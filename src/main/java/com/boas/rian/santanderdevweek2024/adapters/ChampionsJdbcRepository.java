package com.boas.rian.santanderdevweek2024.adapters;

import com.boas.rian.santanderdevweek2024.domain.model.Champion;
import com.boas.rian.santanderdevweek2024.domain.ports.ChampionsRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class ChampionsJdbcRepository implements ChampionsRepository {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Champion> rowMapper;

    public ChampionsJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = (((rs, rowNum) -> new Champion(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("role"),
                rs.getString("lore"),
                rs.getString("image_url")
        )));
    }

    @Override
    public List<Champion> findAll() {
        return jdbcTemplate.query("SELECT * FROM champions", rowMapper);
    }

    @Override
    public Optional<Champion> findOne(Long id) {
        Champion champion = jdbcTemplate.queryForObject("SELECT * FROM champions WHERE ID = ?", rowMapper, id);
        return Optional.ofNullable(champion);
    }
}
