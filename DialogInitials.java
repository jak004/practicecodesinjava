import javax.swing.*;
public class DialogInitials
{
    public static void main(String[]args)
    {
        String response= JOptionPane.showInputDialog(null,"Please enter your initials");
        JOptionPane.showMessageDialog(null,response);
        JOptionPane.showConfirmDialog(null, "Are the initials  provided correct?");
     System.exit(0);
    
    }
}