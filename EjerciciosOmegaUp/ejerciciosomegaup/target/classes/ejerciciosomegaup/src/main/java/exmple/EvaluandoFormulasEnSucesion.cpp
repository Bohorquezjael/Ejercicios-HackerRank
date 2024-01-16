#include <iostream>
#include <cmath>

using namespace std;

int main() {
    double x, y ,z;
    cin >>x;
    y = (x + 5) / (2 * (x + 1));
    z = ((pow(y, 2) + (x * (x - (2 * y)))) / (x * y));

    cout << z << endl;
	return 0;
}
