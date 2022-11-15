using System;

namespace Q7
{
    class Program
    {
        static void Main(string[] args)
        {
            int eleitores, brancos, nulos, válidos;
            float eleitoresf, brancosf, nulosf, válidosf, p_brancos, p_nulos, p_válidos;
            string pf_brancos, pf_nulos, pf_válidos;
            Console.Write("Digite o total de eleitores no município: ");
            eleitores = int.Parse(Console.ReadLine());
            eleitoresf = (float)eleitores;
            Console.Write("Digite o total de votos brancos: ");
            brancos = int.Parse(Console.ReadLine());
            brancosf = (float)brancos;
            Console.Write("Digite o total de votos nulos: ");
            nulos = int.Parse(Console.ReadLine());
            nulosf = (float)nulos;
            Console.Write("Digite o total de votos válidos: ");
            válidos = int.Parse(Console.ReadLine());
            válidosf = (float)válidos;
            p_brancos = brancosf * 100 / eleitoresf;
            p_nulos = nulosf * 100 / eleitoresf;
            p_válidos = válidosf * 100 / eleitoresf;
            pf_brancos = string.Format("{0:N1}", p_brancos);
            pf_nulos = string.Format("{0:N1}", p_nulos);
            pf_válidos = string.Format("{0:N1}", p_válidos);
            Console.WriteLine("O percentual de votos, em relação ao total de eleitores no município, é:");
            Console.WriteLine("{0}% votos brancos, {1}% votos nulos e {2}% votos válidos.", pf_brancos, pf_nulos, pf_válidos);
        }
    }
}