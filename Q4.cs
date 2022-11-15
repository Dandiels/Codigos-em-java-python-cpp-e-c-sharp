using System;

namespace Q4
{
    class Program
    {
        static void Main(string[] args)
        {
            float número, antecessor;
            string antecessorf;
            Console.Write("Digite um número: ");
            número = float.Parse(Console.ReadLine());
            antecessor = número - 3;
            antecessorf = string.Format("{0:#,#.######}", antecessor);
            Console.WriteLine("O 3° antecessor desse número é {0}.", antecessorf);
        }
    }
}