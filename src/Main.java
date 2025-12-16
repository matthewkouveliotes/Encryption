public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 1000; i++) {
            User alice = new User();
            User bob = new User();

            alice.setReceive(bob.getPubKey());


            bob.setReceive(alice.getPubKey());


            if(alice.showKey() != bob.showKey()) {
                System.out.println("Fail: " + alice.showSecret() + " " + bob.showSecret());
            }
        }

//        User alice = new User(8);
//        User bob = new User(9);
//
//        alice.setReceive(bob.getPubKey());
//
//
//        bob.setReceive(alice.getPubKey());
//
//        System.out.println(alice.showKey());
//        System.out.println(bob.showKey());
    }
}