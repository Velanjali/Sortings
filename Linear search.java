import java.util.*;
public class Main 
{  
public static void main(String[] args)
{  
    int [] arr={5,3,1,4,9,8,4};
    int item=1;
    {
        for(int i=0;i<arr.length;i++){
           if (arr[i]==item)
            System.out.println(i);
        }
    }
}
}