package lab4;

public class Example8 {
    public class Main {
        public static int m() {
            try {
                System.out.println("0"); throw new RuntimeException();
            } finally { System.out.println("1");
            } }
        public static void main(String[] args) { System.out.println(m());
        }
    }
}
