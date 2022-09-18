package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler=new String[4];
		ogrenciler[0]="Adem";
		ogrenciler[1]="Polat";
		ogrenciler[2]="Nemati";
		ogrenciler[3]="Çakır";
		
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		System.out.println("FOREACH LOOP\n");		
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("FOR LOOP");
	}

}
