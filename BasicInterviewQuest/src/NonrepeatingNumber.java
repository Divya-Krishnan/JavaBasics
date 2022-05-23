import java.util.Arrays;
import java.util.Scanner;
public class NonrepeatingNumber {
   public static void main(String args[]) {
      int array[] = new int[11];
      //System.out.println("");
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<array.length;i++)
      {
    	  array[i]=sc.nextInt();
      }
      //Creating the count array
      int countArray[] = new int[array.length];
      for(int i=0; i<array.length; i++) {
         countArray[i] = 0;
      }
      for(int i=0; i<array.length; i++) {
         for(int j=0; j<array.length;j++) {
            if(i!=j && array[i]==array[j]) {
               countArray[i]++;
            }
         }
      }
      //System.out.println(Arrays.toString(countArray));
      //First non-repeating element in the array
      for(int i=0; i<array.length; i++) {
         if(countArray[i]==0) {
            System.out.println(array[i]);
            break;
         }
      }
   }
}