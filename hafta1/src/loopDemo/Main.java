package loopDemo;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngü bitti\n");
		
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Tek sayılar bitti\n");
		
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Çift sayılar bitti\n");
		
		int i=1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti\n");
		
		int j=2;
		while (j<10) {
			System.out.println(j);
			j+=2;
		}
		System.out.println("While Çift sayılar bitti\n");
		
		int k=1;
		while (k<10) {
			System.out.println(k);
			k+=2;
		}
		System.out.println("While Tek sayılar bitti\n");
		
	}

}
