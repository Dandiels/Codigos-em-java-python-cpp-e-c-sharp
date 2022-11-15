using System;

namespace Q10
{
    class Program
    {
        static void Main(string[] args)
        {
            ushort carros_vendidos;
            float salário_fixo, valor_carro, valor_das_vendas, salário_final;
            string saláriof;
            Console.Write("Digite o salário fixo do vendedor: ");
            salário_fixo = float.Parse(Console.ReadLine());
            Console.Write("Digite o número de carros vendidos pelo vendedor: ");
            carros_vendidos = ushort.Parse(Console.ReadLine());
            Console.Write("Digite o valor fixo ganho por cada carro vendido: ");
            valor_carro = float.Parse(Console.ReadLine());
            Console.Write("Digite o valor total das vendas do vendedor: ");
            valor_das_vendas = float.Parse(Console.ReadLine());
            salário_final = salário_fixo + carros_vendidos * valor_carro + 3 * valor_das_vendas / 100;
            saláriof = string.Format("{0:N}", salário_final);
            Console.WriteLine("O salário final do vendedor será R${0}.", saláriof);
        }
    }
}