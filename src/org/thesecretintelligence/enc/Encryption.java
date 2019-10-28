package org.thesecretintelligence.enc;

public class Encryption implements Crypt{

    /**
     * Very basic encryption, this mainly taught me how to mess
     * around with bytes to change the outcome of something.
     *
     * Essentially what I learned from this was that if you have a byte, you can
     * check if the value is equal to something, change it and that will basically alter the outcome,
     * in most cases you can easily decrypt it if the outcome is as simple as changing odd and even numbers.
     *
     * =)
     *
     * */

    /**@param data the bytes of a String or a File*/
    @Override
    public byte[] encrypt(byte[] data) {
        byte[] enc = new byte[data.length];
        for (int i =0;i < data.length; i++){
            enc[i] = (byte) ((i % 2 == 0) ? data[i] + 1 : data[i] - 1);
        }
        return enc;
    }

    /**@param data the bytes of a String (String.getBytes())*/
    @Override
    public byte[] decrypt(byte[] data) {
        byte[] enc = new byte[data.length];
        for (int i =0;i < data.length; i++){
            enc[i] = (byte) ((i % 2 == 0) ? data[i] - 1 : data[i] + 1);
        }
        return enc;
    }
}
