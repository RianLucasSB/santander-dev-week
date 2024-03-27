package com.boas.rian.santanderdevweek2024.config;

import com.boas.rian.santanderdevweek2024.application.AskChampionUseCase;
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

    @Bean
    public AskChampionUseCase askChampionUseCase(ChampionsRepository championsRepository){
        return new AskChampionUseCase(championsRepository);
    };
}
