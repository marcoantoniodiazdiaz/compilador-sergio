/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;

/**
 *
 * @author mark7
 */
public class Sintactico {
    
    public static String DIG = "[\\d]+";
    public static String GUION = "(-|_)";
    public static String IDENT = "[a-zA-Z_][a-zA-Z0-9_]*";
    public static String TIPO = "(int|double|txt|boolean)";
    public static String INIT = "" + TIPO + "\\s+" + IDENT + "\\s+;";
    public static String CONST_INT = "[0-9]+";
    public static String CONST_BOOLEAN = "(true|false)";
    public static String CONST_TXT = "\".*\"";
    public static String CONST_DOUBLE = "" + CONST_INT + "\\." + CONST_INT;
    public static String CONST = "(" + CONST_BOOLEAN + "|" + CONST_DOUBLE + "|" + CONST_INT + "|" + CONST_TXT + ")";
    public static String OPER = "(" + IDENT + "|" + CONST + ")";
    public static String ARIT = "(\\+|\\-|\\*|\\/|\\^)";
    public static String REL = "(<|>|<=|>=|==|<>)";
    public static String ESTRUC = "(if|else|frciclo|whciclo|main)";
    public static String COND = "" + OPER + "\\s+" + REL + "\\s+" + OPER;
    public static String IF = "^(?<s>if)\\s+\\(\\s+" + COND + "\\s+\\)\\s+\\{$";
    public static String ELSE = "^}\\s+else\\s+{$";
    public static String FRCICLO = "^frciclo\\s+\\(\\s+" + IDENT + "\\s+;\\s+" + COND + "\\s+;\\s+" + IDENT + "\\+\\+\\s+\\)\\s+\\{$";
    public static String WHCICLO = "whciclo\\s+\\(\\s+" + COND + "\\s+\\)\\s+\\{";
    public static String ASIGN = "" + IDENT + "\\s+=\\s+(\\s+"+ OPER +"|" + OPER + "\\s+" + ARIT + "\\s+" + OPER + "\\s+);";
    public static String SCAN = "scan\\s+\\(\\s+" + IDENT + "\\s+\\)\\s+;";
    public static String PRINT = "print\\s+\\(\\s+(?<val>(" + IDENT + "|" + CONST + "))\\s+\\)\\s+;";
    public static String CLOSE = "}";

    public void run() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("C:\\Users\\mark7\\Documents\\NetBeansProjects\\AUTOMATAS\\src\\automatas\\programa.srg");
            
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            // Lectura del fichero
            String linea;
            int line = 1;
            while ((linea = br.readLine()) != null) {
                if (linea.matches(IF)) {
                    System.out.println("Estructura if detectada");
                } else if (linea.matches(FRCICLO)) {
                    System.out.println("Estructura frciclo detectada");
                } else if (linea.matches(WHCICLO)) {
                    System.out.println("Estructura whciclo detectada");
                } else if (linea.matches(PRINT)) {
                    System.out.println("Estructura print detectada");
                } else if (linea.matches(SCAN)) {
                    System.out.println("Estructura scan detectada");
                } else if (linea.matches(INIT)) {
                    System.out.println("Declaracion de variable");
                } else if (linea.matches(ASIGN)) {
                    System.out.println("Asignacion de variable");
                } else {
                    System.err.println("Linea desconocida: " + line);
                }
                
                line ++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
