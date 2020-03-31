public class Cliente{
    private String id;
    private String nombre;
    private String apellidos;
    private String genero;
    private String fechanacimiento;
    private String estadocivil;

    public Cliente(String id, String nombre, String apellidos, String genero, String fechanacimiento, String estadocivil){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechanacimiento = fechanacimiento;
        this.estadocivil = estadocivil;
    }

    @Override
    public String toString() {
        return "Cliente [apellidos=" + apellidos + ", estadocivil=" + estadocivil + ", fechanacimiento="
                + fechanacimiento + ", genero=" + genero + ", id=" + id + ", nombre=" + nombre + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}