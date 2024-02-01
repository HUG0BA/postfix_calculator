package uvg.edu.gt.Components;

import java.util.Vector;

public interface UVGStack<T> {

    public void push(T val);
    public T pop();
    public T top();
    public boolean isEmpty();
    
}
