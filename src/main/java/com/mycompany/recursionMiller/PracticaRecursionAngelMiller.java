/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursionMiller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
public class PracticaRecursionAngelMiller {

    public static void main(String[] args) {
        List<String> ejemplo1 = new ArrayList<>();
        ejemplo1.add("reconocer");
        ejemplo1.add("perro");
        ejemplo1.add("palindromo");
        for(String ej:ejemplo1){
            if(esPalindromo(ej)){
                System.out.println("El string " +ej+ " es un palindromo");
            }else{
                System.out.println("El string " +ej+ " no es un palindromo");
            }
        }
        int base1=2, exp1 = 3;
        int base2 = 4, exp2 = 4;
        int base3 = 5 , exp3 = 5;
        System.out.println(base1 + " elevado a la " + exp1 + " es igual a " + potencia(base1,exp1));
        System.out.println(base2 + " elevado a la " + exp2 + " es igual a " + potencia(base2,exp2));
        System.out.println(base3 + " elevado a la " + exp3 + " es igual a " + potencia(base3,exp3));
        
        List<String> ejemplo3 = new ArrayList<>();
        ejemplo3.add("Hello");
        ejemplo3.add("Agua");
        ejemplo3.add("Palindromo");
        for(String ej:ejemplo3){
            System.out.println("'"+ ej + "' " + "invertido se lee: " + revertir(ej));
        }
        
    }
    static public boolean esPalindromo(String palabras){
       
        /*En esta funcion implemento incluso si lo que se ingresa no es una palabra sino toda una frase palindroma*/
        
        String palabra = palabras.replace(" ", "");
        //System.out.println(palabra);
        char letraInicial = palabra.charAt(0);
        char letraFinal =palabra.charAt(palabra.length()-1);
        if((palabra.length())%2!=0){
            if(palabra.length()>1){
                if(letraInicial == letraFinal){
                    //System.out.println("es igual");
                    String nuevaPalabra = palabra.substring(1, palabra.length()-1);
                    return esPalindromo(nuevaPalabra);
                }else{return false;}
            }
          
        }else{
            if(palabra.length()==2){
                /*if(letraInicial == letraFinal){
                    //System.out.println("es palindromo");
                    return true;
                }else{return false;}*/
            }
            
            
                if(letraInicial == letraFinal){
                       // System.out.println("es igual");
                        String nuevaPalabra = palabra.substring(1, palabra.length()-1);
                        return esPalindromo(nuevaPalabra);
                }else{return false;}
            
            }
            return true;
           
        }
    static int potencia(int base, int exponente){
        int resultado = 0;
        if(exponente<0){
            System.out.println("No se aceptan numeros negativos");
            return -1;
        }else if(exponente ==0){
            return 1;    
        }else{
            
            if(exponente ==1){
                resultado = base;
            }
            resultado = base * potencia(base, exponente-1) ;
            
            return resultado;
        }
        
        
    }
    
    static String revertir(String s){
        char letraInvertida;
        String palabraNueva;
      if(s.length()==1){
          return s;
      }  
      if(s.length()>0){
        letraInvertida = s.charAt(s.length()-1);
        palabraNueva = letraInvertida + revertir(s.substring(0,s.length()-1));
          
      return palabraNueva;
      }
      return null;
    }

       
   
}



