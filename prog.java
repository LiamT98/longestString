public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        String[] array = {"aa", "aaaa", "aaaaaaa", "aaaaaaaaaaaa", "AAAAA"};
        
        int index = longestStringInArray(array);
        
        System.out.println("Longest String is: " + array[index] );
        
     }
     public static int longestStringInArray(String[] arr)
     {
         int longestString = 0;
         int wordLength = 0;
         
         for (int i = 0; i < arr.length(); i++)
         {
             
            if (arr[i].length() > arr[i + 1].length())
            {
                longestString = i;
                wordLength = arr[i].length();
                if (i + 1 == arr.length())
                    break;
            }
            
            
         }
         
         
         return longestString;
         
         
     }
}
