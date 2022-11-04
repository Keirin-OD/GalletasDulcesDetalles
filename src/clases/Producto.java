
package clases;

import java.util.ArrayList;


public class Producto {
    
    String Codigo;
    String Nombre;
    double Precio;
    int Existencia;

static public ArrayList<Producto> ListaProducto = new ArrayList<>();    

    public Producto() {
    }

    public Producto(String Codigo, String Nombre, double Precio, int Existencia) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Existencia = Existencia;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public static ArrayList<Producto> getListaProducto() {
        return ListaProducto;
    }

    public static void setListaProducto(ArrayList<Producto> ListaProducto) {
        Producto.ListaProducto = ListaProducto;
    }
    
    
    
    
    
    
}
