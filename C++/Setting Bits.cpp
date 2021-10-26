#include <bits/stdc++.h>
using namespace std;

// Returns smallest number whose set bits
// are maximum in given range.

int countMaxSetBits(int left, int right)
{
	while ((left | (left + 1)) <= right)
		left |= left + 1;

	return left;
}

// Driver code
int main()
{
	int l = 1,n,num;
	cin>>n;
	int r[n];
	for(int i=1;i<=n;i++){
        cin>>r[i];
	}
	for(int i=1;i<=n;i++){
        num=r[i];
	cout << countMaxSetBits(l,num) << "\n";
	}
	return 0;
}
