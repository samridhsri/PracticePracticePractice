#include <stdio.h>
#include <iostream>
using namespace std;

void printArray(int* A, int n){
    for(int i=0;i<n;i++){
        printf("%d",A[i]);
    }
}

void quickSort(int A[], int low, int high){
    int partitionIndex;

    partitionIndex = partition(A, low, high);
    quickSort(A, low, partitionIndex-1);
    quickSort(A, partitionIndex+1, high);
}

int partition(int A[], int low, int high){
    int pivot = A[low];
    int i = low+1;
    int j = high;

    while(A[i]<pivot){
        i++;
    }

    while(A[j]>pivot){
        j--;
    }
    
}