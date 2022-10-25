#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    float fahrenheit, celsius;
    cout << "Digite uma temperatura em °F: ";
    cin >> fahrenheit;
    celsius = (5 * fahrenheit - 160) / 9;
    cout << fixed << setprecision(1);
    cout << "A temperatura em celsius é " << celsius << "°C." << endl;
    return 0;
}