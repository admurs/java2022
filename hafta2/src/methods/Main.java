package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
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
			mesajVer(sayi+" : Sayýsý Dizide mevcut");
		}else {
			mesajVer(sayi+" : Sayýsý Dizide mevcut deðildir.");
		}
	}
	public static void mesajVer(String  mesaj) {
		System.out.println(mesaj);
	}
	
}
