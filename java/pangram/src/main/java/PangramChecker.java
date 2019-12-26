public class PangramChecker {
    String alphaBet = "abcdefghijklmnopqrstuvwxyz";
    public boolean isPangram(String input) {
        boolean flag = true;
        for(int i=0;i<alphaBet.length();i++){
            if(input.toLowerCase().indexOf(alphaBet.toCharArray()[i])>=0)
                flag = flag && true;
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
