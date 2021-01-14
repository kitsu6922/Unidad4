package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Cliente {
    private SimpleIntegerProperty ID;
    private SimpleStringProperty Nombres;
    private SimpleStringProperty Apellido_P;
    private SimpleStringProperty Apellido_M;
    private SimpleStringProperty Sexo;
    private SimpleStringProperty Telefono1;
    private SimpleStringProperty Telefono2;
    private SimpleStringProperty Direccion;

    public Cliente(int id,String nombres,String apellido_p,String apellido_m,String sexo, String t1, String t2, String direccion){
        ID=new SimpleIntegerProperty(id);
        Nombres=new SimpleStringProperty(nombres);
        Apellido_P=new SimpleStringProperty(apellido_p);
        Apellido_M=new SimpleStringProperty(apellido_m);
        Sexo= new SimpleStringProperty(sexo);
        Telefono1= new SimpleStringProperty(t1);
        Telefono2= new SimpleStringProperty(t2);
        Direccion= new SimpleStringProperty(direccion);
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

    public String getNombres() {
        return Nombres.get();
    }

    public SimpleStringProperty nombresProperty() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        this.Nombres.set(nombres);
    }

    public String getApellido_P() {
        return Apellido_P.get();
    }

    public SimpleStringProperty apellido_PProperty() {
        return Apellido_P;
    }

    public void setApellido_P(String apellido_P) {
        this.Apellido_P.set(apellido_P);
    }

    public String getApellido_M() {
        return Apellido_M.get();
    }

    public SimpleStringProperty apellido_MProperty() {
        return Apellido_M;
    }

    public void setApellido_M(String apellido_M) {
        this.Apellido_M.set(apellido_M);
    }

    public String getSexo() {
        return Sexo.get();
    }

    public SimpleStringProperty sexoProperty() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        this.Sexo.set(sexo);
    }

    public String getTelefono1() {
        return Telefono1.get();
    }

    public SimpleStringProperty telefono1Property() {
        return Telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.Telefono1.set(telefono1);
    }

    public String getTelefono2() {
        return Telefono2.get();
    }

    public SimpleStringProperty telefono2Property() {
        return Telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.Telefono2.set(telefono2);
    }

    public String getDireccion() {
        return Direccion.get();
    }

    public SimpleStringProperty direccionProperty() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion.set(direccion);
    }
}
