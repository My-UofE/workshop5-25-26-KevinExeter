import java.util.Arrays;
import java.util.ArrayList;


public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    int originalVals[] = new int [nVals];
    ArrayList<Integer> uniqueVals =  new ArrayList<>(0);
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]);
      originalVals[i] = item;
      if (uniqueVals.contains(item)) {
        continue;
      } else {
        uniqueVals.add(item);
      }

    }



    System.out.println("original values: " + Arrays.toString(originalVals));
    System.out.println("unique values: " + uniqueVals);
  }
}