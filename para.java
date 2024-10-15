public class para {
    public static void main(String[] args) {
        
   
    
    int i,j;
    int width=5;
    int height=4;
    for ( i=0;i<=height;i++){
        for (j=0;j<i+width;j++)
        {
            if(j>i){
                System.out.print("*");
            }
            
        }
        System.out.println();

    }
}
}
