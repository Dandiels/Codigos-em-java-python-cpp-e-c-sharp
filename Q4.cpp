#include <iostream>

using namespace std;

int main()
{
    float numero, antecessor;
    cout << "Digite um número: ";
    cin >> numero;
    antecessor = numero - 3;
    cout << "O 3° antecessor desse número é " << antecessor << "." << endl;
    return 0;
}