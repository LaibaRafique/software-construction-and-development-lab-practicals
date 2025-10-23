package task1;

public class GenericReverseArray {

    public static <T> void printArrayInReverse(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array in Reverse: ");
        printArrayInReverse(intArray);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.print("Double Array in Reverse: ");
        printArrayInReverse(doubleArray);

        Character[] charArray = {'a', 'b', 'c', 'd'};
        System.out.print("Character Array in Reverse: ");
        printArrayInReverse(charArray);
    }
}

