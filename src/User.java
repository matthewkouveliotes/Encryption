public class User {
    private int secret;
    private int key;
    private static int p = 17;
    private static int g = 5;


    public User() {
        secret = (int)(Math.random() * 10);
    }

    public User(int secret) {
        this.secret = secret;
    }

    public int getPubKey() {
        return (int) Math.pow(g, secret) % p;
    }

    public void setReceive(int receive) {
        key = (int) Math.pow(receive, secret) % p;
    }


    public int showKey() {
        return key;
    }

    public int showSecret() {
        return secret;
    }
}
