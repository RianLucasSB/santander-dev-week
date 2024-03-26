package com.boas.rian.santanderdevweek2024.application;

import com.boas.rian.santanderdevweek2024.domain.model.Champion;
import com.boas.rian.santanderdevweek2024.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase (ChampionsRepository repository){
    public List<Champion> findAll(){
        return repository.findAll();
    }
}
