#include <iostream>

using namespace std;

int main(){
    int t, b;
    cin >> t >> b;
    int tamalB = 0;
    if(t % 2 == 0){
        tamalB = (t - (t / 2));
        cout << ((t / 2) + (tamalB % (b - 1))) << endl;
    }else if(t % 2 == 1){
        tamalB = (t - (t / 2) - 1);
        cout << ((t / 2) + (t % 2) + (tamalB % (b - 1))) << endl;
    }
    return 0;
}