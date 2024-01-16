#include <iostream>
#include <cmath>
using namespace std;

int main(){
    double x1, y1, x2, y2, x3, y3, x4, y4;
    cin >>x1>>y1>>x2>>y2>>x3>>y3>>x4>>y4;
    double ladoAB = sqrt((pow((x2 - x1), 2)) + (pow((y2 - y1), 2)));
    double ladoBC = sqrt((pow((x3 - x2), 2)) + (pow((y3 - y2), 2)));
    double ladoCD = sqrt((pow((x4 - x3), 2)) + (pow((y4 - y3), 2)));
    double ladoDA = sqrt((pow((x4 - x1), 2)) + (pow((y4 - y1), 2)));

    if(ladoAB < ladoBC && ladoAB < ladoCD && ladoAB < ladoDA){
        cout << ladoAB << endl;
    }else if(ladoBC < ladoAB && ladoBC < ladoCD && ladoBC < ladoDA){
        cout << ladoBC << endl;
    }else if(ladoCD < ladoAB && ladoCD < ladoBC && ladoCD < ladoDA){
        cout << ladoCD << endl;
    }else if(ladoDA < ladoAB && ladoDA < ladoBC && ladoDA < ladoCD){
        cout << ladoDA << endl;
    }
    return 0;
}