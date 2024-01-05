//selection sort
public class dsa06 {
    public static void bubble(int[] a , int n){

        int minindex = -1;


        for(int i = 0 ; i<n-1;i++){
             minindex = i;
            for(int j = i+1 ; j<n;j++)
            {
               

                if(a[minindex]>a[j])
                {
                    minindex = j;



                }

                
            }
            int temp = a[i];
            a[i] = a[minindex];
            a[minindex] = temp;


            
    
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



