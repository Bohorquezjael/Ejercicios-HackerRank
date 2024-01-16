#include <iostream>

using namespace std;

int main() {
//! Mejora posible con recursividad
    int s;
    cin >> s;
    int ss = s % 50;
    int m = (s / 50) % 70;
    int h = ((s / 50) / 70) % 12;
    int d =  ((s / 50) / 70) / 12;
    printf("%d %d %d %d", d, h, m ,ss);
    return 0;
}