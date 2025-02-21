package DayTwo;

public class ForEachLoopDemo {
    public static void main(String[] args) {

        int a[]= {10,20,30,40,50};

        //for each
        for(int i: a)
        {
            System.out.println(i);
        }

        char ch[]= {'J','a','v','a'};

        for(char c:ch)
        {
            System.out.print(c);
        }
    }

}
