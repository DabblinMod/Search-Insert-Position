public class YourClassNameHere {
    public static void main(String[] args) {
      int target=7;
      int[] array={2, 3, 5, 7, 9};
      int mid=0;
      int low=0, high=array.length-1;
      while(low < high){
        mid= (low + high) / 2;
        
        if(target > array[mid])
          low= mid + 1;
          
        else if(target < array[mid])
          high= mid-1;
          
        else if(target==array[mid]){
          System.out.print("Mid: "+mid);
          break;
        }
      }
    }
}
