import java.util.Map;
import java.util.HashMap;
class ReverseString {

    String reverse(String inputString) {
        StringBuffer rev = new StringBuffer(inputString);
        return rev.reverse().toString();
    }
  
}