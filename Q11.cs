using System;

namespace Q11
{
    class Program
    {
        static void Main(string[] args)
        {
            float fahrenheit, celsius;
            string celsiusf;
            Console.Write("Digite uma temperatura em °F: ");
            fahrenheit = float.Parse(Console.ReadLine());
            celsius = (5 * fahrenheit - 160) / 9;
            celsiusf = string.Format("{0:N1}", celsius);
            Console.WriteLine("A temperatura em celsius é {0}°C.", celsiusf);
        }
    }
}