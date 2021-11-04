package ClassesObjectsPractice;

public class Functions {

    static int x = 2;

    public static int addToX(int y){
        int result = x+y;
        return result;
    }


    public static void main(String[] args) {
        x = 4;
        int y = 10;
        System.out.println(addToX(y));

    }
}
