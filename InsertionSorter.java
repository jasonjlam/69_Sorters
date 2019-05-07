/**
  Implement an insertion sort, in the Sorters structure
  
  Precondition: A list of at least one or more elements
  Postcondition: A sorted list with the same elements
 */
import java.util.ArrayList;



public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList<String> usersData) {
        super(usersData);
        mySort();
    }
    

    /**
    
    For every element in the list calls the method insert1 to place the element 
    in the sorted region
    
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        for (int i = 1; i < elements.size(); i ++) {
            insert1 (elements, i);
        }
    }
    /**
    Given a sorted and unsorted region, takes the first element of the 
    unsorted region and shifts all sorted elements larger than it to the right,
    inserting that element into the spot left empty.
    **/
    public static void insert1(
                                             ArrayList<String> list, 
                                             int alreadyInserted) {
        System.out.println(list);                                            
        String valueToInsert = list.get(alreadyInserted);
        System.out.println("valueToInsert:" + valueToInsert);
        if (valueToInsert.compareTo(list.get(0))< 0) {
            list.remove(alreadyInserted);
            list.add(0, valueToInsert);
        return;
        }
        for (int indexToCompare = alreadyInserted - 1; 
             indexToCompare >= 0;
             indexToCompare --) {
            System.out.println("indexToCompare" + indexToCompare);
            if (valueToInsert.compareTo(list.get(indexToCompare)) < 0) {
                shift(list, indexToCompare);
            }
            else {
                list.set(indexToCompare + 1, valueToInsert );
                break;
                 }         
            }         
    }
    
    public static void shift(ArrayList<String> list, int index) {
            list.set(index +1, list.get(index));      
        }
}
