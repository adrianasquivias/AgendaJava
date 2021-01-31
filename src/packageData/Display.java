package packageData;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.Date;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import com.toedter.components.JSpinField;

public class Display extends JFrame {
	private JTextField textName;
	private JTextField textStartTime;
	private JTextField textEndingTime;
	private JTextField textDescription;
	private JTextField text;
	private JTable tableDate;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Display frame = new Display();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Display() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 416);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		tableDate = new JTable();
		tableDate.setBackground(new Color(255, 250, 240));
		tableDate.setFont(new Font("Times New Roman", Font.BOLD, 11));
		tableDate.setForeground(Color.BLACK);
		tableDate.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nombre", "Fecha", "Hora I", "Hora F", "Descripci\u00F3n", "Ubicaci\u00F3n"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"name", "date", "timeS", "timeE", "description", "ubication"
			}
		));
		tableDate.setBounds(289, 0, 467, 366);
		getContentPane().add(tableDate);
		
		JLabel lblDate = new JLabel("Fecha");
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDate.setForeground(new Color(128, 128, 128));
		lblDate.setBounds(50, 97, 46, 14);
		getContentPane().add(lblDate);
		
		JLabel lblDescription = new JLabel("Descripci\u00F3n");
		lblDescription.setForeground(new Color(128, 128, 128));
		lblDescription.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDescription.setBounds(48, 219, 109, 14);
		getContentPane().add(lblDescription);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblName.setForeground(new Color(128, 128, 128));
		lblName.setBounds(50, 52, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblTittle = new JLabel("AGENDA");
		lblTittle.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTittle.setForeground(new Color(139, 69, 19));
		lblTittle.setBounds(106, 22, 83, 31);
		getContentPane().add(lblTittle);
		
		JLabel lblUbicaton = new JLabel("Ubicaci\u00F3n");
		lblUbicaton.setForeground(new Color(128, 128, 128));
		lblUbicaton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblUbicaton.setBounds(117, 265, 61, 14);
		getContentPane().add(lblUbicaton);
		
		JLabel lblStartTime = new JLabel("Hora de inicio");
		lblStartTime.setForeground(new Color(128, 128, 128));
		lblStartTime.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblStartTime.setBounds(48, 124, 83, 14);
		getContentPane().add(lblStartTime);
		
		JLabel lblEndingTime = new JLabel("Hora de finalizaci\u00F3n");
		lblEndingTime.setForeground(new Color(128, 128, 128));
		lblEndingTime.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblEndingTime.setBounds(48, 170, 109, 14);
		getContentPane().add(lblEndingTime);
		
		textName = new JTextField();
		textName.setBounds(48, 66, 120, 20);
		getContentPane().add(textName);
		textName.setColumns(10);
		
		textStartTime = new JTextField();
		textStartTime.setBounds(48, 139, 86, 20);
		getContentPane().add(textStartTime);
		textStartTime.setColumns(10);
		
		textEndingTime = new JTextField();
		textEndingTime.setBounds(48, 188, 86, 20);
		getContentPane().add(textEndingTime);
		textEndingTime.setColumns(10);
		
		textDescription = new JTextField();
		textDescription.setBounds(48, 234, 166, 20);
		getContentPane().add(textDescription);
		textDescription.setColumns(10);
		
		text = new JTextField();
		text.setBounds(106, 277, 86, 20);
		getContentPane().add(text);
		text.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(85, 91, 109, 20);
		getContentPane().add(dateChooser);
		
		JButton btnSave = new JButton("GUARDAR");
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 8));
		btnSave.setBounds(114, 314, 75, 23);
		getContentPane().add(btnSave);
		
		JLabel lblWallpaper = new JLabel("New label");
		lblWallpaper.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblWallpaper.setForeground(new Color(128, 128, 128));
		lblWallpaper.setIcon(new ImageIcon("C:\\Users\\adria\\Downloads\\PhotoWallpaper (2).jpg"));
		lblWallpaper.setBounds(0, 0, 279, 377);
		getContentPane().add(lblWallpaper);
	}
}
