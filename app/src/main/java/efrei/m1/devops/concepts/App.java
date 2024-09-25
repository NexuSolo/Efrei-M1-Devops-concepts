package efrei.m1.devops.concepts;

public class App {
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    
    public int add(int a, int b) {
        return a + b;
    }

    public String getGreeting() {
        return "Hello World!";
    }
}
