#include <iostream>
#include <cmath>
using namespace std;

int main(){
    double x, y, z, pi = acos(-1);
    cin >> x >> y >> z;
    
    double resu = (x + x * (y + z * z) / (x + pi) * (y + pi));
    cout << resu << endl;
    return 0;
}