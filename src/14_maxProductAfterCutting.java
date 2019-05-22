
//Solution 1 :动态规划
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
//Solution 2: 贪婪算法
public static int maxProductWithGreedy(int len){
		if(len<2)
			return 0;
		if(len==2)
			return 1;
		if(len==3)
			return 2;
		//啥也不管,先尽可能减去长度为3的段
		int timeOfThree=len/3;
		
		//判断还剩下多少，再进行处理
		if(len-timeOfThree*3==1)
			timeOfThree-=1;
		int timeOfTwo=(len-timeOfThree*3)/2;
		
		return (int) ((Math.pow(3, timeOfThree))*(Math.pow(2, timeOfTwo)));
	
	
