/*
 Q1.What is a Stream in the context of the Java 8 Stream API?

 A) A data structure for storing elements.


 B) A sequence of data elements that can be processed in parallel or sequentially.


 C) A container for holding collections.


 D) A type of exception thrown during runtime.

 */

package com.nt.mcqs;

public class Test1 {

}

/*Output:B) A sequence of data elements that can be processed in parallel or sequentially.

In Java 8, the Stream API is used to process collections of objects in a functional style. 
A Stream represents a sequence of elements supporting sequential
and parallel aggregate operations such as filter, map, reduce, etc.

-It does not store data, it just conveys elements from
 a source (like a collection, array, or I/O channel).

-It is different from data structures like List or 
 Set—streams are not meant to store elements.
*/