#include <iostream>
using namespace std;
int main() {
  int n, num = 0;
  cin >> n;
  while(n >= 0){
    num++;
    bool  flag = true;
    for(int i = 2; i <= num; i++){
      if(num % i == 0 && i != num){
        flag = false;
        break;
      }
    }
    if(flag){
      n--;
    }
    
  }
  cout << num <<endl;
}