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

    if((a > b && a < c) || (a < b && a > c)){
        mayor2 = a;
    }else if((b > a && b < c) || (b < a && b > c)){
        mayor2 = b;
    }else if((c > a && c < b) || (c < a && c > b)){
        mayor2 = c;
    }else{
        mayor2 = d;
    }

    if((a < b && a > c) || (a > b && a < c)){
        menor2 = a;
    }else if((b < a && b > c) || (b > a && b < c)){
        menor2 = b;
    }else if((c < a && c > b) || (c > a && c < b)){
        menor2 = c;
    }else{
        menor2 = d;
    }
    cout << menor << menor2 << mayor2 << mayor <<endl;
    return 0;
}