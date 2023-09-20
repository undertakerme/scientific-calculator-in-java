import java.util.*;
public class calculator2
{
    calculator1 x=new calculator1();
    Scanner ob=new Scanner (System.in);
    void main()
    {
        
        do 
        {
            System.out.println("              -----WELCOME IN SCIENTIFIC CALCULATOR-----");
            System.out.println("Enter 1 for ABSOLUTE VALUE");
            System.out.println("Enter 2 for SQUARE ROOT ");
            System.out.println("Enter 3 for POWER OF NUMERIC NUMBER ");
            System.out.println("Enter 4 for ROUNDOF VALUE ");
            System.out.println("Enter 5 for MAXIMUM VALUE");
            System.out.println("Enter 6 for MINIMUM VALUE");
            System.out.println("Enter 7 for RANDOM VALUE");
            System.out.println("Enter 8 for ROUNDOF DOWN VALUE");
            System.out.println("Enter 9 for ROUNDOF UP  VALUE");
            System.out.println("Enter 10 for LOGARITHM VALUE");
            System.out.println("Enter 11 for EXPOENTIAL VALUE");
            System.out.println("Enter 12 for RINT FUNCTION");
            System.out.println("Enter 13 for SINE VALUE");
            System.out.println("Enter 14 for COSIN VALUE");
            System.out.println("Enter 15 for TANGENT VALUE");
            System.out.println("Enter 16 for ANGLE OF SINE ");
            System.out.println("Enter 17 for ANGLE OF COSINE");
            System.out.println("Enter 18 for ANGLE OF TANGENT");
            x.n=ob.nextInt();
            switch(x.n)
            {
            case 1:
            {
                System.out.println("Enter the value");
               x.m=ob.nextInt();
                System.out.println("THE ABSOLUTE VALUE IS "+(Math.abs(x.m)));break;
            }
            case 2:
            {
                 System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE SQUARE ROOT ="+(Math.sqrt(x.m)));
                 break;
            }
            case 3:
            {
                System.out.println("Enter the value");
                x.m=ob.nextInt();
                System.out.println("Enter the power");
                x.y=ob.nextInt();
                System.out.println("THE POWER OF NUMERIC NUMBER "+(Math.pow(x.m,x.y)));
                break;
            }
            case 4:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE ROUNDOF VALUE  ="+(Math.round(x.m)));
                 break;
            }
            case 5:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                 System.out.println("Enter the value");
                 x.y=ob.nextInt();
                  System.out.println("THE MAXIMUM VALUE  ="+(Math.max(x.m,x.y)));
                 break;
            }
            case 6:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                 System.out.println("Enter the value");
                 x.y=ob.nextInt();
                  System.out.println("THE MINIMUM VALUE  ="+(Math.min(x.m,x.y)));
                 break;
            }
            case 7:
            {
                  System.out.println("THE RANDOM VALUE ="+(Math.random()));
                  break;
            }
            case 8:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE ROUNDOF DOWN VALUE  ="+(Math.ceil(x.m)));
                break;
            }
            case 9:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE ROUNDOF UP VALUE  ="+(Math.floor(x.m)));
               break;
            }
            case 10:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE LOGARITHM VALUE  ="+(Math.log(x.m)));
                 break;
            }
            case 11:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE EXPOENTIAL VALUE  ="+(Math.exp(x.m)));
                 break;
            }
            case 12:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE RINT FUNCTION="+(Math.rint(x.m)));
               break;
            }
            case 13:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE SINE VALUE="+(Math.sin(x.m)));
                 break;
                }
            case 14:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE COSIN VALUE="+(Math.cos(x.m)));
                break;
                }
                case 15:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE TANGENT VALUE  ="+(Math.tan(x.m)));
                break;
                }
                case 16:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE ANGLE OF SINE   ="+(Math.asin(x.m)));
                break;
                }
                case 17:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE ANGLE OF COSINE  ="+(Math.acos(x.m)));
                break;
                }
                case 18:
            {
                System.out.println("Enter the value");
                 x.m=ob.nextInt();
                  System.out.println("THE ANGLE OF TANGENT ="+(Math.atan(x.m)));
                break;
                }
                default:{
                System.out.println("Wrong Input");
                break;
            }
        }
        System.out.println("IF YOU WANT TO USE MORE SCIENTIFIC CALCULATOR THEN ENTER 19 OR ENTER 0 TO EXIT");
                x.p=ob.nextInt();
                if (x.p!=19)
                break;
       }while(x.p==19);
    }
}
    
