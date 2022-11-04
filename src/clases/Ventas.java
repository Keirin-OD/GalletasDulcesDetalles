
package clases;

import java.util.ArrayList;
import java.util.Date;


public class Ventas {
    double ClienteID;
    double Monto;
    double Descuento;
    double IVA;
    String NumeroFactura;
    Date fecha;
    
    ArrayList<Ventas>ListaVentas = new ArrayList<>();

    public Ventas() {
    }

    public Ventas(double ClienteID, double Monto, double Descuento, double IVA, String NumeroFactura, Date fecha) {
        this.ClienteID = ClienteID;
        this.Monto = Monto;
        this.Descuento = Descuento;
        this.IVA = IVA;
        this.NumeroFactura = NumeroFactura;
        this.fecha = fecha;
    }

    public double getClienteID() {
        return ClienteID;
    }

    public void setClienteID(double ClienteID) {
        this.ClienteID = ClienteID;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public String getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(String NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Ventas> getListaVentas() {
        return ListaVentas;
    }

    public void setListaVentas(ArrayList<Ventas> ListaVentas) {
        this.ListaVentas = ListaVentas;
    }
    
    
    
}
