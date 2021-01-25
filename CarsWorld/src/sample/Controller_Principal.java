package sample;

import com.jfoenix.controls.JFXColorPicker;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Controller_Principal {
    //paneles principales///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    AnchorPane panel_menu, panel_reparaciones, panel_autos, panel_refacciones;
    @FXML
    JFXTextField txt_menu_total;
    double total = 0;
    //paneles de refacciones///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    AnchorPane panel_refacciones_comprar, panel_refacciones_inventario, panel_refacciones_rventas;
    //panel inventario
    @FXML
    JFXTextField txt_ref_inv_codigo, txt_ref_inv_mproducto, txt_ref_inv_datos, txt_ref_inv_descripcion, txt_ref_inv_cantidad, txt_ref_inv_precio;
    @FXML
    JFXComboBox cb_ref_inv_tproduto;
    @FXML
    TableView tabla_ref_inv;
    @FXML
    TableColumn columna_refaccioncom_codigo, columna_refaccioncom_tproducto, columna_refaccioncom_mproducto, columna_refaccioncom_datos, columna_refaccioncom_descripcion, columna_refaccioncom_cantidad, columna_refaccioncom_precio;
    ObservableList<Refaccion> refacciones_inventario = FXCollections.observableArrayList();
    LinkedList<String> lista_cb_ref_inv_tprodutocb_ref_inv_tproduto = new LinkedList<>();
    //panel compras
    @FXML
    JFXTextField txt_ref_com_codigo, txt_ref_com_total, txt_ref_com_pago, txt_ref_com_cambio, txt_ref_com_descuento;
    @FXML
    TableView tabla_ref_com;
    @FXML
    TableColumn columna_refaccioninv_codigo, columna_refaccioninv_tproducto, columna_refaccioninv_mproducto, columna_refaccioninv_datos, columna_refaccioninv_descripcion, columna_refaccioninv_cantidad, columna_refaccioninv_precio;
    Stack<Refaccion> refacciones_compras = new Stack<>();
    ObservableList<Refaccion> refacciones_compras_ol = FXCollections.observableArrayList(refacciones_compras);
    double total_refacciones = 0, descuentos_refacciones = 0;
    //panel ventas
    @FXML
    TableView tabla_ref_rven;
    @FXML
    TableColumn columna_refaccionven_codigo, columna_refaccionven_tproducto, columna_refaccionven_mproducto, columna_refaccionven_datos, columna_refaccionven_descripcion, columna_refaccionven_cantidad, columna_refaccionven_precio;
    ObservableList<Refaccion> refacciones_ventas = FXCollections.observableArrayList();
    //paneles de reparaciones///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    AnchorPane panel_reparacion_reparaciones, panel_reparacion_registro, panel_reparacion_cliente;
    //panel cliente
    @FXML
    TableView tabla_rep_cli;
    @FXML
    TableColumn columna_reparacioncli_id,columna_reparacioncli_nombres,columna_reparacioncli_apellidop,columna_reparacioncli_apellidom,columna_reparacioncli_sexo,columna_reparacioncli_t1,columna_reparacioncli_t2,columna_reparacioncli_direccion;
    @FXML
    JFXTextField txt_rep_cli_nombres,txt_rep_cli_apellidop,txt_rep_cli_apellidom,txt_rep_cli_t1,txt_rep_cli_t2,txt_rep_cli_direccion,txt_rep_cli_id;
    @FXML
    JFXComboBox cb_rep_cli_sexo;
    ObservableList<Cliente> reparacion_clientes= FXCollections.observableArrayList();
    LinkedList<String> lista_cb_rep_cli_sexo = new LinkedList<>();
    int id_cliente_contador=0;
    //panel reparacion
    @FXML
    JFXTextField txt_rep_rep_total;
    @FXML
    TableView tabla_rep_rep_cli,tabla_rep_rep_rept1,tabla_rep_rep_rept2,tabla_rep_rep_aut;
    @FXML
    ListView lv_rep_rep_repp;
    @FXML
    TableColumn columna_rep_repcli_id,columna_rep_repcli_nombres,columna_rep_repcli_apellidop,columna_rep_repcli_apellidom,columna_rep_repcli_sexo,columna_rep_repcli_t1,columna_rep_repcli_t2,columna_rep_repcli_direccion;
    @FXML
    TableColumn columna_rep_repaut_marca,columna_rep_repaut_modelo,columna_rep_repaut_anio,columna_rep_repaut_matricula,columna_rep_repaut_tv,columna_rep_repaut_tf,columna_rep_repaut_descripcion,columna_rep_repaut_color;
    @FXML
    TableColumn columna_rep_rep_idr,columna_rep_rep_idc,columna_rep_rep_nombres,columna_rep_rep_apellidop,columna_rep_rep_apellidom,columna_rep_rep_t1,columna_rep_rep_marca,columna_rep_rep_modelo,columna_rep_rep_anio,columna_rep_rep_total;
    Queue<Reparacion> reparaciones_pendientes=new LinkedList<>();
    Stack<Reparacion> reparaciones_xentregar=new Stack<>();
    ObservableList<Cliente> reparacion_rep_cliente=FXCollections.observableArrayList();
    ObservableList<Reparacion> reparacion_rep_reparacion=FXCollections.observableArrayList();
    ObservableList<Reparacion> reparaciones_terminadas=FXCollections.observableArrayList();
    ObservableList<Cliente> reparaciones_terminadascli=FXCollections.observableArrayList();
    ObservableList<Integer> id_reparaciones=FXCollections.observableArrayList();
    int id_reparacion_pendiente=0;
    // panel registro
    @FXML
    TableView tabla_rep_reg;
    @FXML
    TableColumn columna_reparacionreg_id,columna_reparacionreg_nombres,columna_reparacionreg_apellidop,columna_reparacionreg_apellidom,columna_reparacionreg_sexo,columna_reparacionreg_t1,columna_reparacionreg_t2,columna_reparacionreg_direccion;
    @FXML
    JFXComboBox cb_rep_reg_id;
    @FXML
    JFXTextField txt_rep_reg_marca,txt_rep_reg_modelo,txt_rep_reg_anio,txt_rep_reg_matricula,txt_rep_reg_tv,txt_rep_reg_tf;
    @FXML
    JFXTextArea txa_rep_reg_descripcion;
    @FXML
    JFXColorPicker cp_rep_reg_color;
    //paneles de autos///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    AnchorPane panel_autos_ventas, panel_autos_inventario, panel_autos_comprar;
    //panel inventario
    @FXML
    TableColumn columna_autoinv_niv, columna_autoinv_placa, columna_autoinv_pais, columna_autoinv_marca, columna_autoinv_modelo, columna_autoinv_anio, columna_autoinv_cilindrada, columna_autoinv_transmision, columna_autoinv_precio, columna_autoinv_color;
    @FXML
    JFXTextField txt_aut_inv_niv, txt_aut_inv_placa, txt_aut_inv_precio, txt_aut_inv_pais, txt_aut_inv_marca, txt_aut_inv_modelo;
    @FXML
    JFXComboBox cb_aut_inv_anio, cb_aut_inv_cilindrada, cb_aut_inv_transmision;
    @FXML
    JFXColorPicker cp_aut_inv_color;
    @FXML
    TableView tabla_aut_inv;
    ObservableList<Auto> autos_inventario = FXCollections.observableArrayList();
    LinkedList<Integer> lista_cb_aut_inv_anio = new LinkedList<>();
    LinkedList<String> lista_cb_aut_inv_cilindrada = new LinkedList<>();
    LinkedList<String> lista_cb_aut_inv_transmision = new LinkedList<>();
    //panel compras
    @FXML
    TableColumn columna_autocom_niv, columna_autocom_placa, columna_autocom_pais, columna_autocom_marca, columna_autocom_modelo, columna_autocom_anio, columna_autocom_cilindrada, columna_autocom_transmision, columna_autocom_precio, columna_autocom_color;
    @FXML
    JFXComboBox cb_aut_com_niv;
    @FXML
    JFXTextField txt_aut_com_total, txt_aut_com_pago, txt_aut_com_cambio, txt_aut_com_descuento;
    @FXML
    TableView tabla_aut_com;
    int total_autos = 0, descuentos_autos = 0;
    Queue<Auto> autos_compras = new LinkedList<>();
    ObservableList<Auto> autos_compras_ol = FXCollections.observableArrayList(autos_compras);
    //panel ventas
    @FXML
    TableView tabla_aut_ven;
    @FXML
    TableColumn columna_autoven_niv, columna_autoven_placa, columna_autoven_pais, columna_autoven_marca, columna_autoven_modelo, columna_autoven_anio, columna_autoven_cilindrada, columna_autoven_transmision, columna_autoven_precio, columna_autoven_color;
    ObservableList<Auto> autos_ventas = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        panel_menu.setVisible(true);
        panel_reparaciones.setVisible(false);
        panel_autos.setVisible(false);
        panel_refacciones.setVisible(false);

        panel_refacciones_comprar.setVisible(false);
        panel_refacciones_inventario.setVisible(false);
        panel_refacciones_rventas.setVisible(false);

        panel_reparacion_reparaciones.setVisible(true);
        panel_reparacion_registro.setVisible(false);
        panel_reparacion_cliente.setVisible(false);

        panel_autos_comprar.setVisible(true);
        panel_autos_inventario.setVisible(false);
        panel_autos_ventas.setVisible(false);

        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Accesorios");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Caja de Velocidades");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Frenos");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Herramientas");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Interior");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Motor");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Quimicos");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Ruedas");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Sistema Electrico");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Souvenirs");
        lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.add("Suspension");
        for (int f = 0; f < lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.size(); f++) {
            cb_ref_inv_tproduto.getItems().addAll(lista_cb_ref_inv_tprodutocb_ref_inv_tproduto.get(f));
        }
        cb_ref_inv_tproduto.setValue("Accesorios");

        for (int f = 1900; f <= 2100; f++) lista_cb_aut_inv_anio.add(f);
        for (int f = 0; f < lista_cb_aut_inv_anio.size(); f++)
            cb_aut_inv_anio.getItems().addAll(lista_cb_aut_inv_anio.get(f));
        cb_aut_inv_anio.setValue(2021);

        lista_cb_aut_inv_cilindrada.add("2");
        lista_cb_aut_inv_cilindrada.add("4");
        lista_cb_aut_inv_cilindrada.add("5");
        lista_cb_aut_inv_cilindrada.add("6");
        lista_cb_aut_inv_cilindrada.add("8");
        lista_cb_aut_inv_cilindrada.add("10");
        lista_cb_aut_inv_cilindrada.add("12");
        lista_cb_aut_inv_cilindrada.add("16");
        for (int f = 0; f < lista_cb_aut_inv_cilindrada.size(); f++)
            cb_aut_inv_cilindrada.getItems().addAll(lista_cb_aut_inv_cilindrada.get(f));
        cb_aut_inv_cilindrada.setValue("2");

        lista_cb_aut_inv_transmision.add("Estandar");
        lista_cb_aut_inv_transmision.add("Automatico");
        cb_aut_inv_transmision.getItems().addAll(lista_cb_aut_inv_transmision.get(0));
        cb_aut_inv_transmision.getItems().addAll(lista_cb_aut_inv_transmision.get(1));

        lista_cb_rep_cli_sexo.add("Masculino");
        lista_cb_rep_cli_sexo.add("Femenino");
        cb_rep_cli_sexo.getItems().addAll(lista_cb_rep_cli_sexo.get(0));
        cb_rep_cli_sexo.getItems().addAll(lista_cb_rep_cli_sexo.get(1));
        cb_rep_cli_sexo.setValue("Masculino");

        lv_rep_rep_repp.setItems(id_reparaciones);


        columna_refaccioninv_codigo.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("Codigo"));
        columna_refaccioninv_tproducto.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("T_Producto"));
        columna_refaccioninv_mproducto.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("M_Producto"));
        columna_refaccioninv_datos.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("Datos"));
        columna_refaccioninv_descripcion.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("Descripcion"));
        columna_refaccioninv_cantidad.setCellValueFactory(new PropertyValueFactory<Refaccion, Double>("Cantidad"));
        columna_refaccioninv_precio.setCellValueFactory(new PropertyValueFactory<Refaccion, Double>("Precio"));
        columna_refaccioncom_codigo.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("Codigo"));
        columna_refaccioncom_tproducto.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("T_Producto"));
        columna_refaccioncom_mproducto.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("M_Producto"));
        columna_refaccioncom_datos.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("Datos"));
        columna_refaccioncom_descripcion.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("Descripcion"));
        columna_refaccioncom_cantidad.setCellValueFactory(new PropertyValueFactory<Refaccion, Double>("Cantidad"));
        columna_refaccioncom_precio.setCellValueFactory(new PropertyValueFactory<Refaccion, Double>("Precio"));
        columna_refaccionven_codigo.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("Codigo"));
        columna_refaccionven_tproducto.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("T_Producto"));
        columna_refaccionven_mproducto.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("M_Producto"));
        columna_refaccionven_datos.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("Datos"));
        columna_refaccionven_descripcion.setCellValueFactory(new PropertyValueFactory<Refaccion, String>("Descripcion"));
        columna_refaccionven_cantidad.setCellValueFactory(new PropertyValueFactory<Refaccion, Double>("Cantidad"));
        columna_refaccionven_precio.setCellValueFactory(new PropertyValueFactory<Refaccion, Double>("Precio"));
        tabla_ref_inv.setItems(refacciones_inventario);
        tabla_ref_com.setItems(refacciones_compras_ol);
        tabla_ref_rven.setItems(refacciones_ventas);


        columna_autoinv_niv.setCellValueFactory(new PropertyValueFactory<Auto, String>("NIV"));
        columna_autoinv_placa.setCellValueFactory(new PropertyValueFactory<Auto, String>("Placa"));
        columna_autoinv_pais.setCellValueFactory(new PropertyValueFactory<Auto, String>("Pais"));
        columna_autoinv_marca.setCellValueFactory(new PropertyValueFactory<Auto, String>("Marca"));
        columna_autoinv_modelo.setCellValueFactory(new PropertyValueFactory<Auto, String>("Modelo"));
        columna_autoinv_anio.setCellValueFactory(new PropertyValueFactory<Auto, String>("Anio"));
        columna_autoinv_cilindrada.setCellValueFactory(new PropertyValueFactory<Auto, String>("Cilindrada"));
        columna_autoinv_transmision.setCellValueFactory(new PropertyValueFactory<Auto, String>("Transmision"));
        columna_autoinv_precio.setCellValueFactory(new PropertyValueFactory<Auto, Integer>("Precio"));
        columna_autoinv_color.setCellValueFactory(new PropertyValueFactory<Auto, Color>("Color"));
        columna_autocom_niv.setCellValueFactory(new PropertyValueFactory<Auto, String>("NIV"));
        columna_autocom_placa.setCellValueFactory(new PropertyValueFactory<Auto, String>("Placa"));
        columna_autocom_pais.setCellValueFactory(new PropertyValueFactory<Auto, String>("Pais"));
        columna_autocom_marca.setCellValueFactory(new PropertyValueFactory<Auto, String>("Marca"));
        columna_autocom_modelo.setCellValueFactory(new PropertyValueFactory<Auto, String>("Modelo"));
        columna_autocom_anio.setCellValueFactory(new PropertyValueFactory<Auto, String>("Anio"));
        columna_autocom_cilindrada.setCellValueFactory(new PropertyValueFactory<Auto, String>("Cilindrada"));
        columna_autocom_transmision.setCellValueFactory(new PropertyValueFactory<Auto, String>("Transmision"));
        columna_autocom_precio.setCellValueFactory(new PropertyValueFactory<Auto, Integer>("Precio"));
        columna_autocom_color.setCellValueFactory(new PropertyValueFactory<Auto, Color>("Color"));
        columna_autoven_niv.setCellValueFactory(new PropertyValueFactory<Auto, String>("NIV"));
        columna_autoven_placa.setCellValueFactory(new PropertyValueFactory<Auto, String>("Placa"));
        columna_autoven_pais.setCellValueFactory(new PropertyValueFactory<Auto, String>("Pais"));
        columna_autoven_marca.setCellValueFactory(new PropertyValueFactory<Auto, String>("Marca"));
        columna_autoven_modelo.setCellValueFactory(new PropertyValueFactory<Auto, String>("Modelo"));
        columna_autoven_anio.setCellValueFactory(new PropertyValueFactory<Auto, String>("Anio"));
        columna_autoven_cilindrada.setCellValueFactory(new PropertyValueFactory<Auto, String>("Cilindrada"));
        columna_autoven_transmision.setCellValueFactory(new PropertyValueFactory<Auto, String>("Transmision"));
        columna_autoven_precio.setCellValueFactory(new PropertyValueFactory<Auto, Integer>("Precio"));
        columna_autoven_color.setCellValueFactory(new PropertyValueFactory<Auto, Color>("Color"));
        tabla_aut_com.setItems(autos_compras_ol);
        tabla_aut_inv.setItems(autos_inventario);
        tabla_aut_ven.setItems(autos_ventas);

        columna_reparacioncli_id.setCellValueFactory(new PropertyValueFactory<Cliente,Integer>("ID"));
        columna_reparacioncli_nombres.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Nombres"));
        columna_reparacioncli_apellidop.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Apellido_P"));
        columna_reparacioncli_apellidom.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Apellido_M"));
        columna_reparacioncli_sexo.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Sexo"));
        columna_reparacioncli_t1.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Telefono1"));
        columna_reparacioncli_t2.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Telefono2"));
        columna_reparacioncli_direccion.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Direccion"));
        columna_reparacionreg_id.setCellValueFactory(new PropertyValueFactory<Cliente,Integer>("ID"));
        columna_reparacionreg_nombres.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Nombres"));
        columna_reparacionreg_apellidop.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Apellido_P"));
        columna_reparacionreg_apellidom.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Apellido_M"));
        columna_reparacionreg_sexo.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Sexo"));
        columna_reparacionreg_t1.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Telefono1"));
        columna_reparacionreg_t2.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Telefono2"));
        columna_reparacionreg_direccion.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Direccion"));
        tabla_rep_cli.setItems(reparacion_clientes);
        tabla_rep_reg.setItems(reparacion_clientes);

        columna_rep_repcli_id.setCellValueFactory(new PropertyValueFactory<Cliente,Integer>("ID"));
        columna_rep_repcli_nombres.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Nombres"));
        columna_rep_repcli_apellidop.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Apellido_P"));
        columna_rep_repcli_apellidom.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Apellido_M"));
        columna_rep_repcli_sexo.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Sexo"));
        columna_rep_repcli_t1.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Telefono1"));
        columna_rep_repcli_t2.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Telefono2"));
        columna_rep_repcli_direccion.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Direccion"));
        columna_rep_repaut_marca.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Marca"));
        columna_rep_repaut_modelo.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Modelo"));
        columna_rep_repaut_anio.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Anio"));
        columna_rep_repaut_matricula.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Matricula"));
        columna_rep_repaut_tv.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Tipo_Vehiculo"));
        columna_rep_repaut_tf.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Tipo_Falla"));
        columna_rep_repaut_descripcion.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Descripcion"));
        columna_rep_repaut_color.setCellValueFactory(new PropertyValueFactory<Reparacion,Color>("Color"));
        columna_rep_rep_idr.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("ID"));
        columna_rep_rep_total.setCellValueFactory(new PropertyValueFactory<Reparacion,Integer>("Pago"));
        columna_rep_rep_marca.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Marca"));
        columna_rep_rep_modelo.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Modelo"));
        columna_rep_rep_anio.setCellValueFactory(new PropertyValueFactory<Reparacion,String>("Anio"));
        columna_rep_rep_idc.setCellValueFactory(new PropertyValueFactory<Cliente,String>("ID"));
        columna_rep_rep_nombres.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Nombres"));
        columna_rep_rep_apellidop.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Apellido_P"));
        columna_rep_rep_apellidom.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Apellido_M"));
        columna_rep_rep_t1.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Telefono1"));
        tabla_rep_rep_cli.setItems(reparacion_rep_cliente);
        tabla_rep_rep_aut.setItems(reparacion_rep_reparacion);
        tabla_rep_rep_rept1.setItems(reparaciones_terminadas);
        tabla_rep_rep_rept2.setItems(reparaciones_terminadascli);


    }

    public void cerrar() {
        System.exit(0);
    }

    //cambio paneles principales
    public void cambio_panel_menu() {
        panel_menu.setVisible(true);
        panel_reparaciones.setVisible(false);
        panel_autos.setVisible(false);
        panel_refacciones.setVisible(false);
    }

    public void cambio_panel_reparaciones() {
        panel_menu.setVisible(false);
        panel_reparaciones.setVisible(true);
        panel_autos.setVisible(false);
        panel_refacciones.setVisible(false);
    }

    public void cambio_panel_autos() {
        panel_menu.setVisible(false);
        panel_reparaciones.setVisible(false);
        panel_autos.setVisible(true);
        panel_refacciones.setVisible(false);
    }

    public void cambio_panel_refacciones() {
        panel_menu.setVisible(false);
        panel_reparaciones.setVisible(false);
        panel_autos.setVisible(false);
        panel_refacciones.setVisible(true);

        panel_refacciones_comprar.setVisible(true);
        panel_refacciones_inventario.setVisible(false);
        panel_refacciones_rventas.setVisible(false);
    }

    //paneles refacciones ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void refacciones_menu_comprar() {
        panel_refacciones_comprar.setVisible(true);
        panel_refacciones_inventario.setVisible(false);
        panel_refacciones_rventas.setVisible(false);
    }

    public void refacciones_menu_inventario() {
        panel_refacciones_comprar.setVisible(false);
        panel_refacciones_inventario.setVisible(true);
        panel_refacciones_rventas.setVisible(false);
    }

    public void refacciones_menu_rventas() {
        panel_refacciones_comprar.setVisible(false);
        panel_refacciones_inventario.setVisible(false);
        panel_refacciones_rventas.setVisible(true);
    }

    //inventario
    public void accion_refacciones_inventario_guardar() {
        boolean ri_codigo = false;
        int ri_codigo2 = 0;
        for (int f = 0; f < refacciones_inventario.size(); f++) {
            if (refacciones_inventario.get(f).getCodigo().equals(txt_ref_inv_codigo.getText())) {
                ri_codigo = true;
                ri_codigo2 = f;
            }
        }
        if (ri_codigo == false) {
            refacciones_inventario.add(new Refaccion(txt_ref_inv_codigo.getText(), String.valueOf(cb_ref_inv_tproduto.getSelectionModel().getSelectedItem()), txt_ref_inv_mproducto.getText(), txt_ref_inv_datos.getText(), txt_ref_inv_descripcion.getText(), Double.parseDouble(txt_ref_inv_cantidad.getText()), Double.parseDouble(txt_ref_inv_precio.getText())));
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Se agrego un nuevo articulo al inventario", ButtonType.OK);
            alert.show();
        } else {
            refacciones_inventario.remove(ri_codigo2);
            refacciones_inventario.add(new Refaccion(
                    txt_ref_inv_codigo.getText(),
                    String.valueOf(cb_ref_inv_tproduto.getSelectionModel().getSelectedItem()),
                    txt_ref_inv_mproducto.getText(),
                    txt_ref_inv_datos.getText(),
                    txt_ref_inv_descripcion.getText(),
                    Double.parseDouble(txt_ref_inv_cantidad.getText()),
                    Double.parseDouble(txt_ref_inv_precio.getText())
            ));
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Se modifico el articulo del inventario", ButtonType.OK);
            alert.show();
        }
    }

    public void accion_refacciones_inventario_eliminar() {
        boolean ri_codigo = false;
        for (int f = 0; f < refacciones_inventario.size(); f++)
            if (refacciones_inventario.get(f).getCodigo().equals(txt_ref_inv_codigo.getText())) {
                refacciones_inventario.remove(f);
            } else {
                ri_codigo = true;
            }
        if (ri_codigo) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "No se encontro ningun articulo con dicho codigo", ButtonType.OK);
            alert.show();
        }
    }

    //compras
    public void accion_refacciones_compras_agregar() {
        for (int f = 0; f < refacciones_inventario.size(); f++) {
            if (refacciones_inventario.get(f).getCodigo().equals(txt_ref_com_codigo.getText())) {
                if (refacciones_inventario.get(f).getCantidad() >= 1) {
                    refacciones_compras.add(new Refaccion(refacciones_inventario.get(f).getCodigo(), refacciones_inventario.get(f).getT_Producto(), refacciones_inventario.get(f).getM_Producto(), refacciones_inventario.get(f).getDatos(), refacciones_inventario.get(f).getDescripcion(), 1, refacciones_inventario.get(f).getPrecio()));
                    total_refacciones = total_refacciones + refacciones_compras.peek().getPrecio();
                    double t = total_refacciones - descuentos_refacciones;
                    txt_ref_com_total.setText("$" + t);
                    double cantidad = refacciones_inventario.get(f).getCantidad();
                    cantidad = cantidad - 1;
                    refacciones_inventario.get(f).setCantidad(cantidad);
                    tabla_ref_inv.refresh();
                    refacciones_compras_ol.clear();
                    refacciones_compras_ol.setAll(refacciones_compras);
                    tabla_ref_com.refresh();
                } else {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "No se encuentra mas existencia de dicho articulo", ButtonType.OK);
                    alert.show();
                }
                break;
            }
        }
        txt_ref_com_codigo.setText("");
    }

    public void accion_refacciones_compras_comprar() {
        int r = refacciones_compras.size();
        for (int f = 0; f < r; f++) {
            refacciones_ventas.add(new Refaccion(refacciones_compras.peek().getCodigo(), refacciones_compras.peek().getT_Producto(), refacciones_compras.peek().getM_Producto(), refacciones_compras.peek().getDatos(), refacciones_compras.peek().getDescripcion(), refacciones_compras.peek().getCantidad(), refacciones_compras.peek().getPrecio()));
            refacciones_compras.pop();
        }
        total = total + (total_refacciones - descuentos_refacciones);
        txt_menu_total.setText("$" + total);
        refacciones_compras_ol.clear();
        refacciones_compras_ol.setAll(refacciones_compras);
        tabla_ref_com.refresh();
        total_refacciones = 0;
        descuentos_refacciones = 0;
        txt_ref_com_total.setText("");
        txt_ref_com_cambio.setText("");
        txt_ref_com_pago.setText("");
        txt_ref_com_descuento.setText("");
    }

    public void accion_refacciones_compras_cancelar() {
        int r1 = refacciones_compras.size();
        int r2 = refacciones_inventario.size();
        for (int f = 0; f < r1; f++) {
            String codigo = refacciones_compras.peek().getCodigo();
            boolean comprobar = false;
            for (int f2 = 0; f2 < r2; f2++) {
                if (refacciones_inventario.get(f2).getCodigo().equals(codigo)) {
                    refacciones_inventario.get(f2).setCantidad(refacciones_inventario.get(f2).getCantidad() + 1);
                    refacciones_compras.pop();
                    comprobar = true;
                }
            }
            if (!comprobar) refacciones_inventario.add(refacciones_compras.pop());
        }
        refacciones_compras_ol.clear();
        refacciones_compras_ol.setAll(refacciones_compras);
        tabla_ref_com.refresh();
        tabla_ref_inv.refresh();
        total_refacciones = 0;
        descuentos_refacciones = 0;
        txt_ref_com_total.setText("");
        txt_ref_com_cambio.setText("");
        txt_ref_com_pago.setText("");
        txt_ref_com_descuento.setText("");
    }

    public void accion_refacciones_compras_descontar() {
        descuentos_refacciones = Double.parseDouble(txt_ref_com_descuento.getText());
        if (descuentos_refacciones <= total_refacciones) {
            double t = total_refacciones - descuentos_refacciones;
            txt_ref_com_total.setText("$" + t);
            txt_ref_com_cambio.setText("");
            txt_ref_com_pago.setText("");
        } else {
            txt_ref_com_descuento.setText("");
            descuentos_refacciones = 0;
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "El descuento no puede ser mayor al total a pagar.", ButtonType.OK);
            alert.show();
        }
    }

    public void accion_refacciones_compras_calcularpago() {
        double pago = Integer.parseInt(txt_ref_com_pago.getText());
        double t = total_refacciones - descuentos_refacciones;
        if (pago >= t) {
            double cambio = pago - t;
            txt_ref_com_cambio.setText("$" + cambio);
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "El pago debe ser igual o mayor al total", ButtonType.OK);
            alert.show();
        }

    }

    //panel ventas
    public void accion_refacciones_ventas_ordenar_codigo(){
        int x, y;
        for (x = 0 ; x < refacciones_ventas.size()-1; x++){
            for (y = x+1 ; y < refacciones_ventas.size(); y++){
                if (refacciones_ventas.get(x).getCodigo().compareToIgnoreCase(refacciones_ventas.get(y).getCodigo())>=1) {
                    Refaccion refaccion;
                    refaccion=refacciones_ventas.get(x);
                    refacciones_ventas.set(x,refacciones_ventas.get(y));
                    refacciones_ventas.set(y,refaccion);
                }
            }
        }
    }
    public void accion_refacciones_ventas_ordenar_tipo(){
        int im, x, y;
        for (x = 0; x < refacciones_ventas.size()-1; x++) {
            im=x;
            for (y = x+1; y < refacciones_ventas.size(); y++){
                if (refacciones_ventas.get(y).getT_Producto().compareToIgnoreCase(refacciones_ventas.get(im).getT_Producto()) <= -1) {
                    im = y;
                }
            }
            if (x != im){
                Refaccion refaccion;
                refaccion=refacciones_ventas.get(x);
                refacciones_ventas.set(x,refacciones_ventas.get(im));
                refacciones_ventas.set(im,refaccion);
            }
        }
    }
    public void accion_refacciones_ventas_ordenar_marca(){
        int x, y;
        for(x=0;x<refacciones_ventas.size()-1;x++)
            for(y=0;y<refacciones_ventas.size()-x-1;y++)
                if(refacciones_ventas.get(y+1).getM_Producto().compareToIgnoreCase(refacciones_ventas.get(y).getM_Producto())<=-1){
                    Refaccion refaccion;
                    refaccion=refacciones_ventas.get(y+1);
                    refacciones_ventas.set(y+1,refacciones_ventas.get(y));
                    refacciones_ventas.set(y,refaccion);
                }
    }
    public void accion_refacciones_ventas_ordenar_datos(){
        int intervalo, x, y, z;
        intervalo = refacciones_ventas.size() / 2;
        while (intervalo > 0){
            for (x = intervalo; x < refacciones_ventas.size(); x++) {
                y = x - intervalo;
                while (y >= 0) {
                    z = y + intervalo;
                    if (refacciones_ventas.get(y).getDatos().compareToIgnoreCase(refacciones_ventas.get(z).getDatos())<=0){
                        y = -1;
                    }else{
                        Refaccion refaccion;
                        refaccion=refacciones_ventas.get(y);
                        refacciones_ventas.set(y,refacciones_ventas.get(y+1));
                        refacciones_ventas.set(y+1,refaccion);
                        y -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }
    public void accion_refacciones_ventas_ordenar_descripcion(){
        int x, y;
        for (x = 0 ; x < refacciones_ventas.size()-1; x++){
            for (y = x+1 ; y < refacciones_ventas.size(); y++){
                if (refacciones_ventas.get(x).getDescripcion().compareToIgnoreCase(refacciones_ventas.get(y).getDescripcion())>=1) {
                    Refaccion refaccion;
                    refaccion=refacciones_ventas.get(x);
                    refacciones_ventas.set(x,refacciones_ventas.get(y));
                    refacciones_ventas.set(y,refaccion);
                }
            }
        }
    }
    public void accion_refacciones_ventas_ordenar_precio(){
        int x, y;
        for(x=0;x<refacciones_ventas.size()-1;x++)
            for(y=0;y<refacciones_ventas.size()-x-1;y++)
                if(refacciones_ventas.get(y+1).getPrecio()<refacciones_ventas.get(y).getPrecio()){
                    Refaccion refaccion;
                    refaccion=refacciones_ventas.get(y+1);
                    refacciones_ventas.set(y+1,refacciones_ventas.get(y));
                    refacciones_ventas.set(y,refaccion);
                }
    }
    //paneles reparaciones ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void reparaciones_menu_reparaciones() {
        panel_reparacion_reparaciones.setVisible(true);
        panel_reparacion_registro.setVisible(false);
        panel_reparacion_cliente.setVisible(false);
    }

    public void reparaciones_menu_registro() {
        panel_reparacion_reparaciones.setVisible(false);
        panel_reparacion_registro.setVisible(true);
        panel_reparacion_cliente.setVisible(false);
    }

    public void reparaciones_menu_cliente() {
        panel_reparacion_reparaciones.setVisible(false);
        panel_reparacion_registro.setVisible(false);
        panel_reparacion_cliente.setVisible(true);
    }
    //clientes
    public void accion_reparaciones_clientes_guardar(){
        id_cliente_contador++;
        reparacion_clientes.add(new Cliente(
                id_cliente_contador,
                txt_rep_cli_nombres.getText(),
                txt_rep_cli_apellidop.getText(),
                txt_rep_cli_apellidom.getText(),
                String.valueOf(cb_rep_cli_sexo.getSelectionModel().getSelectedItem()),
                txt_rep_cli_t1.getText(),
                txt_rep_cli_t2.getText(),
                txt_rep_cli_direccion.getText()
                ));
        cb_rep_reg_id.getItems().clear();
        for (int f = 0; f < reparacion_clientes.size(); f++)cb_rep_reg_id.getItems().addAll(reparacion_clientes.get(f).getID());
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Se agrego un nuevo cliente.", ButtonType.OK);
        alert.show();
    }
    public void accion_reparaciones_clientes_eliminar(){
        int id=Integer.parseInt(txt_rep_cli_id.getText());
        for(int f=0;f<reparacion_clientes.size();f++)if(reparacion_clientes.get(f).getID()==id){reparacion_clientes.remove(f);break;}
        cb_rep_reg_id.getItems().clear();
        for (int f = 0; f < reparacion_clientes.size(); f++)cb_rep_reg_id.getItems().addAll(reparacion_clientes.get(f).getID());
        tabla_rep_cli.refresh();
        tabla_rep_reg.refresh();
    }
    public void accion_reparaciones_clientes_ordenar_nombre(){
        ordenarNombresClientes(reparacion_clientes,0,reparacion_clientes.size()-1);
    }
    public void accion_reparaciones_clientes_ordenar_id(){
        ordenarIdClientes(reparacion_clientes,0,reparacion_clientes.size()-1);
    }
    public void ordenarNombresClientes(ObservableList<Cliente> reparacion_clientes, int n1, int n2){
        int x,y,z;
        String cliente;
        z=(n1+n2)/2;
        cliente=reparacion_clientes.get(z).getNombres();
        x=n1;
        y=n2;
        do{
            while(reparacion_clientes.get(x).getNombres().compareTo(cliente)==-1){
                x++;
            }
            while(reparacion_clientes.get(y).getNombres().compareTo(cliente)==1){
                y--;
            }
            if(x<=y){
                Cliente aux;
                aux= reparacion_clientes.get(x);
                reparacion_clientes.set(x,reparacion_clientes.get(y));
                reparacion_clientes.set(y,aux);
                x++;
                y--;
            }
        }while(x<=y);
        if(n1<y){
            ordenarNombresClientes(reparacion_clientes,n1,y);
        }
        if(x<n2){
            ordenarNombresClientes(reparacion_clientes,x,n2);
        }

    }
    public void ordenarIdClientes(ObservableList<Cliente> reparacion_clientes, int n1, int n2){
        int x,y,z;
        int cliente;
        z=(n1+n2)/2;
        cliente=reparacion_clientes.get(z).getID();
        x=n1;
        y=n2;
        do{
            while(reparacion_clientes.get(x).getID()<cliente){
                x++;
            }
            while(reparacion_clientes.get(y).getID()>cliente){
                y--;
            }
            if(x<=y){
                Cliente aux;
                aux= reparacion_clientes.get(x);
                reparacion_clientes.set(x,reparacion_clientes.get(y));
                reparacion_clientes.set(y,aux);
                x++;
                y--;
            }
        }while(x<=y);
        if(n1<y){
            ordenarIdClientes(reparacion_clientes,n1,y);
        }
        if(x<n2){
            ordenarIdClientes(reparacion_clientes,x,n2);
        }

    }
    //registro
    public void accion_reparaciones_registro_guardar(){
        id_reparacion_pendiente++;
        Cliente cliente = null;
        boolean comprobar=false;
        for(int f=0;f<reparacion_clientes.size();f++)if(reparacion_clientes.get(f).getID()==Integer.parseInt(String.valueOf(cb_rep_reg_id.getSelectionModel().getSelectedItem()))){cliente=reparacion_clientes.get(f);comprobar=true;}

        if(comprobar==true){
            reparaciones_pendientes.add(new Reparacion(
                    id_reparacion_pendiente,
                    txt_rep_reg_marca.getText(),
                    txt_rep_reg_modelo.getText(),
                    txt_rep_reg_anio.getText(),
                    txt_rep_reg_matricula.getText(),
                    txt_rep_reg_tv.getText(),
                    txt_rep_reg_tf.getText(),
                    txa_rep_reg_descripcion.getText(),
                    cp_rep_reg_color.getValue(),
                    cliente,
                    0
            ));
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Registro agregado a la cola", ButtonType.OK);
            alert.show();
            id_reparaciones.add(id_reparacion_pendiente);
            reparacion_rep_cliente.clear();
            reparacion_rep_reparacion.clear();
            reparacion_rep_cliente.add(reparaciones_pendientes.peek().getCliente());
            reparacion_rep_reparacion.add(reparaciones_pendientes.peek());
        }
    }
    //reparaciones
    public void accion_reparaciones_reparacion_finalizar(){
        if(reparaciones_pendientes.isEmpty()==false){
            reparaciones_pendientes.peek().setPago(Integer.parseInt(txt_rep_rep_total.getText()));
            reparaciones_terminadas.add(reparaciones_pendientes.peek());
            reparaciones_terminadascli.add(reparaciones_pendientes.peek().getCliente());
            reparaciones_xentregar.add(reparaciones_pendientes.poll());
            id_reparaciones.remove(0);
            reparacion_rep_cliente.clear();
            reparacion_rep_reparacion.clear();
            if(reparaciones_pendientes.isEmpty()==false){
                reparacion_rep_cliente.add(reparaciones_pendientes.peek().getCliente());
                reparacion_rep_reparacion.add(reparaciones_pendientes.peek());
            }
        }
    }
    public void accion_reparaciones_reparacion_entregar(){
        if(reparaciones_xentregar.isEmpty()==false){
            for(int f=0;f<reparaciones_terminadas.size();f++)if(reparaciones_terminadas.get(f).getID()==reparaciones_xentregar.peek().getID()){reparaciones_terminadas.remove(f);reparaciones_terminadascli.remove(f);}
            total=total+reparaciones_xentregar.peek().getPago();
            txt_menu_total.setText("$"+total);
            reparaciones_xentregar.pop();
        }
    }
    //paneles autos ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void autos_menu_comprar() {
        panel_autos_comprar.setVisible(true);
        panel_autos_inventario.setVisible(false);
        panel_autos_ventas.setVisible(false);
    }

    public void autos_menu_inventario() {
        panel_autos_comprar.setVisible(false);
        panel_autos_inventario.setVisible(true);
        panel_autos_ventas.setVisible(false);
    }

    public void autos_menu_rventas() {
        panel_autos_comprar.setVisible(false);
        panel_autos_inventario.setVisible(false);
        panel_autos_ventas.setVisible(true);
    }

    // inventario
    public void accion_autos_inventario_guardar() {
        boolean ri_codigo = false;
        int ri_codigo2 = 0;
        for (int f = 0; f < autos_inventario.size(); f++) {
            if (autos_inventario.get(f).getNIV().equals(txt_aut_inv_niv.getText())) {
                ri_codigo = true;
                ri_codigo2 = f;
            }
        }
        if (ri_codigo == false) {
            autos_inventario.add(new Auto(
                    txt_aut_inv_niv.getText(),
                    txt_aut_inv_placa.getText(),
                    txt_aut_inv_pais.getText(),
                    txt_aut_inv_marca.getText(),
                    txt_aut_inv_modelo.getText(),
                    String.valueOf(cb_aut_inv_anio.getSelectionModel().getSelectedItem()),
                    String.valueOf(cb_aut_inv_cilindrada.getSelectionModel().getSelectedItem()),
                    String.valueOf(cb_aut_inv_transmision.getSelectionModel().getSelectedItem()),
                    Integer.parseInt(txt_aut_inv_precio.getText()),
                    cp_aut_inv_color.getValue()
            ));
            cb_aut_com_niv.getItems().clear();
            for (int f = 0; f < autos_inventario.size(); f++)
                cb_aut_com_niv.getItems().addAll(autos_inventario.get(f).getNIV());
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Se agrego un nuevo articulo al inventario", ButtonType.OK);
            alert.show();
        } else {
            autos_inventario.remove(ri_codigo2);
            autos_inventario.add(new Auto(
                    txt_aut_inv_niv.getText(),
                    txt_aut_inv_placa.getText(),
                    txt_aut_inv_pais.getText(),
                    txt_aut_inv_marca.getText(),
                    txt_aut_inv_modelo.getText(),
                    String.valueOf(cb_aut_inv_anio.getSelectionModel().getSelectedItem()),
                    String.valueOf(cb_aut_inv_cilindrada.getSelectionModel().getSelectedItem()),
                    String.valueOf(cb_aut_inv_transmision.getSelectionModel().getSelectedItem()),
                    Integer.parseInt(txt_aut_inv_precio.getText()),
                    cp_aut_inv_color.getValue()
            ));
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Se modifico el articulo del inventario", ButtonType.OK);
            alert.show();
        }
    }

    public void accion_autos_inventario_eliminar() {
        int x, y;
        for(x=0;x<autos_inventario.size()-1;x++){
            for(y=0;y<autos_inventario.size()-x-1;y++){
                if(autos_inventario.get(y+1).getNIV().compareToIgnoreCase(autos_inventario.get(y).getNIV())<=-1){
                    Auto auto;
                    auto=autos_inventario.get(y+1);
                    autos_inventario.set(y+1,autos_inventario.get(y));
                    autos_inventario.set(y,auto);
                }
            }
        }

        int centro,inf=0,sup=autos_inventario.size()-1;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(autos_inventario.get(centro).getNIV().equals(txt_aut_inv_niv.getText())){
                autos_inventario.remove(centro);
                cb_aut_com_niv.getItems().clear();
                for (int f = 0; f < autos_inventario.size(); f++){
                    cb_aut_com_niv.getItems().addAll(autos_inventario.get(f).getNIV());
                }
                break;
            } else if(txt_aut_inv_niv.getText().compareToIgnoreCase(autos_inventario.get(centro).getNIV()) <= -1){
                sup=centro-1;
            } else {
                inf=centro+1;
            }
        }
    }

    //compras
    public void accion_autos_compras_agregar() {
        for (int f = 0; f < autos_inventario.size(); f++) {
            if (autos_inventario.get(f).getNIV().equals(String.valueOf(cb_aut_com_niv.getSelectionModel().getSelectedItem()))) {
                autos_compras.add(new Auto(
                        autos_inventario.get(f).getNIV(),
                        autos_inventario.get(f).getPlaca(),
                        autos_inventario.get(f).getPais(),
                        autos_inventario.get(f).getMarca(),
                        autos_inventario.get(f).getModelo(),
                        autos_inventario.get(f).getAnio(),
                        autos_inventario.get(f).getCilindrada(),
                        autos_inventario.get(f).getTransmision(),
                        autos_inventario.get(f).getPrecio(),
                        autos_inventario.get(f).getColor()
                ));
                total_autos = total_autos + autos_compras.peek().getPrecio();
                double t = total_autos - descuentos_autos;
                txt_aut_com_total.setText("$" + t);
                autos_inventario.remove(f);
                tabla_aut_inv.refresh();
                autos_compras_ol.clear();
                autos_compras_ol.setAll(autos_compras);
                tabla_aut_com.refresh();
                cb_aut_com_niv.getItems().clear();
                for (int f2 = 0; f2 < autos_inventario.size(); f2++)
                    cb_aut_com_niv.getItems().addAll(autos_inventario.get(f).getNIV());
            } else {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "No se encuentra mas existencia de dicho articulo", ButtonType.OK);
                alert.show();
            }
            break;
        }
        txt_ref_com_codigo.setText("");
    }

    public void accion_autos_compras_calcularpago() {
        double pago = Integer.parseInt(txt_aut_com_pago.getText());
        double t = total_autos - descuentos_autos;
        if (pago >= t) {
            double cambio = pago - t;
            txt_aut_com_cambio.setText("$" + cambio);
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "El pago debe ser igual o mayor al total", ButtonType.OK);
            alert.show();
        }
    }

    public void accion_autos_compras_comprar() {
        int r = autos_compras.size();
        for (int f = 0; f < r; f++) {
            autos_ventas.add(new Auto(
                    autos_compras.peek().getNIV(),
                    autos_compras.peek().getPlaca(),
                    autos_compras.peek().getPais(),
                    autos_compras.peek().getMarca(),
                    autos_compras.peek().getModelo(),
                    autos_compras.peek().getAnio(),
                    autos_compras.peek().getCilindrada(),
                    autos_compras.peek().getTransmision(),
                    autos_compras.peek().getPrecio(),
                    autos_compras.peek().getColor()
            ));
            autos_compras.poll();
        }
        total = total + (total_autos - descuentos_autos);
        txt_menu_total.setText("$" + total);
        autos_compras_ol.clear();
        autos_compras_ol.setAll(autos_compras);
        tabla_aut_com.refresh();
        total_autos = 0;
        descuentos_autos = 0;
        txt_aut_com_total.setText("");
        txt_aut_com_cambio.setText("");
        txt_aut_com_pago.setText("");
        txt_aut_com_descuento.setText("");
    }

    public void accion_autos_compras_cancelar() {
        int r1 = autos_compras.size();
        for (int f = 0; f < r1; f++) {
                autos_inventario.add(autos_compras.poll());
            }
            autos_compras_ol.clear();
            autos_compras_ol.setAll(autos_compras);
            tabla_aut_com.refresh();
            tabla_aut_inv.refresh();
            total_autos = 0;
            descuentos_autos = 0;
            txt_aut_com_total.setText("");
            txt_aut_com_cambio.setText("");
            txt_aut_com_pago.setText("");
            txt_aut_com_descuento.setText("");
        cb_aut_com_niv.getItems().clear();
        for (int f = 0; f < autos_inventario.size(); f++)
            cb_aut_com_niv.getItems().addAll(autos_inventario.get(f).getNIV());
    }
        public void accion_autos_compras_descontar () {
            descuentos_autos = Integer.parseInt(txt_aut_com_descuento.getText());
            if (descuentos_autos <= total_autos) {
                double t = total_autos - descuentos_autos;
                txt_aut_com_total.setText("$" + t);
                txt_aut_com_cambio.setText("");
                txt_aut_com_pago.setText("");
            } else {
                txt_aut_com_descuento.setText("");
                descuentos_autos = 0;
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "El descuento no puede ser mayor al total a pagar.", ButtonType.OK);
                alert.show();
            }
        }
}