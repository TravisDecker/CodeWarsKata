package straylense.space;

public class Kata {

  //In this simple assignment you are given a number and have to make it negative.
  public static int makeNegative(final int x) {
      if (x <= 0)
        return x;
      else return x * -1;
  }


//  You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
//  Array can contain numbers or strings. X can be either.
//  Return true if the array contains the value, false if not.
  public static boolean check(Object[] a, Object x) {
    for (Object c : a){
      if (c instanceof String) {
        if (c.equals(x))
          return true;
      }
      else if (c == x) {
        return true;
      }
    }
    return false;
  }


}
