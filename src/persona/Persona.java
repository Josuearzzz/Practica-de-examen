
package persona;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Josue Arias
 */
public class Persona {
    private String Nombre;
    private String Identificacion;
    private String Telefono;
    public LocalDate fechaNacimiento;

    public Persona(String Nombre, String Identificacion, String Telefono, LocalDate fechaNacimiento) {
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        this.Telefono = Telefono;
        this.fechaNacimiento = fechaNacimiento;
    }
    
  public int calcularEdad(){
     if(fechaNacimiento != null){
         return Period.between(fechaNacimiento, LocalDate.now()).getYears();
     }
        return 0;
  }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Identificacion=" + Identificacion + ", Telefono=" + Telefono + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
}
