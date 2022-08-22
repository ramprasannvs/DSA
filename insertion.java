public class insertion {
    public static void ram(int num[]){
        for(int i=0;i<num.length;i++){
        int temp=num[i];
        int j=i-1;
        while(j>=0 && num[j]>temp){
            num[j+1]=num[j];
            j--;
        }
        num[j+1]=temp;

        }
    
    }
    public static void  prin(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    public static void main(String[] args) {
        int num[]={4,1,9,2,3,6};
        ram(num);
        prin(num);
    }
    
}
