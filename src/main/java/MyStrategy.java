import model.*;

public final class MyStrategy implements Strategy {
    @Override
    public void move(Player me, World world, Game game, Move move) {
        if (world.getTickIndex() == 0) {
            move.setAction(ActionType.CLEAR_AND_SELECT);
            move.setRight(world.getWidth());
            move.setBottom(world.getHeight());
            return;
        }

        if (world.getTickIndex() == 1) {
            move.setAction(ActionType.MOVE);
            move.setX(world.getWidth() / 2.0D);
            move.setY(world.getHeight() / 2.0D);
        }
    }
}
