
package stack ;

/**
 * @author Benjamin Lauze
 * 
 * @version 1.0.0 2023-10-01 Initial implementation
 */
public interface StackInterface<T>
    {

    void push( T anEntry ) ;

    T pop() ;

    T peek() ;

    boolean isEmpty() ;

    void clear() ;

    }
// end class StackInterface