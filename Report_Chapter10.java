import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Report_Chapter10 extends JFrame{
	
	JTextField TextField1;
	JTextField TextField2;
	
	public Report_Chapter10() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		
		TextField1= new JTextField("");
		TextField1.setBounds(10, 10, 465, 40);
		c.add(TextField1);
		
		TextField2= new JTextField("");
		TextField2.setBounds(10, 55, 465, 40);
		TextField2.setHorizontalAlignment(JLabel.RIGHT);
		c.add(TextField2);
		
		//ButtonPanel 만들기
		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setLayout(new GridLayout(5, 4, 0, 0));
		ButtonPanel.setBounds(10, 100, 465, 355);
		//ButtonPanel.setBackground(Color.black);
		//ButtonPanel 영역확인용
		
		String Button_names[]= {"7", "8", "9", "/", 
								"4", "5", "6", "*",
								"1", "2", "3", "-",
								"0", ".", "=", "+",
								"C", "B"};
		JButton Buttons[] = new JButton[Button_names.length];
		for(int i=0; i<Button_names.length; i++) {
			Buttons[i]=new JButton(Button_names[i]);
			Buttons[i].setFont(new Font("Arial", Font.BOLD, 25));
			ButtonPanel.add(Buttons[i]);
			Buttons[i].addActionListener(new CalculateActionListener());
		}
		
		add(ButtonPanel);
		
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}
	
	//ActionListener class 구현
	class CalculateActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();
			
			if (operation.equals("C")) {
				TextField1.setText("");
				TextField2.setText("");
			}
			else if(operation.equals("B")) {
				String text= TextField1.getText();
				text=text.substring(0, text.length()-1);
				TextField1.setText(text);
				TextField2.setText("");
			}
			else if (operation.equals("=")) {
				String result = performArithmeticOperation(TextField1.getText()+TextField2.getText());
				TextField1.setText(result);
				TextField2.setText("");
			}
			else if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
				String text=TextField2.getText();
				TextField2.setText("");
				TextField1.setText(TextField1.getText()+text+operation);
			}
			else {
				TextField2.setText(TextField2.getText() + operation);
			}
		}
	}
	
	//String으로 작성된 계산식의 결과값을 String으로 반환하는 함수 구현
	public static String performArithmeticOperation(String expression) {
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();
        String num = "";
        boolean isDecimal = false;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                num += ch;
            } else if (ch == '.') {
                if (isDecimal) {
                    throw new IllegalArgumentException("Invalid expression: multiple decimal points in a number");
                }
                num += ch;
                isDecimal = true;
            } else {
                if (!num.isEmpty()) {
                    numbers.add(Double.parseDouble(num));
                    num = "";
                    isDecimal = false;
                }

                operators.add(ch);
            }
        }

        if (!num.isEmpty()) {
            numbers.add(Double.parseDouble(num));
        }

        performPriorityOperation(numbers, operators, '*', '/');
        performPriorityOperation(numbers, operators, '+', '-');

        double result = numbers.get(0);
        return String.valueOf(result);
    }

    private static void performPriorityOperation(ArrayList<Double> numbers, ArrayList<Character> operators, char op1, char op2) {
        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);

            if (op == op1 || op == op2) {
                double num1 = numbers.get(i);
                double num2 = numbers.get(i + 1);
                double result;

                switch (op) {
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + op);
                }

                numbers.set(i, result);
                numbers.remove(i + 1);
                operators.remove(i);
                i--;
            }
        }
    }


	
	public static void main(String [] args) {
		new Report_Chapter10();
	}
}