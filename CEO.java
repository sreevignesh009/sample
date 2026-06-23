public class CEO {

    void work() {
        System.out.println("CEO is working");
    }

    public static void main(String[] args) {

        Manager obj = new Manager();

        obj.work();

    }
}
class Manager extends CEO {

}