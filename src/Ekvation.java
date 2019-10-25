import javax.swing.*;


public class Ekvation {
    public static void main(String[] args) {
        {

            int ekvation = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange ekvationens grad"));
            int a;
            int b;
            int c;
            int potens;


            if (ekvation == 0) {
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "a?"));
                JOptionPane.showMessageDialog(null, a);


            } else if (ekvation == 1) {
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "a?"));
                b = Integer.parseInt(JOptionPane.showInputDialog(null, "b?"));
                JOptionPane.showMessageDialog(null, -a / b);


            } else if (ekvation == 2) {
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "a?"));
                b = Integer.parseInt(JOptionPane.showInputDialog(null, "b?"));
                c = Integer.parseInt(JOptionPane.showInputDialog(null, "c?"));
                potens = Integer.parseInt(JOptionPane.showInputDialog(null, "Potens?"));
                JOptionPane.showMessageDialog(null, -b );
            }

        }
    }
}