package testNG;

import org.testng.annotations.Test;

public class ClassA {

    @Test(groups = "sanity")
    public void methodA() {
        System.out.println("Method A");
    }

    @Test(priority = 2)
    public void methodB() {
        System.out.println("Method B");
    }

    @Test(priority = 1)
    public void nonRepetativeString() {
        String string = "geeksforgeeks";
        int index = -1;
        char fnc = ' ';

        if (string.length() == 0) {
            System.out.println("EMPTY STRING");
        }

        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fnc = i;
                break;
            } else {
                index += 1;
            }
        }
        if (index == string.length() - 1) {
            System.out.println("All characters are repeating");
        } else {
            System.out.println("First non-repeating character is " + fnc);
        }
    }

    @Test(groups = "sanity")
    public void methodD() {
        System.out.println("Method A");
    }

    @Test(priority = 2)
    public void methodE() {
        System.out.println("Method B");
    }

    @Test(groups = "regression")
    public void methodF() {
        System.out.println("Method C");
    }


}
