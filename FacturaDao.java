import java.util.*;

public interface FacturaDao{
    public void addFactura(Factura factura);
    public void eliminarFactura(int nro);
    public List<Item> getItems();
}