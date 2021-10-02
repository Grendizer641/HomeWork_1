public class HomeWorkApp_1 {
    public static void main(String[] args) {
//      printThreeWords();
//      checkSumSign();
//      printColor();
//      compareNumbers();

    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a;
        int b;
        int sum;

        a = 5;
        b = -8;
        sum = a + b;

        if(sum >= 0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value;

        value = 0;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100 ){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a;
        int b;

        a = 0;
        b = 2;
        if (a >= b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }
}
