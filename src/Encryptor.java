public class Encryptor {
    public static byte[] xorEncrypt(byte[] message, byte[] key) {
        byte[] output = new byte[message.length];
        for (int i = 0; i < message.length; i++) {
            output[i] = (byte) (message[i] ^ key[i % key.length]);
        }
        return output;
    }
}
