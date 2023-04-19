import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class PizzaOrderForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaOrderForm frame = new PizzaOrderForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PizzaOrderForm() {
		setTitle("Pizza Order Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMamaMia = new JLabel("Mama Mia Pizzaria");
		lblMamaMia.setHorizontalAlignment(SwingConstants.CENTER);
		lblMamaMia.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblMamaMia.setBounds(10, 11, 414, 37);
		contentPane.add(lblMamaMia);
		
		JLabel lblSmall = new JLabel("Small:");
		lblSmall.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSmall.setBounds(20, 59, 62, 22);
		contentPane.add(lblSmall);
		
		JLabel lblMedium = new JLabel("Medium:");
		lblMedium.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMedium.setBounds(20, 92, 62, 22);
		contentPane.add(lblMedium);
		
		JLabel lblLarge = new JLabel("Large:");
		lblLarge.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLarge.setBounds(20, 125, 62, 22);
		contentPane.add(lblLarge);
		
		JLabel lblToppings = new JLabel("Toppings:");
		lblToppings.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblToppings.setBounds(20, 158, 62, 22);
		contentPane.add(lblToppings);
		
		JLabel lblSmall_1 = new JLabel("$4.99");
		lblSmall_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSmall_1.setBounds(92, 59, 70, 22);
		contentPane.add(lblSmall_1);
		
		JLabel lblMedium_1 = new JLabel("$6.99");
		lblMedium_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMedium_1.setBounds(92, 92, 70, 22);
		contentPane.add(lblMedium_1);
		
		JLabel lblLarge_1 = new JLabel("$8.99");
		lblLarge_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLarge_1.setBounds(92, 125, 70, 22);
		contentPane.add(lblLarge_1);
		
		JLabel lblEach = new JLabel("$0.50 each");
		lblEach.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEach.setBounds(92, 158, 76, 22);
		contentPane.add(lblEach);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(159, 207, 255)), "Size", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(172, 59, 103, 185);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSmall.setBounds(6, 20, 91, 23);
		panel.add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnMedium.setBounds(6, 46, 91, 23);
		panel.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		rdbtnLarge.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnLarge.setBounds(6, 72, 91, 23);
		panel.add(rdbtnLarge);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnSmall);
		buttonGroup.add(rdbtnMedium);
		buttonGroup.add(rdbtnLarge);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(159, 207, 255)), "Toppings", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(285, 59, 139, 185);
		contentPane.add(panel_1);
		
		JCheckBox chckbxPepperoni = new JCheckBox("Pepperoni");
		chckbxPepperoni.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxPepperoni.setBounds(6, 20, 97, 23);
		panel_1.add(chckbxPepperoni);
		
		JCheckBox chckbxItalianSausage = new JCheckBox("Italian Sausage");
		chckbxItalianSausage.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxItalianSausage.setBounds(6, 46, 127, 23);
		panel_1.add(chckbxItalianSausage);
		
		JCheckBox chckbxPineApple = new JCheckBox("Pineapple");
		chckbxPineApple.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxPineApple.setBounds(6, 72, 127, 23);
		panel_1.add(chckbxPineApple);
		
		JCheckBox chckbxExtraCheese = new JCheckBox("Extra Cheese");
		chckbxExtraCheese.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxExtraCheese.setBounds(6, 98, 127, 23);
		panel_1.add(chckbxExtraCheese);
		
		JCheckBox chckbxGreenPepper = new JCheckBox("Green Pepper");
		chckbxGreenPepper.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxGreenPepper.setBounds(6, 124, 127, 23);
		panel_1.add(chckbxGreenPepper);
		
		JCheckBox chckbxOlives = new JCheckBox("Olives");
		chckbxOlives.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxOlives.setBounds(6, 150, 127, 23);
		panel_1.add(chckbxOlives);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cost = 0;
				if (rdbtnSmall.isSelected()) {
					cost+=4.99;
				}
				if (rdbtnMedium.isSelected()) {
					cost+=6.99;
				}
				if (rdbtnLarge.isSelected()) {
					cost+=8.99;
				}
				if (chckbxPepperoni.isSelected()) {
					cost+=0.5;
				}
				if (chckbxItalianSausage.isSelected()) {
					cost+=0.5;
				}
				if (chckbxPineApple.isSelected()) {
					cost+=0.5;
				}
				if (chckbxExtraCheese.isSelected()) {
					cost+=0.5;
				}
				if (chckbxGreenPepper.isSelected()) {
					cost+=0.5;
				}
				if (chckbxOlives.isSelected()) {
					cost+=0.5;
				}
				JOptionPane.showMessageDialog(null, "Your pizza cost $"+cost);
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalculate.setBounds(115, 255, 108, 25);
		contentPane.add(btnCalculate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(233, 255, 70, 25);
		contentPane.add(btnExit);
	}
}
