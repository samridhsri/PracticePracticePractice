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
    int a[] = {2,7,1,3,8};
    printArray(a, 5);
    insertionSort(a, 5);
    printArray(a, 5);
    return 0;
}

//Time Complexity is O(n^2)
//Space Complexity is 1