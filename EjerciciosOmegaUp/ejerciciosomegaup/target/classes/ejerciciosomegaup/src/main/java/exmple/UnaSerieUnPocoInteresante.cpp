#include <iostream>
using namespace std;

int main(){
    int n, m, atras, adelante;
    cin >> n >> m;
    m %= 3;

    adelante = (n + m) % 3;
    atras = (n - m + 3) % 3;

    if(adelante == 0){
        adelante = 3;
    }
    if(atras == 0){
        atras = 3;
    }

    cout << atras << " " <<adelante <<endl;
    return 0;
}