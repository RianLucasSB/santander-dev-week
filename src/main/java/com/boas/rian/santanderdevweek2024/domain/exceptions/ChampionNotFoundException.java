package com.boas.rian.santanderdevweek2024.domain.exceptions;

public class ChampionNotFoundException extends RuntimeException {
    public ChampionNotFoundException(Long championId) {
        super("Champion not found with id: %d".formatted(championId));
    }
}
