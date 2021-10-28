//BIT or Fenwick Trees
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
int gcd(int a,int b){
	if(b==0)return a;
	
	return gcd(b,a%b);
}
const int mxn = 1e6;
ll tree[mxn+1];
ll prefixSum[mxn+1];
void build(ll n){
	for(ll i = 1;i<=n;i++){
		//tree [k] = sumq(k−p(k)+1,k);
		//p(q) --> highest power of 2 which is less than k
		tree[i] = prefixSum[i]-prefixSum[i-(i&(-i))];
		}
}
//calc sumq(1,k) in log(n)
ll sum(ll k){
	ll s = 0;
	while(k>=1){
		s+=tree[k];
		k -= (k&-k);
	}
	return s;
}
//update function 
void update(ll k, ll x,ll n){
	while(k<=n){
		tree[k]+=x;
		k+=(k&-k);
	}
}

void solve(){
	ll n,q ;cin>>n>>q;
	//1-indexing 
	
	vector<ll>v(n+1);
	
	for(ll i = 1;i<=n;i++)cin>>v[i];
	
	ll s = 0;
	for(ll i = 1;i<=n;i++){
		s += v[i];
		prefixSum[i] = s;
	}

	build(n);
	//for(ll i = 1;i<=n;i++)cout<<tree[i]<<' ';
		
	//cout<<'\n';
	while(q-->0){
		int t;
		ll L,R;cin>>t;
		
		//sum query
		if(t==1){
			cin>>L>>R;
			// cout<<sum(L)<<' '<<sum(R)<<endl;
			cout<<sum(R)-sum(L)<<'\n';
		}
		//update query
		else{
			ll x,p;cin>>p>>x;
			update(p+1,x,n);		
			}	
	}
}
int main()
{	boost;
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	t = 1;
	//cin>>t;
	//cin>>t>>n>>q;
	//clock_t clk = clock();
	for(int i = 0;i<t;i++){
		//cout<<"Case #"<<i+1<<": ";
		solve();
		}
	
	//clk = clock()-clk;
	//cout<<"TIME CONSUMED: "<<(float)(clk)/CLOCKS_PER_SEC<<"sec\n";
}
