import java.text.DecimalFormat;
import java.util.Scanner;

public class Q11 {
    public static Scanner leia = new Scanner(System.in);

    public static void main(String args[]) {
        float fahrenheit;
        float resultado;
        System.out.print("Digite uma temperatura em °F: ");
        fahrenheit = leia.nextFloat();
        resultado = (5 * fahrenheit - 160) / 9;
        String celsius = new DecimalFormat("#.0").format(resultado);
        System.out.println("A temperatura em celsius é " + celsius + "°C.");
    }
}
