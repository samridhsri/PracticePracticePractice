#include<iostream>
using namespace std;
void leader(int arr[], int n){
    cout<<"Leaders of the array are: ";
    cout<<arr[n-1]<<" ";
    int lead;
    lead = arr[n-1];
    for(int i=n-2;i>=0;i--){
        if(arr[i]>lead) {
            cout<<arr[i]<<" ";
            lead = arr[i];
        }
    }
}

int main(){
    int arr[] = {9,5,1,6,2};
    leader(arr, 5);
}