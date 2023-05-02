package d1;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double lato1 = 7.8;
		double lato2 = 4.6;
		double perimetro = perimetroRettangolo(lato1, lato2);
		System.out.println("il perimetro del rettangolo è :" + perimetro);
		

	}
	public static double perimetroRettangolo(double lato1,double lato2) {
		double perimetro= 2 * (lato1 + lato2);
		return perimetro;
	}

}
