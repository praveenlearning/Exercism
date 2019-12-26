import java.math.BigInteger;
import java.math.BigDecimal;
class Grains {
    BigInteger grain = new BigInteger("2");
    BigInteger grainsOnSquare(final int square) {
        if(square<1 || square>64)
            throw new IllegalArgumentException("square must be between 1 and 64");
        return grain.pow(square-1);
    }

    BigInteger grainsOnBoard() {
        BigInteger sum = new BigInteger("0");
        for(int i=0;i<64;i++)
            sum = sum.add(grain.pow(i));
        return sum;
    }

}
