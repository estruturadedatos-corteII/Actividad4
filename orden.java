import java.util.Comparator;

class ComparadorPrioridad implements Comparator<Cliente> {
    public int compare(Cliente a1, Cliente a2) {
        if (a1.tipo.equals("Urgente") && a2.tipo.equals("Normal")){
        return -1;
    }
    else if (a1.tipo.equals("Normal") && a2.tipo.equals("Urgente")){
        return 1;
    }
    else {
        if(a1.tiempoLlegada < a2.tiempoLlegada){
            return -1;
        } else{
            return 1;
        }
    }
}
}
