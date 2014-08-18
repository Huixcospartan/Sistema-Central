package Model;
// Generated 18/08/2013 10:09:46 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Municipios generated by hbm2java
 */
public class Municipios  implements java.io.Serializable {


     private Integer claveMunicipio;
     private Codigospostales codigospostales;
     private Estados estados;
     private String municipio;
     private String descripcion;
     private Set<Domicilios> domicilioses = new HashSet<Domicilios>(0);

    public Municipios() {
    }

	
    public Municipios(Estados estados, String municipio) {
        this.estados = estados;
        this.municipio = municipio;
    }
    public Municipios(Codigospostales codigospostales, Estados estados, String municipio, String descripcion, Set<Domicilios> domicilioses) {
       this.codigospostales = codigospostales;
       this.estados = estados;
       this.municipio = municipio;
       this.descripcion = descripcion;
       this.domicilioses = domicilioses;
    }
   
    public Integer getClaveMunicipio() {
        return this.claveMunicipio;
    }
    
    public void setClaveMunicipio(Integer claveMunicipio) {
        this.claveMunicipio = claveMunicipio;
    }
    public Codigospostales getCodigospostales() {
        return this.codigospostales;
    }
    
    public void setCodigospostales(Codigospostales codigospostales) {
        this.codigospostales = codigospostales;
    }
    public Estados getEstados() {
        return this.estados;
    }
    
    public void setEstados(Estados estados) {
        this.estados = estados;
    }
    public String getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Domicilios> getDomicilioses() {
        return this.domicilioses;
    }
    
    public void setDomicilioses(Set<Domicilios> domicilioses) {
        this.domicilioses = domicilioses;
    }




}

