
public class Automata {
	private static String[] alphabet = {"_","0","1","2","3","4","5","6","7","8","9","a","A","b","B","c","C","d","D","e","E","f","F","g","G","h","H","i","I","j","J","k","K","l","L","m","M","n","N","o","O","p","P","q","Q","r","R","s","S","t","T","u","U","v","V","w","W","x","X","y","Y","z","Z"};
	private static String[] alpha = {"a","A","B","c","C","d","D","E","f","F","g","G","h","H","I","j","J","k","K","l","L","m","M","n","N","o","O","P","q","Q","r","R","s","S","T","u","U","V","w","W","x","X","y","Y","z","Z"};
	private static String[] alphabetnum = {"0","1","2","3","4","5","6","7","8","9","a","A","b","B","c","C","d","D","e","E","f","F"};
	
	 
	public static boolean automataIdentificador(String s) {
		int estadoActual = 0;
		boolean isID = false;
		char[] letras = s.toCharArray();
		for(int i = 0; i<letras.length;i++) {
			flag: switch(estadoActual) {
			case 0:
				
				if(String.valueOf(letras[i]).equals("v") ) {
					estadoActual = 1;
					isID = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals("p") ) {
					estadoActual = 3;
					isID = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals("b") ) {
					estadoActual = 10;
					isID = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals("e") ) {
					estadoActual = 14;
					isID = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals("i") ) {
					estadoActual = 16;
					isID = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals("t") ) {
					estadoActual = 19;
					isID = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals("_") ) {
					estadoActual = 23;
					isID = false;
					break flag;
				}else if(String.valueOf(letras[i]).equals("0") ||String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")||String.valueOf(letras[i]).equals("8")||String.valueOf(letras[i]).equals("9")) {
					estadoActual = 22;
					isID = false;
					break flag;
				}
				for(int j = 0; j< alpha.length; j++) {
					if(String.valueOf(letras[i]).equals(alpha[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 1:
				if(String.valueOf(letras[i]).equals("a") ) {
					estadoActual = 2;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 2:
				if(String.valueOf(letras[i]).equals("r") ) {
					estadoActual = 9;
					isID = false;
					break flag;
				}
				for(int j = 0; j< alphabet.length-1; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 3:
				if(String.valueOf(letras[i]).equals("r") ) {
					estadoActual = 4;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
				
			case 4:
				if(String.valueOf(letras[i]).equals("o") ) {
					estadoActual = 5;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 5:
				if(String.valueOf(letras[i]).equals("g") ) {
					estadoActual = 6;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 6:
				if(String.valueOf(letras[i]).equals("r") ) {
					estadoActual = 7;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 7:
				if(String.valueOf(letras[i]).equals("a") ) {
					estadoActual = 8;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 8: 
				if(String.valueOf(letras[i]).equals("m") ) {
					estadoActual = 9;
					isID = false;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 9: 
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 10:
				if(String.valueOf(letras[i]).equals("e") ) {
					estadoActual = 11;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 11:
				if(String.valueOf(letras[i]).equals("g") ) {
					estadoActual = 12;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 12:
				if(String.valueOf(letras[i]).equals("i") ) {
					estadoActual = 13;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 13:
				if(String.valueOf(letras[i]).equals("n") ) {
					estadoActual = 9;
					isID = false;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 14:
				if(String.valueOf(letras[i]).equals("n") ) {
					estadoActual = 15;
					isID = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals("l") ) {
					estadoActual = 17;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 15:
				if(String.valueOf(letras[i]).equals("d") ) {
					estadoActual = 9;
					isID = false;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 16:
				if(String.valueOf(letras[i]).equals("f") ) {
					estadoActual = 9;
					isID = false;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 17:
				if(String.valueOf(letras[i]).equals("s") ) {
					estadoActual = 18;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length-1; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 18:
				if(String.valueOf(letras[i]).equals("e") ) {
					estadoActual = 9;
					isID = false;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 19:
				if(String.valueOf(letras[i]).equals("h") ) {
					estadoActual = 20;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 20:
				if(String.valueOf(letras[i]).equals("e") ) {
					estadoActual = 21;
					isID = true;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 21:
				if(String.valueOf(letras[i]).equals("n") ) {
					estadoActual = 9;
					isID = false;
					break flag;
				}
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 22:
				return false;
			case 23:
				if(String.valueOf(letras[i]).equals("_") ) {
					estadoActual = 23;
					isID = false;
					break flag;
				}else if(String.valueOf(letras[i]).equals("0") ||String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")||String.valueOf(letras[i]).equals("8")||String.valueOf(letras[i]).equals("9")) {
					estadoActual = 23;
					isID = false;
					break flag;
				} for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			case 24:
				for(int j = 0; j< alphabet.length; j++) {
					if(String.valueOf(letras[i]).equals(alphabet[j])) {
						estadoActual = 24;
						isID = true;
						break flag;
					}
				}
				return false;
			}
		}
		return isID;
	}
	public static boolean automataNumero(String s) {
		int estadoActual = 0;
		boolean isNum = false;
		char[] letras = s.toCharArray();
		for(int i = 0; i<letras.length;i++) {
			flag: switch(estadoActual) {
			case 0:
				if(String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")||String.valueOf(letras[i]).equals("8")||String.valueOf(letras[i]).equals("9")) {
					estadoActual = 2;
					isNum = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals("0")) {
					estadoActual = 3;
					isNum = true;
					break flag;
				}else {
					return false;
				}
			case 1:
				return false;
			case 2:
				if(String.valueOf(letras[i]).equals("0") ||String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")||String.valueOf(letras[i]).equals("8")||String.valueOf(letras[i]).equals("9")) {
					estadoActual = 2;
					isNum = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals(".")) {
					estadoActual = 5;
					isNum = false;
					break flag;
				}else {
					return false;
				}
			case 3:
				if(String.valueOf(letras[i]).equals(".")) {
					estadoActual = 5;
					isNum = false;
					break flag;
				}else if(String.valueOf(letras[i]).equals("x")||String.valueOf(letras[i]).equals("X")) {
					estadoActual = 6;
					isNum = false;
					break flag;
				}else if(String.valueOf(letras[i]).equals("0") ||String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")) {
					estadoActual = 4;
					isNum = true;
					break flag;
				}else {
					return false;
				}
			case 4:
				if(String.valueOf(letras[i]).equals("0") ||String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")) {
					estadoActual = 4;
					isNum = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals(".")) {
					estadoActual = 5;
					isNum = false;
					break flag;
				}else {
					return false;
				}
			case 5:
				if(String.valueOf(letras[i]).equals("0") ||String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")||String.valueOf(letras[i]).equals("8")||String.valueOf(letras[i]).equals("9")) {
					estadoActual = 7;
					isNum = true;
					break flag;
				}else {
					return false;
				}
			case 6:
				for(int j = 0; j<alphabetnum.length;j++) {
					if(String.valueOf(letras[i]).equals(alphabetnum[j])) {
						estadoActual = 8;
						isNum = true;
						break flag;
					}
				}
				return false;
			case 7:
				if(String.valueOf(letras[i]).equals("0") ||String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")||String.valueOf(letras[i]).equals("8")||String.valueOf(letras[i]).equals("9")) {
					estadoActual = 7;
					isNum = true;
					break flag;
				}else if(String.valueOf(letras[i]).equals("e")||String.valueOf(letras[i]).equals("E")) {
					estadoActual = 9;
					isNum = false;
					break flag;
				}else {
					return false;
				}
			case 8:
				for(int j = 0; j<alphabetnum.length;j++) {
					if(String.valueOf(letras[i]).equals(alphabetnum[j])) {
						estadoActual = 8;
						isNum = true;
						break flag;
					}
				}
				return false;
			case 9:
				if(String.valueOf(letras[i]).equals("+")||String.valueOf(letras[i]).equals("-")) {
					estadoActual = 10;
					isNum = false;
					break flag;
				}else {
					return false;
				}
			case 10:
				if(String.valueOf(letras[i]).equals("0") ||String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")||String.valueOf(letras[i]).equals("8")||String.valueOf(letras[i]).equals("9")) {
					estadoActual = 11;
					isNum = true;
					break flag;
				}else {
					return false;
				}
			case 11:
				if(String.valueOf(letras[i]).equals("0") ||String.valueOf(letras[i]).equals("1") || String.valueOf(letras[i]).equals("2")||String.valueOf(letras[i]).equals("3") || String.valueOf(letras[i]).equals("4")||String.valueOf(letras[i]).equals("5")||String.valueOf(letras[i]).equals("6")||String.valueOf(letras[i]).equals("7")||String.valueOf(letras[i]).equals("8")||String.valueOf(letras[i]).equals("9")) {
					estadoActual = 11;
					isNum = true;
					break flag;
				}else {
					return false;
				}
			}
		}
		if(estadoActual == 2) {
			System.out.println("Natural");
		}else if(estadoActual == 3||estadoActual == 4) {
			System.out.println("Octal");
		}else if(estadoActual == 8) {
			System.out.println("Hexadecimal");
		}else if(estadoActual == 7||estadoActual == 11) {
			System.out.println("Punto Flotante");
		}
		return isNum;
	}
	
	public static void main(String[] args) {
		System.out.println(Automata.automataIdentificador("sd"));
		System.out.println(Automata.automataNumero("000.4587E-485"));
	}

}
