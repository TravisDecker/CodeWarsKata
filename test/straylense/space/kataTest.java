package straylense.space;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class kataTest {

  @Test
  void makeNegative() {
    assertEquals(-42, Kata.makeNegative(42) );
  }


  @Test
  void check() {
    assertEquals(Kata.check(new Object[] {66, 101}, 66), true);
    assertEquals(Kata.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
    assertEquals(Kata.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
    assertEquals(Kata.check(new Object[] {"what", "a", "great", "Kata"}, "kat"), false);
  }
}