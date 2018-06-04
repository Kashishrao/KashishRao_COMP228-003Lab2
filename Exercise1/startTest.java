package Exercise1;

public class startTest
{
    public static  void main(String[] args)
    {
        int i = 0; // iterator to be used later for the simulateQuestion loop
        int correct = 0; // number of correct answers
        int incorrect = 0; // number of incorrect answers
        String response = ""; // holds the answer the user supplied temporarily

        String[][] question = new String[5][5]; // Array to store questions
        String[] correctAnswer = new String[5]; // Array to store correct answers

        question[0][0] = "Which of these is necessary to specify at time of array initialization?";
        question[0][1] = "A) row";
        question[0][2] = "B) column";
        question[0][3] = "C) both row and column";
        question[0][4] = "D) none";
        correctAnswer[0] = "A";

        question[1][0] = "Which of these class can generate an array which can increase and decrease in size automatically? ";
        question[1][1] = "A) ArrayList()";
        question[1][2] = "B) DynamicList()";
        question[1][3] = "C) LinkedList()";
        question[1][4] = "D) DynamicList()";
        correctAnswer[1] = "A";

        question[2][0] = "Which of these method of ArrayList class is used to obtain present size of an object? ";
        question[2][1] = "A) size()";
        question[2][2] = "B) length()";
        question[2][3] = "C) index()";
        question[2][4] = "D) capacity()";
        correctAnswer[2] = "A";

        question[3][0] = "Which of the following can be operands of arithmetic operators?";
        question[3][1] = "A) numeric";
        question[3][2] = "B) boolean";
        question[3][3] = "C) character";
        question[3][4] = "D) both boolean and character";
        correctAnswer[3] = "D";

        question[4][0] = "Which GUI toolkit comes included with Java?";
        question[4][1] = "A) Swing";
        question[4][2] = "B) Gtk";
        question[4][3] = "C) JavaFX";
        question[4][4] = "D) JavaSE";
        correctAnswer[4] = "B";

        Test st = new Test();

        for(i = 0; i < question.length; i++)
        {
            response = st.simulateQuestion(question[i]);
            if (response.equals("ABORT"))
                return;

            if (Test.checkAnswer(correctAnswer[i], response)) {

                correct += 1;
            } else {

                incorrect += 1;
            }
        }


        Test.showGrade(correct, incorrect);

    }
}
