public class Apple implements Phone {
    public void call(String phoneNumber) {
        System.out.println("Apple: calling");
    }

    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Apple: sending a message");
        System.out.println("your message is sent");
    }
}
