#include <stdio.h>
#include <iostream>
using namespace std;

void swap(int* a, int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

void bubbleSort(int arr[], int n){
    int i,j;
    for(i=0;i<n;i++){
        for(j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                swap(&arr[j],&arr[j+1]);
            }
        }
    }
}

void printArray(int a[], int n){
    for(int i=0;i<n;i++){
        printf(" %d ",a[i]);
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
    bubbleSort(a, size);
    cout<<"New Array: ";
    printArray(a, size);
    return 0;

}