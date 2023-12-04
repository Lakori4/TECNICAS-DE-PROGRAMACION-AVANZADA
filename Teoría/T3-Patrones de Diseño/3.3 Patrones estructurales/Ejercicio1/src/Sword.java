public class Sword extends CharacterDecorator{
    public Sword(Character personaje) {
        super(personaje);
    }

    public void equip() {
        super.equip();
        System.out.println("Espada Equipada");
    }
}
