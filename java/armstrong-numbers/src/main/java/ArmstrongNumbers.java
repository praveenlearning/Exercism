class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int num = numberToCheck;
		int sum = 0;
		while(num > 0){
			sum += Math.pow(num%10,Integer.toString(numberToCheck).length());
			num = num/10;
		}
		if(sum == numberToCheck)
			return true;
		else
			return false;
	}

}
