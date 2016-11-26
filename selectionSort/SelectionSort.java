package selectionSort;

public class SelectionSort {
	
	public int[] selectionSort (int[] list) {  	     //accepting array list.
		int i, j, minValue, minIndex, temp = 0;  		//i = outer loop variable, j = inner loop, temp for swapping
		for (i = 0; i < list.length; i++) { 		//***outer for-loop***:going down list one at a time, running inner loop for each.
													//ex: if 6 items: outer loop should go from 0-5, which is 6 iterations regardless. So for i = 0 to 5.
			minValue = list[i];					//initialize minValue to first unsorted item in list each time through the outer for loop.
			minIndex = i;	   					//initialize minIndex to to first unsorted item’s INDEX each time through the outer for loop.
			for (j = i; j < list.length; j++) { //***inner for-loop***: starts at first UNSORTED item,through last.
													//So for j = i to 5. why i? because inner loop starts at first UNSORTED item.
				if (list[j] < minValue) {   		//*inner-loop if*:each time in inner for-loop want to make comparison.
													//if list item is less than the minimum value then…
					minValue = list[j]; 		//…change the minimum value to that list item that your comparing it too.
					minIndex = j;				//…and set the index.
				}
			}									//after each iteration of the inner loop, we want to check…
			if (minValue < list[i]) {		//*outer-loop if* //…if the minValue was the first value, if so then no swap needed 
												//….else if its not the first unsorted value then we need to: swap the minValue with the first unsorted value.
				temp = list[i]; 				//-this is part of the swapping of the minValue with the first unsorted value.
				list[i] = list[minIndex]; 		//-this is part of the swapping of the minValue with the first unsorted value.
				list[minIndex] = temp; 			//-this is part of the swapping of the minValue with the first unsorted value.
			}
		}
		return list;						//returning array list.
	}


}
