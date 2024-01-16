#include <iostream>

using namespace std;
//USAR CICLOOOS
int main(){
    int a, b, c, d;
    cin >> a >> b >> c >> d;

    
        
        if(a > b){
            int temp = 0;
            temp = b;
            b = a;
            a = temp;
        }

        if(b > c){
            int temp = 0;
            temp = c;
            c = b;
            b = temp;
        }

        if(c > d){
            int temp = 0;
            temp = d;
            d = c;
            c = temp;
        }

        if(a > b){
            int temp = 0;
            temp = b;
            b = a;
            a = temp;
        }

        if(b > c){
            int temp = 0;
            temp = c;
            c = b;
            b = temp;
        }

        if(a > b){
            int temp = 0;
            temp = b;
            b = a;
            a = temp;
        }

    cout << a << " " << b << " " << c << " " << d <<endl;
    return 0;
}