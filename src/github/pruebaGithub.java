package github;
public class pruebaGithub {
	public static void main(String[] args) {
		int numero1=1;
		int numero2=2;
		suma(numero1,numero2);
		resta(numero1,numero2);
		multiplicacion(numero1,numero2);
		division(numero1,numero2);
	}
	public static void suma(int numero1,int numero2) {
		int resultado=numero1+numero2;
		System.out.println(resultado);
	}
	public static void resta(int numero1,int numero2) {
		int resultado=numero1-numero2;
		System.out.println(resultado);
	}
	public static void multiplicacion(int numero1,int numero2) {
		int resultado=numero1*numero2;
		System.out.println(resultado);
	}
	public static void division(int numero1,int numero2) {
		int resultado=numero1/numero2;
		System.out.println(resultado);
	}
}
