public class binarysearch {
    public static int prin(int marks[],int key) {
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key)
            return i;
            
        }

        return -1;
        
    }
   
    public static void main(String[] args) {
        int key=10;
        int marks[]={2,3,4,5,6,7,8,9,};
      int index=  prin(marks,key);
      if(index==-1){
        System.out.println("not found");
      }
      else{
        System.out.println("found");
      }
      

    }
}
