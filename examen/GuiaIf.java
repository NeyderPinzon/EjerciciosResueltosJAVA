package examen;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class GuiaIf {
    public static void Ejercicio13(){
        String color;
        String localidad;
        Scanner Miteclado = new Scanner(System.in);
        
        System.out.println("Ingrese un color: ");
        color = Miteclado.next();
        System.out.println("Ingrese una localidad: ");
        localidad = Miteclado.next();
        
        if(color.equals("rojo")){
            if (localidad.equals("avellaneda")){
                System.out.println("sos hincha de Independiente");
            }
            if (localidad.equals("lanus")){
                System.out.println("sos hincha de Independiente");
            }
        }
        
    }
    public static void Ejercicio14(){
        //Se pide el sexo y el nombre, si es “f” de femenino,
        //se muestra el mensaje” feliz dia XXXXX”, donde XXXX es el nombre
        String sexo, nombre;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su genero sexual: ");
        sexo = entrada.next();
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        if (sexo.equals("f")){
            System.out.println("Feliz dia "+nombre);
        }
    }
    public static void Ejercicio15(){
       String nombre, sexo, localidad;
        Scanner entrada = new Scanner(System.in);
      
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese su genero sexual: ");
        sexo = entrada.next();
        System.out.println("Ingrese su localidad: ");
        localidad = entrada.next();
        
        //if (nombre.equals("Jose")|| nombre.equals("Maria"))&& sexo.equals("m")&& localidad.equals("moron"){
            System.out.println("Sos de Moron");
        } 
    public static void Ejercicio16(){
        Integer edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        if (edad>17){
            System.out.println("mayor de edad");
        }else if (edad<13){
            System.out.println("es niño");
        }else{
            System.out.println("es adolecente");
    }
}   
    public static void Ejercicio17(){
        //se ingresa un importe, si supera los 100 pesos se  le suma un impuesto
        //del 23%, si no se les descuenta el 50%
        String DatoAux;
        Integer Importe;
        int suma;
        int resta;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su importe: ");
        DatoAux = entrada.next();
        Importe = Integer.parseInt(DatoAux);
        
        suma = Importe+ 23*100/100;
        if (Importe.equals ("100"));
        {System.out.println("El importe es menor que 100");
        }            
     
    }
    public static void Ejercicio18(){
        //Se pide una clave  y si coincide de muestra el mensaje “Bienvenido”  
        //de lo contrario mostrar el mensaje “clave incorrecta
        String Clave;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingrese su clave: ");
        Clave = entrada.next();
        
        // No olvidar utilizar el EQUALS para comprar la comparacion de texto
        if(Clave.equals("utn750")){
            System.out.println("Bienvenido");
        }else {
        System.out.println("Clave erronea");    
        }
    }
    public static void Ejercicio19(){
        //Se ingresa un importe del pasaje de avión y el mes de viaje, 
        //si el mes es enero, se les descuenta un 10% por temporada baja
        String mes;
        Double pasaje, total;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese pasaje de avion: ");
        pasaje = entrada.nextDouble();
        System.out.println("Ingrese el mes en el que desea viajar: ");
        mes = entrada.next();
        
        if (mes.equals("enero")){
            total = ((pasaje*0.10)-pasaje);
            System.out.println("el total de su vuelo es: "+total);
            }
        
    }
}

