public class Persona {
    private String nombre, apellidos;
    private int edad;
    private char sexo;
    Cuenta cuentaCorriente;

    public Persona() {

        this.apellidos ="none";
        this.nombre = "none";
        this.edad = 0;
        this.sexo= 'F';
        this.cuentaCorriente = null;
    }

    public Persona(String nombre, String apellidos, int edad, char sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.cuentaCorriente = null;
    }

    public boolean crearCuentaBancaria(String iban, int nc, double interesMensual){

        boolean accionRealizada = false;

        if (cuentaCorriente == null) {
            cuentaCorriente = new Cuenta(iban, nc, interesMensual);
        }

        return accionRealizada;

    }

    public boolean sacarDinero(double dinero) {
        boolean operacionRealizada = false;

        if (cuentaCorriente.retirar(dinero)) {
            operacionRealizada = true;
        }

        return operacionRealizada;
    }

    public boolean ingresarDinero(double dinero){

        boolean operacionRealizada = false;

        if (cuentaCorriente.ingresar(dinero)){

            operacionRealizada = true;

        }
        return operacionRealizada;

    }



    public double hacerTransferecia(Persona p, double cantidad){

        boolean operacionRealizada = false;


        if (!cuentaCorriente.hacerTransferencia(p.cuentaCorriente, cantidad)){

            cantidad = 0;

        }

        return cantidad;

    }

    public void cerrarCuenta(){


        cuentaCorriente = null;


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
