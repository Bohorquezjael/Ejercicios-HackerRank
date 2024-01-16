#include <iostream>
using namespace std;

int main(){
    int a, b, c;
    cin >> a >> b >> c;
    if(a == b && a == c){
            cout << "equilatero" << endl;
        }else if(a == b || b == c || a == c){
            cout << "isosceles" << endl;
        }else{
            cout << "escaleno" << endl;
        }
    return 0;
}