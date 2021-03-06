package Model;
// Generated 18/08/2013 10:09:46 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Formaspagos generated by hbm2java
 */
public class Formaspagos  implements java.io.Serializable {


     private Integer claveFormasPagos;
     private String formaPago;
     private String descripcion;
     private Set<Comprasclientes> comprasclienteses = new HashSet<Comprasclientes>(0);

    public Formaspagos() {
    }

	
    public Formaspagos(String formaPago) {
        this.formaPago = formaPago;
    }
    public Formaspagos(String formaPago, String descripcion, Set<Comprasclientes> comprasclienteses) {
       this.formaPago = formaPago;
       this.descripcion = descripcion;
       this.comprasclienteses = comprasclienteses;
    }
   
    public Integer getClaveFormasPagos() {
        return this.claveFormasPagos;
    }
    
    public void setClaveFormasPagos(Integer claveFormasPagos) {
        this.claveFormasPagos = claveFormasPagos;
    }
    public String getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Comprasclientes> getComprasclienteses() {
        return this.comprasclienteses;
    }
    
    public void setComprasclienteses(Set<Comprasclientes> comprasclienteses) {
        this.comprasclienteses = comprasclienteses;
    }




}


