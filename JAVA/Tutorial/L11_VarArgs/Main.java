package L11_VarArgs;

public class Main {
    static int add(int... numbers){
        int sum = 0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }

    // static double add(int a){}
    // static double add(int a,int b){}
    // static double add(int a,int b, int c){}
    // static double add(int a,int b, int c ,int d){}
    // static double add(int a,int b, int c ,int d,int e){}
    // static double add(int a,int b, int c ,int d,int e ,int f){}
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5,6));
        System.out.println(add());
        System.out.println(add(1,2,3,4));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4,5,6,5,6,7,4,3,2));
    }
}
