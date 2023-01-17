/*Juan Carlos T. Matias 
IT101A*/
import java.util.*;
public class GenshinQuiz {
  
    public static String [] questions = {
        "For wishing characters in the game, what currency does the player use?",
        "In Genshin Impact, what are the trinkets that element wielders have on their clothes?",
        "Keqing is my favorite Genshin character of all time. What element does she use?",
        "Among these weapons, which one is considered a 5 star?",
        "In December 2022, which 5 star character was released for the first time?",
    };

    public static String [] answers = {
        "Primogems",
        "Vision",                                                                           //Array of Questions, Answers, and Choices
        "Electro",
        "Wolf's Gravestone",
        "Wanderer",
    };
    
    public static String [] choices = {
        "Resin | Primogems | Tokens",
        "Vision | Artifact | Weapon",
        "Pyro | Electro | Hydro",
        "Sacrificial Sword | The Stringless | Wolf's Gravestone |",
        "Wanderer | Diluc | Qiqi",
    };    

    public static String response;
    public static void main(String args[]) {

        System.out.println("   ______                __    _          ____        _          __");
        System.out.println(" / ____/__  ____  _____/ /_  (_)___     / __ \\__  __(_)___     / /");
        System.out.println(" / / __/ _ \\/ __ \\/ ___/ __ \\/ / __ \\   / / / / / / / /_  /    / / ");      //Genshin Quiz! Display
        System.out.println("/ /_/ /  __/ / / (__  ) / / / / / / /  / /_/ / /_/ / / / /_   /_/  ");
        System.out.println("\\____/\\___/_/ /_/____/_/ /_/_/_/ /_/   \\___\\_\\__,_/_/ /___/  (_)   ");
        
        int a = 0;
        int score2 = Answering(a);      //Grabs the score from the Answering Function


            if (score2 == 5 ) {
                System.out.println("Your score was: " + score2 + "/" + questions.length + "!" + " Congratulations!");       //5/5 Score
                System.out.println();
            }

            else if (score2 >= 3 ) {
                System.out.println("Your score was: " + score2 + "/" + questions.length + "!" + " Good Job!");      //3-4/5 Score
                System.out.println();
            }

            else {
                System.out.println("Your score was: " + score2 + "/" + questions.length + "!" + " Better Luck Next Time!");     //Below 3 Score
                System.out.println();
            }
        }
       
        public static int Answering (int scoring) {     //The Answering function
            
            Scanner s = new Scanner(System.in);     //Scanner  

            for (int i = 0; i < questions.length; i++) {          

                System.out.println(questions[i]);
                System.out.print(choices[i] + ": ");        //For Loop of Questions and Answer If User gets the answer right, int scoring increases
                response = s.nextLine();                    
                System.out.println();

                if (response.equalsIgnoreCase(answers[i])) {        //Score increases for every correct answer
                    System.out.println("Correct Answer!");
                    System.out.println();
                    scoring++;
                }
        
                else {
                    System.out.println("Incorrect answer! The correct answer was: " + answers[i]);
                    System.out.println();                                                               //Displays correct answer when user answers incorrectly                                                                                                   
                }                                                                                       
               
        }
            return scoring;     //Returns the final value of scoring to the main method
    }
}