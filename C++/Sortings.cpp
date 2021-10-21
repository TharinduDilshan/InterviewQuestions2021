#include <bits/stdc++.h>
using namespace std;
void Bubble_Sort(vector<int>&a){
	//swap adjacent elements upto n-1 times it will sort the array
	// upper bound to the no. of swaps required in order to sort the array is n*(n-1)/2; (in the worst case)
	//Avg O(n^2)
	//Best O(n^2) --> it can be further improved by introducing  a flag inside if no inversion not found then simply break. New Best O(n);
	//Worst O(n^2)
	int n = a.size();
	for(int i = 0;i<n-1;i++){
		for(int j = 1;j<n;j++){
			//if find any inversion
			if(a[j]<a[j-1])
				swap(a[j],a[j-1]);
			}
	}
}
void Selection_Sort(vector<int>&a){
	//partition the array in to 2 parts one is the sorted and the other is unsorted
	//every time take a no. from unsorted part and insertion it at correct position in the sorted part
	
	//not stable 
		
	//Avg O(n^2)
	//Best O(n^2)
	//Worst O(n^2)
	//The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
	int n = a.size();
	for(int i = 0;i<n-1;i++){
		int t = i;
		for(int j = i+1;j<n;j++){
			if(a[j]<a[t]){
				t = j;
				}
			}	
		if(t!=i){
			swap(a[i],a[t]);
			}
	}
}
void Insertion_Sort(vector<int>&a){
	//sorting cards
	//Best O(n);
	
	int n = a.size();
	for(int i = 1;i<n;i++){
		int j = i-1;
		//here key is the element to be placed at its correct place
		int key = a[i];
		while(j >= 0 and a[j]>key){
			a[j+1] = a[j];
			j--;
			}
		a[j+1] = key;
		}
}
int main(){
	vector<int>v;
	int x;

	while(cin>>x){v.push_back(x);}

	cout<<"Before sorting : ";
	for(int i:v)cout<<i<<' ';
	cout<<"\n";
	Insertion_Sort(v);
	cout<<"After sorting : ";
	for(int i:v)cout<<i<<' ';
	cout<<"\n";
}
