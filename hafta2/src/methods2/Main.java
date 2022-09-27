package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi=topla(7,5);
		System.out.println(sayi);
		int toplam = toplam(1,3,5,7,9);
		System.out.println(toplam);
//
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
public static void sil() {
	System.out.println("Silindi");
		
	}
public static void guncelle() {

	System.out.println("Güncellendi");
}
public static int topla(int sayi1,int sayi2) {
	return sayi1+sayi2;
}

public static int toplam(int... sayilar) {
	int toplam=0;
	for (int i : sayilar) {
		toplam=toplam+i;
	}
	return toplam;
}

public static String sehirVer() {
	return "Ankara";
}
}
