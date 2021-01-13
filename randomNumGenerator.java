import java.time.LocalTime;

public class randomNumGenerator {

    public static int numGen(){
        int rNum;

        LocalTime time = LocalTime.now();
        rNum = time.getMinute();


        return rNum %10;

    }

    public static void main(String[] args) {
        System.out.println("Random Number between 0-9: "+ numGen());
    }


}
