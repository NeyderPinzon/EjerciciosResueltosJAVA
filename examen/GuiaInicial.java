package examen;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class GuiaInicial {
    public static void saludar() {
        // TODO code application logic here
        //public: cualquiera la puede ver
        //static: estaticco
        //void: no retorna ningun valor
        
        System.out.println("Buenas tardes"); 
        
    }
    public static void Ejercicio1(){
        System.out.println("Esto funciona de maravilla");
    }
    public static void Ejercicio2(){
        String nombre;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
    }
    public static void Ejercicio3(){
        String nombre;
        String apellido;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.next();
        
        System.out.println("Su nomnbre es: "+nombre);
        System.out.println("y su apellido es: "+apellido);
        
    }
    public static void Ejercicio4(){
        Integer edad;
        String nombre;
        String Dato;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese su edad: ");
        Dato = entrada.next();
        edad = Integer.parseInt(Dato);
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        
        System.out.println("Usted se llama: "+nombre);
        System.out.println("y su edad es: "+edad);
        
        
    }
    public static void Ejercicio5(){
        Integer num1, num2, resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        
        resultado = num1+num2;
        
        System.out.println("la suma de los numero es: "+resultado);
     
    }
    public static void Ejercicio6(){ 
     // se piden tres numero y se debe informar el promedio
     Integer num1, num2,num3, Promedio;
     Scanner entrada = new Scanner(System.in);
     
        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num3 = entrada.nextInt();
        
        Promedio = (num1+num2+num3)/3;
        
        System.out.println("El numero promedio es : "+Promedio);       
                
    }
    public static void Ejercicio7(){
        //se pide la base de un cuadrado y se informa el perimetro
        Double lado, perimetro;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el lado de su cuadrado: ");
        lado = entrada.nextDouble();
        
        perimetro = lado*4;
        
        System.out.println("El perimetro de su cuadrado es: "+perimetro);
    }
    public static void Ejercicio8(){
        // se pide el largo y el ancho de un terreno y se da la superficie del mismo
        Double largo, ancho, superficie;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el largo del terreno: ");
        largo = entrada.nextDouble();
        System.out.println("Ingrese el ancho del terreno: ");
        ancho = entrada.nextDouble();
        superficie = largo*ancho;
        System.out.println("la superficie del terreno es : "+ superficie);
    }
    public static void Ejercicio9(){
        //se ingresa un producto y el precio del producto y se informa el total a pagar
        String datoAux;
        Integer cantidad;
        Double Precio;
        Double precioTotal;
        
        Scanner entradaPorTeclado = new Scanner(System.in);
        System.out.println("ingrese la cantidad de prendas de vestir que desea llevar: ");
        datoAux = entradaPorTeclado.next();
        cantidad = Integer.parseInt(datoAux);
        
        
        System.out.println("Ingrese el precio por unidad de cada prenda: ");
        datoAux = entradaPorTeclado.next();
        Precio = Double.parseDouble(datoAux);
        
        precioTotal = cantidad*Precio;
        System.out.println("el precio de la cantidad de prendas es: "+ precioTotal);
        
        
    }
    public static void Ejercicio10(){
        //se ingresa la cantidad de ganadores de la loteria nacional y el monto 
        //total del premio, informar cuanto dnero le corresponde a cada uno
        String DatoAux;
        Integer montoTotal;
        Double porUno;
        Double total;
        Scanner entradaPorTeclado = new Scanner(System.in);
        
        System.out.println("Total de Ganadores: ");
        DatoAux = entradaPorTeclado.next();
        montoTotal = Integer.parseInt(DatoAux);
        
        System.out.println("Dinero total Ganado: ");
        DatoAux = entradaPorTeclado.next();
        porUno = Double.parseDouble(DatoAux);
        
        total= porUno/montoTotal;
        System.out.println("A cada Ganador le corresponde: " + total);
    }
    public static void Ejercicio11(){
        //Se ingresa el importe de un producto importado y se le debe agregar el 35% 
        //de impuestos internos
        String DatoAux;
        Integer valor;
        int Porcentaje;
        Scanner entradaPorTeclado = new Scanner(System.in);
        
        System.out.println("Importe del producto : ");
        DatoAux = entradaPorTeclado.next();
        valor = Integer.parseInt(DatoAux);
        Porcentaje = valor* 35/ 100 ;
        System.out.println("Impuestos: "+ Porcentaje);
    }
    public static void Ejercicio12(){
     //se pide el valor de la hora de un trabajador y la cantidad de horas 
     //trabajadas informar cuanto e corresponde de sueldo, restandole el 15%
     //de impuestos internos
     Double ValorHora, tiempo, total, impuestos;
     Scanner entrada = new Scanner(System.in);
     
        System.out.println("Ingrese valor por hora: ");
        ValorHora = entrada.nextDouble();
        System.out.println("Ingrese las horas trabajadas:  ");
        tiempo = entrada.nextDouble();
        
        total = ValorHora*tiempo;
        System.out.println("Su sueldo mensual es: "+total);
        impuestos = total*0.35;
        System.out.println("Su sueldo neto restando impuestos es: "+impuestos);
    }
    
}  
