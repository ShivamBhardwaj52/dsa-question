import java.util.Scanner;

    public class Student_array {
        public static void main(String[] args) {
            //the user take the input there are 5 Branches ,n no. of section and n no. of student for each section consider the Avrage Percentage of sections.
            System.out.println("Enter number of branch:");
            Scanner ob=new Scanner(System.in);
            int x=ob.nextInt();
            int stu[][][]=new int[x][][];
            int max=0;
            for (int i=0;i<x;i++)
            {
                System.out.println("Enter Number of Section for Branch"+(i+1)+":");
                int y=ob.nextInt();
                stu[i]= new int[y][];
                for (int j=0;j<y;j++)
                {
                    System.out.println("Enter the no. of student for Section"+(j+1)+":");
                    int z=ob.nextInt();
                    stu[i][j] = new int[z];
                    for (int k=0;k<z;k++)
                    {
                        System.out.println("Enter the % of student "+(k+1)+":");
                        stu[i][j][k] =ob.nextInt();
                        if(max < stu[i][j][k] )
                        {
                            max=stu[i][j][k];
                        }
                    }
    
                }
            }
            System.out.println("Topper = "+max);
            ob.close();
        }
    }
    
