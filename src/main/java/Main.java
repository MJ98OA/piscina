public class Main {

    //piscina con aforo de 4 hilos
    //un hilo se queda un rato en la piscina tiempo aleatorio
    //cuando uno se va entra otro

    public static void main(String[] args){
        for (int i=0; i<10; i++){
            //devuelve el caracter que corresponde a string
            Banista b = new Banista(String.valueOf(i));
            b.start();
        }
    }

}
