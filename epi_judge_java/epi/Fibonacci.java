package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class Fibonacci {

  @EpiTest(testDataFile = "fibonacci.tsv")

  public static int fibonacci(int n) {
    // TODO - you fill in here.
    if (n <= 1) {
      return n;
    }

    int first = 0;
    int second = 1;
    int result = first + second;
    for (int i = 2; i <= n; i++) {
      result = first + second;
      first = second;
      second = result;
    }
    return result;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "Fibonacci.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
