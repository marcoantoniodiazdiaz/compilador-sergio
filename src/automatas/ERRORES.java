/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author mark7
 */
public class ERRORES {
    
    static HashMap<Integer, String> codes = new HashMap<>();
    static List<ERRORES> lista = new ArrayList<>();
    
    int code;
    int column;
    int line;
    String description;
    
    ERRORES() {
        codes.put(1, "TOKEN INVALIDO");
        codes.put(2, "NO EN EL LENGUAJE");
        codes.put(3, "LA LINEA NO ES CORRECTA");
        codes.put(4, "IDENTIFICADOR INVALIDO");
        codes.put(4, "VARIABLE YA DEFINIDA");
        codes.put(5, "YA NO ESTA DEFINIDA");
        codes.put(6, "VARIABLES INCOMPATIBLES");
        codes.put(7, "CERRADO INCORRECTO");
        codes.put(8, "CONSTANTE INVALIDA");
        codes.put(9, "TOKEN INVALIDO");
        codes.put(10, "ELEMENTOS INCOMPARABLES");
        codes.put(11, "OPERACION ARITMETICA INVALIDA");
    }
    
    ERRORES(int code, int column, int line, String description) {
        this.code = code;
        this.column = column;
        this.line = line;
        this.description = description;
    }
    
    static String getError(int code) {
        return codes.get(code);
    }
}
