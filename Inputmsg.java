
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Inputmsg {
    public static void main(String[] args)
    {
        ///1 to 5
        //JOptionPane.showMessageDialog(null,"Wrong Password.Try Again");
        //JOptionPane.showInputDialog(null,"Wrong Password.Try Again");
        //JOptionPane.showOptionDialog(null,"Wrong Password.Try Again");
        //JOptionPane.showConfirmDialog(null,"Wrong Password.Try Again");
       // JOptionPane.showMessageDialog(null,"Wrong Password.Try Again","Attention",JOptionPane.QUESTION_MESSAGE);
        //ImageIcon img = new ImageIcon("Snow.png");
        //JOptionPane.showInputDialog(null,"Enter Your password","Error",JOptionPane.PLAIN_MESSAGE,NewIcon);
        //JOptionPane.showMessageDialog(null,"Enter Your password","Error",JOptionPane.PLAIN_MESSAGE,img);
    
        ///6 to 
        
        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        JOptionPane.showMessageDialog(null,"Hey " + name + "  Welcome To Swing");
    }
}