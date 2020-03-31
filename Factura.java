import java.util.*;

public class Factura{
    private int nrofactura;
    private String fechafactura;
    private Cliente cliente;
    private int totalfactura;
    private String estado;
    private List<Item> items;

    public Factura(int nrofactura, String fechafactura, Cliente cliente, int totalfactura, String estado,
            List<Item> items) {
        this.nrofactura = nrofactura;
        this.fechafactura = fechafactura;
        this.cliente = cliente;
        this.totalfactura = totalfactura;
        this.estado = estado;
        this.items = items;
    }

    public int getNrofactura() {
        return nrofactura;
    }

    public void setNrofactura(int nrofactura) {
        this.nrofactura = nrofactura;
    }

    public String getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(String fechafactura) {
        this.fechafactura = fechafactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getTotalfactura() {
        return totalfactura;
    }

    public void setTotalfactura(int totalfactura) {
        this.totalfactura = totalfactura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        String listaitems = "";
        for(Item it : items){
            listaitems = listaitems + it.getTipoItem() + " | " + it.getDescripcion() + " | " + String.valueOf(it.getValorunitario()) + "\n";
        }
        return "Factura nro. " + nrofactura + "\nCliente: " + cliente.getNombre() + " " + cliente.getApellidos() +
               "\nFecha factura: " + fechafactura + "\nItems\n" + listaitems + "Total factura: " + totalfactura;
    }
}