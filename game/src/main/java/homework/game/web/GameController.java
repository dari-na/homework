package homework.game.web;

import homework.game.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GameController {
    private final GameService gameService;

    @PostMapping("/createGame")
    public Object createGame(){
        return gameService.createGame().getId() ;
    }

    @GetMapping("/game/{id}/{guess}")
    public String play(Integer id, Integer guess){
        if (guess == gameService.games.get(id)){
            return "correct";
        } else if (guess < gameService.games.get(id)) {
            return "the number you guessed is too high!";
        } else {
            return "the number you guessed is too low!";
        }
    }

}
