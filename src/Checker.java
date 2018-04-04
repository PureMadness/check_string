public class Checker {

    public static boolean check(String string){
        int counter = 0;
        int length = string.length();
        for(int i = 0; i < length; i++){
            if(string.charAt(i)=='(')counter++;
            if(string.charAt(i)==')')counter--;
            if(counter < 0)break;
        }
        if(counter==0)return true;
        else return false;
    }

}
