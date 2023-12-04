public class BasicCharacter implements Character{
    String name;

    public BasicCharacter(String name) {
        this.name = name;
    }
    @Override
    public void equip() {
        System.out.println(name + " tiene equipación básica");
    }
}
