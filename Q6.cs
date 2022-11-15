using System;

namespace Q6
{
    class Program
    {
        static void Main(string[] args)
        {
            byte anos, meses, dias;
            ushort dias_vividos;
            string dias_vividosf;
            Console.Write("Digite a sua idade: ");
            anos = byte.Parse(Console.ReadLine());
            Console.Write("Digite quantos meses se passaram desde seu aniversário: ");
            meses = byte.Parse(Console.ReadLine());
            Console.Write("Digite quantos dias você viveu no mês atual: ");
            dias = byte.Parse(Console.ReadLine());
            dias_vividos = Convert.ToUInt16(anos * 365 + meses * 30 + dias);
            dias_vividosf = string.Format("{0:N0}", dias_vividos);
            Console.WriteLine("Você viveu um total de {0} dias.", dias_vividosf);
        }
    }
}