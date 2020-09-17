
public class SortColumns {
    // prints whole orginal array
    public static void printArray(String[] A) {
        for (int i = 0; i < A.length; i++)
            System.out.println("String[" + i + "]: " + A[i] + " - Length: " + A[i].length());
    }

    // prints whole indicies array
    public static void printIndicies(int[] indicies) {
        for (int i = 0; i < indicies.length; i++)
            System.out.println("Indicies: " + indicies[i]);
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

    // retruns the inices of colums uib arguemnt
    // NOTE: returns empty array if all is sorted
    public static int[] minDeletionSize(String[] A) {
        // compares columms
        int[] indicies = new int[A.length];
        int counter = 0;
        for (int x = 1; x < A.length; x++)
            for (int y = 0; y < A.length; y++)
                if (A[x - 1].charAt(y) > A[x].charAt(y))
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

        // TODO: fail check for mismatching string length
        // TODO: output values: ex. "Output {-1}"

        String A[] = { "cba", "daf", "ghi" };
        // String A[] = { "zyx", "wvu", "tsr" };
        // String A[] = { "cba", "daf", "ghi" };
        // String A[] = { "azb", "bac" };
        // String A[] = { "captain", "marvel", "saved", "the", "avengers" };
        printArray(A);
        int indicies[] = minDeletionSize(A);
        printIndicies(indicies);

    }
}