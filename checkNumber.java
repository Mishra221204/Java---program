import java.util.Scanner;
public Class Checknumber{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int x= sc .nextlnt()
        if(x>0)
        {
            System.out.println("+ve Number");
        }
        if(x<0)
        {
            System.out.println("-ve Number");
        }
        if(x==0){
          System.out.println("zero Number");
        }
    }
}