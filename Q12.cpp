#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    float peso2, peso3, peso4, peso7, media_final;
    cout << "Digite a nota de peso 2: ";
    cin >> peso2;
    cout << "Digite a nota de peso 3: ";
    cin >> peso3;
    cout << "Digite a nota de peso 4: ";
    cin >> peso4;
    cout << "Digite a nota de peso 7: ";
    cin >> peso7;
    media_final = (peso2 * 2 + peso3 * 3 + peso4 * 4 + peso7 * 7) / 16;
    cout << fixed << setprecision(1);
    cout << "A média final desse aluno é " << media_final << "." << endl;
    return 0;
}