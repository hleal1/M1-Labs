package Lab08;

/**
 * Ao ser executado o código apresentado, tem-se a seguinte ordem de chamada:
 *	- methodB(3,9)
 *	- methodC(3,9)
 * 	- devolve para o methodA a soma de i+j = 3+9 = 12
 *	- methodD(3+9)
 *	- Imprime para a consola a String 3+9
 *	- methodC(4,7)
 *	- devolve para o methodA a soma de i+j = 4+7 = 11
 *	- methodD(4+7)
 *	- Imprime para a consola a String 4+7
 *	- Resolve a instrução do methodA, imprimindo para a consola o resultado de 12+11
 *	- Imprime para a consola o valor 23
 * @author Hugo
 *
 */
public class PrintMethods {

	public static void main(String[] args) {
		methodA(3,4,9,7);
	}
	public static void methodA(int a, int b, int c, int d) {
		System.out.println(methodB(a,c) + methodC(b,d));
	}
	public static int methodC(int i, int j) {
		methodD(i + "+" + j);
		return i + j;
	}
	public static int methodB(int i, int j) {
		return methodC(i, j);
	}
	public static void methodD(String string) {
		System.out.println(string);
	}
}


