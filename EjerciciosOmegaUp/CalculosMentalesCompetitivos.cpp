#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main(){
    long double r;  
    cin >> r;
    long double  b = r + 5 ,c = pow(b, 2) , d = c / (r / 3.0) ,e = pow(d, 3);
    cout << fixed << setprecision(6) << r << endl;
    cout << fixed << setprecision(6) << b << endl;
    cout << fixed << setprecision(6) << c << endl;
    cout << fixed << setprecision(6) << d << endl;
    cout << fixed << setprecision(6) << e << endl;
    return 0;
}