#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    
    string a;
    string b;

    cin >> a;
    cin >> b;

    reverse(a.begin(), a.end());
    reverse(b.begin(), b.end());

    int intA = stoi(a);
    int intB = stoi(b);

    int result = intA > intB ? intA : intB;
    cout << result << endl;

    
    return 0;

}
