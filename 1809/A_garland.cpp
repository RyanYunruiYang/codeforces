#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;

    cin >> t;

    // std::vector<char> buffer(m);
    // cin.read(&buffer[0], m);
    
    int m = 4;
    char c;
    for(int i=0; i<t; i++) {
        std::vector<char> buffer(m);
        cin.read(&buffer[0], m);

        cout << buffer << "\n";
        // str x;
        // cin >> x;
        // cout << "x: " << x << "\n";
    }

}

