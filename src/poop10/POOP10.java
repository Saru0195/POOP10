/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 *
 * @author Sarahi
 * Se crea la clase POOP10 Donde veremos varios ejemplos de excepciones 
 */
public class POOP10 {

    /**
     * @param args Se generan varias actividades las cuales nos muestran las utilizaciones de las excepciones 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * En la actividad 1 Se crea una lista con un apuntador de más en el cual creamos un apuntador de más
         * por lo cual se crea una excepcion
         */
        System.out.println("1******************");
        try{
            String mensajes[] = {"Antonio","Javier","Gabriela"};
            for (int i = 0; i < 4; i++) {
                System.out.println(mensajes[i]);
        }
    }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: apuntador fuera de rango");
    }
        System.out.println("2****************************+");
        
        try{
            float equis = 5/5;
            System.out.println("Equis ="+equis);
    }catch(ArithmeticException ae){
            System.out.println("Error: division entre cero");
    }finally{
            System.out.println("A pesar de todo , se ejecuta finally");
        }
    System.out.println("Fuera de try-catch");
        
    System.out.println("3**********************");
    try{
        float equis = 5/0;
        System.out.println("Equis ="+equis);
    }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: apuntador fuera de rango");
    }catch(ArithmeticException ae){
        System.out.println("Error: division entre cero");
    }catch(Exception e){
        System.out.println("Exception general");
    }finally{
        System.out.println("A pesar de todo , se ejecuta finally");
    }
    System.out.println("4******************************");
    //Propagacion de exceptions
    try{
        int division = division(8,0);
        System.out.println("Division = "+division);
    }catch(ArithmeticException ae){
        System.out.println("Error: division entre cero");
        //e.printStackTrace();
    }
    /*int division = division(8,0);
        System.out.println("Division = "+division);*/
        System.out.println("5************************");
        try{
        int division = division2(8,0);
        System.out.println("Division = "+division);
    }catch(ArithmeticException ae){
        System.out.println("Error: division entre cero");
        //e.printStackTrace();
        }
    }
    /**
     * 
     * @param a Es el numero a dividir
     * @param b Es el numero en el que se dividira
     * @return Se regresa el resultado de la division
     * @throws ArithmeticException Es la excepcion de la division entre cero
     */
    public static int division(int a,int b)throws ArithmeticException{
        int c;
        /*try{
            c = a/b;
        }catch(ArithmeticException ae){
            System.out.println("Exception aritmetica");
            c=0;
        }*/
        c=a/b;
        return c;
    }
    /**
     * 
     * @param a Es el numero a dividir
     * @param b Es el numero en el que se dividira
     * @return Se regresa el resultado de la division
     * @throws ArithmeticException Es la excepcion de la division entre cero
     */
    public static int division2(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }int c = a/b;
        return c;
    }
}
