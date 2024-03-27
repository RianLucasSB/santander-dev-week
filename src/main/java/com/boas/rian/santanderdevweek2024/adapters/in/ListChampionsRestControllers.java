package com.boas.rian.santanderdevweek2024.adapters.in;

import com.boas.rian.santanderdevweek2024.application.ListChampionsUseCase;
import com.boas.rian.santanderdevweek2024.domain.model.Champion;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
@Tag(name = "champions")
public record ListChampionsRestControllers(ListChampionsUseCase useCase) {

    @GetMapping
    public List<Champion> findAllChampions(){
        return useCase.findAll();
    }
}
