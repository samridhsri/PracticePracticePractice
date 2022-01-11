#include <iostream>
using namespace std;

int reverseNum(int n){
    int rev = 0;
    while(n>0){
        int temp = n%10;
        rev = rev*10 + temp;
        n = n/10;
    };
    return rev;
}

int main(){
    cout<<reverseNum(9876)<<endl;
    cout<<reverseNum(96)<<endl;
    cout<<reverseNum(6)<<endl;
}