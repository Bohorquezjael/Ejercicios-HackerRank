#include <iostream>

using namespace std;
//FIXME
int main(){
    int a, b, c, d;
    cin >> a >> b >> c >> d;

    int mayor, menor2, mayor2, menor;

    if(a > b && a > c && a > d){
        mayor = a;
    }else if(b > a && b > c && b > d){
        mayor = b;
    }else if(c > a && c > b && c > d){
        mayor = c;
    }else{
        mayor = d;
    }

    if(a < b && a < c && a < d){
        menor = a;
    }else if(b < a && b < c && b < d){
        menor = b;
    }else if(c < a && c < b && c < d){
        menor = c;
    }else{
        menor = d;
    }
    
    
    cout << menor << menor2 << mayor2 << mayor <<endl;
    return 0;
}