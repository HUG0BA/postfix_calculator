package uvg.edu.gt.Components;

import java.util.Stack;

public class Calcu {
    /**
     * @param array
     * method to make a postfix result
     */
    public static void postfix(String arrays){
        Stack<Double> numbers = new Stack<>();
        String[] array = arrays.split(" ");
        double result = 0;
        //run each element of the array given
        for (String element : array){
           
            if (element.matches("-?\\d+(\\.\\d+)?")){
                numbers.push(Double.parseDouble(element));
            }
            else{
                double a = numbers.pop();
                double b = numbers.pop();
                //Operations using push
                switch (element) {
                    case "+":
                        numbers.push(a+b);            
                        break;
                    case "-":
                        numbers.push(a-b);
                        break;
                    case "*":
                        numbers.push(a*b);
                        break;
                    case "/":
                        numbers.push(a/b);
                        break;
                }
            }
        }
            
        
        result = numbers.isEmpty() ? 0: numbers.pop();
        System.out.println("Resultado: " + result);
    }
    
}