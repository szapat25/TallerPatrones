public class ItemComida{
    private String iddescripcion = "COMIDA: ";
    private String descripcion = "Artículo de comida.";

    public ItemComida() {

    }
    
    public String getDescripcion(){
        return this.iddescripcion + this.descripcion;
    }
}