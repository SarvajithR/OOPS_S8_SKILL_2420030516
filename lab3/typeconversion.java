package lab3;

public class typeconversion {

	public static void main(String[] args) {
		System.out.println("Widening (Implicit) Conversion:");
        int myInt = 10;
        long myLong = myInt;
        float myFloat = myLong;

        System.out.println("int value: " + myInt);
        System.out.println("long value after conversion: " + myLong);
        System.out.println("float value after conversion: " + myFloat);

        System.out.println("\nNarrowing (Explicit) Conversion:");
        double myDouble = 9.78;
        int newInt = (int) myDouble;
        System.out.println("double value: " + myDouble);
        System.out.println("int value after explicit casting: " + newInt);

        long myLong2 = 123456789;
        int newInt2 = (int) myLong2;
        System.out.println("long value: " + myLong2);
        System.out.println("int value after explicit casting: " + newInt2);

        int largeInt = 250;
        byte myByte = (byte) largeInt;
        System.out.println("int value: " + largeInt);
        System.out.println("byte value after explicit casting (data loss): " + myByte);	
	}

}
