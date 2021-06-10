import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.*;


public class FindGrade extends Application {
    private Connection connection;
    private Statement statement;
    private TextField txtID = new TextField();
    private TextField txtCourseID = new TextField();
    private Button btnFind = new Button("Find Grade");
    private Label lblStatus = new Label();

    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();
        root.add(new Label("Student ID:"),0,0);
        root.add(txtID,1,0);
        root.add(new Label("Course ID:"),0,1);
        root.add(txtCourseID,1,1);
        root.add(btnFind,1,2);
        root.add(lblStatus,0,3,2,1);
        root.setPadding(new Insets(10,10,10,10));
        root.setHgap(10);
        root.setVgap(10);

        initializeDB();
        btnFind.setOnAction(e->showGrade());

        stage.setScene(new Scene(root, 400,300));
        stage.setTitle("Find Grade");
        stage.show();
    }

    public void initializeDB(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vispro","root","root");
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void showGrade(){
        String query = "SELECT firstName, lastName, title, grade FROM student "+
        "INNER JOIN enrollment ON student.studentId = enrollment.studentId "+
        "INNER JOIN course ON enrollment.courseId = course.courseId "+
        "WHERE student.studentId = '" + txtID.getText() +"' AND enrollment.courseId = '" + txtCourseID.getText() +"'";
        //System.out.println(query);

        ResultSet set;
        try {
            set = statement.executeQuery(query);
            while (set.next())
                lblStatus.setText(set.getString(1) + " " + set.getString(2) + " " + set.getString(3) + " " + set.getString(4));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}