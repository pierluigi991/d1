package d1;

public class PariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 24;
		int result = pariDispari(num);
		System.out.println("il numeron " + num + " è " + (result ==0? "pari" : "dispari"));

	}
	public static int pariDispari(int num) {
		if(num % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}

}
