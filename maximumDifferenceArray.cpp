//Maximum Value of arr[j]-arr[i] where j>i

#include<iostream>
using namespace std;
int maxDiff(int arr[], int n){
    int minVal = arr[0];
    int res = arr[1] - arr[0];
    for(int j=1;j<n;j++){
        if(arr[j]<minVal) minVal = arr[j];
        res = max(arr[j] - minVal,res);
    }
    return res;
}

int main(){
    int a[] = {2,3,10,6,4,8,1};
    cout<<maxDiff(a, 7);
}