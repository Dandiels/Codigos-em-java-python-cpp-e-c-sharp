#include <iostream>

using namespace std;

int main()
{
    int anos;
    int meses;
    int dias;
    int diasVividos;
    cout << "Digite a sua idade: ";
    cin >> anos;
    cout << "Digite quantos meses se passaram desde seu aniversário: ";
    cin >> meses;
    cout << "Digite quantos dias você viveu no mês atual: ";
    cin >> dias;
    diasVividos = anos * 365 + meses * 30 + dias;
    cout << "Você viveu um total de " << diasVividos << " dias." << endl;
    return 0;
}