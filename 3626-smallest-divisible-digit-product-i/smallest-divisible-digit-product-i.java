class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
            int mult=1;
            int num=i;
            while(num!=0){
                int digit=num%10;
                mult*=digit;
                num/=10;
            }
            if(mult%t==0) return i; 
        }
        return n;
    }
}