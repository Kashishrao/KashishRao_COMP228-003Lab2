package Exercise3;

public class overload
{

    public static double method(int base, int height){

        double sum = 0.5*base+height;
        System.out.println("area of rectangle is " + sum);
        return  0;
    }


    public static int method(int a, int b, int c){

        int sum = a+b+c;
        System.out.println("sum of three number is "  + sum);
        return 0;
    }

    public static String method(String a , String b)
    {
        String ss;
        ss = a+b;
        System.out.println("before concatination  = "+ "\n" +a + "\n" + b + "\n");
        System.out.println("after concatination string is " +ss);
        return "";
    }

    public static void main(String[] args)
    {
        overload o =new overload();

        o.method(4 , 5);
        o.method(2,3,4);
        o.method("kashish" , "rao");
    }
}
