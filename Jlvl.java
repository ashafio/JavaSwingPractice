package shafiswingjava;

import javax.swing.*;
import java.awt.*;

public class Jlvl extends JFrame {

    private Container c;

    private JLabel userLabel;

//    Jlvl()
//    {
//        initcomponents();
//    }

    public void initcomponents()
    {
        c = getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);
        userLabel = new JLabel();
        userLabel.setText("Enter your username: ");
        userLabel.setBounds(160,150,150,50);
        userLabel.setForeground(Color.BLACK); //works
        c.add(userLabel);

    }
    //for dark theme
    public void components_dark()
    {
        c = getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(null);
        userLabel = new JLabel();
        userLabel.setText("Enter your username: ");
        userLabel.setBounds(160,150,150,50);
        userLabel.setForeground(Color.WHITE); //works
        c.add(userLabel);

    }


    public static void main(String[] args) {
        //Main Frame
        Jlvl frame = new Jlvl();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Information");


            ///User Side Copy
        int optionValue = JOptionPane.showConfirmDialog(null,"Do you want to keep this default theme (White)"," ",JOptionPane.YES_NO_CANCEL_OPTION);

        if ( optionValue == JOptionPane.YES_OPTION)
        {
            try{
                JOptionPane.showMessageDialog(null,"It will take a while. Please wait.");
                Thread.sleep(2000); //To wait sometime
                //It'll give a sound
                Toolkit.getDefaultToolkit().beep();

                frame.initcomponents();

                JOptionPane.showMessageDialog(null,"Theme Successfully saved.");
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        else if(optionValue == JOptionPane.NO_OPTION)
        {
            try{
                JOptionPane.showMessageDialog(null,"It will take a while. Please wait.");
                Thread.sleep(2000); //To wait sometime
                //It'll give a sound
                Toolkit.getDefaultToolkit().beep();

                frame.components_dark();

                JOptionPane.showMessageDialog(null,"Theme Successfully saved.");
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        else
        {
            int optionValue2 = JOptionPane.showConfirmDialog(null,"Oops!!! :( \n Something went wrong.\nDo you want to find the problem using our 'BugKill' tool?"," ",JOptionPane.YES_NO_CANCEL_OPTION);

            if (optionValue2==JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null,"It will take a while. Please wait.");
                try {
                    Thread.sleep(2000); //To wait sometime
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //It'll give a sound
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null,"Update this application.Thank You for staying with us." );
            }
            else {
                //to give error alert
                final Runnable runnable =
                        (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
                if (runnable != null) runnable.run();

                JOptionPane.showMessageDialog(null,"We're sorry.Something went wrong. BugKill did not find it. :(");

            }

//            JOptionPane.showMessageDialog(null,"Oops!!! :( \n Something went wrong.\n" +
//                    "Do you want to find the problem using our 'bugkill' tool?");

        }



        //End of selecting
//            Jlvl frame = new Jlvl();
//            frame.setVisible(true);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setBounds(200,50,500,400);
//            frame.setTitle("Information");


    }


}
