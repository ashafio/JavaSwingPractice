package shafiswingjava;
import javax.swing.JOptionPane;
//import javax.swing.*;

public class MultipleInputArgs{

    public static void main(String[] args) {
        //2 Arguments
        String f_name = JOptionPane.showInputDialog("Enter Your First Name: ","Shafi");
        //JOptionPane.showMessageDialog(null,"Hey " + f_name + "  Welcome To JavaApp");
        //4 Arguments
        String l_name = JOptionPane.showInputDialog(null,"Enter Your Last Name: ","Info",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hey " + f_name + " " + l_name + "  Welcome To JavaApp");


    }

}
