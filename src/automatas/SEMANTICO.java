/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mark7
 */
public class SEMANTICO {
    static void cerrar(String linea, int pos) {
        
        if (PILA.pila.size() == 0) {
            ERRORES.lista.add(new ERRORES(7, 0, pos, ""));
            return;
        }
        
        PILA.pop(pos);
    }
    
    static void print(String linea, int pos) {
        Pattern pattern = Pattern.compile(Sintactico.PRINT);
        Matcher matcher = pattern.matcher(linea);
        
        String val = matcher.group("val").trim();
        
        // AQUI ME QUEDE
    }
    
    static boolean esIdentificador(String str) {
        return str.matches(Sintactico.IDENT);
    }
    
    static void estaEnLaTabla(String str) {
        boolean flag = false;
        
        for (VARIABLE e : TABLADESIMBOLOS.tabla) {
            // AQUI ME QUEDE
        }
    }
}
