// Binary Search using recursion

#include <iostream>
using namespace std;
int BinarySearch(int arr[], int k, int high, int low){
    int mid = (high + low)/2;
    if(arr[mid]==k) return mid;
    if(arr[mid]>k) return BinarySearch(arr, k, mid-1, low);
    if(arr[mid]<k) return BinarySearch(arr, k, high, mid+1);
    else return -1;
}

int main(){
    int a[] = {1,2,3,4,5,6};
    cout<<BinarySearch(a, 4, 5, 0)<<endl;
}