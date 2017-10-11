package ejemplowhile;

import java.util.Scanner;

public class TomarDatos {
    public static void PrimosDelUnoAlCien(){
        Integer numeroIngresado=1;
        while(numeroIngresado<101){
            
            numeroIngresado++;
            Integer contador =2;
            Integer contadorDiv=0;

            while (contador<numeroIngresado){

                if (numeroIngresado%contador==0){
                    contadorDiv++;
                    break;
                }
                contador++;
            }
            if (contadorDiv>0){
                //System.out.println("No es Primo");
            }else{
                System.out.println("Es Primo el numero: "+numeroIngresado);
            }
        }
    }   

    public static void NumeroPrimo(){
        
        
        Integer numeroIngresado=17;
        Integer contador =2;
        Integer contadorDiv=0;
        
        while (contador<numeroIngresado){
            
            if (numeroIngresado%contador==0){
                contadorDiv++;
                break;
            }
            contador++;
        }
        if (contadorDiv>0){
            System.out.println("No es Primo");
        }else{
            System.out.println("Es Primo");
        }
    }
    public static void ContadoresyAcumuladores(){
        Integer contador =0;
        Integer acumulador =0;
        Integer multiplicador=1;
        Integer restador =0;
        Integer contadorPares=0;
        Integer contadorDiv3=0;
        
        while (contador<10){
            contador++;
            System.out.println("Numero: "+contador);
            acumulador = acumulador+contador;
            multiplicador = multiplicador*contador;
            restador = restador-contador;
            if(contador%2==0){
                contadorPares++;
            }
            if(contador%3==0){
                contadorDiv3++;
            }
        }
        System.out.println("la suma: "+acumulador);
        System.out.println("la multiplicacion: "+multiplicador);
        System.out.println("la resta: "+restador);
        System.out.println("los pareas: "+contadorPares);
        System.out.println("los divisores de 3 son: "+contadorDiv3); 
    } 
    public static void TomarDatosValidados(){
        /**Pide los datos de una persona y valida cada uno
    *daots a pedir:
    * Nombre
    * Edad (1-100)
    * Sexo (F o M)
    * Estado civil:(S-C-D-V)
    * Nacionalidad: (N,L,E,R)
    * Sueldo (8000-58000)
    * Dona organos (Si o No)
    */ 
        Scanner entrada = new Scanner(System.in);
        
        String aux;
        String nombre;
        Integer edad;
        String sexo;
        String estadoCivil;
        String nacionalidad;
        Integer sueldo;
        String organos;
        String clave;
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        
        System.out.println("Ingrese su edad: ");
        aux = entrada.next();
        edad = Integer.parseInt(aux);
        
        while (edad<1 || edad>100){
            System.out.println("Ingrese una edad valida: ");
            aux = entrada.next();
            edad = Integer.parseInt(aux);            
        }
        
        System.out.println("Ingrese su sexo: ");
        sexo = entrada.next();
        
        while (!sexo.equals("m")&&!sexo.equals("f")){
            System.out.println("Ingrese una seña valida: ");
            sexo = entrada.next();
        }   
        
        System.out.println("Ingrese su estado civil: ");
        estadoCivil = entrada.next();//Estado civil:(S-C-D-V)
        
        while (!estadoCivil.equals("s")&&!estadoCivil.equalsIgnoreCase("c")&&!estadoCivil.equalsIgnoreCase("d")&&!estadoCivil.equalsIgnoreCase("v")){
            System.out.println("Ingrese un estado civil valido: ");
            estadoCivil = entrada.next();
        }
        
        System.out.println("Ingrese su nacionalidad: ");
        nacionalidad = entrada.next();//Nacionalidad: (N,L,E,R)
        
        while (!nacionalidad.equalsIgnoreCase("n")&&!nacionalidad.equalsIgnoreCase("l")&&!nacionalidad.equalsIgnoreCase("e")&&!nacionalidad.equalsIgnoreCase("r")){
            System.out.println("Ingrese una nacionalidad valida: ");
            nacionalidad = entrada.next();
        }
        
        System.out.println("Ingrese su sueldo: ");
        aux = entrada.next();
        sueldo = Integer.parseInt(aux);
        
        while (sueldo<8000||sueldo>58000){
            System.out.println("Ingrese su sueldo: ");
            aux = entrada.next();
            sueldo = Integer.parseInt(aux);
        }
        
        System.out.println("Es donador de organos: ");
        organos = entrada.next();
        while (!organos.equalsIgnoreCase("Si")&&!organos.equalsIgnoreCase("No")){
            System.out.println("Los datos no fueron leidos, reingrese: ");
            organos = entrada.next();
           
        }
        
        System.out.println("Ingrese una Clave: ");
        clave = entrada.next();
        while (clave.length()<6){
            System.out.println("Clave muy corta!!!, reingrese: ");
            clave = entrada.next(); 
        }
        
    }
}


