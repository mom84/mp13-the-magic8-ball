package at.refugeescode.mp13themagic8ball;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Controller
public class magic8ball {

    private List<String> sentences = new ArrayList<>();

    @GetMapping
    String magic8ball(){
        return "magic";
    }


    @ModelAttribute("sentence")
    String game(){

        sentences.add("How are you?");
        sentences.add("Where are you?");
        sentences.add("Are you fine?");
        sentences.add("Let's Go!");

        Collections.shuffle(sentences);
        String sentence = sentences.get(0);
        return sentence;
    }

}
