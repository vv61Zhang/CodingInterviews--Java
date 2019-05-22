public class Solutions {
	public int maxProductAfterCutting(int n) {
		//if(n<=1) return 0;
		//if(n == 2) return 1;
		//if( n== 3) return 2;
		int[] product = new int[n+1];
		product[0] = 0;
		product[1] = 0;
		product[2] = 1;
		product[3] = 2;
		int max =0;
		for(int i =4;i<=n;i++) {
            max =0;
			for(int j =1;j<i/2;j++) {
				if(product[i]*product[j-i] > max) max=product[i]*product[j-i];
			}
			product[i] =max;
		}	
		return product[n];
	}
