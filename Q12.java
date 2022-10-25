import java.text.DecimalFormat;
import java.util.Scanner;

public class Q12 
{
    public static Scanner leia = new Scanner(System.in);

    public static void main(String args[]) 
    {
        float peso2, peso3, peso4, peso7, media_resultado;
        String media_final;
        System.out.print("Digite a nota de peso 2: ");
        peso2 = leia.nextFloat();
        System.out.print("Digite a nota de peso 3: ");
        peso3 = leia.nextFloat();
        System.out.print("Digite a nota de peso 4: ");
        peso4 = leia.nextFloat();
        System.out.print("Digite a nota de peso 7: ");
        peso7 = leia.nextFloat();
        media_resultado = (peso2 * 2 + peso3 * 3 + peso4 * 4 + peso7 * 7) / 16;
        media_final = new DecimalFormat("#.0").format(media_resultado);
        System.out.println("A média final desse aluno é " + media_final + ".");
    }
}
