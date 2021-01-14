package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.paint.Color;


public class Auto {
    private SimpleStringProperty NIV;
    private SimpleStringProperty Placa;
    private SimpleStringProperty Pais;
    private SimpleStringProperty Marca;
    private SimpleStringProperty Modelo;
    private SimpleStringProperty Anio;
    private SimpleStringProperty Cilindrada;
    private SimpleStringProperty Transmision;
    private SimpleIntegerProperty Precio;
    private javafx.scene.paint.Color Color;
    public Auto(String niv,String placa, String pais,String marca, String modelo, String anio, String cilindrada, String transmision, int precio, Color color){
        NIV =new SimpleStringProperty(niv);
        Placa = new SimpleStringProperty(placa);
        Pais = new SimpleStringProperty(pais);
        Marca = new SimpleStringProperty(marca);
        Modelo = new SimpleStringProperty(modelo);
        Anio = new SimpleStringProperty(anio);
        Cilindrada = new SimpleStringProperty(cilindrada);
        Transmision = new SimpleStringProperty(transmision);
        Precio = new SimpleIntegerProperty(precio);
        Color = color;
    }

    public String getNIV() {
        return NIV.get();
    }

    public SimpleStringProperty NIVProperty() {
        return NIV;
    }

    public void setNIV(String NIV) {
        this.NIV.set(NIV);
    }

    public String getPlaca() {
        return Placa.get();
    }

    public SimpleStringProperty placaProperty() {
        return Placa;
    }

    public void setPlaca(String placa) {
        this.Placa.set(placa);
    }

    public String getPais() {
        return Pais.get();
    }

    public SimpleStringProperty paisProperty() {
        return Pais;
    }

    public void setPais(String pais) {
        this.Pais.set(pais);
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

    public String getCilindrada() {
        return Cilindrada.get();
    }

    public SimpleStringProperty cilindradaProperty() {
        return Cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.Cilindrada.set(cilindrada);
    }

    public String getTransmision() {
        return Transmision.get();
    }

    public SimpleStringProperty transmisionProperty() {
        return Transmision;
    }

    public void setTransmision(String transmision) {
        this.Transmision.set(transmision);
    }

    public int getPrecio() {
        return Precio.get();
    }

    public SimpleIntegerProperty precioProperty() {
        return Precio;
    }

    public void setPrecio(int precio) {
        this.Precio.set(precio);
    }

    public javafx.scene.paint.Color getColor() {
        return Color;
    }

    public void setColor(javafx.scene.paint.Color color) {
        Color = color;
    }
}
