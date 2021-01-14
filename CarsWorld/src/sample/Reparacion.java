package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.paint.Color;

public class Reparacion {
    private SimpleIntegerProperty ID;
    private SimpleStringProperty Marca;
    private SimpleStringProperty Modelo;
    private SimpleStringProperty Anio;
    private SimpleStringProperty Matricula;
    private SimpleStringProperty Tipo_Vehiculo;
    private SimpleStringProperty Tipo_Falla;
    private SimpleStringProperty Descripcion;
    private Color Color;
    private Cliente Cliente;
    private SimpleIntegerProperty Pago;

    public Reparacion(int id, String marca, String modelo, String anio, String matricula, String tipo_Vehiculo, String tipo_Falla, String descripcion, Color color, Cliente cliente, int pago) {
        ID = new SimpleIntegerProperty(id);
        Marca =new SimpleStringProperty(marca);
        Modelo =new SimpleStringProperty(modelo);
        Anio =new SimpleStringProperty(anio);
        Matricula =new SimpleStringProperty(matricula);
        Tipo_Vehiculo =new SimpleStringProperty(tipo_Vehiculo);
        Tipo_Falla =new SimpleStringProperty(tipo_Falla);
        Descripcion =new SimpleStringProperty(descripcion);
        Color = color;
        Cliente = cliente;
        Pago =new SimpleIntegerProperty(pago);
    }

    public int getID() {
        return ID.get();
    }

    public SimpleIntegerProperty IDProperty() {
        return ID;
    }

    public void setID(int ID) {
        this.ID.set(ID);
    }

    public String getMarca() {
        return Marca.get();
    }

    public SimpleStringProperty marcaProperty() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca.set(marca);
    }

    public String getModelo() {
        return Modelo.get();
    }

    public SimpleStringProperty modeloProperty() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo.set(modelo);
    }

    public String getAnio() {
        return Anio.get();
    }

    public SimpleStringProperty anioProperty() {
        return Anio;
    }

    public void setAnio(String anio) {
        this.Anio.set(anio);
    }

    public String getMatricula() {
        return Matricula.get();
    }

    public SimpleStringProperty matriculaProperty() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        this.Matricula.set(matricula);
    }

    public String getTipo_Vehiculo() {
        return Tipo_Vehiculo.get();
    }

    public SimpleStringProperty tipo_VehiculoProperty() {
        return Tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String tipo_Vehiculo) {
        this.Tipo_Vehiculo.set(tipo_Vehiculo);
    }

    public String getTipo_Falla() {
        return Tipo_Falla.get();
    }

    public SimpleStringProperty tipo_FallaProperty() {
        return Tipo_Falla;
    }

    public void setTipo_Falla(String tipo_Falla) {
        this.Tipo_Falla.set(tipo_Falla);
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

    public javafx.scene.paint.Color getColor() {
        return Color;
    }

    public void setColor(javafx.scene.paint.Color color) {
        Color = color;
    }

    public sample.Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(sample.Cliente cliente) {
        Cliente = cliente;
    }

    public int getPago() {
        return Pago.get();
    }

    public SimpleIntegerProperty pagoProperty() {
        return Pago;
    }

    public void setPago(int pago) {
        this.Pago.set(pago);
    }
}
