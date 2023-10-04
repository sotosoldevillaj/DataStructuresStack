
package stack ;

import java.util.EmptyStackException ;

import utils.Node ;

/**
 * @author Benjamin Lauze
 * 
 * @version 1.0.0 2023-09-21 Initial implementation
 */
public class LinkedStack<T> implements StackInterface<T>

    {

    private Node<T> topNode ;

    public LinkedStack()
        {
        topNode = null ;

        }


    public boolean isEmpty()
        {
        return topNode == null ;

        }


    public void push( T anEntry )
        {
        Node<T> toAdd = new Node<>( anEntry ) ;
        toAdd.setNext( topNode ) ;
        topNode = toAdd ;

        }


    public T pop()
        {
        if ( isEmpty() )
            {
            throw new EmptyStackException() ;

            }

        T outData = topNode.getData() ;
        topNode = topNode.getNext() ;
        return outData ;

        }


    public T peek()
        {
        if ( isEmpty() )
            {
            throw new EmptyStackException() ;

            }

        return topNode.getData() ;

        }


    public void clear()
        {
        topNode = null ;

        }

    }
// end class LinkedStack