#include <iostream>
using namespace std;

int main(){
    double a, b, c;
    cin >> a >> b >> c;
    double mas = ((a / b) + c);
    double menos = ((a / b) - c);
    if(b != 0){
        if (mas == menos){
            cout << mas <<endl;
        }else{
        cout << mas << " " << menos << endl;
        }
    }else{
        cout << "indefinido" << endl;
    }
    return 0;
}