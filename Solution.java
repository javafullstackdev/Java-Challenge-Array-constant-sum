import java.util.*;

public class Program {
  public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
    // Write your code here.
    List<Integer[]> res = new ArrayList<>();
    int i, j, k, r;
    int n = array.length;
    for(i = 0; i < n; ++i) {
        for(j = i + 1; j < n; ++j) {
            for(k = j + 1; k < n; ++k) {
                for(r = k + 1; r < n; ++r) {
                    if(array[i] + array[j] + array[k] + array[r] == targetSum) {
                        res.add(new Integer[]{array[i], array[j], array[k], array[r]});
                    }
                }
            }
        }
    }
    return res;
  }
  public static void main(String[] args) {
      int[] array = {7 , 6,  4, -1, 1 ,2};
      int targetSum = 16;
      List<Integer[]> res = fourNumberSum(array, targetSum);
      for(Integer[] quad : res) {
          for(Integer a : quad){
              System.out.print(a + ", ");
          }
          System.out.println();
      }
  }
}