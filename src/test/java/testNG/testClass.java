package testNG;

public class testClass {
    public static class MainClass {
        double overloadedMethod(double d) {
            return d *= d;
        }

        int overloadedMethod(int i) {
            return overloadedMethod(i *= i);
        }

        float overloadedMethod(float f) {
            return overloadedMethod(f *= f);
        }

        public static void main(String args[])  //static method
        {
//            MainClass main = new MainClass();
//            System.out.println(main.overloadedMethod(1));

//        String str = "Geeks", nstr = "";
//        char ch;
//
//        System.out.print("Original word: ");
//        System.out.println("Geeks"); //Example word
//
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i); //extracts each character
//            nstr = ch + nstr; //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: " + nstr);

//            int numb = 20;


//        for (int i = 1; i <= numb; i++) {
//            if (i % 2 == 0) {
////                System.out.println("following even numbers till 20" + i);
////                System.out.print(i + " ");
//                System.out.print(i);
//            }
//        }


        }

//    @Test(groups = "")
//    public void methodX() {
//        System.out.println("Method B");
//    }
//
//    @Test(groups = "")
//    public void methodY() {
//        System.out.println("Method B");
//    }
//
//    @Test(groups = "regression")
//    public void methodZ() {
//        System.out.println("Method B");
//    }
//
//    @Test(priority = 2)
//    public void methodB() {
//        System.out.println("Method B");
//    }


//        public static void main(String[] args) {
//            MainClass main = new MainClass();
//            System.out.println(main.overloadedMethod(100));
//        }
    }

}
