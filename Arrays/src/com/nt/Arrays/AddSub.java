package com.nt.Arrays;

public class AddSub {

	public static int[] addSub(int i, int j) {
		int[] result = new int[2];  // Create an array of size 2
        result[0] = i + j;          // Store addition result at index 0
        result[1] = i - j;          // Store subtraction result at index 1
        return result; 

	}

	public static int[] addSub(int[] ia) {

        if (ia == null || ia.length == 0) {
            return new int[]{0, 0};  // Return default values if input array is empty/null
        }

        int sum = 0;
        int subtract = ia[0];  // Start with the first element

        for (int num : ia) {
            sum += num;
        }

        for (int i = 1; i < ia.length; i++) {
            subtract -= ia[i];  // Subtract remaining elements
        }

        return new int[]{sum, subtract}; 
	
	
	}

}
