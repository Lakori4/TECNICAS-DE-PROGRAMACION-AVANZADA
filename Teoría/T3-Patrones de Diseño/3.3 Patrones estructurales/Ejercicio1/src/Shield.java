public class Shield extends CharacterDecorator{
    public Shield(Character personaje) {
        super(personaje);
    }

    public void equip() {
        super.equip();
        System.out.println("Escudo Equipado");
    }
}
