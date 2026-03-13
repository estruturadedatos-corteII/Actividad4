import java.util.Comparator;

class ComparadorPrioridad implements Comparator<Cliente> {
    public int compare(Cliente a1, Cliente a2) {
        if (a1.tipo.equals("urgente") && a2.tipo.equals("normal")){
        return -1;
    }
    else if (a1.tipo.equals("normal") && a2.tipo.equals("urgente")){
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
