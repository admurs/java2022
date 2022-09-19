package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf='Ü';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf+" : harfi kalın harftir.");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println(harf+" : harfi ince harftir.");
			break;
		default:
			System.out.println(harf+" : harfi kalın veya ince harf değildir.");
			break;
		}

	}

}
