import java.util.*;
public class Radix{
    @SuppressWarnings("unchecked")
    public static void radixsort(int[] data){
      //make temp and actual bucket. size 20
      //integer type
      MyLinkedList<Integer>[] bucket = new MyLinkedList[20];
      MyLinkedList<Integer> temp = new MyLinkedList<>();
      for (int x = 0; x < bucket.length; x++){
        bucket[x] = new MyLinkedList<Integer>();
      }
      for (int x = 0; x < data.length; x++){
        temp.add(data[x]);
      }
      int biggest = Math.abs(data[0]);
      for (int x = 0; x < data.length; x++){
        if (Math.abs(data[x]) > biggest){
          biggest = Math.abs(data[x]);
        }
      }


      //increment by multiplicity of 10 every pass.
      for (int count = 1; biggest / count > 0; count *= 10){
        for (int x = 0; x < data.length; x++){
          int tempval = temp.removeFront();
          bucket[9 + (tempval / count % 10)].add(tempval);
        }
        for (int x = 0; x < bucket.length; x++){
          if (bucket[x].size() > 0){
            temp.extend(bucket[x]);
          }
        }
      }
      //finally, remove the first element till end of data.
      for (int x = 0; x < data.length; x++){
        data[x] = temp.removeFront();
      }
    }
}
