public class solutions {
    public boolean findDuplicatedArray(int[] arr, int length, int duplication) {
    	if(arr == null || length <=0) return false;
    	int start = 1;
    	int end =length -1;
    	
    	
    	while (start != end ) {
    		int  count =0;
    		int mid = (end -start)/2 +start; //mid =(end +start)>>1
    		for (int i = 0;i<length;i++) {
    			if (arr[i]>=start && arr[i]<=mid) count++;
    		}
    		if(count > mid -start +1) end = mid;
    		else start = mid +1 ;	
    	}
    	duplication =  start;
    	return true;
    }
}
