import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInformation extends JFrame {

	private JPanel contentPane;
	private JTextField textStudentID;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textGrade;
	private static ArrayList <Student> list = new ArrayList<Student>();
	private static int index =0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInformation frame = new StudentInformation();
					frame.setVisible(true);
					Scanner scan = new Scanner(new File("students.txt"));
					while (scan.hasNextLine()){
						String line = scan.nextLine();
						String [] arr = line.split(" ");
						String id = arr[0];
						String first = arr[1];
						String last = arr[2];
						int grade = Integer.parseInt(arr[3]);
						String level = arr[4];
						Student s = new Student(id, first, last, grade, level);
						list.add(s);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentInformation() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Student Information");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle.setBounds(124, 11, 300, 25);
		contentPane.add(lblTitle);
		
		JLabel lblStudentID = new JLabel("Student ID");
		lblStudentID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStudentID.setBounds(80, 50, 110, 25);
		contentPane.add(lblStudentID);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(80, 86, 110, 25);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(80, 122, 110, 25);
		contentPane.add(lblLastName);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade.setBounds(80, 158, 110, 25);
		contentPane.add(lblGrade);
		
		JLabel lblGradeLevel = new JLabel("Grade Level");
		lblGradeLevel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGradeLevel.setBounds(80, 194, 110, 25);
		contentPane.add(lblGradeLevel);
		
		textStudentID = new JTextField();
		textStudentID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textStudentID.setBounds(200, 52, 224, 25);
		contentPane.add(textStudentID);
		textStudentID.setColumns(10);
		
		textFirstName = new JTextField();
		textFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFirstName.setColumns(10);
		textFirstName.setBounds(200, 90, 224, 25);
		contentPane.add(textFirstName);
		
		textLastName = new JTextField();
		textLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textLastName.setColumns(10);
		textLastName.setBounds(200, 126, 224, 25);
		contentPane.add(textLastName);
		
		textGrade = new JTextField();
		textGrade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textGrade.setColumns(10);
		textGrade.setBounds(200, 162, 224, 25);
		contentPane.add(textGrade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select one:", "Freshman", "Sophomore", "Junior", "Senior"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(200, 197, 224, 25);
		contentPane.add(comboBox);
		
		JButton btnFirst = new JButton("First");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index=0;
				String id = list.get(index).getStudentID();
				String first = list.get(index).getFirstName();
				String last = list.get(index).getLastName();
				int grade = list.get(index).getGrade();
				String level = list.get(index).getGradeLevel();
				textStudentID.setText(id);
				textFirstName.setText(first);
				textLastName.setText(last);
				textGrade.setText(""+grade);
				comboBox.setSelectedItem(level);
			}
		});
		btnFirst.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFirst.setBounds(20, 240, 90, 25);
		contentPane.add(btnFirst);
		
		JButton btnLast = new JButton("Last");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index=list.size()-1;
				String id = list.get(index).getStudentID();
				String first = list.get(index).getFirstName();
				String last = list.get(index).getLastName();
				int grade = list.get(index).getGrade();
				String level = list.get(index).getGradeLevel();
				textStudentID.setText(id);
				textFirstName.setText(first);
				textLastName.setText(last);
				textGrade.setText(""+grade);
				comboBox.setSelectedItem(level);
			}
		});
		btnLast.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLast.setBounds(124, 240, 90, 25);
		contentPane.add(btnLast);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index+=1;
				if (index>list.size()-1) {
					index=list.size()-1;
				}
				String id = list.get(index).getStudentID();
				String first = list.get(index).getFirstName();
				String last = list.get(index).getLastName();
				int grade = list.get(index).getGrade();
				String level = list.get(index).getGradeLevel();
				textStudentID.setText(id);
				textFirstName.setText(first);
				textLastName.setText(last);
				textGrade.setText(""+grade);
				comboBox.setSelectedItem(level);
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNext.setBounds(224, 240, 90, 25);
		contentPane.add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index-=1;
				if (index<0) {
					index=0;
				}
				String id = list.get(index).getStudentID();
				String first = list.get(index).getFirstName();
				String last = list.get(index).getLastName();
				int grade = list.get(index).getGrade();
				String level = list.get(index).getGradeLevel();
				textStudentID.setText(id);
				textFirstName.setText(first);
				textLastName.setText(last);
				textGrade.setText(""+grade);
				comboBox.setSelectedItem(level);
			}
		});
		btnPrevious.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPrevious.setBounds(324, 240, 90, 25);
		contentPane.add(btnPrevious);
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textStudentID.setText("");
				textFirstName.setText("");
				textLastName.setText("");
				textGrade.setText("");
				comboBox.setSelectedIndex(0);
			}
		});
		btnNew.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNew.setBounds(424, 240, 90, 25);
		contentPane.add(btnNew);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textStudentID.getText();
				String first = textFirstName.getText();
				String last = textLastName.getText();
				int grade = Integer.parseInt(textGrade.getText());
				String level = (String) comboBox.getSelectedItem();
				Student newStudent = new Student(id, first, last, grade, level);
				list.add(newStudent);
				try (FileWriter fw = new FileWriter("students.txt", true);
						 BufferedWriter bw = new BufferedWriter(fw)) {
					bw.newLine();
					bw.write(""+newStudent.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSave.setBounds(224, 276, 90, 25);
		contentPane.add(btnSave);
	}
}
