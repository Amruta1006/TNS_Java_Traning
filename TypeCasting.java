public class TypeCasting {
    public static void main(String[] args) {

        //implicitly type casting //widening
        byte b= 10;
        int i=b;
        System.out.println(i);

        float f=100.3f;
        double d=f;
        System.out.println(d);

        char ch = 'A';
        int a=ch;
        System.out.println(a);

        //explixitly type casting //narrowing
        double f1=10.4357f;
        long l1=(long) f1;
        System.out.println(l1);

        long abc=123456789;
        int i1=(int) abc;
        System.out.println(i1);

        int xyz=132;
        byte pqr =(byte)xyz;
        System.out.println(pqr);


    }
}
