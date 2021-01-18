public class Cuenta {

    private String iban;
    private int numeroCuenta;
    private double saldo;
    private boolean descuebierta;
    private double interesMensual;


    public Cuenta(String iban, int numeroCuenta, double interesMensual) {
        this.iban = iban;
        this.numeroCuenta = numeroCuenta;
        this.interesMensual = interesMensual;
    }

    public String toString(){

        String estadoCuenta = "El saldo de la cuenta es "+saldo;

        return estadoCuenta;
    }

    public void ingresar(double dinero){

        if (dinero > 0) {
            this.saldo += dinero;
        }
        System.out.println(toString());

    }



    public boolean retirar (double dinero){

         boolean retiradaCorrecta = false;

        if (dinero > 0 && !descuebierta) {
            this.saldo -= dinero;
            retiradaCorrecta = true;
        }
        comprobarCuenta();
        System.out.println(toString());
        return retiradaCorrecta;

    }

    public boolean hacerTransferencia(Cuenta c, double cantidad){

        boolean transferenciaCorrecta = false;

        if(this.retirar(cantidad)){

            c.ingresar(cantidad);
            transferenciaCorrecta = true;
        }
        comprobarCuenta();
        System.out.println(toString());
        return transferenciaCorrecta;
    }

    public void comprobarCuenta(){

        if (this.saldo < 0){
            this.descuebierta = true;
        }

    }


    public double beneficiosFuturos(int numMeses){

        double beneficios = 0;

        if (!descuebierta && numMeses > 0){

            beneficios = numMeses * this.interesMensual;

        }

        System.out.println(toString());
        return beneficios;
    }




    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isDescuebierta() {
        return descuebierta;
    }

    public void setDescuebierta(boolean descuebierta) {
        this.descuebierta = descuebierta;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }
}
