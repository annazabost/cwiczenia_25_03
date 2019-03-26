public class Admin implements User {

    String name = "Ola";

    @Override
    public void showInfo() {
        System.out.println(name + " - " + this.getClass());
    }
}
