package operadores_logicos;

public class Operadores_Logicos {

	public static void main(String[] args) {
		int n1 = 2,n2 = 3 ,n3 = 1,n4 = 4;
		
		if((n1 > 2) || (n1 > n3)) { // uma das opçãoes deve ser verdadeira
			System.out.println("Uma das opção é verdadeira");
		}else {
			System.out.println("Falso");
		}
		
		if ((n1 > n3) && (n4 > n1)) { // todas as opções devem ser verdadeira
			System.out.println("Todas as opções são verdadeiras");
		}else {
			System.out.println("Falso");
		}
	}

}
