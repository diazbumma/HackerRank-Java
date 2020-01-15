package strings;

import java.util.Scanner;

public class Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        
    }
}

class MyRegex {

    public String pattern;

    public MyRegex() {
        pattern = "^(((25[0-5])|(2[0-4]\\d)|([0-1]?\\d\\d)|(\\d{1,2}))(\\.)){3}((25[0-5])|(2[0-4]\\d)|([0-1]?\\d\\d)|(\\d{1,2}))$";
    }
}
