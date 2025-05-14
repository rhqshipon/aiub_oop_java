import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FrameIntroFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My First GUI");

        // ComboBox
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("CSE", "CS", "CSSE", "SE", "CIS");
        comboBox.setValue("CSE");

        // Labels and Inputs
        Label userLabel = new Label("User Name:");
        TextField userTF = new TextField();

        Label passLabel = new Label("Password:");
        PasswordField passPF = new PasswordField();

        // Buttons
        Button loginBtn = new Button("Login");
        Button exitBtn = new Button("Exit");
        exitBtn.setOnAction(e -> primaryStage.close());

        // RadioButtons
        RadioButton r1 = new RadioButton("OOP1 G");
        RadioButton r2 = new RadioButton("OOP1 C");
        RadioButton r3 = new RadioButton("OOP2 I");
        ToggleGroup radioGroup = new ToggleGroup();
        r1.setToggleGroup(radioGroup);
        r2.setToggleGroup(radioGroup);
        r3.setToggleGroup(radioGroup);

        // CheckBoxes
        CheckBox c1 = new CheckBox("FST");
        CheckBox c2 = new CheckBox("FE");
        CheckBox c3 = new CheckBox("FBA");

        // Image
        ImageView imageView = new ImageView();
        try {
            Image img = new Image("file:Images/Anik.jpg"); // Make sure path is correct
            imageView.setImage(img);
            imageView.setFitWidth(200);
            imageView.setFitHeight(112);
        } catch (Exception e) {
            System.out.println("Image not found.");
        }

        // Layouts
        GridPane formGrid = new GridPane();
        formGrid.setPadding(new Insets(20));
        formGrid.setHgap(10);
        formGrid.setVgap(10);
        formGrid.add(comboBox, 0, 0);
        formGrid.add(userLabel, 0, 1);
        formGrid.add(userTF, 1, 1);
        formGrid.add(passLabel, 0, 2);
        formGrid.add(passPF, 1, 2);
        formGrid.add(loginBtn, 0, 3);
        formGrid.add(exitBtn, 1, 3);

        VBox radioBox = new VBox(10, r1, r2, r3);
        VBox checkBoxBox = new VBox(10, c1, c2, c3);

        HBox controlsRow = new HBox(30, radioBox, checkBoxBox, imageView);
        controlsRow.setAlignment(Pos.CENTER);
        controlsRow.setPadding(new Insets(20));

        VBox root = new VBox(10, formGrid, controlsRow);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
