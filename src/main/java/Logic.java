import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Logic {

    private static Stage stg;
    private int numberQue = 0;
    private Welcome welcome;
    private Answers answers;
    private BufferedReader reader;

    {
        welcome = new Welcome();
        answers = new Answers();
        try {
            reader  = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\Sergei-dev-PersonalityInnovativenessTest\\src\\main\\resources\\Questions.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Text createText(int size, int x, int y) throws IOException {
        Text text = new Text();
        text.setText(reader.readLine());
        text.setFont(Font.font("Calibri", FontWeight.NORMAL, size));
        text.setX(x);
        text.setY(y);
        return text;
    }

    public Text createText(int size, int x, int y, String str) throws IOException {
        Text text = new Text();
        if(str.equals("welcome")) {
            text.setText("Здравствуйте! Введите пожалуйста ваши имя и фамилию:");
        }
        if(str.equals("result")){
            text.setText(Welcome.getTextField().getText().substring(5) + " " + Welcome.getTextField1().getText().substring(9) + '\n' + "Ваши результаты: ");
        }
        text.setFont(Font.font("Calibri", FontWeight.NORMAL, size));
        text.setX(x);
        text.setY(y);
        return text;
    }

    public Text createText(int size, int x, int y, int hz) throws IOException {
        Text text = new Text();
        text.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        text.setFont(Font.font("Calibri", FontWeight.NORMAL, size));
        text.setX(x);
        text.setY(y);
        return text;
    }

    public Stage createStage(Text...text){
        Group root = new Group(text);
        Stage stage = new Stage();
        stage.setTitle("Исследование инновационности личности");
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        return stage;
    }

    public Stage createStage(Text text, Button button, TextField textField1, TextField textField2, ImageView imageView){
        Stage stage = new Stage();
        Group root1 = new Group(text, button, textField1, textField2, imageView);
        stage.setTitle("Исследование инновационности личности ");
        Scene scene = new Scene(root1, 600, 600);
        stage.setScene(scene);
        return stage;
    }

    public Stage createStage(Stage primaryStage, Text text, VBox vBox, Button button){
        primaryStage = new Stage();
        Group root1 = new Group(text, vBox, button);
        primaryStage.setTitle("Исследование инновационности личности");
        Scene scene = new Scene(root1, 800, 600);
        primaryStage.setScene(scene);
        return primaryStage;
    }

    public Button createButton(String str, int x, int y){
        if(str.equals("Далее")){
            Button button = new Button("Далее");
            button.setPrefSize(100, 35);
            button.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
            button.setLayoutX(x);
            button.setLayoutY(y);
            return button;
        }
        else return null;
    }

    public ImageView createImage(String str, int rW, int rH, int x, int y) throws FileNotFoundException {
        FileInputStream input = new FileInputStream(str);
        Image image = new Image(input, rW, rH, true, false);
        ImageView imageView = new ImageView(image);
        imageView.setX(x);
        imageView.setY(y);
        return imageView;
    }

    public TextField createTextField(String str, int x, int y){
        TextField textField = new TextField(str + ": ");
        textField.setPrefColumnCount(30);
        textField.setStyle ("-fx-border-color: #0000ff; -fx-border-width: 1px;");
        textField.setLayoutX(x);
        textField.setLayoutY(y);
        return textField;
    }

}
