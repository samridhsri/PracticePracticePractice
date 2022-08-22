#include <iostream>
using namespace std;

void printArray(int arr[], int n){
    for(int i=0; i<n; i++){
        cout<<i+1<<" Element: "<<arr[i]<<endl;
    }
}

void leftRotate(int arr[], int n){
    int temp = arr[0];
    for(int i=1; i<n; i++){
        arr[i-1] = arr[i];
    }
    arr[n-1] = temp;
}

void leftRotatebyD(int arr[], int n, int d){
    for(int i=0; i<d; i++){
        leftRotate(arr, n);
    }
}

int main(){
    int * arr;
    int n = 10;
    cout<<"Enter number elements you want to add to the array: ";
    cin>>n;
    arr = new int[n];
    for(int i = 1; i<n+1; i++){
        cout<<"\n Enter element "<<i<<": ";
        cin>>arr[i-1];
    }
    cout<<"Original array"<<endl;
    printArray(arr, n);
    leftRotatebyD(arr, n, 2);
    cout<<"Array after rotation"<<endl;
    printArray(arr, n);
}