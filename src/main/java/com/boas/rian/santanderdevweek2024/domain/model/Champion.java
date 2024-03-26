package com.boas.rian.santanderdevweek2024.domain.model;

public record Champion(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl
) {
    public void test(){
        Champion champion = new Champion(1L, "Lee", "JG", "", "");
    }
}
