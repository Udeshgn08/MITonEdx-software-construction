package javacode;

public class PrePostDemo {

    public static void main(String[] args) {
        // postfix, prefix, remainder 
        int i = 12;
        int i_val = i++;
        int n1 = i++%6;
        int n2 = ++i%6;
        System.out.println("i value " +i_val+ " i= " + i + " n1= " + n1 + " n2= " + n2);

    }

}
