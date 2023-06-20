public class FinalExample {
    private final int constantValue = 10;
    public final void printMessage() {
        System.out.println("This is a final function.");
    }
    public final class FinalClass {
        public void display() {
            System.out.println("Inside the final class.");
        }
    }
    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        System.out.println("The constant value is: " + example.constantValue);
        example.printMessage();
        FinalClass finalObj = example.new FinalClass();
        finalObj.display();
    }
}
