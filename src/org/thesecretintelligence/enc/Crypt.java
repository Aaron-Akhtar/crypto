package org.thesecretintelligence.enc;

public interface Crypt {

    byte[] encrypt(byte[] data);
    byte[] decrypt(byte[] data);
}
