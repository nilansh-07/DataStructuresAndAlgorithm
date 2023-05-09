public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,5,};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] arr){
        int j=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i+1];
                j++;
            }
        }
        return j;
    }
}
