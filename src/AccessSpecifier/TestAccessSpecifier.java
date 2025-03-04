package AccessSpecifier;

public class TestAccessSpecifier {
        public static void main(String[] args) {
            AccessSpecifier ac=new AccessSpecifier();
            // ac.privateMethod();  //it does not acess from outside the class
            ac.protectedMethod();
            ac.defaultMethod();
            ac.publicMethod();
        }
    }

