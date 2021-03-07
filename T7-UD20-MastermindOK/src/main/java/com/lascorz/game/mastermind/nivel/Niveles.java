package com.lascorz.game.mastermind.nivel;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

import com.lascorz.game.mastermind.avanzado.Avanzado;
import com.lascorz.game.mastermind.intermedio.Intermedio;
import com.lascorz.game.mastermind.principiante.Principiante;

public class Niveles extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Niveles level;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level = new Niveles();
					level.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Niveles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 319);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.setBounds(79, 34, 189, 155);
		contentPane.add(layeredPane);
		
		// Creación de los botones para definir el nivel del juego : principiante, intermedio, avanzado //

		rdbtnNewRadioButton_1 = new JRadioButton("Intermedio");
		rdbtnNewRadioButton_1.setBounds(54, 59, 109, 23);
		rdbtnNewRadioButton_1.setSelected(false);
		layeredPane.add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton = new JRadioButton("Principiante");
		rdbtnNewRadioButton.setBounds(54, 23, 109, 23);
		rdbtnNewRadioButton.setSelected(false);

		layeredPane.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_2 = new JRadioButton("Avanzado");
		rdbtnNewRadioButton_2.setBounds(54, 97, 109, 23);
		rdbtnNewRadioButton_2.setSelected(false);
		layeredPane.add(rdbtnNewRadioButton_2);

		ButtonGroup group = new ButtonGroup();

		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(79, 220, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(179, 220, 89, 23);
		contentPane.add(btnNewButton_1);

		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level.dispose();
			}
			
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
					if (Principiante.principiante == null) {
						System.out.print("asdf");
						Principiante.main(null);
					}
					if (Avanzado.avanzado != null) {
						System.out.print("FFFF");
						Avanzado.avanzado.dispose();
						Principiante.main(null);
					}
					if(!(Intermedio.intermedio == null)) {
            			Intermedio.intermedio.dispose();
            		}
					level.dispose();
				}
				if (rdbtnNewRadioButton_1.isSelected()) {
					if (Intermedio.intermedio == null) {
						Intermedio.main(null);
					}
					if (!(Principiante.principiante == null)) {
						Principiante.principiante.dispose();
					}
					if (!(Avanzado.avanzado == null)) {
						Avanzado.avanzado.dispose();
					}
					level.dispose();
				}
				if (rdbtnNewRadioButton_2.isSelected()) {
					if (Avanzado.avanzado == null) {
						Avanzado.main(null);
					}
					if (Principiante.principiante != null) {
						Principiante.principiante.dispose();
					}
					if (!(Intermedio.intermedio == null)) {
						Intermedio.intermedio.dispose();
					}
					level.dispose();
				}
			}
		});
	}
}
