
package clases;

import java.util.ArrayList;


public class TipoProducto {
    String TipoProductoID;
    String Nombre;
    String Descripcion;
    
    static public ArrayList<TipoProducto>ListaTipoProducto = new ArrayList<>();

    public TipoProducto() {
    }

    public TipoProducto(String TipoProductoID, String Nombre, String Descripcion) {
        this.TipoProductoID = TipoProductoID;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public String getTipoProductoID() {
        return TipoProductoID;
    }

    public void setTipoProductoID(String TipoProductoID) {
        this.TipoProductoID = TipoProductoID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public static ArrayList<TipoProducto> getListaTipoProducto() {
        return ListaTipoProducto;
    }

    public static void setListaTipoProducto(ArrayList<TipoProducto> ListaTipoProducto) {
        TipoProducto.ListaTipoProducto = ListaTipoProducto;
    }
    
    
    
    
    
    
}
