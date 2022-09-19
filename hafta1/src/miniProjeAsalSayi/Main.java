package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi=10;
		
		boolean asalmi=true;
		if (sayi<1) {
			System.out.println("Geçersiz Sayı");
			return;
		}
		
		if (sayi==1) {
			System.out.println("Asal Sayı Değil");
		}
	
		for (int i = 2; i < sayi; i++) {
			if (sayi%2==0) {
				asalmi=false;
			}
		}
		if (asalmi) {
			System.out.println("Asal Sayı");
		}else {
			System.out.println("Asal Sayı Değil");
		}

	}

}
