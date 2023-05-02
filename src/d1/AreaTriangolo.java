package d1;

import java.util.Scanner;

public class AreaTriangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int base;
     int altezza;
     int area;
     
     Scanner in = new Scanner(System.in);
     System.out.println("inserisci un numero per la base");
     base = in.nextInt();
     System.out.println("inserisci un numero per l'altezza");
     altezza = in.nextInt();
     
     area = base * altezza /2 ;
     
     System.out.println("area:" + area);
     
     
    
	}
	

}
