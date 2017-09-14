package lecture01;
//@author HamadAllo
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        
        int[][] h = {
        {1,2,3},
        {4,5,6}
        };
        
        
        System.out.println(h);
        rotate(h);
        Print(h);
        
        System.out.println(h);
        
        
    }
    public static void Print(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            
            System.out.println(Arrays.toString(b[i]));
            
        }
        
    }
    
    
    
    public static int[][] rotate(int[][] a) {
        int X = a[0].length; // Rows
        int Y = a.length;    // Columns
        int[][] b = new int[X][Y];
        
        for (int i=0 ; i<X ; i++) {
            for (int j=0 ; j <Y  ; j++) {
                b[i][j] = a[j][X-i-1];
            }
        }
        return b;
    }
    
    
}   