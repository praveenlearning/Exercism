import java.util.HashMap;
import java.util.Map;
class ResistorColor {
	String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    int colorCode(String color) {
        int i;
        for(i=0;i<colors.length;i++){
        	if(color.equals(colors[i]))
        		break;
        }
        return i;
    }

    String[] colors() {
        return colors;
    }
}
