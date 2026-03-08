
class Cliente {
    int id;
    String tipo;
    int tiempoLlegada;
    int tiempoAtencion;

    public Cliente(int id, String tipo, int tiempoLlegada, int tiempoAtencion) {
        this.id = id;
        this.tipo = tipo;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoAtencion = tiempoAtencion;
    }
}

class Nodo {
    Cliente dato;
    Nodo siguiente;

    public Nodo(Cliente cliente) {
        this.dato = cliente;
        this.siguiente = null;
    }
}

class colaManual {
    Nodo frente;
    Nodo fin;

    public boolean isEmpty() {
        return frente == null;
    }

    public void encolar(Cliente a) {
        Nodo nuevo = new Nodo(a);
        if (isEmpty()) {
            frente = nuevo;
            fin = nuevo;
        } else { 
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Cliente desencolar() {
        if (isEmpty()){
            return null;
        }
        Cliente atendido = frente.dato;
        frente = frente.siguiente;
        
        if( frente == null){
            fin = null;
        }
        return atendido;
    }
}

