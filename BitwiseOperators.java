package com.example.javastudy;

public class BitwiseOperators {
    public static void main(String args[]){
        byte a = 1;
        byte b = 2;
        byte c = 3;
        BinaryRepresentation(a);
        Not(a);
        And(a, b);
        Xor(a, b);
        TwosComplementRepresentation((byte) 5);
        byte c_Negative = TwosComplementChange(c);
        System.out.printf("Turn byte value to negative with Two's Complements: %d",(int) c_Negative);
    }
    private static void BinaryRepresentation(byte b1){
        String binary_a = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
        System.out.println(binary_a);
    }

    private static void Not(byte b1){
        System.out.print("'NOT' Binary Representation is: ");
        BinaryRepresentation((byte) ~b1);
    }

    private static void And(byte b1, byte b2){
        System.out.print("'AND' Binary Representation is: ");
        BinaryRepresentation((byte) (b1 & b2));
    }

    private static void Xor(byte b1, byte b2){
        System.out.print("'XOR' Binary Representation is: ");
        BinaryRepresentation((byte) (b1 ^ b2));
    }

    private static void TwosComplementRepresentation(byte b1){
        byte TCRep = (byte) ~b1;
        TCRep++;
        System.out.print("Two's Complement Binary Representation is: ");
        BinaryRepresentation(TCRep);
    }

    private static byte TwosComplementChange(byte b1){
        byte ChangeTC = (byte) ~b1;
        ChangeTC++;
        return ChangeTC;
    }
}