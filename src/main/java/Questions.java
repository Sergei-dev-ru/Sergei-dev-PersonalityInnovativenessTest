import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class Questions {

    public static List<String> questions = new ArrayList<String>();
    static final String que1 = "1) Он считает, что изменения  - это  путь к успеху.";
    static final String que2 = "2) С его точки зрения сегодняшние потери совсем необязательно плохи для будущего.";
    static final String que3 = "3) Он готов идти на риск ради достижения своих целей.";
    static final String que4 = "4) Для него важно рождать новые идеи и заниматься творчеством.";
    static final String que5 = "5) Ему нравится делать все по-своему, оригинально.";
    static final String que6 = "6) Для него важно разнообразие в жизни.";
    static final String que7 = "7) Встреча с неизведанным, новым не пугает его.";
    static final String que8 = "8) Он полагает, что возможности даются только тем, кто их сам их активно ищет.";
    static final String que9 = "9) Он творческий человек, всегда стремиться создавать, придумать что-то новое.";
    static final String que10 = "10) Он не преклоняется перед авторитетами, он независим.";
    static final String que11 = "11) Он не боится ошибок и конструктивно реагирует на них.";
    static final String que12 = "12) Для него характерна любовь к исследованию нового, любознательность.";
    static final String que13 = "13) Он поощряет креативность в других людях.";
    static final String que14 = "14) Он готов вкладывать деньги в инновации.";
    static final String que15 = "15) Он вполне комфортно чувствует себя в нестабильной среде.";

    public static void fullQue() {
        questions.add(que1);
        questions.add(que2);
        questions.add(que3);
        questions.add(que4);
        questions.add(que5);
        questions.add(que6);
        questions.add(que7);
        questions.add(que8);
        questions.add(que9);
        questions.add(que10);
        questions.add(que11);
        questions.add(que12);
        questions.add(que13);
        questions.add(que14);
        questions.add(que15);
    }

    public String newQuestions(){
        try {
            questions.remove(0);
            return questions.get(0);
        }
        catch (Exception e){
            return "На этом все";
        }
    }

}