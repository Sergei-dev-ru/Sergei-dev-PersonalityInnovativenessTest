import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class MainClass extends Application {

    private int numberQue = 0;

    public static void main(String[] args) {
        Questions.fullQue();
        Application.launch(args);
    }

    public void start(Stage primaryStage) throws IOException {
        Questions question = new Questions();
        Answers answers = new Answers();
        Text text = new Text();
        text.setText("1) Он считает, что изменения  - это  путь к успеху.");
        text.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
        text.setX(30);
        text.setY(80);

        Button button = new Button("Далее");
        button.setPrefSize(100, 35);
        button.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        button.setLayoutX(660);
        button.setLayoutY(530);

        RadioButton button5 = new RadioButton("Очень похож на меня.");
        RadioButton button4 = new RadioButton("Похож на меня.");
        RadioButton button3 = new RadioButton("Немного похож на меня.");
        RadioButton button2 = new RadioButton("Мало похож на меня.");
        RadioButton button1 = new RadioButton("Совсем не похож на меня.");
        ToggleGroup radioGroup = new ToggleGroup ();
        button1.setToggleGroup(radioGroup);
        button2.setToggleGroup(radioGroup);
        button3.setToggleGroup(radioGroup);
        button4.setToggleGroup(radioGroup);
        button5.setToggleGroup(radioGroup);

            button.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    if (button1.isSelected()) {
                        numberQue++;
                        answers.responseHandler(numberQue, 1);
                    } else if (button2.isSelected()) {
                        numberQue++;
                        answers.responseHandler(numberQue, 2);
                    } else if (button3.isSelected()) {
                        numberQue++;
                        answers.responseHandler(numberQue, 3);
                    } else if (button4.isSelected()) {
                        numberQue++;
                        answers.responseHandler(numberQue, 4);
                    } else if (button5.isSelected()) {
                        numberQue++;
                        answers.responseHandler(numberQue, 5);
                    }
                    if (numberQue >= 15){
                        System.out.println("test");
                        Answers.result();
                    }
                    text.setText(question.newQuestions());
                }
            });

        VBox.setMargin(button1, new Insets(150, 10, 5, 20));
        VBox.setMargin(button2, new Insets(5, 10, 5, 20));
        VBox.setMargin(button3, new Insets(5, 10, 5, 20));
        VBox.setMargin(button4, new Insets(5, 10, 5, 20));
        VBox.setMargin(button5, new Insets(5, 10, 5, 20));

        VBox vBox = new VBox(10, button1, button2, button3, button4, button5);
        vBox.setAlignment(Pos.CENTER_LEFT);

        Group root = new Group(text, vBox, button);
        primaryStage.setTitle("Исследование инновационности личности");
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}