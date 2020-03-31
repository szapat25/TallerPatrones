import java.util.*;

public class Datos{
    private List<Cliente> clientes;
    private List<Factura> facturas;
    private static Datos instance;

    public Datos() {
        this.clientes = new ArrayList<Cliente>();
        this.facturas = new ArrayList<Factura>();
    }

    public void addClienteDB(Cliente cl){
        this.clientes.add(cl);
    }

    public void addFacturaDB(Factura fa){
        this.facturas.add(fa);
    }

    public static Datos getInstance(){
        if(instance == null){
            instance = new Datos();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Data\nclientes = " + clientes + "\nfacturas = " + facturas;
    }
}