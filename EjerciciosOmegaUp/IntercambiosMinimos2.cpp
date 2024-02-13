#include <iostream>
using namespace std;
int main() {
  int a, b, c;
  cin >> a >> b >> c;
  if(a < b && b < c){
    cout << "0" <<endl;
  }else if((b > a && a > c) || (a > c && c > b)){
    cout << "2" <<endl;
  }else{
    cout << "1" <<endl;
  }
  return 0;
}
