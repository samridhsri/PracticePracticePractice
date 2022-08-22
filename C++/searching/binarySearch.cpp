//Binary Search

#include <iostream>
using namespace std;

int binarySearch(int arr[], int n, int k){
    int high = n-1;
    int low = 0;

    while(high>=low){
        int mid = (high + low)/2;
        if(arr[mid]==k) return mid;
        else if (k>arr[mid]){
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }
    return -1;
}

int main(){
    int arr[] = {1,2,3,4,5};
    int arr2[] = {12,23,45,65,100,101};
    cout<<binarySearch(arr, 5, 2)<<endl;
    cout<<binarySearch(arr2, 6, 100)<<endl;
    cout<<binarySearch(arr2, 6, 102)<<endl;
    return 0;
}