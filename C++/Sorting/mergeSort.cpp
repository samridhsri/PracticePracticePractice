#include<iostream>
using namespace std;

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

void merge(int arr[], int s, int e){
	
	int mid = (s+e)/2;
	int i = s;
	int j = mid+1;
	int k = s;
	int temp[100];
	
	while((i <= mid) && (j <= e)){
		if(arr[i] < arr[j]){
			temp[k++] = arr[i++];
		}
		else{
			temp[k++] = arr[j++];
		}
	}
	
	while(i<=mid){
		temp[k++] = arr[i++];
	}
	while(j<=e){
		temp[k++] = arr[j++];
	}
	for(int i = s; i <= e; i++){
		arr[i] = temp[i];
	}
}
void mergeSort(int arr[], int s, int e){
	if(s>=e){
		return;
	}
	int mid = (s+e)/2;
	mergeSort(arr, s, mid);
	mergeSort(arr, mid+1, e);
	merge(arr, s, e);
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
    mergeSort(arr, 0, size);
    cout<<"Sorted Array: ";
	printArr(arr, size);
}