
class ResistorColorDuo {
	String[] Colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
	int value(String[] colors) {
        String val = "";
        for(int i=0;i<2;i++)
			val += Integer.toString(getValue(colors[i]));
        return Integer.parseInt(val);
    }
    int getValue(String color){
    	int i;
		for(i=0;i<Colors.length;i++){
    		if(color.equals(Colors[i]))
    			break;
		}
    	return i;
	}
}
