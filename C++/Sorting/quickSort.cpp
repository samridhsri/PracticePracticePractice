// #include <stdio.h>
#include <iostream>
using namespace std;

void swap(int * a, int * b){
    int temp = *a;
    *a = *b;
    *b = temp;

}

void printArray(int* A, int n){
    for(int i=0;i<n;i++){
        printf("%d ",A[i]);
    }
}

int partition(int a[], int l, int h){
    int pivot=a[l];
    int i=l;
    int j=h;

    do{
    do{i++;}while (a[i]<=pivot);
    do{j--;}while(a[j]>pivot);
    if(i<j) swap(&a[i],&a[j]);
    }while(i<j);
    swap(&a[l],&a[j]);
    return j;
    
}

void quickSort(int a[], int l, int h){
    int j;
    if(l<h){
        j=partition(a, l, h);
        quickSort(a, l, j);
        quickSort(a, j+1, h);
    }
}

int main(){
    cout<<"Name: Samridh Srivastava"<<endl;
    cout<<"Registration: 209303155"<<endl;
    cout<<"Enter number of elements you want to enter: ";
    int size;
    cin>>size;
    cout<<endl;
    int* a = new int[size+1];
    a[size] = INT_MAX; //for infinity
    for(int i=0;i<size;i++){
        cout<<"Enter element "<<i<<": ";
        cin>>a[i];
        cout<<endl;
    }
    cout<<"Current Array: ";
    printArray(a,size);
    cout<<endl;
    quickSort(a, 0, size);
    cout<<"New Array: ";
    printArray(a, size);
    return 0;

}