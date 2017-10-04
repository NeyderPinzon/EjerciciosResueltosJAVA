package examen;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class GuisSwitch {
  public static void Ejercicio20(){
        //Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje 
        //“Feliz verano” de lo contrario Informar “No es Verano”
        String mes;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un mes: ");
        mes = entrada.next();
        
        switch (mes){
            case ("enero"):{
                System.out.println("Feliz verano");
                break;
            }
            case ("febrero"):{
                System.out.println("Feliz verano");
                break;
            }    
            default: 
                System.out.println("No es verano");
        } 
    }
  public static void Ejercicio21(){
    //Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje 
    //“Iniciando el año” ,si es junio o julio el mensaje” Mitad del año” 
    //y si es diciembre el mensaje fin de año.
    String mes;
    Scanner entrada = new Scanner(System.in);
    
      System.out.println("Ingrese mes del año: ");
      mes = entrada.next();
      
        switch (mes){
            case ("enero"):
              System.out.println("Iniciando el año");
              break;
        
            case ("febrero"):{
               System.out.println("Iniciando el año");
                break;
            }
            case ("junio"):{
                System.out.println("Mitad del año");
                break;
            }
            case ("julio"):{
                System.out.println("Mitad del año");
                break;
            }
            case ("diciembre"):{
                System.out.println("fin del año");
                break;
            }
        }
        
        
  }
  public static void Ejercicio22(){
      //Se ingresa un mes del año y si es Enero: "que comiences bien el año!” 
      //, si es Marzo: "a clases!” , si es Julio: "se vienen las vacaciones!” 
      //, si es Diciembre: "Felices fiesta!”.
      String mes;
    Scanner entrada = new Scanner(System.in);
    
      System.out.println("Ingrese mes del año: ");
      mes = entrada.next();
      
        switch (mes){
            case ("enero"):
              System.out.println("Que comiences bien el año");
              break;
        
            case ("marzo"):{
               System.out.println("a clases");
                break;
            }
            case ("julio"):{
                System.out.println("se vienen las vacaciones");
                break;
            }
            case ("diciembre"):{
                System.out.println("felices fiestas");
                break;
            }default:
                System.out.println("que hace?");
        }
        
  }
  public static void Ejercicio23(){
      //Se ingresa un mes del año al seleccionar un mes informar: 
      //si tiene 28 días ,si tiene 30 días, si tiene 31 días.
      String mes;
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Ingrese un mes: ");
      mes = entrada.next();
      
      switch (mes) {
            case ("enero"):
                System.out.println("tiene 31 dias");
                break;
            case ("febrero"):
                System.out.println("tiene 28 dias");
                break;
            case ("marzo"):
                System.out.println("tiene 31 dias");
                break;
            case ("abril"):
                System.out.println("tiene 31 dias");
                break;
            case ("mayo"):
                System.out.println("tiene 30 dias");
                break;
            case ("junio"):
                System.out.println("tiene 31 dias");
                break;
            case ("julio"):
                System.out.println("tiene 30 dias");
                break;
            case ("agosto"):
                System.out.println("tiene 31 dias");
                break;
            case ("septiembre"):
                System.out.println("tiene 31 dias");
                break;
            case ("octubre"):
                System.out.println("tiene 30 dias");
                break;
            case ("noviembre"):
                System.out.println("tiene 31 dias");
                break;
            case ("diciembre"):
                System.out.println("tiene 31 dias");
                break;
                
            default:
                System.out.println("no es un mes!!!");
      }
      
  }
  public static void Ejercicio24(){
      //Al ingresar una hora del día, informar: si está entre 
      //las 7 y las 11: "Es de mañana."
      String hora;
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Ingrese la hora: ");
      hora = entrada.next();
    
      switch(hora){
            case ("7"):
              System.out.println("Es de mañana");
              break;
            case ("8"):
              System.out.println("Es de mañana");
              break;
            case ("9"):
              System.out.println("Es de mañana");
              break;
            case ("10"):
              System.out.println("Es de mañana");
              break;
            case ("11"):
              System.out.println("Es de mañana");
              break;
            default : 
                System.out.println("No esta entra las 7 y 11");
        }            
    }
}  

