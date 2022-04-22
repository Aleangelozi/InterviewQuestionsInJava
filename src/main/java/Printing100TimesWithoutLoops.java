public class Printing100TimesWithoutLoops {
    public static void main(String[] args) {

        int n = 1;

        //print100TimesWithoutLoopOrRecursion();
        print100TimesRecursively(n);
    }

    // Source code: https://www.youtube.com/watch?v=YgA3XXNkx0k
    private static void print100TimesWithoutLoopOrRecursion() {
        String a = "SKM";
        String b = "i";

        b = b.replace("i", "iiiiiiiiii");
        b = b.replace("i", "iiiiiiiiii");
        b = b.replace("i", a + "\n");
        System.out.println(b);
    }

    // Source code: https://www.youtube.com/watch?v=X1u1TdFSqwc
    private static void print100TimesRecursively(int num) {

        if (num <= 100) {
            System.out.print(num + " ");

            print100TimesRecursively(num+1);
        }
    }
}
