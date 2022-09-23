import java.text.DecimalFormat;
import java.util.Scanner;

public class Q8 {
    public static Scanner leia = new Scanner(System.in);

    public static void main(String args[]) {
        float salario;
        double salario_resultado;
        System.out.print("Digite o salário mensal atual do funcionário: ");
        salario = leia.nextFloat();
        salario_resultado = salario * 1.22;
        String salario_reajustado = new DecimalFormat("#.00").format(salario_resultado);
        System.out.println("O salário do funcionário, após o reajuste de 22%, será R$" + salario_reajustado + ".");
    }
}
