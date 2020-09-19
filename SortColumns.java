public class SortColumns {
    // prints whole orginal array
    public static void printInput(String[] A) {
        System.out.print("Input: {");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1)
                System.out.print(", ");
        }
        System.out.print("}\n");
    }

    // prints whole indicies array
    public static void printOutput(int[] indicies) {
        System.out.print("Output: {");
        for (int i = 0; i < indicies.length; i++) {
            System.out.print(indicies[i]);
            if (i < indicies.length - 1)
                System.out.print(", ");
        }
        System.out.print("}\n");
    }

    // checks if array has at least two strings to comapre
    public static boolean checkArray(String[] A) {
        if (A.length < 2)
            return false;
        return true;
    }

    // checks if all strings in array are of equal length
    public static boolean checkLength(String[] A) {
        for (int i = 1; i < A.length; i++)
            if (A[i - 1].length() != A[i].length())
                return false;
        return true;
    }

    // retruns the inices of colums arguemnt
    // NOTE: returns empty array if all is sorted
    public static int[] minDeletionSize(String[] A) {
        // compares columms
        int[] indicies = new int[A.length];
        int counter = 0;
        for (int x = 0; x < A.length - 1; x++)
            for (int y = 0; y < A[0].length(); y++)
                if (A[x].charAt(y) > A[x + 1].charAt(y))
                    indicies[y] = y + 1;

        // counts length of final array
        for (int i = 0; i < indicies.length; i++)
            if (indicies[i] > 0)
                counter++;

        // final array values are transplanted from OG array
        int[] indiciesFinal = new int[counter];
        counter = 0;
        for (int i = 0; i < indicies.length; i++)
            if (indicies[i] > 0)
                indiciesFinal[counter++] = indicies[i] - 1;

        return indiciesFinal;
    }

    public static void main(final String[] args) {

        String A[] = { "cba", "daf", "ghi" };
        // String A[] = { "a", "b" };
        // String A[] = { "zyx", "wvu", "tsr" };
        // String A[] = { "cba", "daf", "ghi" };
        // String A[] = { "azb", "bac" };
        // String A[] = { "captain", "marvel", "saved", "the", "avengers" };
        printInput(A);
        if (checkArray(A) && checkLength(A)) { // checks num of strings and string length
            int indicies[] = minDeletionSize(A);
            printOutput(indicies);
        } else {
            if (!checkLength(A)) { // ERROR FOR unequal strings
                int indicies[] = { -1 };
                printOutput(indicies);
            } else { // default
                int indicies[] = {};
                printOutput(indicies);
            }
        }
    }
}