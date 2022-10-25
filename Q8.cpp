#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    float salario, salario_reajustado;
    cout << "Digite o salário mensal atual do funcionário: ";
    cin >> salario;
    salario_reajustado = salario * 1.22;
    cout << fixed << setprecision(2);
    cout << "O salário do funcionário, após o reajuste de 22%, será R$" << salario_reajustado << "." << endl;
    return 0;
}