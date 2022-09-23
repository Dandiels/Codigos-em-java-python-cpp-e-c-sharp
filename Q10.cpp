#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    float salario_fixo;
    float carros_vendidos;
    float valor_carro;
    float valor_das_vendas;
    float salario_final;
    cout << "Digite o salário fixo do vendedor: ";
    cin >> salario_fixo;
    cout << "Digite o número de carros vendidos pelo vendedor: ";
    cin >> carros_vendidos;
    cout << "Digite o valor fixo ganho por cada carro vendido: ";
    cin >> valor_carro;
    cout << "Digite o valor total das vendas do vendedor: ";
    cin >> valor_das_vendas;
    salario_final = salario_fixo + carros_vendidos * valor_carro + 3 * valor_das_vendas / 100;
    cout << fixed << setprecision(2);
    cout << "O salário final do vendedor será R$" << salario_final << "." << endl;
    return 0;
}