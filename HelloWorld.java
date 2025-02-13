public class HelloWorld {
    public String sayHello() {
        return "Hello, World!";
    }

    // Main method to run inside Docker
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.sayHello());
    }
}
