public class Main {

  public static void main(String[] args) {
    float n; // 内申点
    int t; // 試験の点数
    n = 4.5f;
    t = 90;
    System.out.println("内申:" + n + "  試験:" + t + "  結果:" + Judgement.judgement(n, t));
    n = 2.0f;
    t = 55;
    System.out.println("内申:" + n + "  試験:" + t + "  結果:" + Judgement.judgement(n, t));
    n = 0.5f;
    t = 101;
    System.out.println("内申:" + n + "  試験:" + t + "  結果:" + Judgement.judgement(n, t));
  }
}
