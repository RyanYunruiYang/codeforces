#include <iostream>
// #include <queue>
// #include <tuple>
// #include <unordered_set>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

string vector_int_str(vector<int> v) {
    string s;
    s += '[';
    for (int i = 0; i < v.size(); i++)
    {
        s += to_string(v[i]);
        // if (v[i] != v.back())
        s += ", ";   
    }
    s += ']';
    s += '\n';
    return s;    
}

int main() {
    ios_base::sync_with_stdio(false);    

    int t;
    cin >> t;
    // cout << t;

    for (int _ = 0; _ < t; _++)
    {
        // Each Test Case
        int n;
        cin >> n;

        vector<int> a(n); // Declare a as a vector of integers with size n
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
        }

        // We calculate the remaining cost of the state:
        // b[j] = cost if the friend's term comes up
        //        and we've beaten j monsters.

        vector<int> b(n+5);
        for (int i = 0; i < b.size(); i++)
        {
            b[i] = 0;
        }
        

        for (int j=n-1; j >= 0; j--) {
            // Will never happen:
            if (j >= n) {
                b[j] = 0;
            }
            else {
                // Four cases.
                vector<int> possible_choices(3);
                // Case 1: [f=1,g=1]
                possible_choices[0] = b[j+2] + a[j];

                // Case 2: [f=1,g=2]
                possible_choices[1] = b[j+3] + a[j];

                // // Dead Case: [f=2, g=1]
                // possible_choices[2] = b[j+3] ;

                // Case 4: [f=2, g=2]
                if (j+1 < n) {
                    possible_choices[2] = b[j+4] + a[j] + a[j+1];
                }
                else {
                    possible_choices[2] = n;
                }

                // cout << possible_choices[0] << " "
                //      << possible_choices[1] << " "
                //      << possible_choices[2] << "\n";

                b[j] = *std::min_element(possible_choices.begin(), possible_choices.end());
            }
        }
        // cout << vector_int_str(a);
        // cout << vector_int_str(b);

        // Final Answr:
        cout << b[0] << "\n";
    }
    return 0;

}