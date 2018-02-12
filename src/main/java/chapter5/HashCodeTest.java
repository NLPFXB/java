package chapter5;

import java.util.Arrays;

public class HashCodeTest {
    public String name="aaa";
    public static void main(String[] args) throws Exception{
//        printList();
        HashCodeTest codeTest = new HashCodeTest();
        codeTest.name ="ccc";
        HashCodeTest codeTestc = new HashCodeTest();
        Class a = codeTest.getClass();
        System.out.println("ddd"+a.isInstance(codeTestc));
        System.out.println(a.getName());;
        Class c = codeTestc.getClass();
        Class b = Class.forName(c.getName());
        System.out.println(c.getField("name"));
        System.out.println(b.hashCode()+"dd"+c.hashCode()+"ddd"+c.hashCode());
    }

    public static void printList(){
        String[] array = new String[]{"1","2","3"};
        String t =  Arrays.toString(array);
        System.out.println(t);
    }
}
