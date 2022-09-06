#include <stdio.h>
#include <iostream>
using namespace std;

void printArray(int a[], int n){
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
}

void insertionSort(int a[], int n){
    for(int i=1;i<n;i++){

        int x = a[i];
        int j = i-1;
        while(j>-1 && a[j]>x){
            a[j+1] = a[j];
            j--;
        }

        a[j+1] = x;
    }
}

int main(){
    cout<<"Name: Samridh Srivastava"<<endl;
    cout<<"Registration: 209303155"<<endl;
    cout<<"Enter number of elements you want to enter: ";
    int size;
    cin>>size;
    cout<<endl;
    int* a = new int[size];
    for(int i=0;i<size;i++){
        cout<<"Enter element "<<i<<": ";
        cin>>a[i];
        cout<<endl;
    }
    cout<<"Current Array: ";
    printArray(a,size);
    cout<<endl;
    insertionSort(a, size);
    cout<<"New Array: ";
    printArray(a, size);
    return 0;
}

//Time Complexity is O(n^2)
//Space Complexity is 1