#include <iostream>
using namespace std;
int main(){
    int n, control = 1, vuelta = 0;
    cin >> n;
    while(n > 0){
        cout << control << " ";
        if(control == 5 || (control == 1 && vuelta != 0)){
            vuelta++;
        }
        if(vuelta % 2 == 0){
            control++;
        }else{
            control--;
        }
        n--;
    }
    return 0;
}