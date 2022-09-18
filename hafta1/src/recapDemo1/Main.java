package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;
		
		int eb=sayi1;
		
		if (sayi2>eb) {
			eb=sayi2;
		}
		if (sayi3>eb) {
			eb=sayi3;
		}
		
		System.out.println("En büyük sayi : "+eb);
			
//		if (sayi1>sayi2 && sayi1>sayi3) {
//			System.out.println("Sayi 1 Büyüktür");
//		}
//		else if (sayi2>sayi1&&sayi2>sayi3) {
//			System.out.println("Sayi 2 Büyüktür");
//		}
//		else {
//			System.out.println("Sayi 3 Büyüktür");
//		}
	}

}
