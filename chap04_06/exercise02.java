package chap04_06;

public class exercise02 {
    public static void main(String[] args) {
        for(int x = 0; x < 5; x++) {
            System.out.println("");
            for(int y = 0; y< 5; y++) {
                if(y <= x)
                    System.out.print("*");
            }
        }
    }
}
