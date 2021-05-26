package paquete;

public class Televisor extends Electrodomestico {

    private double tamanio;
    private String sintoniza;
    double recargo;

    public Televisor(String tipo_electro, String nombre, String procedencia, int tamanio, String sintoniza){
        super(tipo_electro,nombre,procedencia);
        this.tamanio = tamanio;
        this.sintoniza=sintoniza;
    }

    //Logica para recalculo para Tv
    public void obtenerPrecioPulgadas(){
        if (tamanio >= 40){
            recargo = getPrecio() * 0.3;
            sumarAdicional(recargo);
        }
    }
    public void obtenerPrecioSintonizador(){
        if (sintoniza.equals("si")){
            sumarAdicional(250000);
        }
    }

    public void calcularPrecio(){
        super.calcularPrecio();
        obtenerPrecioPulgadas();
        obtenerPrecioSintonizador();
    }



}
