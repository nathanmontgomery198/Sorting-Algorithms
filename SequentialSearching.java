package Week07;

public class SequentialSearching {
    public static void main(String[] args) {
        int values[] = {3, 1, 6, 5, 11, 7, 2};
        int num = 6;

        boolean found = search(values, num);

        System.out.print("Number: " + num);
        if (found) {
            System.out.println(" was found.");
        } else {
            System.out.println(" was not found");
        }
    }

    public static boolean search(int data[], int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }
        return false;
    }
}
