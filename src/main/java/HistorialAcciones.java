import java.util.Stack;

public class HistorialAcciones {

    private Stack<String> historial;

    public HistorialAcciones() {
        historial = new Stack<>();
    }

    public boolean registrarAccion(String accion) {
        if (accion == null || accion.trim().isEmpty()){
        return false;
    }
        historial.push(accion.trim());
        return true;
    }

    public String obtenerUltimaAccion() {
        if(historial.isEmpty()){
        return "No tiene mas acciones";
    }
        return historial.peek();
    }

    public String deshacerAccion() {
        if(historial.isEmpty()){
            return "Nada de eliminar";
        }
        return historial.pop();
    }

    public int obtenerCantidadAcciones() {

        return historial.size();
    }

    public boolean estaVacio() {

        return historial.isEmpty();
    }

    public String mostrarHistorial() {
        if (historial.empty()){
        return "Historial vacio";
    }
        StringBuilder sb = new StringBuilder();
        for (int i = historial.size()-1 ; i>=0; i--){
            sb.append(historial.get(i));
            if(i>0){
                sb.append("\n");
            }
        }
        return sb.toString();

        }

    }

