public class solutions {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length <= 1 ) {
    		return false;
    	} 
    	for (int i = 0; i < length; i++) {
    		if (numbers[i] < 0 || numbers[i] > length -1) return false;
    		while (numbers[i] != i) {
        		if (numbers[i] != numbers[numbers[i]]) {
    			    int temp = numbers[i];
    			    numbers[i] = numbers[numbers[i]];
    			    numbers[temp]  = temp;
    		    }
    		    else {
    			    duplication[0] = numbers[i];
    			    return true;
    		    }
    		}
    	}  
    	return false;
    }
}
