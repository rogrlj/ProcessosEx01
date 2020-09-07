package view;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController redesController = new RedesController ();
		
		String os = redesController.os();
		System.out.println("SISTEMA OPERACIONAL: " + os);

	}

}
