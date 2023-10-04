
package stack ;

import java.util.Arrays ;
import java.util.EmptyStackException ;

/**
 * @author Benjamin Lauze
 * 
 * @version 1.0.0 2023-09-19 Initial implementation
 */
public class ArrayStack<T> implements StackInterface<T>
    {

    private T[] stackarray ;
    private int numberOfEntries ;
    private int capacity ;

    private static final int DEFAULT_CAPACITY = 10 ;

    public ArrayStack( int capacity )
        {
        this.capacity = capacity ;
        stackarray = (T[]) new Object[ capacity ] ;

        }


    public ArrayStack()
        {
        this( DEFAULT_CAPACITY ) ;

        }


    public void push( T newEntry )
        {
        stackarray[ numberOfEntries++ ] = newEntry ;

        ensureCapacity() ;

        }


    private void ensureCapacity()
        {
        if ( numberOfEntries == capacity )
            {
            capacity *= 2 ;
            stackarray = Arrays.copyOf( stackarray, capacity ) ;

            }

        }


    public T pop()
        {
        if ( isEmpty() )
            {
            throw new EmptyStackException() ;

            }

        T outData = stackarray[ numberOfEntries - 1 ] ;
        stackarray[ --numberOfEntries ] = null ;
        return outData ;

        }


    public T peek()
        {
        if ( isEmpty() )
            {
            throw new EmptyStackException() ;

            }

        return stackarray[ numberOfEntries ] ;

        }


    public boolean isEmpty()
        {
        return numberOfEntries == 0 ;

        }


    public void clear()
        {
        while ( !isEmpty() )
            {
            pop() ;

            }

        }

    }

// end class ArrayStack