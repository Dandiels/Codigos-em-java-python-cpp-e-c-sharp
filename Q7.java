import java.text.DecimalFormat;
import java.util.Scanner;

public class Q7 
{
    public static Scanner leia = new Scanner(System.in);

    public static void main(String args[]) 
    {
        float eleitores, brancos, nulos, validos, brancos_resultado, nulos_resultado, validos_resultado;
        String percentual_brancos, percentual_nulos, percentual_validos;
        System.out.print("Digite o total de eleitores no município: ");
        eleitores = leia.nextInt();
        System.out.print("Digite o total de votos brancos: ");
        brancos = leia.nextInt();
        System.out.print("Digite o total de votos nulos: ");
        nulos = leia.nextInt();
        System.out.print("Digite o total de votos válidos: ");
        validos = leia.nextInt();
        brancos_resultado = brancos * 100 / eleitores;
        nulos_resultado = nulos * 100 / eleitores;
        validos_resultado = validos * 100 / eleitores;
        percentual_brancos = new DecimalFormat("#.0").format(brancos_resultado);
        percentual_nulos = new DecimalFormat("#.0").format(nulos_resultado);
        percentual_validos = new DecimalFormat("#.0").format(validos_resultado);
        System.out.println("O percentual de votos, em relação ao total de eleitores no município, é:");
        System.out.print(percentual_brancos + "% votos brancos, ");
        System.out.print(percentual_nulos + "% votos nulos e ");
        System.out.println(percentual_validos + "% votos válidos.");
    }
}
