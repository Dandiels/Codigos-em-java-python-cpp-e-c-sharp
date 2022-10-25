#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    float custo_de_fabrica, custo_final;
    cout << "Digite o custo de fábrica do carro: ";
    cin >> custo_de_fabrica;
    custo_final = custo_de_fabrica + 15 * custo_de_fabrica / 100 + 30 * custo_de_fabrica / 100;
    cout << fixed << setprecision(2);
    cout << "O custo final do carro, com a porcentagem do distribuidor e dos impostos, será R$" << custo_final << "." << endl;
    return 0;
}