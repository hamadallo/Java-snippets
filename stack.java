package lecture01;
//@author HamadAllo
public class stack {
    
    public static class UnderflowException extends RuntimeException {
        public UnderflowException (String message) {
            super(message);
        }
        
    }

    
    
    private Object [] theArray;
    private static final int DEFAULT_CAPACITY =10;
    private  int top;
    
    
    public stack() {
        theArray = new Object [ DEFAULT_CAPACITY ];
        top = -1;
    
    }
    
    public boolean isEmpty() {
        return top == -1 ;
    }
    
    public void makeEmpty() {
        top = -1;
    }
    
    public Object peek() {
        if (isEmpty())
            throw new UnderflowException (" stack is empty ");
        return theArray[top];
    }
    
    public Object pop() {
        if (isEmpty())
            throw new UnderflowException("stack is empty");
        return theArray[top--];
    }
    
    public void push(String x) {
        if (top +1 == theArray.length)
            doubleArray();
        theArray[++top] = x;
    }
    
    private void doubleArray() {
        Object [] newArray;
        
        newArray = new Object[ theArray.length *2 ];
        for (int i=0; i<theArray.length; i++)
            newArray[i] = theArray[i];
        theArray = newArray;
        
    }
    
}
