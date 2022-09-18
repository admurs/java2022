package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] list= {1.2,3.4,5.6,7.8,9.11};
		double toplam=0;
		double eb=list[0];
		
		for (double i : list) {
			toplam=toplam+i;
			if (i>eb) {
				eb=i;
			}
		}
		System.out.println("Toplam : "+toplam);
		System.out.println("En Büyük Sayı : "+eb);
		
	}

}
