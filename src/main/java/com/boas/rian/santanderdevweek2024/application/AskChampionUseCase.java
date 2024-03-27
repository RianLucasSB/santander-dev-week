package com.boas.rian.santanderdevweek2024.application;

import com.boas.rian.santanderdevweek2024.domain.exceptions.ChampionNotFoundException;
import com.boas.rian.santanderdevweek2024.domain.model.Champion;
import com.boas.rian.santanderdevweek2024.domain.ports.ChampionsRepository;

public record AskChampionUseCase(ChampionsRepository repository) {
    public String askChampion(Long championId, String question){
        Champion champion = repository.findOne(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        return champion.generateContextByQuestion(question);
    }
}
