using System;

namespace Q5
{
    class Program
    {
        static void Main(string[] args)
        {
            float b, a, área;
            string áreaf;
            Console.Write("Digite o valor da base: ");
            b = float.Parse(Console.ReadLine());
            Console.Write("Digite o valor da altura: ");
            a = float.Parse(Console.ReadLine());
            área = b * a / 2;
            áreaf = string.Format("{0:#,#.######}", área);
            Console.WriteLine("A área desse triângulo é {0}.", áreaf);
        }
    }
}