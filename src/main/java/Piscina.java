import java.util.Random;
import java.util.concurrent.Semaphore;

public class Piscina {
    //tendremos que crear la clase semaforo
    private static final int NUM_ACCESO_SIMULTANEOS=4;
    //true dejara pasar a la persona que llegara primero false que dejara pasar a uno cualquiera
    static Semaphore semaphore =new Semaphore(NUM_ACCESO_SIMULTANEOS,false);

    static void  solicitarAcceso(Banista banista){
        System.out.println("El "+ banista.nombre +"Quiere entrar");
        //en el momento que hacemos el adquire tomara los hilos y dejara a los demas esperando
        try {
            //en este caso si por ejemplo un banista fuese con su hijo en acquire pondremos 2 para que cogiese 2 tickets hilos
            semaphore.acquire();
            banarse(banista);
            semaphore.release();
        }catch (InterruptedException e){

        }
    }

    private static void banarse(Banista banista){
       System.out.println("Comieza el baño el bañista: ");
       try{
           Thread.sleep(new Random().nextInt(4)+1*(1000));
       } catch (InterruptedException e){
           e.printStackTrace();
       }
       banista.sucio=true;
       System.out.println("Finaliza el baño el banista" +banista.nombre);
    }

}
