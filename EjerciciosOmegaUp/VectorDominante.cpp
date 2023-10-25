#include <iostream>
using namespace std;
int main(){
    int n;
    cin >> n;
    int numeros[2][n];
    for (int i = 0; i < 2; i++){
        for (int j = 0; j < n; j++){
            int numero;
            cin >> numero;
            numeros[i][j] = numero;
        }
    }
    int flag = 1;
    for (int i = 0; i < n; i++){
        if (numeros[0][i] <= numeros[1][i]){
            flag = 0;
        }
    }
    cout << flag << endl;
    return 0;
}