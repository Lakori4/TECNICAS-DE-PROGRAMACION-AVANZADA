public abstract class CharacterDecorator implements Character {
    private Character personaje;

    public CharacterDecorator(Character p) {
        personaje = p;
    }

    @Override
    public void equip() {
        System.out.println("Equipación básica");
    }
}
