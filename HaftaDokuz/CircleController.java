import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleController extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Circle circle = new Circle(100,100,50);
        circle.setFill(Color.BLUEVIOLET);
        circle.setFocusTraversable(true);

        circle.setOnMouseClicked(event -> circle.requestFocus());
        circle.setOnMouseDragged(e -> {circle.setCenterX(e.getX());
        circle.setCenterY(e.getY());});

        circle.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN: circle.setCenterY(circle.getCenterY() + 10); break;
                case UP:  circle.setCenterY(circle.getCenterY() - 10); break;
                case LEFT: circle.setCenterX(circle.getCenterX() - 10); break;
                case RIGHT: circle.setCenterX(circle.getCenterX() + 10); break;
            }
        });
        pane.getChildren().addAll(circle);

        Button btnShrink = new Button("Shrink");
        Button btnEnlarge = new Button("Enlarge");
        btnEnlarge.setFocusTraversable(false);
        btnShrink.setFocusTraversable(false);
        btnShrink.setOnAction(event -> circle.setRadius(circle.getRadius()-5));
        btnEnlarge.setOnAction(event -> circle.setRadius(circle.getRadius()+5));
        HBox btnBox = new HBox();
        btnBox.getChildren().addAll(btnShrink, btnEnlarge);
        btnBox.setAlignment(Pos.BOTTOM_CENTER);

        BorderPane root = new BorderPane();
        root.setCenter(pane);
        root.setBottom(btnBox);

        primaryStage.setScene(new Scene(root, 400,400));
        primaryStage.setTitle("Circle Controller");
        primaryStage.show();

        circle.requestFocus();
    }
}