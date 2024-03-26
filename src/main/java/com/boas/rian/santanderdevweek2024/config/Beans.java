package com.boas.rian.santanderdevweek2024.config;

import com.boas.rian.santanderdevweek2024.adapters.ChampionsJdbcRepository;
import com.boas.rian.santanderdevweek2024.application.ListChampionsUseCase;
import com.boas.rian.santanderdevweek2024.domain.ports.ChampionsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public ListChampionsUseCase listChampionsUseCase(ChampionsRepository championsRepository){
        return new ListChampionsUseCase(championsRepository);
    };
}
