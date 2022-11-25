public class PatternP8 {
 //    A
 //   BCB
//   CDEDC
 // DEFGFED
  //  public static void main(String[] args) {
  //      int n=4;
  //      int z=0;
 //       for(int i=1;i<=n;i++){
   //         for(int j=n-1;j>=i;j--){
   //             System.out.print(" ");
   //         }
   //         for(int k=i-1;k>=-(i-1);k--){
   //             System.out.print((char)(z-Math.abs(k)+65));
   //         }
   //         z+=2;
  //          System.out.println();
  //      }
 //   }
    
//}
//public static void main(String[] args) {
//       ☺
 //     ☺☻☺
//     ☺☻♥☻☺
  //  int n=4;
  //  int z=0;
   // for(int i=1;i<=n;i++){
  //      for(int j=n-1;j>=i;j--){
   //         System.out.print(" ");
   //     }
   //     for(int k=i-1;k>=-(i-1);k--){
   //         System.out.print((char) (z-Math.abs(k)%65));
   //     }
   //     z+=1;
     //   System.out.println();
  //  }
//}

//}
public static void main(String[] args) {
        int n=0;
        //int z=1;
        char z=65;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=i-1;k>=-(i-1);k--){
                System.out.print((char)(z-Math.abs(0)));
            }
            z+=0;
            System.out.println();
        }
    }
    
    }
    