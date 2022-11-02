#include <iostream>
using namespace std;

void swap(int* a, int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
}
void printArr(int* a, int size){
    for(int i=0;i<size;i++){
        cout<<a[i]<<",";
    }
    cout<<endl;
}

void takeInput(int* a, int size){
    for(int i=0;i<size;i++){
        cout<<"Enter Element "<<i<<": ";
        cin>>a[i];
        cout<<endl;
    }
}

void selectionSort(int arr[], int n){
    int i,j,k;
    for(i=0;i<n-1;i++){
        for(j=k=i;j<n;j++){
            if(arr[j]<arr[k]){
                k=j;
            }
        }
        swap(&arr[i],&arr[k]);
    }
}


int main(){
    cout<<"Name: Samridh Srivastava"<<endl<<"Registration Number: 209303155"<<endl;
    int size;
    int* arr = new int[size];
    cout<<"Enter Number of elements you want to add: ";
    cin>>size;
    cout<<endl;
    takeInput(arr, size);
    cout<<"current array: ";
    printArr(arr, size);
    selectionSort(arr, size);
    cout<<"Sorted Array: ";
	printArr(arr, size);
}