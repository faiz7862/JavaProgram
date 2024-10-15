
public class consecutive {
    public static void main(String[] args) {
        int [] arr=new int[]{1,1,0,1,1,1,0,0,1};
        int count=0;
        
        for(int i=0;i<=8;i++){
            if (arr[i]==1){
                count+=1;

            }
            else{

                count =0;
                continue;                
            }
        
        }
        System.out.println(count);
    }
}
