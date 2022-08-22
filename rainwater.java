public class rainwater {
    public static int prin(int arr[]){
        int n=arr.length;
        int left[]=new int [n];
        int right[]=new int [n]; 
        left[0]=arr[0];
         int i;
        for( i=1; i<n;i++){
            left[i]=Math.max(left[i-1], arr[i]);

        }
        right[n-1]=arr[n-1];
        for( i=n-2; i>=0; i--){
            right[i]=Math.max(right[i+1], arr[i]);

        }
        int ans=0;
        for( i=0;i<n;i++){
            ans+=Math.min(left[i], right[i])-arr[i];
        }
        return ans;


        

    }
  
    public static void main(String[] args) {
        int num[]={3,1,2,4,0,1,3,2};
        System.out.println(prin(num));
    }
}
