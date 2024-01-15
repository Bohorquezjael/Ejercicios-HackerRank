#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int n; 
    int sumatoria = 0;
    cin >> n;
    for(int i = 0; i <= n; i++){
        sumatoria += n / pow(2 , i);;
    }
    cout << sumatoria <<endl;
    return 0;
}