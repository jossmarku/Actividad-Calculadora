package actividad.calculadora;

import java.util.Scanner;

public class ActividadCalculadora {

    public static void encabezado(){
        System.out.println("Universidad Autónoma de Campeche");
        System.out.println("Facultad de Ingeniería");
        System.out.println("Ingeniería en Sistemas Computacionales");
        System.out.println("11 de mayo de 2021");
        System.out.println("Jossmar Oswaldo Ku Cupul");
    }
    
    public static void cuerpo() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");
        System.out.println("============================[Calculadora]============================");
        System.out.println("");
    }
    
    public static void pie() {
        System.out.println("");
        System.out.println("=====================================================================");
        System.out.println("                                                            JOKC.2021");
    }
    
    public static void principal() {
        int operacion;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Primero deberá introducir dos números, y posteriormente elegirá la\noperación que desea realizar entre ellos.");
        System.out.println("");
        
        System.out.println("Primer número:");
        double primerValor = entrada.nextDouble();
        System.out.println("");
        
        System.out.println("Segundo número:");
        double segundoValor = entrada.nextDouble();
        System.out.println("");
        
        Operaciones op = new Operaciones();
        op.setValores(primerValor, segundoValor);
        
        System.out.println("[1] Suma");
        System.out.println("[2] Resta");
        System.out.println("[3] Multiplicación");
        System.out.println("[4] División");
        System.out.println("");
        System.out.println("Seleccione una operación a realizar: ");
        operacion = entrada.nextInt();
        System.out.println("");
        
        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + op.Suma());
                break;
            case 2:
                System.out.println("Resultado: " + op.Resta());
                break;
            case 3:
                System.out.println("Resultado: " + op.Multiplicacion());
                break;
            case 4:
                if (segundoValor == 0) {
                    System.out.println("Resultado: " + op.ErrorDivision());
                } else {
                    System.out.println("Resultado: " + op.Division());
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
    
    public static void main(String[] args) {
        encabezado();
        cuerpo();
        principal();
        pie();
    }
    
}
