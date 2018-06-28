import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		int op;
		int n1, n2;
		do {
			menu();
			op=leerNumero();
			switch(op) {
				case 1:
					System.out.println("Introduce primer número: ");
					n1=leerNumero();
					System.out.println("Introduce segundo número: ");
					n2=leerNumero();
					System.out.println("La suma es: "+suma(n1,n2));
					break;
				case 2:
					System.out.println("Introduce un número: ");
					n1=leerNumero();
					System.out.println("El factorial es: "+factorial(n1));
					break;
			}
		}while(op!=3);

	}

	private static void menu() {
		System.out.println("1.-Sumar números");
		System.out.println("2.-Factorial número");
		System.out.println("3.-Salir");
	}
	private static int leerNumero() {
		int n;
		Scanner sc=new Scanner(System.in);
		do {
			n=sc.nextInt();
			if(n<0) {
				System.out.println("Número incorrecto, vuelve a intentarlo");
			}
		}while(n<1);
		return n;
	}
	private static int suma(int a, int b) {
		return a+b;
	}
	private static int factorial(int n) {
		int res=1;
		if(n>1) {
			res=n*factorial(n-1);
		}
		return res;
	}
}
