package uvg.edu.gt.Components;

import java.util.*;

public class Calcu {
    /**
     * @param array
     * method to make a postfix result
     */
    public static void postfix(String[] array){
        Stack<Integer> numbers = new Stack<>();
        int result = 0;

        for (String element : array) {
            String[] valor = element.split(" ");
            for(String val : valor){
                if(val.matches("-?\\d+")){
                    numbers.push(Integer.parseInt(val));
                }
                else{
                    if(numbers.size() >= 2){
                        int a = numbers.pop();
                        int b = numbers.pop();

                        switch (val) {
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
            }  
        }
        result = numbers.isEmpty() ? 0: numbers.pop();
        System.out.println("Resultado: " + result);
    }
    public static void main(String[] args) {
        String[] strArray = {"1 2 + 4 * 3 +"};
        postfix(strArray);

    }
    
}