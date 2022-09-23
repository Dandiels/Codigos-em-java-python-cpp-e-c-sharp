import java.text.DecimalFormat;
import java.util.Scanner;

public class Q7 {
    public static Scanner leia = new Scanner(System.in);

    public static void main(String args[]) {
        float eleitores;
        float brancos;
        float nulos;
        float validos;
        float brancos_resultado;
        float nulos_resultado;
        float validos_resultado;
        System.out.print("Digite o total de eleitores no município: ");
        eleitores = leia.nextFloat();
        System.out.print("Digite o total de votos brancos: ");
        brancos = leia.nextFloat();
        System.out.print("Digite o total de votos nulos: ");
        nulos = leia.nextFloat();
        System.out.print("Digite o total de votos válidos: ");
        validos = leia.nextFloat();
        brancos_resultado = brancos * 100 / eleitores;
        nulos_resultado = nulos * 100 / eleitores;
        validos_resultado = validos * 100 / eleitores;
        String percentual_brancos = new DecimalFormat("#.0").format(brancos_resultado);
        String percentual_nulos = new DecimalFormat("#.0").format(nulos_resultado);
        String percentual_validos = new DecimalFormat("#.0").format(validos_resultado);
        System.out.println("O percentual de votos, em relação ao total de eleitores no município, é:");
        System.out.print(percentual_brancos + "% votos brancos, ");
        System.out.print(percentual_nulos + "% votos nulos e ");
        System.out.println(percentual_validos + "% votos válidos.");
    }
}
