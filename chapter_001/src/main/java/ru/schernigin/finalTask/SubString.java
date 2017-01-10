package schernigin.finalTask;

/**
 * class SubString.
 * @author schernigin.
 * @since 13.12.2016.
 * @version 1.
 */

public class SubString {

    /**
     * This method checks whether a substring
     * @param origin
     * @param sub
     * @return boolean
     */

	public boolean contains(String origin, String sub) {
		char[] orig = origin.toCharArray();
		char[] substr = sub.toCharArray();
		int counter = 0;
		for(int i = 0; i < orig.length; i++){
           		for (int j = 0; j < substr.length; j++){
				if(orig[i] == substr[j]){
                  			counter ++;
					break;
				} else {
		                    	j--;
				}		
			}
		}
		return substr.length == counter;
	}
}