//@author HamadAllo
public class meal {
    
    protected static String date(){
        return "hello";
        
    }
    
    protected static String time(){
        return "world";
        
    }
    
    public static String meal(String d,String t){
        return date()+" "+time();
        
    }
    
    public static void print(){
        System.out.println("Date and Time\n"+meal(date(),time()));
    }
    
    //public static void main(String[] args) { print(); }
}
