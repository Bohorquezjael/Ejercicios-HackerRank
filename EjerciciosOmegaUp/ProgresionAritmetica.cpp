#include <iostream>
using namespace std;
int main()
{
    int a, b, c, suma = 0;
    cin >> a >> b >> c;
    for (int i = 0; i < c; i++){
        suma += (a + (i * b));
    }
    cout << suma << endl;
}