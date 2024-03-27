package com.boas.rian.santanderdevweek2024.adapters.in;

import com.boas.rian.santanderdevweek2024.application.AskChampionUseCase;
import com.boas.rian.santanderdevweek2024.application.ListChampionsUseCase;
import com.boas.rian.santanderdevweek2024.domain.model.Champion;
import feign.Body;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/champions")
@Tag(name = "champions")
public record AskChampionsRestControllers(AskChampionUseCase useCase) {

    @PostMapping("/:{championId}/ask")
    public AskQuestionResponse askChampion(@PathVariable Long championId, @RequestBody AskQuestionRequest request){
        String answer = useCase.askChampion(championId, request.question());
        return new AskQuestionResponse(answer);
    }

    public record AskQuestionRequest(String question){};
    public record AskQuestionResponse(String answer){};
}
