#include <bits/stdc++.h>
using namespace std;
#define ll long long 
#define all(v) v.begin(),v.end()
#define pb(x) push_back(x)
#define f first
#define s second
#define vt vector
#define boost ios_base::sync_with_stdio(false), cin.tie(0), cout.tie(0);  
const ll mod = 1e9+7;
vector<int>parent(200001,-1);
void make_set(int v){
	parent[v] = v;
}
int find_set(int v) {
    if (v == parent[v])
        return v;
    return parent[v] = find_set(parent[v]);
}
void union_sets(int a, int b) {
    a = find_set(a);
    b = find_set(b);
    if (a != b)
        parent[b] = a;
}
void solve(){
	 int n,q;cin>>n>>q;
	 for(int i = 0;i<=n;i++){
	 	make_set(i);
	 }
	 for(int i = 0; i<q;i++){
	 	int t,u,v;cin>>t>>u>>v;
	 	if(t==0){
	 		union_sets(u,v);
	 	}else{
	 		if(find_set(u)==find_set(v)){
	 			cout<<"1\n";
	 		}else{
	 			cout<<"0\n";
	 		}
	 	}
	 }
}
int main()
{	boost;
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	t = 1;
	//clock_t clk = clock();
	for(int i = 0;i<t;i++){
		//cout<<"Case #"<<i+1<<": ";
		solve();
	}
	
	//clk = clock()-clk;
	//cout<<"TIME CONSUMED: "<<(float)(clk)/CLOCKS_PER_SEC<<"sec\n";
}
