package uvg.edu.gt.Components;

public class Calcu implements POSFIXCalc {
    /**
     * @param array
     * method to make a postfix result
     * Agarra dos numeros dentro de el Stack (numbers) y realiza el operando
     * Se debe de verificar si el Stack (numbers) esta vacio antes de realizar una operacion.
     */

    @Override
    public int calc(String str) {
        UVGStack<Integer> numbers = new ElMejorStack<Integer>();
        String[] array = str.split(" ");

        int a;
        int b;

        for (String element : array) {
            switch (element) {
                case "+":
                    if (!numbers.isEmpty()) {
                        int primerNumero = numbers.pop();
                        boolean estaVacio = numbers.isEmpty();
                        numbers.push(primerNumero);

                        if (estaVacio) {
                            System.out.println("El Stack debe contener al menos 2 numeros.");
                        }
                    } else {
                        System.out.println("El Stack debe contener al menos 2 numeros.");
                    } {
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b + a);
                }
                    break;

                case "-":
                    if (!numbers.isEmpty()) {
                        int primerNumero = numbers.pop();
                        boolean estaVacio = numbers.isEmpty();
                        numbers.push(primerNumero);

                        if (estaVacio) {
                            System.out.println("El Stack debe contener al menos 2 numeros.");
                        }
                    } else {
                        System.out.println("El Stack debe contener al menos 2 numeros.");
                    } {
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b - a);
                }
                    break;

                case "*":
                    if (!numbers.isEmpty()) {
                        int primerNumero = numbers.pop();
                        boolean estaVacio = numbers.isEmpty();
                        numbers.push(primerNumero);

                        if (estaVacio) {
                            System.out.println("El Stack debe contener al menos 2 numeros.");
                        }
                    } else {
                        System.out.println("El Stack debe contener al menos 2 numeros.");
                    } {
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b * a);
                }

                    break;
                case "/":
                    if (!numbers.isEmpty()) {
                        int primerNumero = numbers.pop();
                        boolean estaVacio = numbers.isEmpty();
                        numbers.push(primerNumero);

                        if (estaVacio) {
                            System.out.println("El Stack debe contener al menos 2 numeros.");
                        }
                    } else {
                        System.out.println("El Stack debe contener al menos 2 numeros.");
                    } {
                    a = numbers.pop();
                    b = numbers.pop();
                    if (a != 0) {
                        numbers.push(b / a);
                    } else {
                        System.out.println("No se puede dividir por 0 en: " + b + "/" + a);
                    }
                }

                    break;

                default:
                    numbers.push(Integer.parseInt(element));
            }

        }

        return numbers.isEmpty() ? 0 : numbers.pop();
    }
}