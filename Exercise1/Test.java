package Exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test
{
    public static boolean isValid(String a)
    {
        a = a.toLowerCase();
        if(a.equals("a") || a.equals("b") || a.equals("c") || a.equals("d"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please pick A, B, C or D");
            return false;
        }
    }



//-----------SIMULATE QUESTIONS---------------
    public static String simulateQuestion(String[] q)
    {
        String fmtQuestion = ""; // String to hold the formatted question
        String answer = "";

        for(int i = 0; i < q.length; i++)
            fmtQuestion += q[i] + "\n";

        do
        {
            answer = JOptionPane.showInputDialog(null, fmtQuestion);
            if(answer == null)
            {
                int quit = JOptionPane.showConfirmDialog(null, "Would you like to quit?", "Quit", JOptionPane.YES_NO_OPTION);
                if(quit == 0)
                    return "ABORT";
                else
                    continue;
            }
        } while (answer == null || !(isValid(answer)));

        return answer;
    }

//----------------------CHECK ANSWER---------------------
    public static boolean checkAnswer(String a, String r) // a = correct answer, r = user response
    {
        r = r.toUpperCase();
        if(a.equals(r))
        {
            JOptionPane.showMessageDialog(null, generateMessage(true));
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, generateMessage(false));
            return false;
        }
    }



    //-----------------------GENERATE RANDOM MESSAGE---------------
    public static String generateMessage(Boolean b)
    {
        Random rand = new Random();
        int randNum=rand.nextInt(4);
        if (b == true){
            switch (randNum){
                case 0:
                    return "Excellent!";
                case 1:
                    return "Good!";
                case 2:
                    return "Keep up the good work!";
                case 3:
                    return "Nice work!";
                default:
                    return "err";
            }
        }
        else {
            switch (randNum){
                case 0:
                    return "No. Please try again";
                case 1:
                    return "Wrong. Try once more";
                case 2:
                    return "Don't give up!";
                case 3:
                    return "No. Keep trying...";
                default:
                    return "err";
            }
        }
    }



    //-----------------SHOWING GRADES-----------------
    public static void showGrade(int c, int i)
    {
        int numberQuestions = c + i;
        String fmtGrade = "";
        int pointsPerQuestion = 100 / numberQuestions;
        int grade = c * pointsPerQuestion;

        fmtGrade += "You answered " + c + " correctly and " + i + " incorrectly";
        fmtGrade += "\nYour percentage is: " + grade + "%";

        JOptionPane.showMessageDialog(null, fmtGrade);
    }
}
