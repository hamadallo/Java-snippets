package lecture01;
//@author HamadAllo
public class Test1 {
    public static void main(String[] a) {
        
        int x =9, y =4, z;
        
        switch (x + 1 % y) {
            case 1: System.out.println("1: " + x + y);
            case 2: System.out.println("2: " + x + y);
            case 10: System.out.println("10: " + x + y);
            default: System.out.printf("def: %d\n", x + y);
        }
        z = 7;
        char c = (z == 6) ? 'Y' : 'N';
        System.out.printf("c = %c\n", c);
        String text = "TEXT";
        if ( ! text.equals("text") && (x == 9.0) )
            System.out.println(text);
        if (y > x);
        System.out.printf("%.0f\nOK\n", 99.7);
    }
}
        

