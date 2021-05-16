package actividad.calculadora;

public class Operaciones {
    
    double primerValor, segundoValor;

    /**
     * Este método trasnfiere los dos valores introducidos por el usuario para utilizarlos en las operaciones establecidas
     * @param x Es el primer valor introducido por el usuario
     * @param y Es el segundo valor introducido por el usuario
     */
    public void setValores(double x, double y) {
        this.primerValor = x;
        this.segundoValor = y;
    }

    /**
     * Este método calcula la suma entre los dos valores introducidos por el usuario
     * @return Devuelve el valor de la suma en tipo double
     */
    public double Suma() {
        return primerValor + segundoValor;
    }

    /**
     * Este método calcula la resta entre los dos valores introducidos por el usuario
     * @return Devuelve el valor de la resta en tipo double
     */
    public double Resta() {
        return primerValor - segundoValor;
    }

    /**
     * Este método calcula la multiplicación entre los dos valores introducidos por el usuario
     * @return Devuelve el valor de la multiplicación en tipo double
     */
    public double Multiplicacion() {
        return primerValor * segundoValor;
    }

    /**
     * Este método calcula la división entre los dos valores introducidos por el usuario
     * @return Devuelve el valor de la división en tipo double
     */
    public Double Division() {
      return primerValor / segundoValor;
    }
    
    /**
     * Este método imprime un mensaje de advertencia cuando el usuario pretenda dividir entre cero
     * @return Devuelve un mensaje de advertencia en tipo String cuando el usuario intente dividir entre cero
     */
    public String ErrorDivision() {
        return "No puede dividir entre cero.";
    }

}