package examen;

import java.util.Scanner;

public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer opcion;
        Scanner miEntrada = new Scanner(System.in);
        
        System.out.println("Que Ejercicio quiere probar???");
        String Dato = miEntrada.next();
        opcion = Integer.parseInt(Dato);
        
        
        switch(opcion){
        
            case 1: 
                GuiaInicial.saludar();
                break;
            case 2:
                GuiaInicial.Ejercicio1();
                break;
            case 3:
                GuiaInicial.Ejercicio2();
                break;
            case 4:
                GuiaInicial.Ejercicio3(); 
                break;
            case 5:
                GuiaInicial.Ejercicio4();
                break;
            case 6:
                GuiaInicial.Ejercicio5();
                break;
            case 7:
                GuiaInicial.Ejercicio6();
                break;
            case 8:
                GuiaInicial.Ejercicio7();
                break;
            case 9:
                GuiaInicial.Ejercicio8();
                break;
            case 10:
                GuiaInicial.Ejercicio9();
            case 11:
                GuiaInicial.Ejercicio10();
                break;
            case 12:
                GuiaInicial.Ejercicio11();
                break;
            case 13:
                GuiaInicial.Ejercicio12();
                break;
            case 14:
                GuiaIf.Ejercicio13();
                break;
            case 15:
                GuiaIf.Ejercicio14();
                break;
            case 16:
                GuiaIf.Ejercicio15();
                break;
            case 17:
                GuiaIf.Ejercicio16();
                break;
            case 18:
                GuiaIf.Ejercicio17();
                break;
            case 19:
                GuiaIf.Ejercicio18();
                break;
            case 20:
                GuiaIf.Ejercicio19();
                break;
            case 21:
                GuisSwitch.Ejercicio20();
                break;
            case 22:
                GuisSwitch.Ejercicio21();
                break;
            case 23:
                GuisSwitch.Ejercicio22();
                break;
            case 24:
                GuisSwitch.Ejercicio23();
                break;
            case 25:
                GuisSwitch.Ejercicio24();
                break;
                
        }
    }
}
    
    

