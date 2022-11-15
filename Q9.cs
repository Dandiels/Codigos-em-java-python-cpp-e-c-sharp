using System;

namespace Q9
{
    class Program
    {
        static void Main(string[] args)
        {
            float custo_de_fábrica, custo_final;
            string custof;
            Console.Write("Digite o custo de fábrica do carro: ");
            custo_de_fábrica = float.Parse(Console.ReadLine());
            custo_final = custo_de_fábrica + 15 * custo_de_fábrica / 100 + 30 * custo_de_fábrica / 100;
            custof = string.Format("{0:N}", custo_final);
            Console.WriteLine("O custo final do carro, com a porcentagem do distribuidor e dos impostos, será R${0}.", custof);
        }
    }
}