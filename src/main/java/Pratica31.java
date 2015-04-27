
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Pratica31 {
    
    private static Date inicio;
    private static Date fim;
    private static String meuNome;
    private static GregorianCalendar dataNascimento;
    
    public static void main(String[] args) {
        
        inicio = new Date();
        
        meuNome = "aLlAn gEoVaNe sKaU";
        System.out.println(meuNome.toUpperCase());        
        
        System.out.println(meuNome.toUpperCase().charAt(14) + meuNome.substring(15, 18).toLowerCase() + ", "
                            + meuNome.toUpperCase().charAt(0) + ". " + meuNome.toUpperCase().charAt(6) + ".");
        
        dataNascimento = new GregorianCalendar(1987, Calendar.FEBRUARY, 17);
        GregorianCalendar dataAtual = new GregorianCalendar();
        System.out.println((dataAtual.getTimeInMillis() - dataNascimento.getTimeInMillis())/(24*60*60*1000));
        
        fim = new Date();
        
        System.out.println(fim.getTime() - inicio.getTime());
        
    }
}
