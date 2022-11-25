import java.util.Scanner;

class IllegaleAgeException extends Exception{
    int age;
    public IllegaleAgeException(int a){
        age = a;
    }
    public String tostring(){
return"Age is insufficient to vote";

    }
}
class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age");
        int a = in.nextInt();
        try{
            if(a<18)
            throw new  IllegaleAgeException(a);
            System.out.print("You can voat");
        }
        catch(IllegaleAgeException e){
            System.out.print(e);
        }
    }
    
}
