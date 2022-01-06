// Given two positive integers num1 and num2, the task is to find the remainder when num1 is divided by num2.

#include <iostream>
using namespace std;

//function
int findRemainder(int num1, int num2)
{
    int rem = num1 % num2;
    return rem;
}

//driver code

int main()
{
    int num1, num2;
    cout << "Enter numbers" << endl;
    cin >> num1 >> num2;
    int ans = findRemainder(num1, num2);
    cout << "Remainder is: " << ans;
}