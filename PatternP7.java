public class PatternP7 {
    public static void main(String[] args) {
        //12345654321
        //12345 54321
        //1234   4321
        //123     321
        //12       21
        //1         1
        for(int i=6; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            for(int j=11; j>2*i; j--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                if(j!=6)
                System.out.print(j);
            }
            System.out.println();
    }
}
}