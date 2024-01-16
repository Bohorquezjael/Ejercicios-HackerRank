#include <iostream>
using namespace std;

int main(){
    int a, b, c, d;

    cin >> a >> b >> c >> d;

        if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
            a = 29;
        }else{
            a = 28;
        }

        if((b % 4 == 0 && b % 100 != 0) || b % 400 == 0){
            b = 29;
        }else{
            b = 28;
        }

        if((c % 4 == 0 && c % 100 != 0) || c % 400 == 0){
            c = 29;
            }else{
            c = 28;
            }

        if((d % 4 == 0 && d % 100 != 0) || d % 400 == 0){
            d = 29;
        }else{
            d = 28;
        }

        cout << a << " " << b << " " << c << " " << d << endl;
    return 0;
}