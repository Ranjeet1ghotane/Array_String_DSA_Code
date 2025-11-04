public class ReturnIndexOfTargetElement {
    public int returnIndex(int arr[],int target){
        int index = -1;
        for(int i=0; i<arr.length-1; i++){
           if( arr[i] == target){
            index = i;
            break;
           }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        ReturnIndexOfTargetElement rtn = new ReturnIndexOfTargetElement();
        int target = 4;

        int res = rtn.returnIndex(arr, target);
        System.out.println("The index of "+target+" is "+res);
    }
}
