package modeImplementation;

public class myMode implements Mode {
	/**
	 * @param array preconditions: array should be an integer
	 *                             array should not be null
	 * 
	 * @return most repeating value (MODE) else 0
	 */
	public int getMode(int[] arr) {
		int arraysLength = arr.length;
		if(arraysLength != 0){

	        int maxValue = -1;
	        int maxCount = 0;
	        for(int i = 0; i < arraysLength; i++) {
	            int count = 0;
	            for(int j = 0; j < arraysLength; j++) {
	                if(arr[j] == arr[i]) {
	                    count++;
	                }
	            }

	            if(count > maxCount) {
	                maxValue = arr[i];
	                maxCount = count;
	            }
	        }
	        return maxValue;

	    }else{

	        return 0;

	    }
	}
}
