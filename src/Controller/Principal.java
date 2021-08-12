package Controller;

import view.ControllerVetor;

public class Principal {

	public static void main(String[] args) {
		ControllerVetor vc = new ControllerVetor ();
		
		int[] vet1000 = vc.geraVetor(1000);
		int[] vet10000 = vc.geraVetor(10000);
		int[] vet100000 = vc.geraVetor(100000);
		
		vc.TPVetor(vet1000);
		vc.TPVetor(vet10000);
		vc.TPVetor(vet100000);
		



	}

}
