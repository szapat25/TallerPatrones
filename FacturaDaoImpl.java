import java.util.*;

public class FacturaDaoImpl{
    List<Factura> facturas;

    public FacturaDaoImpl(){
        this.facturas = new ArrayList<Factura>();
    }

    public void addFactura(Factura factura){
        facturas.add(factura);
    }

    public void eliminarFactura(int nro){
        int pos = 0;
        for(Factura f : facturas){
            if(f.getNrofactura() == nro){
                facturas.remove(pos);
            }
            pos++;
        }
    }

    public Factura getFactura(int nro){
        return facturas.get(nro);
    }

    public List<Factura> getFacturas(){
        return this.facturas;
    }
}