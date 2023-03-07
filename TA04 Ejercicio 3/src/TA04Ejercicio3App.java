
public class TA04Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		int X = 4;
		int Y = 3;
		double N = 1.5;
		double M = 1.8;
		double Resultado;
		
		System.out.println("X = "+ X);
		System.out.println("Y = "+ Y);
		System.out.println("N = "+ N);
		System.out.println("M = "+ M);
		System.out.println("");
		
		System.out.println("Operaciones con X e Y");
		//Suma de X + Y
		Resultado = X + Y;
		System.out.println(X + " + " + Y + " = " + ((int)Resultado));
		
		//Diferencia de X - Y
		Resultado = X - Y;
		System.out.println(X + " - " + Y + " = " + ((int)Resultado));
		
		//Producto de X * Y
		Resultado = X * Y;
		System.out.println(X + " * " + Y + " = " + ((int)Resultado));
		
		//Cociente de X / Y
		//Dividimos pasandolo a double porque puede dar decimales
		Resultado = (double)X / (double)Y;
		
		//If para comprobar si hay que moatrar el resultado con decimales o no
		if (Resultado % 1 == 0.0) {
			System.out.println(X + " / " + Y + " = " + ((int)Resultado));
		} else {
			System.out.println(X + " / " + Y + " = " + (Resultado));
		}
		
		//Resto de X % Y
		Resultado = X % Y;
		System.out.println(X + " % " + Y + " = " + ((int)Resultado));
		
		System.out.println("");
		
		System.out.println("Operaciones con N y M");
		//Suma de N + M
		Resultado = N + M;
		//If para comprobar si hay que moatrar el resultado con decimales o no
		if (Resultado % 1 == 0.0) {
			System.out.println(N + " + " + M + " = " + ((int)Resultado));
		} else {
			System.out.println(N + " + " + M + " = " + (Resultado));
		}
		
		//Diferencia de N - M
		Resultado = N - M;
		//If para comprobar si hay que moatrar el resultado con decimales o no
		if (Resultado % 1 == 0.0) {
			System.out.println(N + " - " + M + " = " + ((int)Resultado));
		} else {
			System.out.println(N + " - " + M + " = " + (Resultado));
		}
		
		//Producto de N * M
		Resultado = N * M;
		System.out.println(N + " * " + M + " = " + (Resultado));
		
		//Cociente de N / M
		Resultado = N / M;
		System.out.println(N + " / " + M + " = " + (Resultado));
		
		//Resto de N % M
		Resultado = N % M;
		System.out.println(N + " % " + M + " = " + (Resultado));
		
		System.out.println();
		
		System.out.println("Operaciones mezclando variables");
		//Suma de X + N
		Resultado = X + N;
		System.out.println(X + " + " + N + " = " + (Resultado));
		
		//Cociente de Y / M
		Resultado = Y / M;
		
		//If para comprobar si hay que moatrar el resultado con decimales o no
		//Puede darse por ejemplo el caso de 3/1.5=2 y no llevaría decimales
		if (Resultado % 1 == 0.0) {
			System.out.println(Y + " / " + M + " = " + ((int)Resultado));
		} else {
			System.out.println(Y + " / " + M + " = " + (Resultado));
		}
		
		System.out.println();
		
		//Doble de todas las variables
		Resultado = X * 2; 
		System.out.println("El doble de " + X + " es " + Resultado);
		
		Resultado = Y * 2;
		System.out.println("El doble de " + Y + " es " + Resultado);
		
		Resultado = N * 2;
		//If para comprobar si hay que moatrar el resultado con decimales o no
		//Podria ser 1.5*2=3 y no llevaría decimales
		if (Resultado % 1 == 0.0) {
			System.out.println("El doble de " + N + " es " + (int)Resultado);
		} else {
			System.out.println("El doble de " + N + " es " + Resultado);
		}
		
		Resultado = M * 2;
		//If para comprobar si hay que moatrar el resultado con decimales o no
		//Podria ser 1.5*2=3 y no llevaría decimales
		if (Resultado % 1 == 0.0) {
			System.out.println("El doble de " + M + " es " + (int)Resultado);
		} else {
			System.out.println("El doble de " + M + " es " + Resultado);
		}
		
		System.out.println();
		
		//Suma de todas las variables
		Resultado = X + Y + N + M;
		
		//If para comprobar si hay que moatrar el resultado con decimales o no
		if (Resultado % 1 == 0.0) {
			System.out.println("La suma de todas las variables es " + (int)Resultado);
		} else {
			System.out.println("La suma de todas las variables es " + Resultado);
		}
		
		System.out.println();
		
		//Producto de todas las variables
		Resultado = X * Y * N * M;
		System.out.println("El producto de todas las variables es " + Resultado);
		
		System.out.println();
	}

}
