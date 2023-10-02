public class Empleado {
    private String nombre;
    private String cargo;
    private int salario;



    public Empleado() {
    }

    public void actualizarSalario (double incr) {
        salario *= (incr + 1);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario anual: " + salario);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
