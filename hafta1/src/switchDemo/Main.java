package switchDemo;

public class Main {

	public static void main(String[] args) {
		char not='X';
		
		switch (not) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef Kaldınız");
			break;

		default:
			System.out.println("Geçersiz Not Girişi");
			break;
		}

	}

}
