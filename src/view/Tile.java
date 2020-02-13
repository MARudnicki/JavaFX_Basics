package view;

import controllers.GameController;
import javafx.scene.control.Button;

public class Tile extends Button {

    private int x, y;
    private GameController gameController;
    private String state;

    public Tile(int x, int y, GameController gameController) {
        this.x = x;
        this.y = y;
        this.gameController = gameController;
        this.state = "-";

        this.setOnMouseClicked(event -> gameController.handleOnClick(this));
        this.setPrefSize(200, 200);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
