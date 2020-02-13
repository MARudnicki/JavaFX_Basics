import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controllers.GameBoard;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        GameBoard gameBoardView = new GameBoard();
        primaryStage.setScene(new Scene(gameBoardView.gameBoard()));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
