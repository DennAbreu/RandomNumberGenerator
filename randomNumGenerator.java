import java.time.LocalTime;

public class randomNumGenerator {

    public static int numGenP(){
        int r;
        int rNum;

        LocalTime time = LocalTime.now();
        rNum = time.getMinute();


        return rNum %10;

    }

    public static void main(String[] args) {
        System.out.println(numGenP());
    }


}
