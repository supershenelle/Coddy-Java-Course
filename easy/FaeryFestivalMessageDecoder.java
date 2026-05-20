/*
Create a function named fairyMessage that receives decimalNumber as its parameter.
This function aims to convert a decimal number to its binary representation, reverse the binary string, and return the reversed binary as a string.

For example, if the input decimalNumber is 5, the binary representation is "101". Reversing this binary string results in "101", which should be returned by the function.

Parameter:
decimalNumber (int): The decimal number to be converted and reversed.
*/

class FairyMessage {
    public static String fairyMessage(int decimalNumber) {
        String binary = Integer.toBinaryString(decimalNumber);
        String revBin = new StringBuilder(binary).reverse().toString();

        return revBin;
    }
}
