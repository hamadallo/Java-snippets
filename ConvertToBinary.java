package lecture01;
//@author HamadAllo
public class ConvertToBinary {
    public static void main(String[] args) {
         String rem=" ";
        stack s= new stack();
        
    /*    for (int val = 15; val >= 1 ; val/=2) {
            
            rem += val%2;
            
        }
        System.out.println(rem);
        while (!s.isEmpty()) {
            System.out.println();
        }
    */
        
        convertToBin(100);
        
    }
    public static void convertToBin (int n) {
        String rem=" ";
        stack Bin = new stack();
        int val = n;
        
        while (val >= 1){
            rem += val%2;
            val/=2;
        }
        Bin.push(rem);
        
        //Note #1: The below while is to give you the exact output of the stack.
        /*
        while (!Bin.isEmpty()) {
            System.out.println(Bin.pop());
        }
        */

/*
        Note #2: The following part to reverse the output to give the correct Binary,
        after the stack reversed it I putted it back "Logically the right".
        **** choose between this or the above code (in Note#1) ****
*/        
        String original = (String)Bin.pop();
        String rev="";
        
        for (int i=original.length()-1 ; i >=0 ; i--) {
            rev +=  original.charAt(i);
        }
        System.out.println(rev);
    }
    
    
}
