#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int a;
    cout << "Enter the number of elements: ";
    cin >> a;

    double num[a],sum = 0, mean, variance = 0, stddev;

    cout << "Enter the elements: ";
    for(int i = 0; i < a; ++i) {
        cin >> num[i];
        sum += num[i];
        cout<<"The sum of the elements is "<<sum<<endl;
    }

    mean = sum / a;
    cout<<"The mean of the elements is "<<mean<<endl;

    for(int i = 0; i < a; ++i) {
        variance  += (num[i] - mean) * (num[i] - mean);
    }

    variance /= a;
    cout<<"The Variance of the elements is "<<variance<<endl;
    
    stddev = sqrt(variance);

    cout << "The Standard Deviation of the elements is  " << stddev << endl;

    return 0;
}