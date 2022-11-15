using System;

namespace Q12
{
    class Program
    {
        static void Main(string[] args)
        {
            float peso2, peso3, peso4, peso7, média_final;
            string médiaf;
            Console.Write("Digite a nota de peso 2: ");
            peso2 = float.Parse(Console.ReadLine());
            Console.Write("Digite a nota de peso 3: ");
            peso3 = float.Parse(Console.ReadLine());
            Console.Write("Digite a nota de peso 4: ");
            peso4 = float.Parse(Console.ReadLine());
            Console.Write("Digite a nota de peso 7: ");
            peso7 = float.Parse(Console.ReadLine());
            média_final = (peso2 * 2 + peso3 * 3 + peso4 * 4 + peso7 * 7) / 16;
            médiaf = string.Format("{0:N1}", média_final);
            Console.WriteLine("A média final desse aluno é {0}.", médiaf);
        }
    }
}