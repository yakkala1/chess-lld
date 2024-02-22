import com.raviy.chesslld.*;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    void justAnExample() {
        Player wp = new Player("1", "Ravi");
        Player bp = new Player("2", "Teja");

        Game game = new Game(wp, bp);

        game.makeMove(wp, new NormalMove(
                new Location(1, 0),
                new Location(3, 0)
        ));
        System.out.println(game.getBoard().toString());

        game.makeMove(bp, new NormalMove(
                new Location(6, 1),
                new Location(4, 1)
        ));
        System.out.println(game.getBoard().toString());

        game.makeMove(wp, new NormalMove(
                new Location(3, 0),
                new Location(4, 1)
        ));
        System.out.println(game.getBoard().toString());
    }

}