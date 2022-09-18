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
		
		int x=1;
		do {
			System.out.println(x);
			x++;
		} while (x<10);
		System.out.println("Do While döngüsü bitti\n");
		
		int y=2;
		do {
			System.out.println(y);
			y+=2;
		} while (y<10);
		System.out.println("Do While Çift sayılar bitti\n");
		
		int z=1;
		do {
			System.out.println(z);
			z+=2;
		} while (z<10);
		System.out.println("Do While Tek sayılar bitti\n");
	}

}
