package countsay;

public class CountAndSayFunction {
	 public String countAndSay(int n) {
	        String s = "1";
	        
	        for(int i = 1; i < n; i++){
	            s = countSay(s);
	        }
	        
	        return s;
	    }
	    
	    public String countSay(String s){
	        StringBuilder sb = new StringBuilder();
	        
	        // lowerbound
	        char lowerBound = s.charAt(0);
	        
	        // Count will only be 1 or 2
	        int oneOrTwo = 1;
	        
	        for(int i = 1; i < s.length(); i++){
	            // If it's 11, then count will be 2, by checking index 1 letter and then so on
	            char upperBound = s.charAt(i);
	            if(upperBound == lowerBound){
	                oneOrTwo++;
	            } else{ 
	                // this only happen when its not 11
	                // If's 21, then add 1 and then 2
	                sb.append(oneOrTwo);
	                sb.append(lowerBound);
	                
	                // Lowerbound will mostly likely become 1
	                lowerBound = upperBound;

	                oneOrTwo = 1;
	            }
	        }
	        
	        // Mostly this is adding 11 when there is 1 or
	        // Adding 21 when there is 11
	        sb.append(oneOrTwo);
	        sb.append(lowerBound);
	        
	        return sb.toString();
	    }
}
