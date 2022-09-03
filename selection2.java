public class selection2 { public static void sortArray(int array[]) {
    for(int i=0; i<array.length-1; i++){
        int minPos=i;
        for(int j=i+1; j<array.length; j++){
          if(array[minPos]>array[j]){
              minPos=j;
          }
        } 

        // swap
        int tmp=array[i];
        array[i]=array[minPos];
        array[minPos]=tmp;  
    }
}
public static void main(String[] args) {
    int array[]={5,4,1,3,2};
    sortArray(array);
    for(int i=0; i<array.length; i++){
        System.out.print(array[i] + " ");
    }
}
    
}
