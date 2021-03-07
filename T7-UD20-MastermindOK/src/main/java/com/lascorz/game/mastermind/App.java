package com.lascorz.game.mastermind;

import java.awt.EventQueue;

import com.lascorz.game.mastermind.principiante.Principiante;

/**
 * Autores David, Christian, Emma.
 */
public class App {
	
	public static boolean PrimeraJugada = false;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principiante.main(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
