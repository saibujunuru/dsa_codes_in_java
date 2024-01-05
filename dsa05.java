// bubble sort
public class dsa05 {

    public static void bubble(int[] a , int n){

        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j<n-i-1;j++){

                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;



                }
            }
        }
        
    }
    public static void main(String[] args){

        int a[] = {4,5,6,1,2,3};
        
        int n =6;

    bubble(a,6);
    for(int i =0;i<n;i++){
    System.out.println(a[i]);
    }
    

    }
    
}
