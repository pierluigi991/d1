package d1;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 10;
		int y = 500;
		int prodotto = x * y;
				System.out.println(prodotto);
       
       //******//
       
				String nome = "Pierluigi";
				int age = 31;
       String message = "ciao, mi chiamo" + nome + "ed ho" + age + "anni";
       System.out.println(message);
       
       //*****//
       
       String[] array = {"HTML","jAVASCRIPT","CSS","REACT","REDUX"};
       String nuovaSkill ="JAVA";
       
       
       // adesso dobbiamo prenderci i primi due elementi dell'array e inserirli nel nuovo
       //poi inseriamo l'elemento che vogliamo inserire
       //dopodichè dobbiamo inserire gli altri elementi del vecchio array
       //infine stampiamo quello che vogliamo ottenere
       
       String[] nuovoArray = new String[6];
       for (int i = 0; i < 2; i++) {
    	   nuovoArray[i]= array[i];
		
	}
       nuovoArray[2]= nuovaSkill;
       for (int i = 3; i < 6; i++) {
		nuovoArray[i]= array[i-1];
	}
       for(String output : nuovoArray) {
    	   System.out.println(output);
       }
	}

}
