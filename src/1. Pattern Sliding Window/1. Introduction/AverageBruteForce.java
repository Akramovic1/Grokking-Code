import java.util.Arrays;

public class Main {
    public static double[] findAverages(int k, int[] arr){
      double[] result = new double[arr.length - k + 1];
      for(int i = 0; i < result.length; i++){
          double sum = 0;
          for(int j = i; j < i + k; j++){
              sum += arr[j];
          }
          result[i] = sum/k;
      }
      return result;
    }
    public static void main(String[]args) {
        double[] results = findAverages(5,new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2});
        System.out.println(Arrays.toString(results));
    }
}
