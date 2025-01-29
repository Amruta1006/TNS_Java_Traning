public class RangeDatatype {
    public static void main(String[] args) {
        //byte....8 bit
        byte byteMax = 127;
        byte byteMin = -128;
        System.out.println("Min range of byte " +byteMin) ;
        System.out.println("Min range of byte " +byteMax) ;

        // short.....2 byte
        short shortMax = 32767;
        short shortMin = -32767;
        System.out.println("Min range of byte " +shortMax) ;
        System.out.println("Min range of byte " +shortMin) ;

        //int.....4 byte
        int intMax = 214748364;
        int intMin = -2147483368;
        System.out.println("Max Range of byte is : " + intMax);
        System.out.println("Min Range of byte is : " + intMin);

        //long.....8 byte
        long longMax = 922337203685477580L;
        long longMin = -9223372036854775808L;
        System.out.println("Max Range of byte is : " + longMax);
        System.out.println("Min Range of byte is : " + longMin);

    }
}
