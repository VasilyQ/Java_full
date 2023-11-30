package project_java;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        boolean ch = false ^ false;
        System.out.println(getType(ch));
    }

    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
    
}