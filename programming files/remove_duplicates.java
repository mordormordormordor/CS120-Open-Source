import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {

    /*
    removes duplicates from a list
    takes in 2 lists of integers named arr, and removedElements
    returns a list of unique elements
    */
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
       
        List<Integer> uniqueArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (!uniqueArr.contains(arr.get(i))) { //checks if element is not in uniqueArr
                uniqueArr.add(arr.get(i)); //if not in uniqueArr then add it
            } else {
                removedElements.add(arr.get(i)); //else add to removed elements
            }
        }
        return uniqueArr; //return list of unique elements as uniqueArr
    }

    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5); //create a list of integeres
        List<Integer> removedElements = new ArrayList<>(); //initialize removed elements
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements); //run function
        //print outputs
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
