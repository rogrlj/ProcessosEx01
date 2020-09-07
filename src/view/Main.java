package view;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController redesController = new RedesController ();
		
//		Chamada da função para reconhecimento do SO.
		String os = redesController.os();
		System.out.println("SISTEMA OPERACIONAL: " + os);
		
		System.out.println("\n====================================");
		
		redesController.ip(os);

	}

}
