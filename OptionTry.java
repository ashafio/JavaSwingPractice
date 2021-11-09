package shafiswingjava;
import javax.swing.JOptionPane;
public class OptionTry {

    public static void main(String[] args) {

       int optionValue = JOptionPane.showConfirmDialog(null,"Do you want to quit?","Permission",JOptionPane.YES_NO_CANCEL_OPTION);

        //if (JOptionPane.YES_NO_CANCEL_OPTION == JOptionPane.YES_OPTION )
        if ( optionValue == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Success");
        }

        else
        {
            JOptionPane.showMessageDialog(null,"Thank You for staying with us :)");
        }
    }

}
