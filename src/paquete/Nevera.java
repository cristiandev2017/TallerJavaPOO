package paquete;

public class Nevera extends Electrodomestico{

    private double capacidad;


    public Nevera (String tipo_electro, String nombre, String procedencia, int capacidad){
        super(tipo_electro,nombre,procedencia);
        this.capacidad = capacidad;
    }

    //Logica para capacidad nevera
    private void calcularPreciopPorLitros(){
        if(this.capacidad >= 120){
            double porcentajeAdicional = ((int)(capacidad - 120)/10)*(0.05);
            double precioAdicional = porcentajeAdicional*getPrecio();
            sumarAdicional(precioAdicional);
        }
    }

    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        calcularPreciopPorLitros();
    }


}
