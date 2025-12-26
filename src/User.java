import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class User {
    SecureRandom random = new SecureRandom();
    private BigInteger secret;
    private BigInteger key;
    private BigInteger p = new BigInteger("21929");
    private BigInteger g = new BigInteger("3");
    private BigInteger receive;


    public User() {
        secret = new BigInteger(p.bitLength() - 2, random);
        if(secret.equals(BigInteger.ZERO))
            secret = BigInteger.ONE;
    }

    public User(BigInteger secret) {
        this.secret = secret;
    }

    public BigInteger getPubKey() {
        return g.modPow(secret, p);
    }

    public void setReceive(BigInteger receive) {
        this.receive = receive;
        key = receive.modPow(secret, p);
    }


    public BigInteger showKey() {
        return key;
    }

    public BigInteger showSecret() {
        return secret;
    }
}
