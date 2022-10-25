#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    float eleitores, brancos, nulos, validos, percentual_brancos, percentual_nulos, percentual_validos;
    cout << "Digite o total de eleitores no município: ";
    cin >> eleitores;
    cout << "Digite o total de votos brancos: ";
    cin >> brancos;
    cout << "Digite o total de votos nulos: ";
    cin >> nulos;
    cout << "Digite o total de votos válidos: ";
    cin >> validos;
    percentual_brancos = brancos * 100 / eleitores;
    percentual_nulos = nulos * 100 / eleitores;
    percentual_validos = validos * 100 / eleitores;
    cout << fixed << setprecision(1);
    cout << "O percentual de votos, em relação ao total de eleitores no município, é:" << endl;
    cout << percentual_brancos << "% votos brancos, ";
    cout << percentual_nulos << "% votos nulos e ";
    cout << percentual_validos << "% votos válidos." << endl;
    return 0;
}