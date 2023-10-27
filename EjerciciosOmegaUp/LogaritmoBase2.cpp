#include <iostream>
#include <cmath>
using namespace std;

int main(){

    int n = 8, log = 0, resu = 0;
    // cin >> n;
    while(resu < n){
        log++;
        resu = pow(2, log);
    }
    cout << log <<endl;
    return 0;
}