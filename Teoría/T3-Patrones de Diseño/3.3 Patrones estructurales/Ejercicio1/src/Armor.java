public class Armor extends CharacterDecorator{
    public Armor(Character personaje) {
        super(personaje);
    }

    public void equip() {
        super.equip();
        System.out.println("Armadura Equipada");
    }
}
