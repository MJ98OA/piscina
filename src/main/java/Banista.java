public class Banista extends Thread {
    String nombre;
    boolean sucio=true;
    public Banista(String nombre){this.nombre=nombre;}

    @Override
    public void run() {
        Piscina.solicitarAcceso(this);
        System.out.println("El " + nombre + "ya se ha bañado Sucio es= "+ sucio);
    }
}
