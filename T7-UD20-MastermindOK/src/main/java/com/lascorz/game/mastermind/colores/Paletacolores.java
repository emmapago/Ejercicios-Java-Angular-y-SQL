package com.lascorz.game.mastermind.colores;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

public class Paletacolores extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Ventanas y cuadraddos diseño del juego //
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private static Paletacolores paleta;

	/**
	 * Launch the application.
	 * 
	 * @return
	 */

	public static Color main(String[] args, final JTextField color) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paleta = new Paletacolores(color);
					paleta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return null;
	}

	/**
	 * Create the frame.
	 */
	public Paletacolores(final JTextField color) {
		setBounds(100, 100, 267, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(10, 11, 20, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBackground(new Color(0, 0, 128));
		textField_1.setColumns(10);
		textField_1.setBounds(40, 11, 20, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBackground(new Color(0, 0, 255));
		textField_2.setColumns(10);
		textField_2.setBounds(70, 11, 20, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBackground(new Color(0, 100, 0));
		textField_3.setColumns(10);
		textField_3.setBounds(100, 11, 20, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBackground(new Color(0, 128, 0));
		textField_4.setColumns(10);
		textField_4.setBounds(130, 11, 20, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBackground(new Color(0, 128, 128));
		textField_5.setColumns(10);
		textField_5.setBounds(160, 11, 20, 20);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBackground(new Color(0, 191, 255));
		textField_6.setColumns(10);
		textField_6.setBounds(190, 11, 20, 20);
		contentPane.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBackground(new Color(0, 206, 209));
		textField_7.setColumns(10);
		textField_7.setBounds(220, 11, 20, 20);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBackground(new Color(0, 250, 154));
		textField_8.setColumns(10);
		textField_8.setBounds(10, 42, 20, 20);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBackground(new Color(0, 255, 0));
		textField_9.setColumns(10);
		textField_9.setBounds(40, 42, 20, 20);
		contentPane.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBackground(new Color(0, 255, 255));
		textField_10.setColumns(10);
		textField_10.setBounds(70, 42, 20, 20);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBackground(new Color(25, 25, 112));
		textField_11.setColumns(10);
		textField_11.setBounds(100, 42, 20, 20);
		contentPane.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBackground(new Color(30, 144, 255));
		textField_12.setColumns(10);
		textField_12.setBounds(130, 42, 20, 20);
		contentPane.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBackground(new Color(47, 79, 79));
		textField_13.setColumns(10);
		textField_13.setBounds(160, 42, 20, 20);
		contentPane.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setBackground(new Color(65, 105, 225));
		textField_14.setColumns(10);
		textField_14.setBounds(190, 42, 20, 20);
		contentPane.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setBackground(new Color(70, 130, 180));
		textField_15.setColumns(10);
		textField_15.setBounds(220, 42, 20, 20);
		contentPane.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setBackground(new Color(95, 158, 160));
		textField_16.setColumns(10);
		textField_16.setBounds(10, 73, 20, 20);
		contentPane.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setBackground(new Color(85, 107, 47));
		textField_17.setColumns(10);
		textField_17.setBounds(40, 73, 20, 20);
		contentPane.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setBackground(new Color(75, 0, 130));
		textField_18.setColumns(10);
		textField_18.setBounds(70, 73, 20, 20);
		contentPane.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setBackground(new Color(105, 105, 105));
		textField_19.setColumns(10);
		textField_19.setBounds(100, 73, 20, 20);
		contentPane.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setBackground(new Color(106, 90, 205));
		textField_20.setColumns(10);
		textField_20.setBounds(130, 73, 20, 20);
		contentPane.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setBackground(new Color(139, 0, 0));
		textField_21.setColumns(10);
		textField_21.setBounds(160, 73, 20, 20);
		contentPane.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setBackground(new Color(139, 0, 139));
		textField_22.setColumns(10);
		textField_22.setBounds(190, 73, 20, 20);
		contentPane.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setBackground(new Color(144, 238, 144));
		textField_23.setColumns(10);
		textField_23.setBounds(220, 73, 20, 20);
		contentPane.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setBackground(new Color(211, 211, 211));
		textField_24.setColumns(10);
		textField_24.setBounds(10, 104, 20, 20);
		contentPane.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setBackground(new Color(176, 196, 222));
		textField_25.setColumns(10);
		textField_25.setBounds(40, 104, 20, 20);
		contentPane.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setBackground(new Color(210, 105, 30));
		textField_26.setColumns(10);
		textField_26.setBounds(70, 104, 20, 20);
		contentPane.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setBackground(new Color(165, 42, 42));
		textField_27.setColumns(10);
		textField_27.setBounds(100, 104, 20, 20);
		contentPane.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setBackground(new Color(210, 105, 30));
		textField_28.setColumns(10);
		textField_28.setBounds(130, 104, 20, 20);
		contentPane.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setBackground(new Color(238, 130, 238));
		textField_29.setColumns(10);
		textField_29.setBounds(160, 104, 20, 20);
		contentPane.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setBackground(new Color(184, 134, 11));
		textField_30.setColumns(10);
		textField_30.setBounds(190, 104, 20, 20);
		contentPane.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setBackground(new Color(255, 0, 255));
		textField_31.setColumns(10);
		textField_31.setBounds(220, 104, 20, 20);
		contentPane.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setBackground(new Color(238, 232, 170));
		textField_32.setColumns(10);
		textField_32.setBounds(10, 135, 20, 20);
		contentPane.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setBackground(new Color(240, 255, 240));
		textField_33.setColumns(10);
		textField_33.setBounds(40, 135, 20, 20);
		contentPane.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setBackground(new Color(238, 130, 238));
		textField_34.setColumns(10);
		textField_34.setBounds(70, 135, 20, 20);
		contentPane.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setBackground(new Color(205, 133, 63));
		textField_35.setColumns(10);
		textField_35.setBounds(100, 135, 20, 20);
		contentPane.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setBackground(new Color(250, 235, 215));
		textField_36.setColumns(10);
		textField_36.setBounds(130, 135, 20, 20);
		contentPane.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setBackground(new Color(255, 215, 0));
		textField_37.setColumns(10);
		textField_37.setBounds(160, 135, 20, 20);
		contentPane.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setBackground(new Color(255, 20, 147));
		textField_38.setColumns(10);
		textField_38.setBounds(190, 135, 20, 20);
		contentPane.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setBackground(new Color(255, 160, 122));
		textField_39.setColumns(10);
		textField_39.setBounds(220, 135, 20, 20);
		contentPane.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setBackground(new Color(255, 255, 0));
		textField_40.setColumns(10);
		textField_40.setBounds(10, 166, 20, 20);
		contentPane.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setEditable(false);
		textField_41.setBackground(new Color(255, 215, 0));
		textField_41.setColumns(10);
		textField_41.setBounds(40, 166, 20, 20);
		contentPane.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setEditable(false);
		textField_42.setBackground(new Color(255, 222, 173));
		textField_42.setColumns(10);
		textField_42.setBounds(70, 166, 20, 20);
		contentPane.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setEditable(false);
		textField_43.setBackground(new Color(255, 250, 205));
		textField_43.setColumns(10);
		textField_43.setBounds(100, 166, 20, 20);
		contentPane.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setBackground(new Color(255, 250, 250));
		textField_44.setColumns(10);
		textField_44.setBounds(130, 166, 20, 20);
		contentPane.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setEditable(false);
		textField_45.setBackground(new Color(255, 255, 224));
		textField_45.setColumns(10);
		textField_45.setBounds(160, 166, 20, 20);
		contentPane.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setBackground(new Color(240, 248, 255));
		textField_46.setColumns(10);
		textField_46.setBounds(190, 166, 20, 20);
		contentPane.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setEditable(false);
		textField_47.setBackground(new Color(199, 21, 133));
		textField_47.setColumns(10);
		textField_47.setBounds(220, 166, 20, 20);
		contentPane.add(textField_47);

		textField_48 = new JTextField();
		textField_48.setEditable(false);
		textField_48.setBackground(new Color(169, 169, 169));
		textField_48.setColumns(10);
		textField_48.setBounds(10, 197, 20, 20);
		contentPane.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setEditable(false);
		textField_49.setBackground(new Color(255, 0, 0));
		textField_49.setColumns(10);
		textField_49.setBounds(40, 197, 20, 20);
		contentPane.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setEditable(false);
		textField_50.setBackground(new Color(255, 69, 0));
		textField_50.setColumns(10);
		textField_50.setBounds(70, 197, 20, 20);
		contentPane.add(textField_50);

		textField_51 = new JTextField();
		textField_51.setEditable(false);
		textField_51.setBackground(new Color(230, 230, 250));
		textField_51.setColumns(10);
		textField_51.setBounds(100, 197, 20, 20);
		contentPane.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setEditable(false);
		textField_52.setBackground(new Color(0, 255, 0));
		textField_52.setColumns(10);
		textField_52.setBounds(130, 197, 20, 20);
		contentPane.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setEditable(false);
		textField_53.setBackground(new Color(128, 128, 0));
		textField_53.setColumns(10);
		textField_53.setBounds(160, 197, 20, 20);
		contentPane.add(textField_53);

		textField_54 = new JTextField();
		textField_54.setEditable(false);
		textField_54.setBackground(new Color(220, 20, 60));
		textField_54.setColumns(10);
		textField_54.setBounds(190, 197, 20, 20);
		contentPane.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setEditable(false);
		textField_55.setBackground(new Color(47, 79, 79));
		textField_55.setColumns(10);
		textField_55.setBounds(220, 197, 20, 20);
		contentPane.add(textField_55);

		textField_56 = new JTextField();
		textField_56.setEditable(false);
		textField_56.setBackground(new Color(123, 104, 238));
		textField_56.setColumns(10);
		textField_56.setBounds(10, 228, 20, 20);
		contentPane.add(textField_56);

		textField_57 = new JTextField();
		textField_57.setEditable(false);
		textField_57.setBackground(new Color(253, 245, 230));
		textField_57.setColumns(10);
		textField_57.setBounds(40, 228, 20, 20);
		contentPane.add(textField_57);

		textField_58 = new JTextField();
		textField_58.setEditable(false);
		textField_58.setBackground(new Color(255, 228, 196));
		textField_58.setColumns(10);
		textField_58.setBounds(70, 228, 20, 20);
		contentPane.add(textField_58);

		textField_59 = new JTextField();
		textField_59.setEditable(false);
		textField_59.setBackground(new Color(147, 112, 219));
		textField_59.setColumns(10);
		textField_59.setBounds(100, 228, 20, 20);
		contentPane.add(textField_59);

		textField_60 = new JTextField();
		textField_60.setEditable(false);
		textField_60.setBackground(new Color(135, 206, 235));
		textField_60.setColumns(10);
		textField_60.setBounds(130, 228, 20, 20);
		contentPane.add(textField_60);

		textField_61 = new JTextField();
		textField_61.setEditable(false);
		textField_61.setBackground(new Color(255, 245, 238));
		textField_61.setColumns(10);
		textField_61.setBounds(160, 228, 20, 20);
		contentPane.add(textField_61);

		textField_62 = new JTextField();
		textField_62.setEditable(false);
		textField_62.setBackground(new Color(173, 216, 230));
		textField_62.setColumns(10);
		textField_62.setBounds(190, 228, 20, 20);
		contentPane.add(textField_62);

		textField_63 = new JTextField();
		textField_63.setEditable(false);
		textField_63.setBackground(new Color(112, 128, 144));
		textField_63.setColumns(10);
		textField_63.setBounds(220, 228, 20, 20);
		contentPane.add(textField_63);

		textField.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_1.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_2.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_2.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_3.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_3.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_4.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_4.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_5.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_5.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_6.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_6.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_7.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_7.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_8.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_8.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_9.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_9.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_10.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_10.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_11.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_11.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_12.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_12.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_13.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_13.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_14.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_14.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_15.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_15.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_16.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_16.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_17.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_17.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_18.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_18.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_19.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_19.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_20.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_20.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_21.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_21.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_22.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_22.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_23.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_23.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_24.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_24.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_25.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_25.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_26.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_26.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_27.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_27.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_28.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_28.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_29.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_29.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_30.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_30.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_31.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_31.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_32.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_32.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_33.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_33.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_34.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_34.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_35.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_35.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_36.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_36.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_37.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_37.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_38.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_38.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_39.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_39.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_40.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_40.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_41.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_41.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_42.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_42.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_43.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_43.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_44.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_44.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_45.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_45.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_46.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_46.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_47.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_47.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_48.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_48.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_49.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_49.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_50.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_50.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_51.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_51.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_52.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_52.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_53.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_53.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_54.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_54.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		textField_55.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_55.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_56.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_56.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_57.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_57.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_58.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_58.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_59.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_59.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_60.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_60.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_61.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_61.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_62.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_62.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});textField_63.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				color.setBackground(textField_63.getBackground());
				paleta.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

	}

}
