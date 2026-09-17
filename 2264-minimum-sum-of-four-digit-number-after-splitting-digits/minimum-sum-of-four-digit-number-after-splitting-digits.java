class Solution {
    public int minimumSum(int num) {
        int arr[]=new int [4];
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            arr[i]=digit;
        }
        Arrays.sort(arr);
        int new1[]=new int[2];
        int new2[]=new int[2];
        new1[0]=arr[0];
        new1[1]=arr[2];
        new2[0]=arr[1];
        new2[1]=arr[3];
          return (new1[0] * 10 + new1[1])
             + (new2[0] * 10 + new2[1]);
        
    }
}