package org.nm.dsalgo.problems.others;

public class FirstBadVersion {

	public static void main(String[] args) {
		FirstBadVersion _inst = new FirstBadVersion();
		System.out.println(_inst.firstBadVersion(10));

	}

	//This solution takes more attempts then binary
	public int firstBadVersion(int n) {
		int version = -1;
		if (n >= 0) {
			int root = ((Double) Math.sqrt(n)).intValue();
			int i = 0;
			for(i = 0 ; i <= n ; i = i + root){
				if(i > n) i = n;
				if(VersionControl.isBadVersion(i)){
					break;
				}
				if(i == n){
					return -1; 
				}
			}
			if(i == 0){
				version = i;
			}
			if(i > 0){
				for(int j = i; j >= i - root; j--){
				   if(!VersionControl.isBadVersion(j)){
					   version  = ++j;
					   break;
				   }
				}
				if(version == -1){
					version = 0;
				}
			}
		}

		return version;
	}

	public int firstBadVersionBinary(int n){
		
		int start = 0 ; int end = n; int mid = 0;
		while(start < end){
			mid = start + (end - start)/2;
			if(VersionControl.isBadVersion(mid)){
				end = mid ;
			}else{
				start = mid + 1;
			}
		}
		return end;
	}
}
