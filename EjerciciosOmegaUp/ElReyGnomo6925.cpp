#include <iostream>
#include <string>
using namespace std;
int main(){
    int a, b, c, d;
    cin >> a;
    string tmp;
    for (int i = 0; i < a; i++){
        cin >> b >> c;
        for (int j = 1; j < b; j++){
            cin >> d;
            if (d != c + 1){
                getline(cin, tmp);
                cout << j + 1 << endl;
                break;
            }
            c = d;
        }
    }
    return 0;
}