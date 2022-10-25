import java.text.DecimalFormat;
import java.util.Scanner;

public class Q5 
{
    public static Scanner leia = new Scanner(System.in);

    public static void main(String args[]) 
    {
        float base, altura, resultado;
        String area;
        System.out.print("Digite o valor da base: ");
        base = leia.nextFloat();
        System.out.print("Digite o valor da altura: ");
        altura = leia.nextFloat();
        resultado = base * altura / 2;
        area = new DecimalFormat("#.######").format(resultado);
        System.out.println("A área desse triângulo é " + area + ".");
    }
}
