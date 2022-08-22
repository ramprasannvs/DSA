public class stockbuy {
    public static int prin(int a[]){
        int maxprofit=0;
        int minsofar=a[0];
        for(int i=0; i<a.length;i++){
            minsofar=Math.min(minsofar, a[i]);
            int profit=a[i]-minsofar;
            maxprofit=Math.max(maxprofit, profit);
            System.out.println(maxprofit);

        }
        
        return maxprofit;

    }
    public static void main(String[] args) {
        int num[]={3,1,4,8,7,2,5};
        System.out.println(prin(num));
    }
    
}
