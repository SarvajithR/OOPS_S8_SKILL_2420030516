package lab3;

public class wrapper {

	public static void main(String[] args) {
		int primitiveInt = 100;
        Integer integerObject = primitiveInt;

        System.out.println("Primitive int value: " + primitiveInt);
        System.out.println("Wrapped Integer object value: " + integerObject);

        int unboxedInt = integerObject;

        System.out.println("Unboxed int value: " + unboxedInt);

        double primitiveDouble = 99.99;
        Double doubleObject = primitiveDouble;

        System.out.println("Primitive double value: " + primitiveDouble);
        System.out.println("Wrapped Double object value: " + doubleObject);

        char primitiveChar = 'G';
        Character charObject = primitiveChar;

        System.out.println("Primitive char value: " + primitiveChar);
        System.out.println("Wrapped Character object value: " + charObject);
	}

}
