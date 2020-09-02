import javax.swing.*;

public class Calculator {
    private JPanel CalculatorSwing;
    private JTextField textField1;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button10;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button11;
    private JButton a2Button;
    private JButton button16;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().CalculatorSwing);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
