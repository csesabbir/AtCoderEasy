#include<bits/stdc++.h>
using namespace std;

int main () {
	vector<int> v;
	for (int i = 0; i < 5; i++) {
		int x;
		cin >> x;
		v.push_back(x);
	}
	int minValue = INT_MAX;
	do {
		int cnt = v[0];
		for (int i = 1; i < 5; i++) {
			int r = cnt % 10;
			//cnt += (10 - r);
			if (r != 0) {
			    cnt += (10 - r);
			}
			cnt += v[i];
		}
		minValue = min(minValue, cnt);
	} while (next_permutation(v.begin(), v.end()));
	cout << minValue << endl;
	return 0;
}