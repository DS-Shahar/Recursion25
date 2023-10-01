import java.util.Scanner;

class Main {
  static Scanner input = new Scanner(System.in);

  /*
   * print all divisors of n
   */
  public static void ex25(int n) {  
  }
  
  /*
   * Print all even digits of n
   */
  public static void ex26(int n) {
  }

  /*
   * Print n first elements of arithmetic progression
   * a1 - first element
   * d  - difference
   */
  public static void ex28(int a1, int d, int n) {
  }

  public static void main(String[] args) {
    ex25(12);
    // expected output:
    // 1
    // 2
    // 3
    // 4
    // 6
    // 12
    
    ex26(365127);
    // expected output:
    // 6
    // 2

    ex28(3, 2, 4);
    // expected outout:
    // 3
    // 5
    // 7
    // 9
  }

  public static void testEx25() {  
    int n = input.nextInt();
    ex25(n);
  }
  
  public static void testEx26() {
    int n = input.nextInt();
    ex26(n);
  }

  public static void testEx28() {
    int a1 = input.nextInt();
    int d = input.nextInt();
    int n = input.nextInt();
    ex28(a1, d, n);
  }

}
