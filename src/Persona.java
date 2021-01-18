public class Persona {
    private String nombre, apellidos;
    private int edad;
    char sexo;

    public Persona() {

        this.apellidos ="none";
        this.nombre = "none";
        this.edad = 0;
        this.sexo= 'F';
    }

    public Persona(String nombre, String apellidos, int edad, char sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }



    public void Saludar(){

        System.out.println("Que pàsa maa");

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
