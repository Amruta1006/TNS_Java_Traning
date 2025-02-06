public class Operator {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;

        System.out.println("Before Increament/ Decreament");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        int c= ++a + b + a--;
        System.out.println(" ");
        System.out.println("After Increament/ Decreament");
        System.out.println("Value of c: " + c);

        int d= c++ + a + b--;
        System.out.println("Value of d: " + d);
    }


}