#include <iostream>
using namespace std;

int main(){
    int numeroLeido, sumatoria = 0;
    do{
        cin >> numeroLeido;
        sumatoria += numeroLeido;
    }while(numeroLeido != 0);

    cout << sumatoria <<endl;
    return 0;
}