import java.text.DecimalFormat;
import java.util.Scanner;

public class Q9 
{
    public static Scanner leia = new Scanner(System.in);

    public static void main(String args[]) 
    {
        float custo_de_fabrica, custo_resultado;
        String custo_final;
        System.out.print("Digite o custo de fábrica do carro: ");
        custo_de_fabrica = leia.nextFloat();
        custo_resultado = custo_de_fabrica + 15 * custo_de_fabrica / 100 + 30 * custo_de_fabrica / 100;
        custo_final = new DecimalFormat("#.00").format(custo_resultado);
        System.out.println("O custo final do carro, com a porcentagem do distribuidor e dos impostos, será R$" + custo_final + ".");
    }
}
