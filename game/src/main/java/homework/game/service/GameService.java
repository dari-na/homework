package homework.game.service;

import homework.game.dto.GameDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class GameService {
    Random rand = new Random();
    public Integer id = 1;
    public Map<Integer,Integer> games;
    public GameDTO createGame(){
        GameDTO gameDTO = new GameDTO();
        gameDTO.setId(id);
        gameDTO.setAnswer(rand.nextInt(101));
        games.put(gameDTO.getId(),gameDTO.getAnswer());
        id ++;
        return gameDTO;
    }
}
