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
    // way better response, Not mine.
    //return Arrays.asList(a).contains(x);
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

//Given a non-empty array of integers, return the result of multiplying the values together in order.
  public static int grow(int[] x){
    int result = 1;
    for (int c : x){
      result = result * c;
    }
  return result;
  }


}
