import java.text.DecimalFormat;
import java.util.Scanner;

public class Q10 
{
    public static Scanner leia = new Scanner(System.in);

    public static void main(String args[]) 
    {
        int carros_vendidos;
        float salario_fixo, valor_carro, valor_das_vendas, salario_resultado;
        String salario_final;
        System.out.print("Digite o salário fixo do vendedor: ");
        salario_fixo = leia.nextFloat();
        System.out.print("Digite o número de carros vendidos pelo vendedor: ");
        carros_vendidos = leia.nextInt();
        System.out.print("Digite o valor fixo ganho por cada carro vendido: ");
        valor_carro = leia.nextFloat();
        System.out.print("Digite o valor total das vendas do vendedor: ");
        valor_das_vendas = leia.nextFloat();
        salario_resultado = salario_fixo + carros_vendidos * valor_carro + 3 * valor_das_vendas / 100;
        salario_final = new DecimalFormat("#.00").format(salario_resultado);
        System.out.println("O salário final do vendedor será R$" + salario_final + ".");
    }
}
