package homework.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		//System.out.println("Hello, if you want to play a game - add '/createGame' to the URL");
		SpringApplication.run(GameApplication.class, args);
	}

}
