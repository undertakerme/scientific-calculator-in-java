import java.util.*;
class atm
{
   static void main()
    {
        long ac[]=new long[100];
        String nm[]=new String[100];
        double bal[]=new double[100];
        char ch='y';
        int i=0;
        while(ch=='y'||ch=='Y')
        {
            System.out.print("Enter Name of Coustomer :");
            nm[i]=new Scanner(System.in).nextLine();
            System.out.print("Enter Account Number :");
            ac[i]=new Scanner(System.in).nextLong();
            System.out.print("Enter the Current Balance :");
            bal[i]=new Scanner(System.in).nextDouble();
            System.out.println("DETAILS SUCCESSFULLY STORED");
            System.out.print("Any More Coustomers ? [Y/N]");
            ch=new Scanner(System.in).next().charAt(0);
            i++;
        }  
        System.out.print("To Access Your account Enter The Account Number \nTo Exit the Program Enter 0:");
        long ac1=new Scanner(System.in).nextLong();

        while(ac1!=0)
        {
            int f=-1;
            for(int j=0;j<ac.length;j++)
                if(ac1==ac[j])
                { f=j;break;}
            if(f!=-1)
            {
                System.out.println("Account Number :"+ac[f]);
                System.out.println("Account Holder :"+nm[f]);
                System.out.println("Current Balance :"+bal[f]);
                System.out.println("Enter 1 to Deposit Money \nEnter 2 to Witdraw Money :");
                int c=new Scanner(System.in).nextInt();
                switch(c)
                {
                    case 1: {
                        System.out.print("Enter Amount to be Deposited :");
                        double amt=new Scanner(System.in).nextDouble();
                        bal[f]+=amt;
                        System.out.println("DEPOSIT SUCCESSFULL!");
                        System.out.println("Current Balance :"+bal[f]);
                        break;
                    }
                    
                    case 2 :{
                        System.out.print("Enter Withdrwal Amount :");
                        double amt=new Scanner(System.in).nextDouble();
                        if(amt<=bal[f])
                      {
                          if(bal[f]<1000)
                        {System.out.println("Your Balance is less than Rs.1000. Fine deducted is Rs.150");
                            bal[f]=bal[f]-amt-150;
                        }
                        else
                            bal[f]-=amt;
                        System.out.println("WITHDRAWL SUCCESSFULL!");
                        }
                        else 
                        System.out.println("WITHDRAWL UNSUCCESFULL. Balance Insufficient");
                        System.out.println("Current Balance :"+bal[f]);
                        break;
                    }
                    default : System.out.println("WRONG CHOICE");
                }
            }
            else
                System.out.println("Sorry!! Account Not Found!");
            System.out.print("To Access Your account Enter The Account Number \nTo Exit the Program Enter 0:");
            ac1=new Scanner(System.in).nextLong();
        }

        System.out.println("Thank You For Using Our Bank!!");
    }
}