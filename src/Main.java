import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User alice = new User();
        User bob = new User();

        alice.setReceive(bob.getPubKey());


        bob.setReceive(alice.getPubKey());

        System.out.println("Alice's secret key: "  + alice.showKey());
        System.out.println("Bob's secret key: " + bob.showKey());

        String message = "Hello, Bob. My name is Alice! I encrypted this message using our shared key.";
        System.out.println("Original Message: " + message);
        byte[] encrypted = Encryptor.xorEncrypt(message.getBytes(StandardCharsets.UTF_8), alice.showKey().toByteArray());
        System.out.println("Encrypted Message using Alice's key: " + Arrays.toString(encrypted));
        String decrypted = new String(Encryptor.xorEncrypt(encrypted, bob.showKey().toByteArray()), StandardCharsets.UTF_8);
        System.out.println("Decrypted Message using Bob's Key: " + decrypted);
    }
}