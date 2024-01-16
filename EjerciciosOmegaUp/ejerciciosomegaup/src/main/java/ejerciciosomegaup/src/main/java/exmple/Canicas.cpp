#include <iostream>
using namespace std;
int main(){
    int vasos, canicas, nn;
    cin >> vasos >> canicas;
    int n[vasos];

    for (int i = 0; i < vasos; i++){
        n[i] = 0;
    }
    
    for (int i = 0; i < canicas; i++){
        cin >> nn;
        n[nn - 1]++;
        }

    for (int i = 0; i < vasos; i++){
        cout << n[i] << endl;
    }
    return 0;
}