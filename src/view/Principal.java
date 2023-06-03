/*
RESUMO      : Classe Principal
PROGRAMADORA: Luiza Felix
DATA        : 01/06/2023
 */


package view;


import javax.swing.JOptionPane;
import controller.Controller;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		JOptionPane.showMessageDialog(null, "Ao confirmar o exercício será executado (para checar se ocorreu tudo bem, abra a localização do arquivo)");
		Controller.newregister(41, 60, 8000.00);
		Controller.newregister(31, 40, 5000.00);
		Controller.newregister(21, 30, 3000.00);

	}

}
