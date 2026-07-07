import java.util.function.Function;

public class Main {

  static void test(Function<Integer, Long> callback, String name) {
    Boolean isPassed = true;
    record Test(int n, long want) {}
    Test[] tests = {
      new Test(-1, -1),
      new Test(0, 0),
      new Test(1, 1),
      new Test(2, 1),
      new Test(3, 2),
      new Test(10, 55),
      new Test(20, 6765),
      new Test(30, 832040),
      new Test(40, 102334155),
      new Test(46, 1836311903),
    };

    for (Test tt : tests) {
      long got = callback.apply(tt.n);
      if (got != tt.want) {
        System.out.printf("%s(%d) = %d, want %d\n", name, tt.n, got, tt.want);
        isPassed = false;
      }
    }
    if (isPassed) {
      System.out.printf("%s tests passed\n", name);
    }
  }

  public static void main(String[] args) {
    test(fibonacci::fibo1, "fibo1");
    test(fibonacci::fibo2, "fibo2");
    test(fibonacci::fibo3, "fibo3");
  }
}
