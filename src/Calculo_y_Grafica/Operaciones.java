package Calculo_y_Grafica;

/**
 *
 * @author George Herrada Farfán
 * @version 1.0
 * @github https://github.com/gherrada22
 */
public class Operaciones {
    //creamos atributos de la clase
    public double result;
    public double velocidadI, angulo, tiempo, angulorad;
// cramos metodos con retorno que usaran los botones 
    //metodo para calcular la altura maxima 
    public  double   calalturamaxima(double velocidadI, double angulo) {
        angulorad = Math.toRadians(angulo);
        result = (velocidadI * Math.sin(angulorad)) * ((velocidadI * Math.sin(angulorad)) / 9.81) + (0.5 * -9.81 * Math.pow(((velocidadI * Math.sin(angulorad)) / 9.81), 2));
        double x = result;
        return  x;
    }
   //metodo para calcular la distancia maxima 
    public double  caldistanciamaxima(double velocidadI, double angulo) {
        angulorad = Math.toRadians(angulo);
        result = (velocidadI * Math.cos(angulorad)) * (((velocidadI * Math.sin(angulorad)) / 9.81)) * 2;
        double x=result;
        return x;
    }
    //metodo para calcular la altura respecto al tiempo 
    public double  altura(double velocidadI, double angulo, double tiempo) {
        angulorad = Math.toRadians(angulo);
        result = ((velocidadI * Math.sin(angulorad)) * tiempo) + (0.5 * -9.81 * Math.pow(tiempo, 2));
        double x=result;
        return x;
    }
    // metodo para calcular la distancia respecto al  tiempo 
    public double  distancia(double velocidadI, double angulo, double tiempo) {
        angulorad = Math.toRadians(angulo);
        result = velocidadI * Math.cos(angulorad) * tiempo;
        double x=result;
        return x;
    }
    // metodo para calcular la velocidad 
    public double  velocidad(double velocidadI, double angulo, double tiempo) {
        angulorad = Math.toRadians(angulo);
        result = Math.sqrt(Math.pow((velocidadI * Math.sin(angulorad)) + (-9.81 * tiempo), 2) + (Math.pow(velocidadI * Math.cos(angulorad), 2)));
        double x=result;
        return x;
    }
// metodo para calcular el tiempo de vuelo
    public double  tiempodevuelo(double velocidadI, double angulo) {
        angulorad = Math.toRadians(angulo);
        result = (((velocidadI * Math.sin(angulorad)) / 9.81) * 2);
        double x=result;
        return x;
    }
    
}
