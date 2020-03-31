public class Item{
    private String tipoItem;
    private String id;
    private String descripcion;
    private int valorunitario;

    public Item(String tipoItem, String id, String descripcion, int valorunitario) {
        this.tipoItem = tipoItem;
        this.id = id;
        this.descripcion = descripcion;
        this.valorunitario = valorunitario;
    }
    
    @Override
    public String toString() {
        return "Item [descripcion=" + descripcion + ", id=" + id + ", tipoItem=" + tipoItem + ", valorunitario="
                + valorunitario + "]";
    }

    public int getValorunitario(){
        return this.valorunitario;
    }

    public String getId() {
        return id;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}