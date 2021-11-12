package shafiswingjava;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
//Code from Islam's tutorial

public class JframeTry extends Thread{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
       // Thread theX = new Thread();

        frame.setVisible(true);

        //frame.setSize(400,300);
        //frame.setLocation(600,600);
        //frame.setLocationRelativeTo(null);

        //setSize + setLocation = setBounds
        frame.setBounds(500,300,400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Application Updater");
        frame.setResizable(false);
        //frame.setJMenuBar();
        int optionValue = JOptionPane.showConfirmDialog(null,"Do you want to update this app now?"," ",JOptionPane.YES_NO_CANCEL_OPTION);
        if ( optionValue == JOptionPane.YES_OPTION)
        {

            try{

                    JOptionPane.showMessageDialog(null,"It will take a while. Please wait.");
                    //theX.start();
                    Thread.sleep(5000);
                    JOptionPane.showMessageDialog(null,"Success.You are Up to Date");

            }catch (InterruptedException e)
            {
                System.out.println(e);
            }



          //  JOptionPane.showMessageDialog(null,"Success.You are Up to Date");
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
