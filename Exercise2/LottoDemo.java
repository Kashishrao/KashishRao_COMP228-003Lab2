package Exercise2;

import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class LottoDemo {
    public static void main (String[] args) {

        // create a Lottery object
        Lotto lotto = new Lotto();

        String lottoStr = JOptionPane.showInputDialog("Enter number between 3 to 27 to get Lotto: ");
        int lotto_num=Integer.parseInt(lottoStr);
        // tell the user how many numbers they matched
        int matches = lotto.addAllLottoNumber();
        if (matches == lotto_num) {
            JOptionPane.showMessageDialog(null, "You Win Lotto " );
        }  else {
            JOptionPane.showMessageDialog(null, "You Lost Lotto and Lotto is:"+matches );
        }

    }


}
