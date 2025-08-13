public class FinalKeywordDemo {

    private final int number;

    public FinalKeywordDemo(int value) {
        this.number = value;
    }

    public final void displayNumber() {
        System.out.println("Final variable number: " + number);
    }

    public static void main(String[] args) {
        FinalKeywordDemo obj = new FinalKeywordDemo(100);
        obj.displayNumber();

        final int[] arr = {1, 2, 3};
        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        arr[0] = 99;
        System.out.println("\nModified array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
 	