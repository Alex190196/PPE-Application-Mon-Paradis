package APP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Dash extends JFrame {

	private JPanel contentPane;
	public String priviledge;
	public String myname;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dash frame = new Dash("role","nom");
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
	public Dash(String priviledge, String myname) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonPradis = new JLabel("Mon Paradis");
		lblMonPradis.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMonPradis.setForeground(Color.BLACK);
		lblMonPradis.setBounds(165, 13, 131, 29);
		contentPane.add(lblMonPradis);
		
		JButton btnClients = new JButton("Clients");
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    client client = new client ();
			    client.showTable();
			    client.setVisible(true);
			}
		});
		btnClients.setBounds(27, 67, 97, 25);
		
		
		JButton btnChambres = new JButton("Chambres");
		btnChambres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    chambre chambre = new chambre ();
			    chambre.showTable();
			    chambre.setVisible(true);
			}
		});
		btnChambres.setBounds(27, 117, 97, 25);
		
		
		JButton btnReservation = new JButton("Reservation");
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    reservation reservation = new reservation ();
			    chambre.showTable();
			    reservation.setVisible(true);
			}
		});
		btnReservation.setBounds(27, 159, 97, 25);
		
		
		JButton btnUtilisateur = new JButton("Utilisateur");
		btnUtilisateur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user user = new user ();
			    user.showTable();
			    user.setVisible(true);
				
			}
		});
		btnUtilisateur.setBounds(27, 197, 97, 25);
		
		
		JButton btnDeconnexion = new JButton("Deconnexion");
		btnDeconnexion.setBounds(230, 215, 116, 25);
		contentPane.add(btnDeconnexion);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\APP Bureau\\img\\75.jpg"));
		lblNewLabel.setBounds(134, 49, 286, 153);
		contentPane.add(lblNewLabel);
		
		System.out.println(priviledge);
		System.out.println(myname);
		
		try {
			
			
		 if (priviledge.equals("administrateur")) {
			 
				contentPane.add(btnChambres);
				contentPane.add(btnReservation);
				contentPane.add(btnClients);
				contentPane.add(btnUtilisateur);
			 
		 }else if (priviledge.equals("utilisateur")) {
				contentPane.add(btnChambres);
				contentPane.add(btnReservation);
				contentPane.add(btnClients);
		 }
			
		}catch(Exception e) {
			
			
		}
//				try {
//			if (priviledge.equals("Administrateur")) {
//		
//		contentPane.add(btnChambres);
//		contentPane.add(btnReservation);
//			contentPane.add(btnClients);
//			contentPane.add(btnUtilisateur);
//			}
//			
//		}else  if (priviledge.equals("utilisateur")) {
//			contentPane.add(btnChambres);
//			contentPane.add(btnReservation);
//			contentPane.add(btnUtilisateur);
//		}
//		
//		catch(Exception e) {
//			System.out.print(e);}
		
			
		
	}
		}
