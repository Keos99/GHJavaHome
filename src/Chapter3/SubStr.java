package Chapter3;

public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - наше все!";

        String substring = orgstr.substring(7,25);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substring: " + substring);
    }
}
