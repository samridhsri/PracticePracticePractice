#include <iostream>
using namespace std;

int binarySearch(int arr[], int low, int high, int key){
    int mid = (low + high)/2;

    if(arr[mid]==key){
        return mid;
    }

    if(key>arr[mid]){
        return binarySearch(arr, mid+1, high, key);
    }
    else{
        return binarySearch(arr, low, mid-1, key);
    }
}

int main(){
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {1,2,3,4,5,6};
    int indexOfSearchedElement1 = binarySearch(arr1, 0, 4, 2);
    int indexOfSearchedElement2 = binarySearch(arr1, 0, 5, 3);
    cout<<indexOfSearchedElement1<<endl;
    cout<<indexOfSearchedElement2<<endl;

    return 0;
}