#include <iostream>
#include <cmath>
using namespace std;

int main (){
    int n = 0, a, b, c;
    cin >> a >> b >> c;

    for(int i = 1; i <= a; i++){
        if(i % 2 == 1){
            n += i;
        }
    }

    for(int i = 1; i <= b; i *= 2){
        n -= i;
    }

    while(n % c == 0){
        n /= c;
    }

    cout << n <<endl;
    return 0;
}