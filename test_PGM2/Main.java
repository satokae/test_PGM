import java.util.function.BiFunction;

public class Main {

  static void test(BiFunction<Float, Integer, Long> callback, String name) {
    boolean isPassed = true;
    record Test(float n, int t, long want) {}
    Test[] tests = {
      new Test(0.9f, 50, -1),
      new Test(5.1f, 50, -1),
      new Test(3.0f, -1, -1),
      new Test(3.0f, 101, -1),
      new Test(Float.NaN, 50, -1),
      new Test(1.0f, 0, 0),
      new Test(1.0f, 1, 0),
      new Test(1.1f, 0, 0),
      new Test(1.1f, 1, 0),
      new Test(3.0f, 100, 0),
      new Test(3.1f, 100, 1),
      new Test(5.0f, 100, 1),
    };
    for (Test tt : tests) {
      long got = callback.apply(tt.n, tt.t);
      if (got != tt.want) {
        System.out.printf("%s(%.1f, %d) = %d, want %d%n", name, tt.n, tt.t, got, tt.want);
        isPassed = false;
      }
    }
    if (isPassed) {
      System.out.printf("%s tests passed%n", name);
    }
  }

  public static void main(String[] args) {
    test(Judgement::judgement, "Judgement");
  }
}
