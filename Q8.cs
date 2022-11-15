using System;

namespace Q8
{
    class Program
    {
        static void Main(string[] args)
        {
            float salário, salário_reajustado;
            string saláriof;
            Console.Write("Digite o salário mensal atual do funcionário: ");
            salário = float.Parse(Console.ReadLine());
            salário_reajustado = salário * 1.22f;
            saláriof = string.Format("{0:N}", salário_reajustado);
            Console.WriteLine("O salário do funcionário, após o reajuste de 22%, será R${0}.", saláriof);
        }
    }
}