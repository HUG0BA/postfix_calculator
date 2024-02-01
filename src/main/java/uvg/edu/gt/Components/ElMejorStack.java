package uvg.edu.gt.Components;

import java.util.Vector;

public class ElMejorStack<T> implements UVGStack<T> {

    private Vector<T> vector;

    public ElMejorStack(){
        vector = new Vector<T>();
    }

    @Override
    public void push(T val) {
        vector.add(val);
    }

    @Override
    public T pop() {
        return vector.lastElement();
    }

    @Override
    public T top() {
        T temp = vector.lastElement();
        vector.remove(vector.indexOf(temp));
        return temp;

    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
    

}
