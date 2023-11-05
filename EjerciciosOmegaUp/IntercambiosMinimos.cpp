#include <iostream>
using namespace std;

int main(){
    int a, b, c, conta = 0, tmp = 0;
    cin >> a >> b >> c;

    if(a > b){
        tmp = a;
        a = b;
        b = tmp;
        conta++;
    }

    if(b > c){
        tmp = b;
        b = c;
        c = tmp;
        conta++;
    }

    if(a > b){
        tmp = a;
        a = b;
        b = tmp;
        conta++;
    }
        cout << conta <<endl;
    return 0;
}