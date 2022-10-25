import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4 
{
	public static Scanner leia = new Scanner(System.in);

	public static void main(String args[]) 
	{
		float numero, resultado;
		String antecessor;
		System.out.print("Digite um número: ");
		numero = leia.nextFloat();
		resultado = numero - 3;
		antecessor = new DecimalFormat("#.######").format(resultado);
		System.out.println("O 3° antecessor desse número é " + antecessor + ".");
	}
}
