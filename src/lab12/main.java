package lab12;
import java.awt.event.*;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(350, 180);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Нэгдүгээр операнд");
        label1.setBounds(10, 10, 120, 25);
        frame.add(label1);

        JTextField operand1Field = new JTextField();
        operand1Field.setBounds(10, 40, 150, 25);
        frame.add(operand1Field);

        JLabel label2 = new JLabel("Хоёрдугаар операнд");
        label2.setBounds(170, 10, 180, 25);
        frame.add(label2);

        JTextField operand2Field = new JTextField();
        operand2Field.setBounds(170, 40, 150, 25);
        frame.add(operand2Field);

        JButton add = new JButton("+");
        add.setBounds(10, 75, 70, 35);
        frame.add(add);

        JButton sub = new JButton("-");
        sub.setBounds(90, 75, 70, 35);
        frame.add(sub);

        JButton mul = new JButton("*");
        mul.setBounds(170, 75, 70, 35);
        frame.add(mul);

        JButton div = new JButton("/");
        div.setBounds(250, 75, 70, 35);
        frame.add(div);

        JLabel result = new JLabel("Хариу: ");
        result.setBounds(10, 110, 300, 25);
        frame.add(result);

        Calculator calc = new Calculator();

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(operand1Field.getText());
                    double b = Double.parseDouble(operand2Field.getText());
                    double res = 0;

                    if (e.getSource() == add) res = calc.add(a, b);
                    else if (e.getSource() == sub) res = calc.subtract(a, b);
                    else if (e.getSource() == mul) res = calc.multiply(a, b);
                    else if (e.getSource() == div) res = calc.divide(a, b);

                    result.setText("Хариу: " + res);
                } catch (Exception ex) {
                    result.setText("Алдаа: Буруу утга");
                }
            }
        };
        

        add.addActionListener(listener);
        sub.addActionListener(listener);
        mul.addActionListener(listener);
        div.addActionListener(listener);
   
        frame.setVisible(true);
    }
}
