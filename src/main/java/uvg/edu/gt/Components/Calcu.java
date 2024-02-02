package uvg.edu.gt.Components;


public class Calcu implements POSFIXCalc{
    /**
     * @param array
     * method to make a postfix result
     */

    

    @Override
    public int calc(String str) {
        UVGStack<Integer> numbers = new ElMejorStack<Integer>();
        String[] array = str.split(" ");
        int a;
        int b;

        for (String element : array){
            switch (element) {
                case "+":
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b+a);            
                    break;
                case "-":
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b-a);
                    break;
                case "*":
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b*a);
                    break;
                case "/":
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b/a);
                    break;
                default:
                    numbers.push(Integer.parseInt(element));
            }
              
        }

        return numbers.isEmpty() ? 0: numbers.pop();
    }
}