import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BallAnimation extends Application{
    @Override
    public void start(Stage primaryStage) {
        BallPane ballPane = new BallPane();

        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        ballPane.setFocusTraversable(true);
        ballPane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    ballPane.increaseSpeed();
                    break;
                case DOWN:
                    ballPane.decreaseSpeed();
                    break;
            }
        });

        Scene scene = new Scene(ballPane, 250, 150);
        primaryStage.setTitle("Ball Animation"); 
        primaryStage.setScene(scene);
        primaryStage.show(); 

        ballPane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}