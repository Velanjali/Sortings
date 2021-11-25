import java.util.*;
public class Main 
{  
public static void main(String[] args)
{  
    int arr[] = {2,8,5,7,8,3,2,0,5,8};
      int i, j;
      for (i = 0; i < arr.length; i++) {
         for (j = 0; j < i; j++)
         if (arr[i] == arr[j])
            break;
         if (i == j)
         System.out.print( arr[i] + " ");
        }
    }
}
