import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ColorChanger extends Application {
    private Label lbl;
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        root.setPadding(new Insets(10,10,10,10));
        root.setSpacing(10);
        Button btn = new Button("Random Color");
        lbl = new Label("BZ 214 Visual Programming");
        lbl.setFont(new Font(14));
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int red = (int) (Math.random()*256);
                int green = (int) (Math.random()*256);
                int blue = (int) (Math.random()*256);
                Color customColor = Color.rgb(red,green,blue);
                lbl.setTextFill(customColor);
            }
        });
    
        /*btn.setOnAction((e)-> {int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color currentColor = Color.rgb(red, green, blue);
        lbl.setTextFill(currentColor);});*/

        root.getChildren().addAll(lbl, btn);
        Scene scene = new Scene(root, 250, 250);
        primaryStage.setTitle("Color Changer"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
/*class ClickHandler implements EventHandler<ActionEvent>{
    private Label lbl;
    public ClickHandler(Label lbl){
        this.lbl = lbl;
    }
    @Override
    public void handle(ActionEvent event) {
        int red = (int) (Math.random()*256);
        int green = (int) (Math.random()*256);
        int blue = (int) (Math.random()*256);
        Color customColor = Color.rgb(red,green,blue);
        lbl.setTextFill(customColor);
    }
}*/