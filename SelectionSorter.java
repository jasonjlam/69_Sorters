/**
  Implement an insertion sort, in the Sorters structure
  
  Precondition: A list of at least one or more elements
  Postcondition: A sorted list with the same elements
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
        super(usersData);
        mySort();
    }
    /** 
    Given a list of n items, finds the index of the smallest item
    beginning at element n.
    **/
    private int champIndex(int start) {
         String minimum = "z";
         int index = start;
         for (int i = start; i < elements.size(); i ++) {
             if (elements.get(i).compareTo(minimum) < 0) {
                 minimum = elements.get(i);
                 index = i;
             }
         }
        return index;
     }
    
    /**
      sort the user's data, implementing insertion sort
    For each element, given a sorted and an unsorted region, find the index of
    the smallest element with champIndex in the unsorted region, swap it with the 
    first element of the unsorted region, and increment the sorted region.
      
     */
    public void mySort() {
        for (int i = 0; i < elements.size()-1; i ++) {
            int nextLargerAt = champIndex(i);
            String smallestString = elements.get(nextLargerAt);
            String oldString = elements.get(i);
            elements.set(nextLargerAt, oldString);
            elements.set(i, smallestString);
            System.out.println("smallest element is at index " + nextLargerAt 
                                + " and has the value " + elements.get( nextLargerAt)
                                + System.lineSeparator()
                                + elements);
             }
    }
}
