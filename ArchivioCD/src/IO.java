import java.util.Scanner;

public class IO {

    public static String input() {
        String str="";
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        return str;
    }

    public static void out(Object o) {
        System.out.println(o);
    }
}
