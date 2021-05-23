package com.Lost;

import java.awt.EventQueue;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Choice;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.Found.Found_UserDetails;
import com.Home.HomePage;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSeparator;
import javax.swing.JTable;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;

public class Lost_desc {

	private JFrame frame;
	private JTextField textName;
	private JTextField textBookTitle;
	private JTextField textBookAuthor;
	private JTextField textSize;
	private JTable table;
	private JTable table_1;
	public static String brandd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lost_desc window = new Lost_desc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public Lost_desc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(0, 10, 1408, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblColour = new JLabel("Colour");
		lblColour.setForeground(Color.BLACK);
		lblColour.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblColour.setBounds(33, 138, 68, 21);
		frame.getContentPane().add(lblColour);
		ItemListener l = null;

		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setForeground(Color.BLACK);
		lblBrand.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBrand.setBounds(33, 178, 59, 25);
		frame.getContentPane().add(lblBrand);

		JLabel lblWhere = new JLabel("Where");
		lblWhere.setForeground(Color.BLACK);
		lblWhere.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWhere.setBounds(33, 215, 82, 35);
		frame.getContentPane().add(lblWhere);

		JComboBox comboItem = new JComboBox();
		comboItem.setBounds(130, 90, 173, 24);
		comboItem.addItem("Select");
		comboItem.addItem("Mobile");
		comboItem.addItem("Jewellery");
		comboItem.addItem("Computer");
		comboItem.addItem("Watch");
		comboItem.addItem("Charger");
		comboItem.addItem("Key");
		comboItem.addItem("Book");
		comboItem.addItem("Helmet");
		comboItem.addItem("Wallet");
		comboItem.addItem("Earphone");
		comboItem.addItem("Pendrive");
		frame.getContentPane().add(comboItem);

		JComboBox comboColour = new JComboBox();
		comboColour.setBounds(130, 136, 173, 24);
		comboColour.addItem("Select");
		comboColour.addItem("Violet");
		comboColour.addItem("Blue");
		comboColour.addItem("Green");
		comboColour.addItem("Yellow");
		comboColour.addItem("Orange");
		comboColour.addItem("Red");
		comboColour.addItem("Pink");
		comboColour.addItem("White");
		comboColour.addItem("Black");
		comboColour.addItem("Grey");
		comboColour.addItem("Silver");
		comboColour.addItem("Golden");
		comboColour.addItem("Brown");
		comboColour.addItem("MultiColour");
		frame.getContentPane().add(comboColour);

		JComboBox comboWhere = new JComboBox();
		comboWhere.setBounds(130, 220, 173, 24);
		comboWhere.addItem("Select");
		comboWhere.addItem("Play Ground");
		comboWhere.addItem("Library");
		comboWhere.addItem("Classroom");
		comboWhere.addItem("Canteen");
		comboWhere.addItem("Parking");
		frame.getContentPane().add(comboWhere);

		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(31, 273, 70, 19);
		frame.getContentPane().add(lblName);

		textName = new JTextField();
		textName.setBounds(130, 273, 173, 19);
		frame.getContentPane().add(textName);
		textName.setColumns(10);

		JLabel lblTitle = new JLabel("Book Title");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitle.setBounds(33, 311, 70, 15);
		frame.getContentPane().add(lblTitle);

		textBookTitle = new JTextField();
		textBookTitle.setBounds(130, 309, 173, 19);
		frame.getContentPane().add(textBookTitle);
		textBookTitle.setColumns(10);

		JLabel lblBookAuthor = new JLabel("Book Author");
		lblBookAuthor.setForeground(Color.BLACK);
		lblBookAuthor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBookAuthor.setBounds(33, 353, 94, 15);
		frame.getContentPane().add(lblBookAuthor);

		textBookAuthor = new JTextField();
		textBookAuthor.setBounds(130, 351, 173, 19);
		frame.getContentPane().add(textBookAuthor);
		textBookAuthor.setColumns(10);

		JLabel lblType = new JLabel("Type");
		lblType.setForeground(Color.BLACK);
		lblType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblType.setBounds(33, 391, 70, 15);
		frame.getContentPane().add(lblType);

		JComboBox comboType = new JComboBox();
		comboType.setBounds(130, 386, 173, 24);
		comboType.addItem("Select");
		frame.getContentPane().add(comboType);

		JLabel lblStrapType = new JLabel("Strap Type");
		lblStrapType.setForeground(Color.BLACK);
		lblStrapType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStrapType.setBounds(33, 431, 94, 15);
		frame.getContentPane().add(lblStrapType);

		JLabel lblDisplayType = new JLabel("Display Type");
		lblDisplayType.setForeground(Color.BLACK);
		lblDisplayType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDisplayType.setBounds(33, 471, 94, 15);
		frame.getContentPane().add(lblDisplayType);

		JComboBox comboStrapType = new JComboBox();
		comboStrapType.setBounds(130, 426, 173, 24);

		frame.getContentPane().add(comboStrapType);

		JComboBox comboDisplayType = new JComboBox();
		comboDisplayType.setBounds(130, 466, 173, 24);

		frame.getContentPane().add(comboDisplayType);

		JLabel lblPasswordType = new JLabel("Security Type");
		lblPasswordType.setForeground(Color.BLACK);
		lblPasswordType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPasswordType.setBounds(366, 95, 122, 15);
		frame.getContentPane().add(lblPasswordType);

		JComboBox comboPass = new JComboBox();
		comboPass.setBounds(492, 90, 207, 24);

		frame.getContentPane().add(comboPass);

		JLabel lblStone = new JLabel("Stone");
		lblStone.setForeground(Color.BLACK);
		lblStone.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStone.setBounds(366, 141, 70, 15);
		frame.getContentPane().add(lblStone);

		JComboBox comboStone = new JComboBox();
		comboStone.setBounds(492, 136, 207, 24);

		frame.getContentPane().add(comboStone);

		JLabel lblKeyChain = new JLabel("Key Chain");
		lblKeyChain.setForeground(Color.BLACK);
		lblKeyChain.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKeyChain.setBounds(366, 183, 70, 15);
		frame.getContentPane().add(lblKeyChain);

		JComboBox comboKC = new JComboBox();
		comboKC.setBounds(492, 178, 207, 24);

		frame.getContentPane().add(comboKC);

		JLabel lblSize = new JLabel("Size (in GB)");
		lblSize.setForeground(Color.BLACK);
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSize.setBounds(366, 225, 94, 15);
		frame.getContentPane().add(lblSize);

		textSize = new JTextField();
		textSize.setBounds(492, 223, 207, 19);
		frame.getContentPane().add(textSize);
		textSize.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(54, 324, 1, 2);
		frame.getContentPane().add(separator);

		JComboBox comboBrand = new JComboBox();
		comboBrand.setBounds(130, 181, 173, 21);

		frame.getContentPane().add(comboBrand);

		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 1394, 547);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblWelcomeUser = new JLabel("Welcome User");
		lblWelcomeUser.setBounds(568, 10, 130, 21);
		panel.add(lblWelcomeUser);
		lblWelcomeUser.setFont(new Font("Sitka Subheading", Font.BOLD, 18));

		JLabel lblWhen = new JLabel("When");
		lblWhen.setForeground(Color.BLACK);
		lblWhen.setBounds(366, 261, 45, 13);
		panel.add(lblWhen);
		lblWhen.setFont(new Font("Tahoma", Font.BOLD, 13));

		JDateChooser whenn = new JDateChooser();
		LocalDate today = LocalDate.now();
		Date d1 = new Date(2018,10,04);
		/*d1.setYear(today.getYear());
		d1.setDate(today.getDayOfMonth());
		d1.setMonth(today.getMonthValue());*/
		whenn.setDate(d1);
		whenn.setBounds(167, 379, 198, 29);
		whenn.setBounds(491, 261, 207, 19);
		panel.add(whenn);

		JComboBox comboWhich = new JComboBox();
		comboWhich.setBounds(491, 300, 207, 21);
		panel.add(comboWhich);

		JLabel lblWhich = new JLabel("Which");
		lblWhich.setForeground(Color.BLACK);
		lblWhich.setBounds(366, 303, 45, 13);
		panel.add(lblWhich);
		lblWhich.setFont(new Font("Tahoma", Font.BOLD, 13));

		JComboBox comboSC = new JComboBox();
		comboSC.setBounds(491, 341, 207, 21);
		panel.add(comboSC);

		JLabel lblStoneColour = new JLabel("Stone Colour");
		lblStoneColour.setForeground(Color.BLACK);
		lblStoneColour.setBounds(366, 344, 94, 13);
		panel.add(lblStoneColour);
		lblStoneColour.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label = new JLabel("Description:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(366, 372, 136, 33);
		panel.add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		textArea.setBounds(366, 415, 438, 105);
		panel.add(textArea);

		// String dob=""+dateChooser.getDate();
		// SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
		// String aaa=(String)Date_Format.format(dateChooser.getDate());

		// java.util.Date departDateD=dateChooser.getDate();
		// SimpleDateFormat odate = new SimpleDateFormat("yyyy-MM-dd");
		// String departdate=odate.format(departDateD);
		//

		table_1 = new JTable(10, 8);
		table_1.setShowHorizontalLines(false);
		table_1.setShowVerticalLines(false);
		table_1.setShowGrid(false);
		table_1.setRowSelectionAllowed(false);
		table_1.setEnabled(false);
		table_1.setAutoCreateColumnsFromModel(true);
		table_1.setBounds(718, 78, 657, 290);
		table_1.setVisible(false);
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean clik = table_1.isEditing();
				if (clik == false) {
					JOptionPane.showMessageDialog(null, "You cant edit row!");
				}

				// refresh(brandd);
			}
		});

		panel.add(table_1);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int flag = 1;

				String item1 = (String) comboItem.getSelectedItem();
				String brand1 = (String) comboBrand.getSelectedItem();
				String name1 = (String) textName.getText();
				String colour1 = (String) comboColour.getSelectedItem();
				String where1 = (String) comboWhere.getSelectedItem();
				String ptype = (String) comboPass.getSelectedItem();
				String btitle = (String) textBookTitle.getText();
				String bauthor = (String) textBookAuthor.getText();
				String type1 = (String) comboType.getSelectedItem();
				String strapType1 = (String) comboStrapType.getSelectedItem();
				String displayType = (String) comboDisplayType.getSelectedItem();
				String stone1 = (String) comboStone.getSelectedItem();
				String keyChain1 = (String) comboKC.getSelectedItem();
				String which1 = (String) comboWhich.getSelectedItem();
				String size1 = (String) textSize.getText();
				String stoneColour = (String) comboSC.getSelectedItem();
				SimpleDateFormat when1 = new SimpleDateFormat("yyyy-MM-dd");
				String when2 = when1.format(whenn.getDate());
				String desc1=  textArea.getText();
								
				if (item1.equals("Select")) {

					JOptionPane.showMessageDialog(frame, "Select an Item", "Error", JOptionPane.ERROR_MESSAGE);
					flag = 0;
				}

				else if (item1.equals("Computer")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textName.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Enter the Model Name", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboPass.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Security Type", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection(
									"jdbc:mysql://127.0.0.1:3306/Project?allowPublicKeyRetrieval=true&useSSL=false",
									"root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LComputer (Brand,Name,Colour,Wheree,Whenn,Password_type,Status,Item_Id,Description) values (?,?,?,?,?,?,'n',203,?);");
							ps.setString(1, brand1);
							ps.setString(2, name1);
							ps.setString(3, colour1);
							ps.setString(4, where1);
							ps.setString(5, when2);
							ps.setString(6, ptype);
							ps.setString(7, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							// frame.setVisible(false);
							// System.out.println("comp!!!!!!!!");
							//
							// System.out.println("Brand is:"+brand1);
							// System.out.println("colour is:"+colour1);
							// System.out.println("ptype is:"+ptype);

							Lost_UserDetails.tabname = "Computer";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LComputer where Brand=? and Name=? and Colour=? and Password_type=?;");
							sq.setString(1, brand1);
							sq.setString(2, name1);
							sq.setString(3, colour1);
							sq.setString(4, ptype);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Computer Sr no is:" + Lost_UserDetails.srno);

							// Statement ps=null;
						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// refresh(brand1);
						// Tables.main(null);
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}

				} else if (item1.equals("Mobile")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textName.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Enter the Model Name", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboPass.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Security Type", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}

					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection(
									"jdbc:mysql://127.0.0.1:3306/Project?allowPublicKeyRetrieval=true&useSSL=false",
									"root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LMobile (Brand,Name,Colour,Wheree,Whenn,Password_type,Status,Item_Id,Description) values (?,?,?,?,?,?,'n',208,?);");
							ps.setString(1, brand1);
							ps.setString(2, name1);
							ps.setString(3, colour1);
							ps.setString(4, where1);
							ps.setString(5, when2);
							ps.setString(6, ptype);
							ps.setString(7, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							Lost_UserDetails.tabname = "Mobile";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LMobile where Brand=? and Name=? and Colour=? and Password_type=?;");
							sq.setString(1, brand1);
							sq.setString(2, name1);
							sq.setString(3, colour1);
							sq.setString(4, ptype);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Mobile Sr no is:" + Lost_UserDetails.srno);

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Lost_UserDetails.main(null);
						frame.setVisible(false);
						// Tables.main(null);
					}
				} else if (item1.equals("Jewellery")) {
					if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhich.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select Jewel", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (stone1.equals("Yes") && colour1.equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Stone Colour", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}

					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection(
									"jdbc:mysql://127.0.0.1:3306/Project?allowPublicKeyRetrieval=true&useSSL=false",
									"root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LJewellery (Type,Colour,Wheree,Whenn,Stone,Which,Status,Item_Id,Description) values (?,?,?,?,?,?,'n',206,?);");
							ps.setString(1, type1);
							ps.setString(2, stoneColour);
							ps.setString(3, where1);
							ps.setString(4, when2);
							ps.setString(5, stone1);
							ps.setString(6, which1);
							ps.setString(7, desc1);
							ps.executeUpdate();
							System.out.println("jewl");

							Lost_UserDetails.tabname = "Jewellery";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LJewellery where Which=? and Type=? and Colour=? and Stone=?;");
							sq.setString(1, which1);
							sq.setString(2, type1);
							sq.setString(3, stoneColour);
							sq.setString(4, stone1);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Jewellery Sr no is:" + Lost_UserDetails.srno);

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}
				} else if (item1.equals("Watch")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Display Type", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboStrapType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Strap Type", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboDisplayType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}

					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LWatch (Brand,Colour,Wheree,Whenn,Strap_type,Display_type,Status,Item_Id,Description) values (?,?,?,?,?,?,'n',211,?);");
							ps.setString(1, brand1);
							ps.setString(2, colour1);
							ps.setString(3, where1);
							ps.setString(4, when2);
							ps.setString(5, strapType1);
							ps.setString(6, displayType);
							ps.setString(7, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							Lost_UserDetails.tabname = "Watch";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LWatch where Brand=? and Strap_type=? and Colour=? and Display_type=?;");
							sq.setString(1, brand1);
							sq.setString(2, strapType1);
							sq.setString(3, colour1);
							sq.setString(4, displayType);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Watch Sr no is:" + Lost_UserDetails.srno);

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}

				} else if (item1.equals("Charger")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LCharger (Brand,Colour,Wheree,Whenn,Type,Status,Item_Id,Description) values (?,?,?,?,?,'n',202,?);");
							ps.setString(1, brand1);
							ps.setString(2, colour1);
							ps.setString(3, where1);
							ps.setString(4, when2);
							ps.setString(5, type1);
							ps.setString(6, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							Lost_UserDetails.tabname = "Charger";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LCharger where Brand=? and Colour=? and Wheree=? and Type=?;");
							sq.setString(1, brand1);
							// sq.setString(2, name1);
							sq.setString(2, colour1);
							sq.setString(3, where1);
							sq.setString(4, type1);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Charger Sr no is:" + Lost_UserDetails.srno);

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}

				} else if (item1.equals("Key")) {
					if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LKeyy (Brand,Type,Key_Chain,Wheree,Whenn,Status,Item_Id,Description) values (?,?,?,?,?,'n',207,?);");
							ps.setString(1, brand1);
							ps.setString(2, type1);
							ps.setString(3, keyChain1);
							ps.setString(4, where1);
							ps.setString(5, when2);
							ps.setString(6, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							Lost_UserDetails.tabname = "Keyy";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LKeyy where Brand=? and Type=? and Key_Chain=? and Wheree=?;");
							sq.setString(1, brand1);
							// sq.setString(2, name1);
							sq.setString(2, type1);
							sq.setString(3, keyChain1);
							sq.setString(4, where1);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Key Sr no is:" + Lost_UserDetails.srno);
						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Key submit button");
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}

				} else if (item1.equals("Book")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textBookTitle.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Select the Book Title", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textBookAuthor.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Enter the Book Author", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LBook (Title,Author,Colour,Wheree,Whenn,Type,Status,Item_Id,Description) values (?,?,?,?,?,?,'n',201,?);");
							ps.setString(1, btitle);
							ps.setString(2, bauthor);
							ps.setString(3, colour1);
							ps.setString(4, where1);
							ps.setString(5, when2);
							ps.setString(6, type1);
							ps.setString(7, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							Lost_UserDetails.tabname = "Book";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LBook where Title=? and Author=? and Colour=? and Type=?;");
							sq.setString(1, btitle);
							// sq.setString(2, name1);
							sq.setString(2, bauthor);
							sq.setString(3, colour1);
							sq.setString(4, type1);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Book Sr no is:" + Lost_UserDetails.srno);

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}

				} else if (item1.equals("Helmet")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}					
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LHelmet (Brand,Wheree,Whenn,Type,Colour,Status,Item_Id,Description) values (?,?,?,?,?,'n',205,?);");
							ps.setString(1, brand1);
							ps.setString(2, where1);
							ps.setString(3, when2);
							ps.setString(4, type1);
							ps.setString(5, colour1);
							ps.setString(6, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							Lost_UserDetails.tabname = "Helmet";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LHelmet where Brand=? and Colour=? and Wheree=? and Type=?;");
							sq.setString(1, brand1);
							// sq.setString(2, name1);
							sq.setString(2, colour1);
							sq.setString(3, where1);
							sq.setString(4, type1);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Helmet Sr no is:" + Lost_UserDetails.srno);

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}

				} else if (item1.equals("Wallet")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LWallet (Brand,Type,Colour,Wheree,Whenn,Status,Item_Id,Description) values (?,?,?,?,?,'n',210,?);");
							ps.setString(1, brand1);
							ps.setString(2, type1);
							ps.setString(3, colour1);
							ps.setString(4, where1);
							ps.setString(5, when2);
							ps.setString(6, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							Lost_UserDetails.tabname = "Wallet";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LWallet where Brand=? and Colour=? and Wheree=? and Type=?;");
							sq.setString(1, brand1);
							// sq.setString(2, name1);
							sq.setString(2, colour1);
							sq.setString(3, where1);
							sq.setString(4, type1);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Wallet Sr no is:" + Lost_UserDetails.srno);

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}

				} else if (item1.equals("Earphone")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LEarphone (Brand,Type,Colour,Wheree,Whenn,Status,Item_Id,Description) values (?,?,?,?,?,'n',204,?);");
							ps.setString(1, brand1);
							ps.setString(2, type1);
							ps.setString(3, colour1);
							ps.setString(4, where1);
							ps.setString(5, when2);
							ps.setString(6, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							Lost_UserDetails.tabname = "Earphone";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LEarphone where Brand=? and Colour=? and Wheree=? and Type=?;");
							sq.setString(1, brand1);
							// sq.setString(2, name1);
							sq.setString(2, colour1);
							sq.setString(3, where1);
							sq.setString(4, type1);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Earphone Sr no is:" + Lost_UserDetails.srno);

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}

				} else if (item1.equals("Pendrive")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textSize.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}else if(when2.equals("3918-11-04"))
					{
						JOptionPane.showMessageDialog(frame, "Select the Proper Date", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}

					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							PreparedStatement ps = con.prepareStatement(
									"insert into LPendrive (Brand,Colour,Size,Wheree,Whenn,Status,Item_Id,Description) values (?,?,?,?,?,'n',209,?);");
							ps.setString(1, brand1);
							ps.setString(2, colour1);
							ps.setString(3, size1);
							ps.setString(4, where1);
							ps.setString(5, when2);
							ps.setString(6, desc1);
							ps.executeUpdate();
							System.out.println("jhgfjds");

							Lost_UserDetails.tabname = "Pendrive";
							PreparedStatement sq = con.prepareStatement(
									"Select * from LPendrive where Brand=? and Colour=? and Wheree=? and Size=?;");
							sq.setString(1, brand1);
							// sq.setString(2, name1);
							sq.setString(2, colour1);
							sq.setString(3, where1);
							sq.setString(4, size1);
							ResultSet rs = sq.executeQuery();

							while (rs.next())
								Lost_UserDetails.srno = rs.getInt("Sr_No");
							System.out.println("Pendrive Sr no is:" + Lost_UserDetails.srno);

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Lost_UserDetails.main(null);
						frame.setVisible(false);
					}
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmit.setBounds(889, 399, 158, 33);
		panel.add(btnSubmit);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePage.main(null);
				frame.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(1113, 399, 158, 33);
		panel.add(btnBack);

		JLabel lblEnterTheFollowing = new JLabel("Enter the following details:");
		lblEnterTheFollowing.setBounds(23, 42, 258, 27);
		panel.add(lblEnterTheFollowing);
		lblEnterTheFollowing.setFont(new Font("Times New Roman", Font.BOLD, 20));

		JLabel lblSimilarFoundItems = new JLabel("Similar found items:");
		lblSimilarFoundItems.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSimilarFoundItems.setBounds(721, 45, 235, 23);
		lblSimilarFoundItems.setVisible(false);
		panel.add(lblSimilarFoundItems);

		JButton btnRelaredItems = new JButton("Related Items");
		btnRelaredItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSimilarFoundItems.setVisible(true);
				table_1.setVisible(true);
				int flag = 1;

				String item1 = (String) comboItem.getSelectedItem();
				String brand1 = (String) comboBrand.getSelectedItem();
				String name1 = (String) textName.getText();
				String colour1 = (String) comboColour.getSelectedItem();
				String where1 = (String) comboWhere.getSelectedItem();
				String ptype = (String) comboPass.getSelectedItem();
				String btitle = (String) textBookTitle.getText();
				String bauthor = (String) textBookAuthor.getText();
				String type1 = (String) comboType.getSelectedItem();
				String strapType1 = (String) comboStrapType.getSelectedItem();
				String displayType = (String) comboDisplayType.getSelectedItem();
				String stone1 = (String) comboStone.getSelectedItem();
				String keyChain1 = (String) comboKC.getSelectedItem();
				String which1 = (String) comboWhich.getSelectedItem();
				String size1 = (String) textSize.getText();
				String stoneColour = (String) comboSC.getSelectedItem();
				String desc1= (String) textArea.getText();
				if (item1.equals("Select")) {

					JOptionPane.showMessageDialog(frame, "Select an Item", "Error", JOptionPane.ERROR_MESSAGE);
					flag = 0;
				}

				else if (item1.equals("Computer")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textName.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Enter the Model Name", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboPass.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Security Type", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);
					// System.out.println(dob);
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection(
									"jdbc:mysql://127.0.0.1:3306/Project?allowPublicKeyRetrieval=true&useSSL=false",
									"root", "mysql");

							String qu = "select Sr_No,Brand,Colour,Wheree,Password_type,Whenn,Description from Computer where Brand=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, brand1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Brand", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Colour", 0, 2);
								table_1.setValueAt("Security Type", 0, 3);
								table_1.setValueAt("Where", 0, 4);
								table_1.setValueAt("Whenn", 0, 5);
								table_1.setValueAt("Description", 0, 6);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Brand"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Colour"), li_row, 2);
								table_1.setValueAt(rs.getString("Password_type"), li_row, 3);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 4);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 5);
								table_1.setValueAt(rs.getString("Description"), li_row, 6);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						// refresh(brand1);
						// Tables.main(null);
					}

				} else if (item1.equals("Mobile")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textName.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Enter the Model Name", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboPass.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Security Type", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);

					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection(
									"jdbc:mysql://127.0.0.1:3306/Project?allowPublicKeyRetrieval=true&useSSL=false",
									"root", "mysql");

							String qu = "select Sr_No,Brand,Colour,Wheree,Password_type,Whenn,Description from Mobile where Brand=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, brand1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Brand", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Colour", 0, 2);
								table_1.setValueAt("Security Type", 0, 3);
								table_1.setValueAt("Where", 0, 4);
								table_1.setValueAt("Whenn", 0, 5);
								table_1.setValueAt("Description", 0, 6);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Brand"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Colour"), li_row, 2);
								table_1.setValueAt(rs.getString("Password_type"), li_row, 3);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 4);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 5);
								table_1.setValueAt(rs.getString("Description"), li_row, 6);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						// Tables.main(null);
					}
				} else if (item1.equals("Jewellery")) {
					if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhich.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select Jewel", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (stone1.equals("Yes") && stoneColour.equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Enter proper Stone Colour", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);

					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection(
									"jdbc:mysql://127.0.0.1:3306/Project?allowPublicKeyRetrieval=true&useSSL=false",
									"root", "mysql");

							String qu = "select Sr_No,Type,Colour,Wheree,Whenn,Stone,Which,Description from Jewellery where Which=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, which1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Type", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Colour", 0, 2);
								table_1.setValueAt("Where", 0, 3);
								table_1.setValueAt("When", 0, 4);
								table_1.setValueAt("Stone", 0, 5);
								table_1.setValueAt("Which", 0, 6);

								table_1.setValueAt("Description", 0, 7);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Type"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Colour"), li_row, 2);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 3);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 4);
								table_1.setValueAt(rs.getString("Stone"), li_row, 5);
								table_1.setValueAt(rs.getString("Which"), li_row, 6);

								table_1.setValueAt(rs.getString("Description"), li_row, 7);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				} else if (item1.equals("Watch")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboStrapType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Strap Type", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboDisplayType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Display type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);

					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");
							String qu = "select Sr_No,Brand,Colour,Wheree,Display_type,Whenn,Strap_type,Description from Watch where Brand=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, brand1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Brand", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Colour", 0, 2);
								table_1.setValueAt("Where", 0, 3);
								table_1.setValueAt("Display_type", 0, 4);
								table_1.setValueAt("Whenn", 0, 5);
								table_1.setValueAt("Strap_type", 0, 6);

								table_1.setValueAt("Description", 0, 7);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Brand"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Colour"), li_row, 2);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 3);
								table_1.setValueAt(rs.getString("Display_type"), li_row, 4);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 5);
								table_1.setValueAt(rs.getString("Strap_type"), li_row, 6);
								table_1.setValueAt(rs.getString("Description"), li_row, 7);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				} else if (item1.equals("Charger")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							String qu = "select Sr_No,Brand,Colour,Wheree,Type,Whenn,Description from Charger where Brand=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, brand1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Brand", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Colour", 0, 2);
								table_1.setValueAt("Type", 0, 3);
								table_1.setValueAt("Where", 0, 4);
								table_1.setValueAt("Whenn", 0, 5);
								table_1.setValueAt("Description", 0, 6);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Brand"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Colour"), li_row, 2);
								table_1.setValueAt(rs.getString("Type"), li_row, 3);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 4);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 5);
								table_1.setValueAt(rs.getString("Description"), li_row, 6);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				} else if (item1.equals("Keyy")) {
					if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							String qu = "select Sr_No,Brand,Key_Chain,Wheree,Whenn,Description from Keyy where Brand=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, brand1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Brand", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Key Chain", 0,2);
								table_1.setValueAt("Where", 0, 3);
								table_1.setValueAt("When", 0, 4);
								table_1.setValueAt("Description", 0, 5);
								// table_1.setValueAt("Status", 0, 5);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Brand"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Key Chain"), li_row, 2);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 3);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 4);
								table_1.setValueAt(rs.getString("Description"), li_row, 5);
								// table_1.setValueAt(rs.getString("Status"), li_row, 5);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				} else if (item1.equals("Book")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textBookTitle.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Select the Book Title", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textBookAuthor.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Enter the Book Author", "Error",
								JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");
							String qu = "select Sr_No,Title,Author,Type,Colour,Wheree,Whenn,Description from Book where Author=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, bauthor);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Title", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Author", 0, 2);
								table_1.setValueAt("Type", 0, 3);
								table_1.setValueAt("Colour", 0, 4);
								table_1.setValueAt("Wheree", 0, 5);
								table_1.setValueAt("Whenn", 0, 6);
								table_1.setValueAt("Description", 0, 7);

								// table_1.setValueAt("Status", 0, 5);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Title"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Author"), li_row, 2);
								table_1.setValueAt(rs.getString("Type"), li_row, 3);
								table_1.setValueAt(rs.getString("Colour"), li_row, 4);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 5);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 6);

								table_1.setValueAt(rs.getString("Description"), li_row, 7);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				} else if (item1.equals("Helmet")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} // else if (dateChooser.getDate().equals(false)) {
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);
					// }
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							String qu = "select Sr_No,Brand,Colour,Wheree,Type,Whenn,Description from Helmet where Brand=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, brand1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Brand", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Colour", 0, 2);
								table_1.setValueAt("Type", 0, 3);
								table_1.setValueAt("Where", 0, 4);
								table_1.setValueAt("Whenn", 0, 5);
								table_1.setValueAt("Description", 0, 6);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Brand"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Colour"), li_row, 2);
								table_1.setValueAt(rs.getString("Type"), li_row, 3);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 4);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 5);
								table_1.setValueAt(rs.getString("Description"), li_row, 6);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				} else if (item1.equals("Wallet")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							String qu = "select Sr_No,Brand,Colour,Wheree,Type,Whenn,Description from Wallet where Brand=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, brand1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Brand", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Colour", 0, 2);
								table_1.setValueAt("Type", 0, 3);
								table_1.setValueAt("Where", 0, 4);
								table_1.setValueAt("Whenn", 0, 5);
								table_1.setValueAt("Description", 0, 6);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Brand"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Colour"), li_row, 2);
								table_1.setValueAt(rs.getString("Type"), li_row, 3);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 4);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 5);
								table_1.setValueAt(rs.getString("Description"), li_row, 6);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				} else if (item1.equals("Earphone")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboType.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Type", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);
					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");
							String qu = "select Sr_No,Brand,Colour,Wheree,Type,Whenn,Description from Earphone where Brand=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, brand1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Brand", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Colour", 0, 2);
								table_1.setValueAt("Type", 0, 3);
								table_1.setValueAt("Where", 0, 4);
								table_1.setValueAt("Whenn", 0, 5);
								table_1.setValueAt("Description", 0, 6);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Brand"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Colour"), li_row, 2);
								table_1.setValueAt(rs.getString("Type"), li_row, 3);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 4);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 5);
								table_1.setValueAt(rs.getString("Description"), li_row, 6);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				} else if (item1.equals("Pendrive")) {
					if (comboColour.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select a Colour", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboBrand.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Brand", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (comboWhere.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(frame, "Select the Place", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					} else if (textSize.getText().equals("")) {
						JOptionPane.showMessageDialog(frame, "Enter the Memory Size", "Error", JOptionPane.ERROR_MESSAGE);
						flag = 0;
					}
					// else if (dateChooser.getDate().equals(false))
					// JOptionPane.showMessageDialog(frame, "Select a Colour", "Error",
					// JOptionPane.ERROR_MESSAGE);

					if (flag == 1) {

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager
									.getConnection("jdbc:mysql://127.0.0.1:3306/Project?useSSL=false", "root", "mysql");

							String qu = "select Sr_No,Brand,Colour,Wheree,Size,Whenn,Description from Pendrive where Brand=? ;";
							PreparedStatement ps = con.prepareStatement(qu);
							// ps.setString(1, colour1);
							// ps.setString(2, ptype);
							ps.setString(1, brand1);
							ResultSet rs = ps.executeQuery();
							int li_row = 1;
							while (rs.next()) {

								table_1.setValueAt("Sr_No", 0, 0);
								table_1.setValueAt("Brand", 0, 1);
								// table.setValueAt("Name", 0, 2);
								table_1.setValueAt("Colour", 0, 2);
								table_1.setValueAt("Size", 0, 3);
								table_1.setValueAt("Where", 0, 4);
								table_1.setValueAt("Whenn", 0, 5);
								table_1.setValueAt("Description", 0, 6);

								// table.setValueAt("When", 0, 5);

								table_1.setValueAt(rs.getInt("Sr_No"), li_row, 0);
								table_1.setValueAt(rs.getString("Brand"), li_row, 1);
								// table.setValueAt(rs.getString("Name"), li_row, 2);
								table_1.setValueAt(rs.getString("Colour"), li_row, 2);
								table_1.setValueAt(rs.getString("Size"), li_row, 3);
								table_1.setValueAt(rs.getString("Wheree"), li_row, 4);
								table_1.setValueAt(rs.getString("Whenn"), li_row, 5);
								table_1.setValueAt(rs.getString("Description"), li_row, 6);

								// table.setValueAt(rs.getDate("Whenn"), li_row, 5);

								li_row++;
							}

						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}

		});
		btnRelaredItems.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRelaredItems.setBounds(993, 462, 182, 33);
		panel.add(btnRelaredItems);

		JLabel lblItem = new JLabel("Item");
		lblItem.setForeground(Color.BLACK);
		lblItem.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblItem.setBounds(33, 82, 51, 21);
		panel.add(lblItem);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\abhin\\eclipse-workspace\\Project\\src\\Image_s\\164664518-question-mark-wallpapers (3).jpg"));
		lblNewLabel.setBounds(0, 0, 1404, 569);
		panel.add(lblNewLabel);

		comboItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String item = (String) comboItem.getSelectedItem();
				if (item.equals("Computer")) {
					comboBrand.setVisible(true);
					comboType.setVisible(false);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(false);
					comboKC.setVisible(false);
					comboPass.setVisible(true);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(true);
					textName.setVisible(true);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(true);
					lblColour.setVisible(true);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(false);
					lblName.setVisible(true);
					lblPasswordType.setVisible(true);
					lblSize.setVisible(false);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(false);
					lblType.setVisible(false);
					lblWhich.setVisible(false);
					comboBrand.removeAllItems();
					comboBrand.addItem("Select");
					comboBrand.addItem("Other");
					comboBrand.addItem("Hp");
					comboBrand.addItem("Lenovo");
					comboBrand.addItem("MI");
					comboBrand.addItem("Apple");
					comboBrand.addItem("Sony");
					comboBrand.addItem("LG");
					comboBrand.addItem("Dell");
					comboBrand.addItem("Acer");
					comboBrand.addItem("Asus");
					comboPass.removeAllItems();
					comboPass.addItem("Select");
					comboPass.addItem("Pattern");
					comboPass.addItem("Pin");
					comboPass.addItem("Password");
					comboPass.addItem("None");
				} else if (item.equals("Mobile")) {
					comboBrand.setVisible(true);
					comboType.setVisible(false);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(false);
					comboKC.setVisible(false);
					comboPass.setVisible(true);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(true);
					textName.setVisible(true);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(true);
					lblColour.setVisible(true);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(false);
					lblName.setVisible(true);
					lblPasswordType.setVisible(true);
					lblSize.setVisible(false);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(false);
					lblType.setVisible(false);
					lblWhich.setVisible(false);
					comboBrand.removeAllItems();
					comboBrand.addItem("Select");
					comboBrand.addItem("Other");
					comboBrand.addItem("Lenovo");
					comboBrand.addItem("MI");
					comboBrand.addItem("Apple");
					comboBrand.addItem("Sony");
					comboBrand.addItem("One Plus");
					comboBrand.addItem("LG");
					comboBrand.addItem("Acer");
					comboBrand.addItem("Asus");
					comboBrand.addItem("Moto");
					comboBrand.addItem("Gionee");
					comboBrand.addItem("Oppo");
					comboBrand.addItem("Vivo");
					comboBrand.addItem("Google");
					comboBrand.addItem("Huawei");
					comboBrand.addItem("Micromax");
					comboBrand.addItem("Lava");
					comboBrand.addItem("Intex");
					comboBrand.addItem("Karbonn");
					comboBrand.addItem("Nokia");
					comboBrand.addItem("Samsung");
					comboBrand.addItem("Blackberry");
					comboPass.removeAllItems();
					comboPass.addItem("Select");
					comboPass.addItem("Pattern");
					comboPass.addItem("Pin");
					comboPass.addItem("Password");
					comboPass.addItem("None");
				} else if (item.equals("Watch")) {
					comboBrand.setVisible(true);
					comboType.setVisible(false);
					comboStrapType.setVisible(true);
					comboDisplayType.setVisible(true);
					comboStone.setVisible(false);
					comboKC.setVisible(false);
					comboPass.setVisible(false);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(true);
					textName.setVisible(false);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(true);
					lblColour.setVisible(true);
					lblDisplayType.setVisible(true);
					lblKeyChain.setVisible(false);
					lblName.setVisible(false);
					lblPasswordType.setVisible(false);
					lblSize.setVisible(false);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(true);
					lblTitle.setVisible(false);
					lblType.setVisible(false);
					lblWhich.setVisible(false);
					comboBrand.removeAllItems();
					comboBrand.addItem("Select");
					comboBrand.addItem("Other");
					comboBrand.addItem("Lenovo");
					comboBrand.addItem("MI");
					comboBrand.addItem("Apple");
					comboBrand.addItem("Fastrack");
					comboBrand.addItem("Sonata");
					comboBrand.addItem("Sony");
					comboBrand.addItem("Titan");
					comboBrand.addItem("Maxima");
					comboBrand.addItem("Fit bit");
					comboBrand.addItem("Rolex");
					comboBrand.addItem("G-Shock");
					comboBrand.addItem("Fossil");
					comboStrapType.removeAllItems();
					comboStrapType.addItem("Select");
					comboStrapType.addItem("Metal");
					comboStrapType.addItem("Plastic");
					comboStrapType.addItem("Leather");
					comboStrapType.addItem("Rubber");
					comboStrapType.addItem("Other");
					comboDisplayType.removeAllItems();
					comboDisplayType.addItem("Select");
					comboDisplayType.addItem("Analog");
					comboDisplayType.addItem("Digital");
				} else if (item.equals("Charger")) {
					comboBrand.setVisible(true);
					comboType.setVisible(true);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(false);
					comboKC.setVisible(false);
					comboPass.setVisible(false);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(true);
					textName.setVisible(false);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(true);
					lblColour.setVisible(true);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(false);
					lblName.setVisible(false);
					lblPasswordType.setVisible(false);
					lblSize.setVisible(false);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(false);
					lblType.setVisible(true);
					lblWhich.setVisible(false);
					comboBrand.removeAllItems();
					comboBrand.addItem("Select");
					comboBrand.addItem("Other");
					comboBrand.addItem("Hp");
					comboBrand.addItem("Lenovo");
					comboBrand.addItem("MI");
					comboBrand.addItem("Apple");
					comboBrand.addItem("Sony");
					comboBrand.addItem("One Plus");
					comboBrand.addItem("LG");
					comboBrand.addItem("Dell");
					comboBrand.addItem("Acer");
					comboBrand.addItem("Asus");
					comboBrand.addItem("Moto");
					comboType.removeAllItems();
					comboType.addItem("Mobile");
					comboType.addItem("Laptop");
				} else if (item.equals("Helmet")) {
					comboBrand.setVisible(true);
					comboType.setVisible(true);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(false);
					comboKC.setVisible(false);
					comboPass.setVisible(false);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(true);
					textName.setVisible(false);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(true);
					lblColour.setVisible(true);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(false);
					lblName.setVisible(false);
					lblPasswordType.setVisible(false);
					lblSize.setVisible(false);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(false);
					lblType.setVisible(true);
					lblWhich.setVisible(false);
					comboBrand.removeAllItems();
					comboBrand.addItem("Select");
					comboBrand.addItem("Other");
					comboBrand.addItem("Vega");
					comboBrand.addItem("SteelBird");
					comboBrand.addItem("LS2");
					comboBrand.addItem("THH");
					comboType.removeAllItems();
					comboType.addItem("Select");
					comboType.addItem("Male");
					comboType.addItem("Female");
				} else if (item.equals("Earphone")) {
					comboBrand.setVisible(true);
					comboType.setVisible(true);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(false);
					comboKC.setVisible(false);
					comboPass.setVisible(false);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(true);
					textName.setVisible(false);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(true);
					lblColour.setVisible(true);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(false);
					lblName.setVisible(false);
					lblPasswordType.setVisible(false);
					lblSize.setVisible(false);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(false);
					lblType.setVisible(true);
					lblWhich.setVisible(false);
					comboBrand.removeAllItems();
					comboBrand.addItem("Select");
					comboBrand.addItem("Other");
					comboBrand.addItem("Hp");
					comboBrand.addItem("Lenovo");
					comboBrand.addItem("MI");
					comboBrand.addItem("Apple");
					comboBrand.addItem("Sony");
					comboBrand.addItem("Moto");
					comboBrand.addItem("Skullcandy");
					comboBrand.addItem("JBL");
					comboBrand.addItem("Philips");
					comboBrand.addItem("Lava");
					comboBrand.addItem("Seinhiesser");
					comboBrand.addItem("Boat");
					comboBrand.addItem("Nokia");
					comboBrand.addItem("Samsung");
					comboBrand.addItem("Micromax");
					comboType.removeAllItems();
					comboType.addItem("Select");
					comboType.addItem("Wired");
					comboType.addItem("Wireless");
				} else if (item.equals("Wallet")) {
					comboBrand.setVisible(true);
					comboType.setVisible(true);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(false);
					comboKC.setVisible(false);
					comboPass.setVisible(false);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(true);
					textName.setVisible(false);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(true);
					lblColour.setVisible(true);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(false);
					lblName.setVisible(false);
					lblPasswordType.setVisible(false);
					lblSize.setVisible(false);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(false);
					lblType.setVisible(true);
					lblWhich.setVisible(false);
					comboBrand.removeAllItems();
					comboBrand.addItem("Select");
					comboBrand.addItem("Other");
					comboBrand.addItem("Lee");
					comboBrand.addItem("Woodland");
					comboBrand.addItem("Zara");
					comboType.removeAllItems();
					comboType.addItem("Select");
					comboType.addItem("Male");
					comboType.addItem("Female");
				} else if (item.equals("Pendrive")) {
					comboBrand.setVisible(true);
					comboType.setVisible(false);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(false);
					comboKC.setVisible(false);
					comboPass.setVisible(false);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(true);
					textName.setVisible(false);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(true);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(true);
					lblColour.setVisible(true);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(false);
					lblName.setVisible(false);
					lblPasswordType.setVisible(false);
					lblSize.setVisible(true);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(false);
					lblType.setVisible(false);
					lblWhich.setVisible(false);
					comboBrand.removeAllItems();
					comboBrand.addItem("Select");
					comboBrand.addItem("Other");
					comboBrand.addItem("Sony");
					comboBrand.addItem("Sandisk");
					comboBrand.addItem("Trancend");
					comboBrand.addItem("iBall");
					comboBrand.addItem("Kingston");
				} else if (item.equals("Jewellery")) {
					comboBrand.setVisible(false);
					comboType.setVisible(true);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(true);
					comboKC.setVisible(false);
					comboPass.setVisible(false);
					comboWhich.setVisible(true);
					comboColour.setVisible(false);
					textName.setVisible(false);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(false);
					lblColour.setVisible(false);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(false);
					lblName.setVisible(false);
					lblPasswordType.setVisible(false);
					lblSize.setVisible(false);
					lblStone.setVisible(true);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(false);
					lblType.setVisible(true);
					lblWhich.setVisible(true);
					comboSC.setVisible(true);

					lblStoneColour.setVisible(true);
					comboWhich.removeAllItems();
					comboWhich.addItem("Select");
					comboWhich.addItem("Necklace");
					comboWhich.addItem("Ear Rings");
					comboWhich.addItem("Bracelet");
					comboWhich.addItem("Anklet");
					comboWhich.addItem("Nose Ring");
					comboWhich.addItem("Ring");
					comboWhich.addItem("Bangles");
					comboWhich.addItem("Other");
					comboType.removeAllItems();
					comboType.addItem("Select");
					comboType.addItem("Gold");
					comboType.addItem("Silver");
					comboType.addItem("Platinum");
					comboType.addItem("Dummy");
					comboStone.removeAllItems();
					comboStone.addItem("Select");
					comboStone.addItem("No");
					comboStone.addItem("Yes");
					comboSC.removeAllItems();
					comboSC.addItem("Select");
					comboSC.addItem("Violet");
					comboSC.addItem("Blue");
					comboSC.addItem("Green");
					comboSC.addItem("Yellow");
					comboSC.addItem("Orange");
					comboSC.addItem("Red");
					comboSC.addItem("Pink");
					comboSC.addItem("White");
					comboSC.addItem("Black");
					comboSC.addItem("Grey");
					comboSC.addItem("Silver");
					comboSC.addItem("Golden");
					comboSC.addItem("MultiColour");
				} else if (item.equals("Key")) {
					comboBrand.setVisible(true);
					comboType.setVisible(true);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(false);
					comboKC.setVisible(true);
					comboPass.setVisible(false);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(false);
					textName.setVisible(false);
					textBookTitle.setVisible(false);
					textBookAuthor.setVisible(false);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(false);
					lblBrand.setVisible(true);
					lblColour.setVisible(false);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(true);
					lblName.setVisible(false);
					lblPasswordType.setVisible(false);
					lblSize.setVisible(false);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(false);
					lblType.setVisible(true);
					lblWhich.setVisible(false);
					comboBrand.removeAllItems();
					comboBrand.addItem("Select");
					comboBrand.addItem("Europa");
					comboBrand.addItem("Godrej");
					comboBrand.addItem("Link");
					comboBrand.addItem("Other");
					comboType.removeAllItems();
					comboType.addItem("Select");
					comboType.addItem("Latch");
					comboType.addItem("Lock");
					comboType.addItem("Car");
					comboType.addItem("Locker");
					comboType.addItem("Bike");
					comboType.addItem("Bunch");
					comboKC.removeAllItems();
					comboKC.addItem("No");
					comboKC.addItem("Yes");
				} else if (item.equals("Book")) {
					comboBrand.setVisible(false);
					comboType.setVisible(true);
					comboStrapType.setVisible(false);
					comboDisplayType.setVisible(false);
					comboStone.setVisible(false);
					comboKC.setVisible(false);
					comboPass.setVisible(false);
					comboWhich.setVisible(false);
					comboSC.setVisible(false);
					comboColour.setVisible(true);
					textName.setVisible(false);
					textBookTitle.setVisible(true);
					textBookAuthor.setVisible(true);
					textSize.setVisible(false);
					lblBookAuthor.setVisible(true);
					lblBrand.setVisible(false);
					lblColour.setVisible(true);
					lblDisplayType.setVisible(false);
					lblKeyChain.setVisible(false);
					lblName.setVisible(false);
					lblPasswordType.setVisible(false);
					lblSize.setVisible(false);
					lblStone.setVisible(false);
					lblStoneColour.setVisible(false);
					lblStrapType.setVisible(false);
					lblTitle.setVisible(true);
					lblType.setVisible(true);
					lblWhich.setVisible(false);
					comboType.removeAllItems();
					comboType.addItem("Select");
					comboType.addItem("Adventure");
					comboType.addItem("Romantic");
					comboType.addItem("Horror");
					comboType.addItem("Fantasy");
					comboType.addItem("Kids");
					comboType.addItem("Educational");
					comboType.addItem("Other");
				}
			}
		});

	}
}
