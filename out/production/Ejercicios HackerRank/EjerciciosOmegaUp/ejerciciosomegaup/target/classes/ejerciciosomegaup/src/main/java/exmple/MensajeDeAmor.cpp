#include <iostream>
using namespace std;
int main()
{
    int a, numeros;
    cin >> a;
    for (int i = 1; i <= a; i++){
        cin >> numeros;
        for (int j = 1; j <= numeros; j++){
            cout << "<3";
        }
        cout << " " << endl;
    }
    return 0;
}