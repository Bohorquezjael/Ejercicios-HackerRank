#include <iostream>
using namespace std;
int main(){
    int n, control = 1;
    cin >> n;
        for (int j = 1; j <= n; j++){
            cout << control << " ";
            if(control == 5){
                control--;
            }else{
                control++;
            }
        }
    return 0;
}