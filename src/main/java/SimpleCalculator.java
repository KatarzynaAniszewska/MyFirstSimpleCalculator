import java.util.*;
public class SimpleCalculator {

        public int addAtoB (int  a, int b ){
            return a+b;

        }
        public int subtractAfromB (int  a, int b ){
        return a - b;

    }
    public static void main (String[]args){
            SimpleCalculator simpleCalculator = new SimpleCalculator();
            int addResult = simpleCalculator.addAtoB(500,2633);
            int substractResult = simpleCalculator.subtractAfromB(546,8569);




        System.out.println(addResult);
        System.out.println(substractResult);
}}

