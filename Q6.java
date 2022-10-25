import java.util.Scanner;

public class Q6 
{
    public static Scanner leia = new Scanner(System.in);

    public static void main(String args[]) 
    {
        int anos, meses, dias, dias_vividos;
        System.out.print("Digite a sua idade: ");
        anos = leia.nextInt();
        System.out.print("Digite quantos meses se passaram desde seu aniversário: ");
        meses = leia.nextInt();
        System.out.print("Digite quantos dias você viveu no mês atual: ");
        dias = leia.nextInt();
        dias_vividos = anos * 365 + meses * 30 + dias;
        System.out.println("Você viveu um total de " + dias_vividos + " dias.");
    }
}
