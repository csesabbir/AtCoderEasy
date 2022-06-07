#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> v1;
    vector<int> v2;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        v1.push_back(x);
    }
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        v2.push_back(x);
    }
    vector<int> v;
    for (int i = 1; i <= n; i++) {
        v.push_back(i);
    }
    int cnt = 1;
    int f = 1, s = 1;
    do {
        if (v == v1) {
            f = cnt;
        }
        if (v == v2) {
            s = cnt;
        }
        cnt++;
    } while (next_permutation(v.begin(), v.end()));
    int res = abs(f - s);
    cout << res << endl;
    return 0;
}