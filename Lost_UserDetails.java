package com.Lost;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.Home.HomePage;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Lost_UserDetails {

	private JFrame frame;
	private int flag = 0;
	private JTextField textName;
	private JTextField textContact;
	public static int srno = 0;
	public static String tabname = "";
	private int studsr = 0;
	String contact = new String();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lost_UserDetails window = new Lost_UserDetails();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Lost_UserDetails() {
		initialize();
	}

	private void initialize() {
		HomePage fe = new HomePage();

		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 15));
		frame.setBounds(100, 50, 1040, 650);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		JLabel lblEnter = new JLabel("Enter your details to proceed:");
		lblEnter.setBounds(147, 38, 348, 25);
		lblEnter.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(147, 111, 46, 25);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));

		textName = new JTextField();
		textName.setFont(new Font("Dialog", Font.PLAIN, 15));
		textName.setBounds(313, 110, 182, 32);
		textName.setColumns(10);

		JLabel lblClass = new JLabel("Class");
		lblClass.setBounds(147, 192, 46, 37);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 15));

		JComboBox comboClass = new JComboBox();
		comboClass.setFont(new Font("Dialog", Font.PLAIN, 15));
		comboClass.addItem("Select");
		comboClass.addItem("FE");
		comboClass.addItem("SE-A");
		comboClass.addItem("SE-B");
		comboClass.addItem("SE-C");
		comboClass.addItem("TE-A");
		comboClass.addItem("TE-B");
		comboClass.addItem("TE-C");
		comboClass.addItem("BE-A");
		comboClass.addItem("BE-B");
		comboClass.addItem("BE-C");
		comboClass.addItem("ME");
		comboClass.setBounds(313, 196, 182, 32);

		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(147, 438, 125, 31);
		lblContactNumber.setFont(new Font("Tahoma", Font.BOLD, 15));

		textContact = new JTextField();
		textContact.setFont(new Font("Dialog", Font.PLAIN, 15));
		contact = textContact.getText();
		textContact.setBounds(313, 440, 182, 32);
		textContact.setColumns(10);

		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(147, 275, 125, 25);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 15));

		JComboBox comboDept = new JComboBox();
		comboDept.setFont(new Font("Dialog", Font.PLAIN, 15));
		comboDept.addItem("Select");
		comboDept.addItem("Computer");
		comboDept.addItem("Civil");
		comboDept.addItem("Mechanical");
		comboDept.addItem("ENTC");
		comboDept.addItem("IT");
		comboDept.setBounds(313, 273, 182, 32);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(147, 359, 55, 23);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(315, 359, 91, 23);
		rdbtnMale.setFont(new Font("Dialog", Font.PLAIN, 15));

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(427, 357, 86, 27);
		rdbtnFemale.setFont(new Font("Dialog", Font.PLAIN, 15));

		ButtonGroup grup = new ButtonGroup();
		grup.add(rdbtnFemale);
		grup.add(rdbtnMale);

		JLabel lblProfession = new JLabel("Profession");
		lblProfession.setBounds(715, 64, 125, 32);
		lblProfession.setFont(new Font("Tahoma", Font.BOLD, 17));

		JRadioButton rdbtnTeacher = new JRadioButton("Teacher");
		rdbtnTeacher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(rdbtnTeacher.isSelected())
				{
					lblClass.setEnabled(true);
					comboClass.setEnabled(true);
				}
				
			}
		});
		rdbtnTeacher.setBounds(715, 125, 148, 25);
		rdbtnTeacher.setFont(new Font("Dialog", Font.PLAIN, 18));

		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(rdbtnStudent.isSelected())
				{
					lblClass.setEnabled(true);
					comboClass.setEnabled(true);
				}
			}
		});
		rdbtnStudent.setBounds(715, 195, 148, 30);
		rdbtnStudent.setFont(new Font("Dialog", Font.PLAIN, 18));

		JRadioButton rdbtnNonteaching = new JRadioButton("Non-Teaching");
		rdbtnNonteaching.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(rdbtnNonteaching.isSelected())
				{
					lblClass.setEnabled(false);
					comboClass.setEnabled(false);
				}
			}
		});
		rdbtnNonteaching.setBounds(715, 262, 148, 32);
		rdbtnNonteaching.setFont(new Font("Dialog", Font.PLAIN, 18));

		ButtonGroup grup1 = new ButtonGroup();
		grup1.add(rdbtnNonteaching);
		grup1.add(rdbtnStudent);
		grup1.add(rdbtnTeacher);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(715, 490, 188, 48);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name1 = (String) textName.getText();
				String class1 = (String) comboClass.getSelectedItem();
				String dept1 = (String) comboDept.getSelectedItem();
				String contact1 = textContact.getText();

				String gender2 = "";
				String prof2 = "";

				int abc = contact1.length();

				// ==================================
				String name3, class3, dept3, gender3, prof3;

				int flag = 0;
				// ===================================
				Enumeration<AbstractButton> prof1 = grup1.getElements();
				while (prof1.hasMoreElements()) {
					JRadioButton jrd2 = (JRadioButton) prof1.nextElement();
					if (jrd2.isSelected())
						prof2 = jrd2.getText();
				}

				Enumeration<AbstractButton> gender1 = grup.getElements();
				while (gender1.hasMoreElements()) {
					JRadioButton jrd1 = (JRadioButton) gender1.nextElement();
					if (jrd1.isSelected())
						gender2 = jrd1.getText();
				}

				if (prof2.equals("")) {
					JOptionPane.showMessageDialog(frame, "Enter proper Profession", "Error", JOptionPane.ERROR_MESSAGE);
					flag = 1;
				} else if (name1.equals("")) {
					JOptionPane.showMessageDialog(frame, "Enter proper Name", "Error", JOptionPane.ERROR_MESSAGE);
					flag = 1;
				} else if (class1.equals("Select")) {
					JOptionPane.showMessageDialog(frame, "Enter proper Class", "Error", JOptionPane.ERROR_MESSAGE);
					flag = 1;
				} else if (dept1.equals("Select")) {
					JOptionPane.showMessageDialog(frame, "Enter proper Department", "Error", JOptionPane.ERROR_MESSAGE);
					flag = 1;
				} else if (gender2.equals("")) {
					JOptionPane.showMessageDialog(frame, "Enter proper Gender type", "Error",
							JOptionPane.ERROR_MESSAGE);
					flag = 1;
				} else if (contact1.equals("")) {
					JOptionPane.showMessageDialog(frame, "Enter proper Contact number", "Error",
							JOptionPane.ERROR_MESSAGE);
					flag = 1;
				} else if (!(contact1.startsWith("7") || contact1.startsWith("8") || contact1.startsWith("9"))) {
					JOptionPane.showMessageDialog(frame, "Enter proper Contact number", "Error",
							JOptionPane.ERROR_MESSAGE);
					flag = 1;
				} else if (abc != 10) {
					JOptionPane.showMessageDialog(frame, "Enter proper Contact number", "Error",
							JOptionPane.ERROR_MESSAGE);
					flag = 1;
				}
				if (flag == 0) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Project?allowPublicKeyRetrieval=true&useSSL=false",
								"root", "mysql");

						// =============================================
						PreparedStatement s1 = con.prepareStatement("Select * from FStudent;");
						ResultSet rs1 = s1.executeQuery();
						while (rs1.next()) {
							name3 = rs1.getString("Name");
							class3 = rs1.getString("Class");
							dept3 = rs1.getString("Department");
							gender3 = rs1.getString("Gender");
							prof3 = rs1.getString("Profession");

							if (prof2.equals(prof3) && name3.equals(name1) && class3.equals(class1)
									&& gender2.equals(gender3) && dept1.equals(dept3)) {

								flag = 1;

								JOptionPane.showMessageDialog(frame, "Student already exists!", "Error",
										JOptionPane.ERROR_MESSAGE);
							}
						}
						if (flag == 0) {

							PreparedStatement ps = con.prepareStatement(
									"insert into FStudent (Profession,Name,Class,Department,Gender,Contact) values(?,?,?,?,?,?);");

							ps.setString(1, prof2);
							ps.setString(2, name1);
							ps.setString(3, class1);
							ps.setString(4, dept1);
							ps.setString(5, gender2);
							ps.setString(6, contact1);

							ps.executeUpdate();

							ps.close();
						}

						// ===================================================================

						PreparedStatement s = con.prepareStatement(
								"Select * from FStudent where Profession=? and Name=? and Class=? and Department=? and Gender=?");
						s.setString(1, prof2);
						s.setString(2, name1);
						s.setString(3, class1);
						s.setString(4, dept1);
						s.setString(5, gender2);
						ResultSet rs = s.executeQuery();
						while (rs.next())
							studsr = rs.getInt("Sr_No");
						System.out.println("Student Sr no is:" + studsr);
						s.close();

						if (tabname.equals("Book")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(201,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Charger")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(202,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Computer")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(203,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Earphone")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(204,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Helmet")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(205,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Jewellery")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(206,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Keyy")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(207,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Mobile")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(208,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Pendrive")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(209,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Wallet")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(210,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						} else if (tabname.equals("Watch")) {
							PreparedStatement pss = con
									.prepareStatement("insert into Lost(Item_Id,Stud_Id,Item_Sr) values(211,?,?);");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						}

						if (tabname.equals("Book")) {
							PreparedStatement pss = con
									.prepareStatement("select Brand,Colour from Book where Brand=? and Colour=?;");
							pss.setInt(1, studsr);
							pss.setInt(2, srno);
							pss.executeUpdate();
						}

						con.close();

						frame.setVisible(false);
						JOptionPane.showMessageDialog(frame, "Saved successfully!!", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						HomePage.main(null);

					} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblEnter);
		frame.getContentPane().add(lblProfession);
		frame.getContentPane().add(rdbtnTeacher);
		frame.getContentPane().add(rdbtnStudent);
		frame.getContentPane().add(rdbtnNonteaching);
		frame.getContentPane().add(lblName);
		frame.getContentPane().add(textName);
		frame.getContentPane().add(lblClass);
		frame.getContentPane().add(comboClass);
		frame.getContentPane().add(lblDepartment);
		frame.getContentPane().add(comboDept);
		frame.getContentPane().add(lblGender);
		frame.getContentPane().add(rdbtnMale);
		frame.getContentPane().add(rdbtnFemale);
		frame.getContentPane().add(lblContactNumber);
		frame.getContentPane().add(textContact);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abhin\\eclipse-workspace\\Project\\src\\Image_s\\filling-a-form.jpg"));
		lblNewLabel.setBounds(0, 0, 1026, 613);
		frame.getContentPane().add(lblNewLabel);

		frame.addWindowListener(new WindowListener() {

			public void windowOpened(WindowEvent arg0) {
			}

			public void windowIconified(WindowEvent arg0) {
				// ForMinimize
			}

			public void windowDeiconified(WindowEvent arg0) {
			}

			public void windowDeactivated(WindowEvent arg0) {
				Rectangle r = frame.getMaximizedBounds();
				System.out.println(r);

			}

			public void windowClosing(WindowEvent arg0) {

				JOptionPane.showMessageDialog(frame, "All data will be lost!!", "Warning", JOptionPane.ERROR_MESSAGE);
				int dialog1 = JOptionPane.YES_NO_OPTION;
				int dialog2 = JOptionPane.showConfirmDialog(null, "Confirm ?", "Warning", dialog1);
				if (dialog2 == JOptionPane.YES_OPTION) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Project?allowPublicKeyRetrieval=true&useSSL=false",
								"root", "mysql");

						if (tabname.equals("Book")) {
							PreparedStatement ps = con.prepareStatement("delete from LBook where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Book is:" + srno);
						} else if (tabname.equals("Charger")) {
							PreparedStatement ps = con.prepareStatement("delete from LCharger where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Charger is:" + srno);
						} else if (tabname.equals("Computer")) {
							PreparedStatement ps = con.prepareStatement("delete from LComputer where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Computer is:" + srno);
						} else if (tabname.equals("Earphone")) {
							PreparedStatement ps = con.prepareStatement("delete from LEarphone where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Earphone is:" + srno);
						} else if (tabname.equals("Helmet")) {
							PreparedStatement ps = con.prepareStatement("delete from LHelmet where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Helmet is:" + srno);
						} else if (tabname.equals("Jewellery")) {
							PreparedStatement ps = con.prepareStatement("delete from LJewellery where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Jewellery is:" + srno);
						} else if (tabname.equals("Keyy")) {
							PreparedStatement ps = con.prepareStatement("delete from LKeyy where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Keyy is:" + srno);
						} else if (tabname.equals("Mobile")) {
							PreparedStatement ps = con.prepareStatement("delete from LMobile where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Mobile is:" + srno);
						} else if (tabname.equals("Pendrive")) {
							PreparedStatement ps = con.prepareStatement("delete from LPendrive where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Pendrive is:" + srno);
						} else if (tabname.equals("Wallet")) {
							PreparedStatement ps = con.prepareStatement("delete from LWallet where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Wallet is:" + srno);
						} else if (tabname.equals("Watch")) {
							PreparedStatement ps = con.prepareStatement("delete from LWatch where Sr_No=?;");
							ps.setInt(1, srno);
							ps.executeUpdate();
							System.out.println("sr no of deleted Watch is:" + srno);
						}
						srno = 0;
						tabname = "";
						con.close();

						HomePage.main(null);
						frame.setVisible(false);

					} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
					}
				} else if (dialog2 == JOptionPane.NO_OPTION) {
				}
			}

			public void windowClosed(WindowEvent arg0) {
			}

			public void windowActivated(WindowEvent arg0) {
			}
		});
	}
}