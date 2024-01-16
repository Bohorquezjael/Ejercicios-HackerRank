#include <iostream>
using namespace std;
int main(){
    int n;
    cin >> n;
    for (int i = 0; i < n; i++){
        int suma = 0;
        for (int j = 0; j < 3; j++){
            int numero;
            cin >> numero;
            suma += numero;
        }
        cout << suma << endl;
    }
    return 0;
}