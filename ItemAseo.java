public class ItemAseo{
    private String iddescripcion = "ASEO: ";
    private String descripcion = "Artículo de aseo.";

    public ItemAseo() {

    }
    
    public String getDescripcion(){
        return this.iddescripcion + this.descripcion;
    }
}