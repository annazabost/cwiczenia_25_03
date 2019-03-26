public class Developer implements User {
    @Override
    public void showInfo() {
        System.out.println(name + " - " + this.getClass());
    }
}
