# Posfix Calculator

Calculadora Posfix funciona mediante la operacion de numeros de derecha a izquierda, donde se toman primero los operando y luego los operadores. Al momento de encontrar un operando este lo mete dentro de un stack utilizando ***.push()*** y al encontrar un operador realiza un ***.pop()*** para extraer los ultimos dos digitos y realizar la operacion hasta que el stack este vacio.
El programa esta organizado por medio de Maven por lo que el codigo se encuentra dentro de *"./scr/main/uvg/edu/gt/Components"* y el metodo principal main *"./scr/main/uvg/edu/gt"*
Dentro de los Components se encuentra
- Calcu.java : Encargado de realizar todas las operaciones Posfix y dar un resultado.
- ElMejorStack.java : Implementacion de UVGStack.
- Lector.java : Lector txt y devuele un Vector.
- POSFIXCalcu.java : Interfaz definida durante clase para implementacion en otros proyectos.
- UVGStack.java : Interfaz definida durante clase para implementacion en otros proyectos.

Luego se encuentra ***App.java*** que contiene el *main* donde se implementan los metodos encontrados en *Calcu.java* y *Lector.java*
