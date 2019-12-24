import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
    	HashMap<String, String> map = new HashMap<>();
    	map.put("G","C");
    	map.put("C","G");
    	map.put("T","A");
    	map.put("A","U");
        String rnaStrand = "";
        if (dnaStrand.length()==1)
            rnaStrand = map.get(dnaStrand);
    	else if(dnaStrand.length()>1){
            for(int i=0;i<dnaStrand.length();i++)
                rnaStrand = rnaStrand + map.get(Character.toString(dnaStrand.charAt(i)));
        }
        return rnaStrand;
    }

}
