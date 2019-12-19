package trv.javaprogramming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String words){
        String[] countwords = StringUtils.split(words,' ');
        return (countwords == null) ? 0 : countwords.length;
    }

    public void greet(){
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");

        for(String greeting : greetings){
            System.out.println("greeting :" + greeting );
        }
    }
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
        Application app = new Application();
        app.greet();
        int countWords = app.countWords("Hi My Name is Surya");
        System.out.println("WordCount is "+ countWords);
    }
}