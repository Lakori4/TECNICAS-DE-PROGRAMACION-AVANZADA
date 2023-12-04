public abstract class CharacterDecorator implements Character {
    private Character personaje;

    public CharacterDecorator(Character personaje) {
        this.personaje = personaje;
    }

    @Override
    public void equip() {
        System.out.println("Equipación básica");
    }
}
