package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println(myMaxIntTest);
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        //casting convert one type to another by adding (byte)
        //defaulted as int when casting not done which results in an error
        byte myNewByteValue = (byte) (myMinByteValue /2);
        // casting using (short) instead
        short myNewShortValue = (short) (myMinShortValue / 2);


        byte myByte = 98;
        short myShort = 586;
        int myInt = 56548;
        long myLongNum = 50000 + 10L * (myInt + myByte + myShort);
        System.out.println(myLongNum);
        // if we wanted to do this with a short instead we would need to cast
        short shortTotal = (short) (1000 + 10 * (myInt + myByte + myShort));

    }
}
