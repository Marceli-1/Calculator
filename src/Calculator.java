import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel CalculatorSwing;
    private JTextField calcField;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button11;
    private JButton button2;
    private JButton button16;
    private JButton clButton;

    private double sum = 0;
    private double finalSum = 0;
    private char operator;

    private void getOperator(String clickedButton){
        operator = clickedButton.charAt(0);


        sum = sum + Double.parseDouble(calcField.getText());
        calcField.setText("");
    }

    public Calculator() {

        // 0 to 9 buttons
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b10 = calcField.getText() + button10.getText();
                calcField.setText(b10);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b1 = calcField.getText() + button1.getText();
                calcField.setText(b1);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b2 = calcField.getText() + button2.getText();
                calcField.setText(b2);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b3 = calcField.getText() + button3.getText();
                calcField.setText(b3);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b4 = calcField.getText() + button4.getText();
                calcField.setText(b4);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b5 = calcField.getText() + button5.getText();
                calcField.setText(b5);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b6 = calcField.getText() + button6.getText();
                calcField.setText(b6);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b7 = calcField.getText() + button7.getText();
                calcField.setText(b7);
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b8 = calcField.getText() + button8.getText();
                calcField.setText(b8);
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b9 = calcField.getText() + button9.getText();
                calcField.setText(b9);
            }
        });

        //function buttons

        // .
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(calcField.getText().equals("")){
                    calcField.setText("0.");
                }
                else if (calcField.getText().contains(".")){
                    button11.setEnabled(false);
                }
                else{
                    calcField.setText(calcField.getText() + button11.getText());

                }
                button11.setEnabled(true);
            }
        });

        // =
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //finalSum = sum + Double.parseDouble(calcField.getText());
                switch(operator){
                    case '+':
                        finalSum = sum + Double.parseDouble(calcField.getText());
                        break;
                    case '-':
                        finalSum = sum - Double.parseDouble(calcField.getText());
                        break;
                    case 'x':
                        finalSum = sum * Double.parseDouble(calcField.getText());
                        break;
                    case '÷':
                        finalSum = sum / Double.parseDouble(calcField.getText());
                        break;
                }

                calcField.setText(Double.toString(finalSum));
                sum = 0;
            }
        });

        // +
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //sum = sum + Double.parseDouble(calcField.getText());
                //calcField.setText("");
                String button = button13.getText();
                getOperator(button);
            }
        });

        // -
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button = button14.getText();
                getOperator(button);
            }
        });

        // x
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button = button15.getText();
                getOperator(button);
            }
        });

        // ÷
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button = button16.getText();
                getOperator(button);
            }
        });

        // Cl
        clButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalSum = sum = 0;
                calcField.setText("");
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().CalculatorSwing);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
