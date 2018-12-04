package com.example.javastudy;

public class BitwiseOperators {
    public static void main(String args[]){
        byte a = 1;
        byte b = 2;
        byte c = 3;
        Not(a);
        And(a, b);
        Xor(a, b);
        TwosComplementRepresentation((byte) 5);
        DoubleWithLeftShift(c);
        byte c_Negative = TwosComplementChange(c);
        System.out.printf("Turn byte value to negative with Two's Complements: %d\n",(int) c_Negative);
        /* The case of sign extension with -1 */
        RightShift((byte) -1);
    }
    private static void BinaryRepresentation(byte b1){
        String binary_a = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
        System.out.println(binary_a);
    }

    private static void Not(byte b1){
        System.out.printf("'NOT' Binary Representation of %d is: ", b1);
        BinaryRepresentation((byte) ~b1);
    }

    private static void And(byte b1, byte b2){
        System.out.printf("'AND' Binary Representation of %d and %d is: ", b1, b2);
        BinaryRepresentation((byte) (b1 & b2));
    }

    private static void Xor(byte b1, byte b2){
        System.out.printf("'XOR' Binary Representation of %d and %d is: ", b1, b2);
        BinaryRepresentation((byte) (b1 ^ b2));
    }

    private static void TwosComplementRepresentation(byte b1){
        byte TCRep = (byte) ~b1;
        TCRep++;
        System.out.printf("Two's Complement Binary Representation of %d is: ", b1);
        BinaryRepresentation(TCRep);
    }

    private static byte TwosComplementChange(byte b1){
        byte ChangeTC = (byte) ~b1;
        ChangeTC++;
        return ChangeTC;
    }

    private static void DoubleWithLeftShift(byte b1){
        System.out.print("Binary Representation before shift: ");
        BinaryRepresentation(b1);
        b1 = (byte)(b1 << 1);
        System.out.print("Binary Representation after shift:  ");
        BinaryRepresentation(b1);
    }

    private static void RightShift(byte b1){
        System.out.print("Binary Representation before shift: ");
        BinaryRepresentation(b1);
        b1 = (byte)(b1 >> 1);
        System.out.print("Binary Representation after shift:  ");
        BinaryRepresentation(b1);
    }
}