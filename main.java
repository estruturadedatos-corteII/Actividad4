import java.util.Random;

public static void main(String[] args) {
    colaManual filaNormal = new colaManual();

    PriorityQueue<Cliente> filaVip = new PriorityQueue<>(new ComparadorPrioridad());

    int totalEspera = 0;

    int atendidos = 0;

    Random dado = new Random();
    int idActual = 1;
    int cajero1 = 0;

    for (int segundo = 1; segundo <= 360; segundo++) {
        int numeroAletorio = dado.nextInt(100);

        if (numeroAletorio < 5) {
            int dadoTipo = dado.nextInt(100);
            String tipoFinal;
            if (dadoTipo < 20) {
                tipoFinal = "urgente";
            } else {
                tipoFinal = "normal";
            }
            int tiempoAtencion = 5 + dado.nextInt(11);

            Cliente nuevo = new Cliente(idActual, tipoFinal, segundo, tiempoAtencion);
            idActual++;

            System.out.println("Segundo " + segundo + ": ¡Entró un cliente!");

            if (tipoFinal.equals("urgente")) {
                filaVip.add(nuevo);
            } else {
                filaNormal.encolar(nuevo);
            }
        }
        // esta libre el cajero?
        if (cajero1 == 0) {
            Cliente atendido = null;

            if (!filaVip.isEmpty()) {
                atendido = filaVip.poll(); // Saca al VIP
            } else if (!filaNormal.isEmpty()) {
                atendido = filaNormal.desencolar(); // Saca al Normal
            }

            if (atendido != null) { 
                System.out.println(">>> ¡Cajero atendiendo al cliente " + atendido.id + "!");
                totalEspera += (segundo - atendido.tiempoLlegada);
                atendidos++;
                cajero1 = atendido.tiempoAtencion; // El cajero ahora está ocupado
            }
        }
        if (cajero1 > 0) {
        cajero1--; 
    }
    }
    if (atendidos > 0) {
        // Usamos (double) para que salgan decimales, tipo "2.5 segundos"
        double promedio = (double) totalEspera / atendidos;
        System.out.println("El promedio de espera fue: " + promedio + " segundos.");
    } else {
        System.out.println("No se atendió a nadie.");
    }

}
