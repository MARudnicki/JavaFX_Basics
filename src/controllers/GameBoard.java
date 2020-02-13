package controllers;

import java.util.HashMap;
import java.util.Map;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import view.Tile;

public class GameBoard {

    public GridPane gameBoard() {
        final GridPane gameGrid = new GridPane();

        Map<String, Tile> tiles = new HashMap<>();
        GameController gameController = new GameController();

        gameGrid.setAlignment(Pos.CENTER);
        gameGrid.setPrefSize(600, 600);
        gameGrid.setPadding(new Insets(15));

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                Tile tile = new Tile(x, y, gameController);
                gameGrid.add(tile, x, y);

                GridPane.setHgrow(tile, Priority.ALWAYS);
                GridPane.setVgrow(tile, Priority.ALWAYS);
                tiles.put(x + "-" + y, tile);
            }
        }
        gameController.setTiles(tiles);

        return gameGrid;
    }
}
