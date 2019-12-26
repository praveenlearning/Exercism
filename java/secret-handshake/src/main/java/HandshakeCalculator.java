import java.util.List;
import java.util.*;
class HandshakeCalculator {
    HashMap<Integer, Signal> map = new HashMap<>();
    List<Signal> calculateHandshake(int number) {

        map.put(0,Signal.WINK);
        map.put(1,Signal.DOUBLE_BLINK);
        map.put(2,Signal.CLOSE_YOUR_EYES);
        map.put(3,Signal.JUMP);
        List<Signal> res = new ArrayList<Signal>();
        String bin = Integer.toBinaryString(number);
        System.out.println(bin);
        int i=0;
        for(int j=bin.length()-1;j>-1;j--){
            if(bin.charAt(j)=='1'){
                if(i<4)
                    res.add(map.get(i));
                if(i==4)
                    Collections.reverse(res);
            }
            i++;
        }
        return res;
    }

}
