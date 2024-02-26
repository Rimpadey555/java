import java.util.Scanner;

public class day0{
    public static void main(String[] args){
        System.out.println("hello world");

        Scanner user_input = new Scanner(System.in); // open scanner
        String s = user_input.next(); // read the next token and save it to 's'
        user_input.close(); // close scanner
        System.out.println("thr input is "+s); // print 's' to System.out, followed by a new line

    }
}