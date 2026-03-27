#include <iostream>
#include <vector>
using namespace std;


int main() {


    int N; 
    cin >> N;
    int cnt = 0;
    bool isGroup;

    string *input = new string[N];
    
    
    for(int i=0; i<N; i++) {
        cin >> input[i];
        string str = input[i];

        string comp;
        for (char c : str) {
            // 결과 문자열이 비어있거나, 마지막 글자와 현재 글자가 다를 때만 추가
            if (comp.empty() || comp.back() != c) {
                comp.push_back(c);
            }
        }
        char alphabet[26] = {0};
        
        isGroup = true;
        for(char c : comp) {
            int index = c - 'a';
            if(alphabet[index] != 0) {
                isGroup = false; 
            }
            alphabet[index]++;
        }

        if(isGroup) {
            cnt++;
        }
        
    }

    cout << cnt << endl;
    


    return 0;
}
