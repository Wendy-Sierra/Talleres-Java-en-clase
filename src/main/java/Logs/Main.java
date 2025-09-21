import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Clase7.Main.class.getName());

    public static void main(String[] args) {
        log.info("Esto es una prueba de log");
        System.out.println("Esto es un system");

        try {
           int resultado = dividir(10,1);
           log.info("Esto es el resultado " +resultado);
        }catch (Exception e){
            log.log(Level.SEVERE, "ERROR AL DIVIDIR" +e.getCause());
        }

        //Datos Fecha

        System.out.println(new Date());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(Calendar.getInstance());

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.minusDays(15));

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(format));

        }
    private static int dividir(int num1, int num2){
        return num1/num2;
    }
}