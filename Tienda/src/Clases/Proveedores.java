package Clases;

/**
 *
 * @author PC
 */
public class Proveedores {
    int id_contacto;
    String conctacto;
    String razon_social;
    String ciudad;
    String calle;
    String avenida;
    String nacionalidad;
    String Telefono;
    char activo;
    float estado_cuenta;
  
    public Proveedores(){
        System.out.println("Clase Proveedores");
    }

    public Proveedores(int id_contacto, String conctacto, String razon_social, String ciudad, String calle, String avenida, String nacionalidad, String Telefono, char activo, float estado_cuenta) {
        this.id_contacto = id_contacto;
        this.conctacto = conctacto;
        this.razon_social = razon_social;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.nacionalidad = nacionalidad;
        this.Telefono = Telefono;
        this.activo = activo;
        this.estado_cuenta = estado_cuenta;
    }

    public Proveedores(String conctacto, String razon_social, String ciudad, String calle, String avenida, String nacionalidad, String Telefono, char activo, float estado_cuenta) {
        this.conctacto = conctacto;
        this.razon_social = razon_social;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.nacionalidad = nacionalidad;
        this.Telefono = Telefono;
        this.activo = activo;
        this.estado_cuenta = estado_cuenta;
    }
    
    public int getId_contacto() {
        return id_contacto;
    }

    public void setId_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }

    public String getConctacto() {
        return conctacto;
    }

    public void setConctacto(String conctacto) {
        this.conctacto = conctacto;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public char getActivo() {
        return activo;
    }

    public void setActivo(char activo) {
        this.activo = activo;
    }

    public float getEstado_cuenta() {
        return estado_cuenta;
    }

    public void setEstado_cuenta(float estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "id_contacto=" + id_contacto + ", conctacto=" + conctacto + ", razon_social=" + razon_social + ", ciudad=" + ciudad + ", calle=" + calle + ", avenida=" + avenida + ", nacionalidad=" + nacionalidad + ", Telefono=" + Telefono + ", activo=" + activo + ", estado_cuenta=" + estado_cuenta + '}';
    }
  
    
}
