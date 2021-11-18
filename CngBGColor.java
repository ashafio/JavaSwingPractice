package shafiswingjava;

import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CngBGColor  extends JFrame {

    private ImageIcon icon;
    private Container cont;  //to contain the field to cng color

    void IconImg()
    {
        imgComponents();
    }

    public void imgComponents()
    {
        cont = this.getContentPane();
        cont.setBackground(Color.CYAN);

        icon = new ImageIcon(getClass().getResource("ashafio.png"));
        this.setIconImage(icon.getImage());

        setVisible(true);
        setBounds(500,300,400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Application Updater");
        setResizable(false);
    }

    public static void main(String[] args) {

        CngBGColor icobg = new CngBGColor();
        icobg.imgComponents();

        int optionValue = JOptionPane.showConfirmDialog(null,"Do you want to update this app now?"," ",JOptionPane.YES_NO_CANCEL_OPTION);

        if ( optionValue == JOptionPane.YES_OPTION)
        {
            try{
                JOptionPane.showMessageDialog(null,"It will take a while. Please wait.");
                Thread.sleep(2000); //To wait sometime
                //It'll give a sound
                Toolkit.getDefaultToolkit().beep();

                JOptionPane.showMessageDialog(null,"Success.You are Up to Date");
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        else if(optionValue == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Thank You for staying with us :)");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Oops!!! :( \n Hope you'll update this app soon.");
        }


    }
}



