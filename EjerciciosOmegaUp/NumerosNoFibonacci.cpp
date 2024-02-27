#include <iostream>
using namespace std;

bool esFibo(int n){
    int a = 0, b = 1, actual = 1;
    bool esParte = false;
    while(actual <= n){
        actual = a + b;
        a = b;
        b = actual;
        if(actual == n){
            esParte = true;
            break;
        }
    }
    return esParte;

}
int main(){
    int n; 
    cin >> n;
    for(int i = 1; i < n; i++){
        if(!esFibo(i)){
            cout << i << " ";
        }
    }
}