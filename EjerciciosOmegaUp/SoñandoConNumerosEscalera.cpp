#include <iostream>
using namespace std;

int main(){
    int n, a, b;
    cin >> n >> a >> b;

    if(n == 1 || n == 121 || n == 12321 || n == 1234321 || n == 123454321){
        cout << "es escalera inicialmente" <<endl;
    }else{
        n = (n - a) / (b + 1);
        if(n == 1 || n == 121 || n == 12321 || n == 1234321 || n == 123454321){
            cout << "es escalera despues del primer intento" <<endl;
        }else{
            n = n - (a + b) + 1;
            if(n == 1 || n == 121 || n == 12321 || n == 1234321 || n == 123454321){
                cout << "es escalera despues del segundo intento" <<endl;
            }else{
                cout << "nos rendimos" <<endl;
            }
        }
    }
    return 0;
}