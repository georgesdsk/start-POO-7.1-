
/*
Ejercicio 4: Imagina que el recibo de la luz lo cobran cada 15 días.
 Dada la primera fecha de cobro por teclado (día, mes y año),
  imprimir por pantalla cuáles serían las 10 siguientes fechas de cobro. El formato es libre,
 pero para solucionar el problema hay que utilizar las clases SimpleDateFormat, Date y GregorianCalendar.

*/


import java.util.Calendar;
import java.util.GregorianCalendar;

public class ReciboLuz implements Cloneable {

    private GregorianCalendar Fecha;
    private  GregorianCalendar FechaSuma;


    ///////////////////////////////////////////////////////////Constructores

    public ReciboLuz(int anio, int mes, int dia) {
        Fecha = new GregorianCalendar(anio, mes, dia);
    }

    public ReciboLuz() {

        Fecha = new GregorianCalendar(1999, 8,14);

    }

    public GregorianCalendar getFecha() {
        return Fecha;
    }


    ///////////////////////////////// de copia



    public void setFecha(int anio, int mes, int dia) {

        Fecha= new GregorianCalendar(anio, mes, dia);
    }




    public String getFechas(int numero){

        FechaSuma = new GregorianCalendar(Fecha.YEAR, Fecha.MONTH, Fecha.DAY_OF_MONTH);
        String Fechassiguientes ="";

        for (int i = 1; i <= numero; i++) {

            Fechassiguientes += "\n La factura numero "+i +", el dia " +escribirFecha(FechaSuma) ;

            FechaSuma.add(Calendar.DAY_OF_MONTH,10);
        }

        return Fechassiguientes;

    }

    public String escribirFecha(GregorianCalendar calendar){

        String fecha = calendar.YEAR +":"+ calendar.MONTH +":"+ calendar.DAY_OF_MONTH ;

        return fecha;
    }


}
