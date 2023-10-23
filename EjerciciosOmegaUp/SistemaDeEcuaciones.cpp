#include <iostream>
using namespace std;

int main(){
    double x1, y1, c1, x2, y2, c2;
    cin >> x1 >> y1 >> c1;
    cin >> x2 >> y2 >> c2;
    double y = (((x2 * c1) - (x1 * c2)) / ((x2 * y1) - (x1 * y2)));
    double x = ((c1 - (y1 * y)) / x1);
    cout << x << " " << y <<endl;
    return 0;
}