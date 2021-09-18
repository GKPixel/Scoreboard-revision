package rien.bijl.Scoreboard.r.Board.Implementations.Drivers.V2;

import fr.mrmicky.fastboard.FastBoard;
import org.bukkit.entity.Player;
import rien.bijl.Scoreboard.r.Board.Implementations.Drivers.V1.ScoreboardDriverV1;
import rien.bijl.Scoreboard.r.Board.Implementations.IBoard;

public class ScoreboardDriverV2 implements IBoard {
    private FastBoard board;

    @Override
    public void setTitle(String title) {
        this.board.updateTitle(title);
    }

    @Override
    public void setLine(int line, String content) {
        board.updateLine(line, ScoreboardDriverV1.split(content)[0]);
    }

    @Override
    public void setLineCount(int lines) {
    }

    @Override
    public Player getPlayer() {
        return this.board.getPlayer();
    }

    @Override
    public void setPlayer(Player player) {
        this.board = new FastBoard(player);
    }
}
