#include <iostream>
using namespace std;
int main(){
    int numero;
    cin >> numero;
    cout << funcion(numero) << endl;
    return 0;
}

int funcion(int numero){
    if (numero == 0){
        return 1;
    }
    else if (numero < 0){
        return funcion(-numero) + funcion(numero + 1) + 2;
    }
    else{
        return funcion(-numero + 1) + 1;
    }
}