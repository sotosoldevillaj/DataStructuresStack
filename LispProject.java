
package hw2 ;

import java.util.ArrayList ;

import stack.ArrayStack ;
import stack.LinkedStack ;

/**
 * @author Benjamin Lauze
 * 
 * @version 1.0.0 2023-10-03 Initial implementation
 */
public class LispProject<T>
    {

    private static ArrayStack<String> operatorStack ;
    private static LinkedStack<String> valueStack ;

    public LispProject()
        {
        operatorStack = new ArrayStack<>() ;
        valueStack = new LinkedStack<>() ;

        }


    public T arrayCreation( String s )
        {
        for ( int i = 0 ; i < s.length() ; i++ )
            {
            String value = String.valueOf( s.charAt( i ) ) ;

            if ( value == "(" )
                {
                valueStack.push( value ) ;

                }
            else if ( value == "+" || value == "-" || value == "*" || value == "/" )
                {
                operatorStack.push( value ) ;

                }
            else if ( value != " " )
                {
                valueStack.push( value ) ;

                }
            else if ( value == ")" )
                {
                String popped = valueStack.pop() ;
                ArrayList<String> operands = new ArrayList<>() ;
                while ( popped != "(" )
                    {
                    operands.add( popped ) ;
                    popped = valueStack.pop() ;

                    }

                String operator = operatorStack.pop() ;

                }
            else
                {
                continue ;

                }

            }

        return null ;

        }


    public static void main( String[] args )
        {
        String s = ( "(+(-6)(* 2 3 4)(/(+3)(*)(-2 3 1)))" ) ;
        System.out.println( "Considering the expression: " + s ) ;

        }

    }
// end class LispProject
