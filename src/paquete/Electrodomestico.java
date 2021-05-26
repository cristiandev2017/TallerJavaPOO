package paquete;

public class Electrodomestico {

    //Definicion de variables
    private String tipo_electro;
    private String nombre;
    private String procedencia;
    private double precio;


    public Electrodomestico(String tipo_electro, String nombre, String procedencia) {
        this.tipo_electro = tipo_electro;
        this.nombre = nombre;
        this.procedencia = procedencia;
        this.precio = 0;
    }

     public double getPrecio() {
        return precio;
    }

    private void calcularConsumo(){
        switch (tipo_electro){
            case "A":
                precio=precio+450000;
                break;
            case "B":
                precio=precio+35000;
                break;
            case "C":
                precio=precio+250000;
                break;
            default:
                System.out.println("No ingreso el tipo de consumo valido");
        }
    }

    private void calcularProcedencia(){
         if(procedencia.equals("Nacional")){
            precio += 250000;
        }else if (procedencia.equals("Importado")){
            precio+= 350000;
        }else{
            System.out.println("Recuerde ingresar Nacional o Importada, sino el precio sigue igual");
        }
        //Forma 2 con operador ternario
        //precio += (procedencia=="nacional")? 250000:350000;
    }
    //Recomendacion dividirlo en 2 metodos
    private void calcularBase(){
        calcularConsumo();
        calcularProcedencia();
    }

    protected void sumarAdicional( double adicional){
        precio = precio + adicional;
    }

    public void calcularPrecio(){
        calcularBase();
    }

}
