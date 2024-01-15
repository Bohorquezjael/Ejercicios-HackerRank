#include <iostream>
using namespace std;

int main(){
    int repeticiones, contadorPar = 0, contadorImpar = 0;
    cin >> repeticiones;
    for(int i = 0; i < repeticiones; i++){
        int numero;
        cin >> numero;
        if(numero % 2 == 1){
            contadorImpar++;
        }else if(numero % 2 == 0){
            contadorPar++;
        }
    }
    cout << contadorPar << " " << contadorImpar <<endl;
    return 0;
}