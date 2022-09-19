package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar=new int[] {1,3,5,7,9};
		int sayi=3;
		boolean mevcut=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayi==sayilar[i]) {
				mevcut=true;
				break;
			}
		}
		if (mevcut) {
			System.out.println(sayi+" : Sayısı Dizide mevcuttur.");
		}else {
			System.out.println(sayi+" : Sayısı Dizide mevcut değildir.");
		}
	}

}
