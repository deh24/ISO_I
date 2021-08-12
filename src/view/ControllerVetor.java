package view;

public class ControllerVetor {
	
	public ControllerVetor(){
		super();
	}
         @SuppressWarnings("unused")
		public void TPVetor(int[] Vetor){
        	 int tam = Vetor.length; 
        	 
        	 double TI = System.nanoTime();
        	 for (int i:Vetor){
        		 
        	 }
        	 double TF = System.nanoTime();
        	 double TT = TF - TI;
        	 TT = TT / Math.pow(10, 9);
        	 
        	 System.out.println(tam+" posições: "+TT+" s.");
         }
         
         public int []geraVetor(int posicoes){
        	 int[] vet= new int[posicoes];
        	 for (int i=0 ; i <posicoes ; i++ ){
        		 vet[i] = 0;
        	 }
        	 return vet;
         }
}
