// Design a class that perform String operations (Equal, Reverse the string, change case)

import java.util.Scanner;

class StringOps {
    String str;
    public StringOps(String str) {
        this.str = str;
    }
    public void equal(StringOps s) {
        if (str.equals(s.str))
            System.out.println("The strings are equal.");
        else
            System.out.println("The strings are not equal.");
    }
    public void reverse() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("The reversed string is: " + rev);
    }
    public void changeCase() {
        String changed = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                changed += Character.toLowerCase(str.charAt(i));
            else
                changed += Character.toUpperCase(str.charAt(i));
        }
        System.out.println("The changed case string is: " + changed);
    }
}

public class StringOpsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringOps s = new StringOps(str);
        System.out.println("Enter the string to compare: ");
        String str2 = sc.nextLine();
        StringOps s2 = new StringOps(str2);
        sc.close();
        s.equal(s2);
        s.reverse();
        s.changeCase();
    }
}