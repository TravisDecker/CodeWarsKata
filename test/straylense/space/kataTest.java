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


  @Test
  void grow() {
    assertEquals(6, Kata.grow(new int[]{1,2,3}));
    assertEquals(16, Kata.grow(new int[]{4,1,1,1,4}));
    assertEquals(64, Kata.grow(new int[]{2,2,2,2,2,2}));
  }
}