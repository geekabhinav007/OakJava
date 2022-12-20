public class SortedCheck {
   /* 
   Method 1

    public static boolean sortedCheck(int index,int arr[]){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index]>=arr[index+1]){
            return false;
        }
        return sortedCheck(index+1, arr);
    }
    */

    // Method 2

    public static boolean sortedCheck(int index,int arr[]){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return sortedCheck(index+1, arr);
        }else{
            return false;
        }
    }
    
    public static void main(String [] args){
        int arr[] = {1,2,3,4,6,2} ;
        System.out.println(sortedCheck(0, arr));

    }
}
