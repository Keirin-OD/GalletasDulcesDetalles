
package clases;

import java.util.ArrayList;


public class Cliente {
    
    String Nombre;
    String ClienteID;
    int NumTelefono;
    String Direccion;
    
    ArrayList<Cliente>ListaCliente = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String Nombre, String ClienteID, int NumTelefono, String Direccion) {
        this.Nombre = Nombre;
        this.ClienteID = ClienteID;
        this.NumTelefono = NumTelefono;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getClienteID() {
        return ClienteID;
    }

    public void setClienteID(String ClienteID) {
        this.ClienteID = ClienteID;
    }

    public int getNumTelefono() {
        return NumTelefono;
    }

    public void setNumTelefono(int NumTelefono) {
        this.NumTelefono = NumTelefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Cliente> getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> ListaCliente) {
        this.ListaCliente = ListaCliente;
    }
    
    
    
}
