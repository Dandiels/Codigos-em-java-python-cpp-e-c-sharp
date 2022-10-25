#include <iostream>

using namespace std;

int main()
{
    int anos, meses, dias, dias_vividos;
    cout << "Digite a sua idade: ";
    cin >> anos;
    cout << "Digite quantos meses se passaram desde seu aniversário: ";
    cin >> meses;
    cout << "Digite quantos dias você viveu no mês atual: ";
    cin >> dias;
    dias_vividos = anos * 365 + meses * 30 + dias;
    cout << "Você viveu um total de " << dias_vividos << " dias." << endl;
    return 0;
}