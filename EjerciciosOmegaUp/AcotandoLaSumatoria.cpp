#include <iostream>
using namespace std;
int main(){
    int n, suma = 0, i = 0;
    cin >> n;
    while (suma < n){
        i++;
        suma += i + 7;
    }
    cout << i << endl;
    return 0;
}