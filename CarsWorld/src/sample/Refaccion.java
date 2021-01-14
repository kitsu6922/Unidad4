package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Refaccion {
    private SimpleStringProperty Codigo;
    private SimpleStringProperty T_Producto;
    private SimpleStringProperty M_Producto;
    private SimpleStringProperty Datos;
    private SimpleStringProperty Descripcion;
    private SimpleDoubleProperty Cantidad;
    private SimpleDoubleProperty Precio;

    public Refaccion(String codigo, String t_Producto, String m_Producto, String datos, String descripcion, double cantidad, double precio) {
        Codigo = new SimpleStringProperty(codigo);
        T_Producto = new SimpleStringProperty(t_Producto);
        M_Producto = new SimpleStringProperty(m_Producto);
        Datos = new SimpleStringProperty(datos);
        Descripcion = new SimpleStringProperty(descripcion);
        Cantidad = new SimpleDoubleProperty(cantidad);
        Precio = new SimpleDoubleProperty(precio);
    }

    public String getCodigo() {
        return Codigo.get();
    }

    public SimpleStringProperty codigoProperty() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        this.Codigo.set(codigo);
    }

    public String getT_Producto() {
        return T_Producto.get();
    }

    public SimpleStringProperty t_ProductoProperty() {
        return T_Producto;
    }

    public void setT_Producto(String t_Producto) {
        this.T_Producto.set(t_Producto);
    }

    public String getM_Producto() {
        return M_Producto.get();
    }

    public SimpleStringProperty m_ProductoProperty() {
        return M_Producto;
    }

    public void setM_Producto(String m_Producto) {
        this.M_Producto.set(m_Producto);
    }

    public String getDatos() {
        return Datos.get();
    }

    public SimpleStringProperty datosProperty() {
        return Datos;
    }

    public void setDatos(String datos) {
        this.Datos.set(datos);
    }

    public String getDescripcion() {
        return Descripcion.get();
    }

    public SimpleStringProperty descripcionProperty() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion.set(descripcion);
    }

    public double getCantidad() {
        return Cantidad.get();
    }

    public SimpleDoubleProperty cantidadProperty() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        this.Cantidad.set(cantidad);
    }

    public double getPrecio() {
        return Precio.get();
    }

    public SimpleDoubleProperty precioProperty() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio.set(precio);
    }
}
