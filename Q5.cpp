#include <iostream>

using namespace std;

int main()
{
    float base;
    float altura;
    float area;
    cout << "Digite o valor da base: ";
    cin >> base;
    cout << "Digite o valor da altura: ";
    cin >> altura;
    area = base * altura / 2;
    cout << "A área desse triângulo é " << area << "." << endl;
    return 0;
}