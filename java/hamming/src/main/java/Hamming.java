class Hamming {
    int distance = 0;
    Hamming(String leftStrand, String rightStrand) {

        if(leftStrand.length()==rightStrand.length()) {
            for (int i=0; i<leftStrand.length(); i++) {
                if (leftStrand.charAt(i) != rightStrand.charAt(i))
                    distance++;
            }
        }
        else if(leftStrand.length()==0)
            throw new IllegalArgumentException("left strand must not be empty.");
        else if(rightStrand.length()==0)
            throw new IllegalArgumentException("right strand must not be empty.");
        else
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }
    int getHammingDistance() {
        return distance;
    }

}
