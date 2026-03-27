#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {

    string str;
    cin >> str;

    int alphabet[26] = {0};

    for(int i=0; i<str.length(); i++) {
        str[i] = tolower(str[i]);
        int index = str[i] - 'a';
        alphabet[index]++;
    }

    int max = 0;
    vector<int> maxs;
    for(int i=0; i<26; i++) {
        if(alphabet[i] > max) {
            maxs.clear();
            maxs.push_back(i);
            max = alphabet[i];
        }
        else if(alphabet[i] == max) {
            maxs.push_back(i);
            max = alphabet[i];
        }
    }    
    
    if(maxs.size() >= 2) {
        cout << "?" << endl;
    } else {
        int index = maxs.at(0);
        char best = index + 'A';
        cout << best << endl;
    }

    return 0;
}
