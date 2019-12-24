class Darts {
	int total;
    Darts(double x, double y) {
		double k = Math.sqrt(x*x+y*y);
		if(k<=1)
			total = 10;
		else if(k<=5)
			total = 5;
		else if(k<=10)
			total = 1;
		else
			total = 0;        
    }

    int score() {
        return total;
    }

}
