package GetterSetter;

public class TestGetSetter {

        public static void main(String[] args) {
            GetterSetter P1 = new GetterSetter();
            P1.setName("Amruta");
            P1.setpCity("Kolhapur");
            System.out.println(P1);
            GetterSetter P2 = new GetterSetter("Sneha", "Pune");
            System.out.println(P2);
        }
    }

