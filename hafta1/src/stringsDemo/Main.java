package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı : "+mesaj.length());

		System.out.println("5.Eleman : "+mesaj.charAt(4));
		
		System.out.println(mesaj.concat(" Ekleme yapıldı"));
		
		System.out.println(mesaj.startsWith("B"));
		
		System.out.println(mesaj.endsWith("l"));
		
		char[] karakter=new char[5];
		mesaj.getChars(0, 5, karakter, 0);
		System.out.println(karakter);
		
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("gü"));
		
		String yeniMesaj=mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(6,14));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		
		System.out.println(mesaj.toUpperCase());
		
		String mesajBosluk="   Bugün hava çok güzel.    ";
		System.out.println(mesajBosluk.trim());
		
	}

}
