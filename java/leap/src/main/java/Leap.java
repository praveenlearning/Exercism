class Leap {

    boolean isLeapYear(int year) {
    	boolean flag;
        if(year%4==0){

        	if(year%100==0){

        		if(year%400==0)
        			flag = true; 	
        		else
        			flag = false;
        	
        	}
        	else
        		flag = true;
        
        }
        else
        	flag = false;
        
        return flag;
    }

}
