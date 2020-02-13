package controllers;

import java.util.Map;

import view.Tile;

public class GameController {

    private Map<String, Tile> tiles;

    public void setTiles(Map<String, Tile> tiles) {
        this.tiles = tiles;
    }

    public void handleOnClick(Tile tile) {

        System.out.println("Tiles clicked x= " + tile.getX() + " y= " + tile.getY());

        tile.setText("X");
        tile.setState("X");

        checkIfPlayerWonTheGame();

        computerMove();

        checkIfComputerWonTheGame();
    }

    private void checkIfComputerWonTheGame() {

    }

    private void computerMove() {

    }

    private void checkIfPlayerWonTheGame() {

        if (tiles.get("0-0").getState().equals("X") &&
                tiles.get("1-0").getState().equals("X") &&
                tiles.get("2-0").getState().equals("X")) {

            System.out.println("PLAYER WON");

        }

    }

}
