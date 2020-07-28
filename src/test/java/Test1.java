
import java.lang.reflect.Array;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        String string = "2+(323-65)";

        if (string.matches("([1-9])*[+*/ /-]([0-9])*")) {
            //  return new CalculatorArabic(input);
            System.out.println("Цифры");

        } else if (string.matches("[(i)(v})(x)(I)(V)(X)]*[+*/ /-][(i)(v})(x)(I)(V)(X)]*")) {
            //    return  new CalculatorLatin(input);
            System.out.println("Латиница");


        }

        String[] numbers = string.split("[+*/ /-]");
        String[] operands = string.split("[(0-9)*]");
        String[][] mathematicalExpression = new String[2][];

        mathematicalExpression[0] = numbers;
        mathematicalExpression[1] = operands;

        System.out.println("");
        System.out.println("-------------");
        System.out.println("Получили:  ");
        System.out.println(Arrays.deepToString(mathematicalExpression));
        System.out.println("");
        System.out.println("-----------------");


    }

}
