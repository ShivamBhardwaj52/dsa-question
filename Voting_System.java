import java.util.Scanner;

public class Voting_System {
    public static void main(String[] args) {
        String Vote[] = {"Ram","Yash Rajput","Shanu Sharma","Karan"};
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Which Country do you belong from:");
            String n= in.next();
            if(!(n.equalsIgnoreCase("India")))
                throw new ArithmeticException();
            System.out.println("Enter your age:");
            int a =in.nextInt();
            in.nextLine();
            if (a<18)
                throw new NumberFormatException();
            System.out.println("Enter your name:");
            String name= in.nextLine();
            int c=0;
            for (int i=0;i<4;i++)
            {
                if(name.equalsIgnoreCase(Vote[i]))
                {
                    System.out.println("You can cast vote -_-");
                    c++;
                    break;
                }
            }
            if (c==0)
            {
                throw new RuntimeException();
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("You are not an Indian!\nYou can't cast vote in India!");
        }
        catch (NumberFormatException e)
        {
            System.out.println("You are Underage!\nYou can't cast Vote!");
        }
        catch (RuntimeException e)
        {
            System.out.println("Your name is not in voter list!\nYou can't cast Vote!");
        }
    }
}