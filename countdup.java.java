import java.util.*;
public class Main 
{  
public static void main(String[] args)
{  
    int [] arr={5,3,1,4,9,8,4,9,3};
    int count=0;{
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
           if (arr[i]==arr[j])
            count++;
            System.out.println(count);
        }
    }
}
}
}