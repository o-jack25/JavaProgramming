import javax.swing.*;

public class practiceGUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello " + name);
        double height = Double.parseDouble(JOptionPane.showInputDialog(("Enter your height: ")));
        JOptionPane.showMessageDialog(null,"Your height is: " + height);
    }
}
