package pkg;

import java.util.ArrayList;
import java.util.List;

public class TestLocalRecord {
  public void test(int i) {
    record Color(int red, int green, int blue) {}
    Color color = new Color(((i >> 16) & 0xFF) / 255, ((i >> 8) & 0xFF) / 255, (i & 0xFF) / 255);
    System.out.println(color);
  }

  public void test2() {
    record R() {}
    List<R> list = new ArrayList<>();
    list.add(new R());
  }

  public void test3() {
    record R() {
      static void nop() {}
    }
    Runnable nop = R::nop;
  }
}
