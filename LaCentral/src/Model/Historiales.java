package Model;
// Generated 18/08/2013 10:09:46 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Historiales generated by hbm2java
 */
public class Historiales  implements java.io.Serializable {


     private Integer claveHistorial;
     private Clientes clientes;
     private Date ultimaCompra;
     private float montoTotalUltimaCompra;
     private float total;
     private Set<Facturas> facturases = new HashSet<Facturas>(0);
     private Set<Comprasclientes> comprasclienteses = new HashSet<Comprasclientes>(0);

    public Historiales() {
    }

	
    public Historiales(Clientes clientes, Date ultimaCompra, float montoTotalUltimaCompra, float total) {
        this.clientes = clientes;
        this.ultimaCompra = ultimaCompra;
        this.montoTotalUltimaCompra = montoTotalUltimaCompra;
        this.total = total;
    }
    public Historiales(Clientes clientes, Date ultimaCompra, float montoTotalUltimaCompra, float total, Set<Facturas> facturases, Set<Comprasclientes> comprasclienteses) {
       this.clientes = clientes;
       this.ultimaCompra = ultimaCompra;
       this.montoTotalUltimaCompra = montoTotalUltimaCompra;
       this.total = total;
       this.facturases = facturases;
       this.comprasclienteses = comprasclienteses;
    }
   
    public Integer getClaveHistorial() {
        return this.claveHistorial;
    }
    
    public void setClaveHistorial(Integer claveHistorial) {
        this.claveHistorial = claveHistorial;
    }
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public Date getUltimaCompra() {
        return this.ultimaCompra;
    }
    
    public void setUltimaCompra(Date ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }
    public float getMontoTotalUltimaCompra() {
        return this.montoTotalUltimaCompra;
    }
    
    public void setMontoTotalUltimaCompra(float montoTotalUltimaCompra) {
        this.montoTotalUltimaCompra = montoTotalUltimaCompra;
    }
    public float getTotal() {
        return this.total;
    }
    
    public void setTotal(float total) {
        this.total = total;
    }
    public Set<Facturas> getFacturases() {
        return this.facturases;
    }
    
    public void setFacturases(Set<Facturas> facturases) {
        this.facturases = facturases;
    }
    public Set<Comprasclientes> getComprasclienteses() {
        return this.comprasclienteses;
    }
    
    public void setComprasclienteses(Set<Comprasclientes> comprasclienteses) {
        this.comprasclienteses = comprasclienteses;
    }




}


