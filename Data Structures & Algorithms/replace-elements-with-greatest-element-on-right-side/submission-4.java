class Solution {
    public int[] replaceElements(int[] arr) {
        int [] result = new int[arr.length];
        int max;

        for(int i=0;i< arr.length;i++){
            if(i+1<arr.length){
                max=arr[i+1];
                for (int j=i+1;j< arr.length;j++){
                    max= Math.max(arr[j], max);
                }
                result[i]=max;
            }else{
                result[i]=-1;
            }
        }
        return result;
    }
}