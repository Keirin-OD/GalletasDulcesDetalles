
package clases;

import java.util.ArrayList;


public class VentaDetalle {
    
    int NumeroFactura;
    String ProductoID;
    double Precio;
    int Cantidad;
    
    ArrayList<VentaDetalle>ListaVentaDetalle = new ArrayList<>();

    public VentaDetalle() {
    }

    public VentaDetalle(int NumeroFactura, String ProductoID, double Precio, int Cantidad) {
        this.NumeroFactura = NumeroFactura;
        this.ProductoID = ProductoID;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public int getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(int NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

    public String getProductoID() {
        return ProductoID;
    }

    public void setProductoID(String ProductoID) {
        this.ProductoID = ProductoID;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public ArrayList<VentaDetalle> getListaVentaDetalle() {
        return ListaVentaDetalle;
    }

    public void setListaVentaDetalle(ArrayList<VentaDetalle> ListaVentaDetalle) {
        this.ListaVentaDetalle = ListaVentaDetalle;
    }
    
    
    
}
