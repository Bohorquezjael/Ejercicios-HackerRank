#include <iostream>
using namespace std;

int main(){

    int c, p, h;

    cin >> c >> p >> h;

    cout << (p) + ((c - p) % (h + 1)) << endl;
    
    return 0;
}