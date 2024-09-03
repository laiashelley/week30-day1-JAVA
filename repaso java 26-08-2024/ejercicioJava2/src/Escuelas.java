public class Escuelas {

    private String nombreEscuela;
    private String localidadEscuela;
    private float precioEscuela;
    private boolean cursoNocturnoEscuela;
    
    public Escuelas() {
    }

    public Escuelas(String nombreEscuela, String localidadEscuela, float precioEscuela, boolean cursoNocturnoEscuela) {
        this.nombreEscuela = nombreEscuela;
        this.localidadEscuela = localidadEscuela;
        this.precioEscuela = precioEscuela;
        this.cursoNocturnoEscuela = cursoNocturnoEscuela;
    }

    public String getNombreEscuela() {
        return this.nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    public String getLocalidadEscuela() {
        return this.localidadEscuela;
    }

    public void setLocalidadEscuela(String localidadEscuela) {
        this.localidadEscuela = localidadEscuela;
    }

    public float getPrecioEscuela() {
        return this.precioEscuela;
    }

    public void setPrecioEscuela(float precioEscuela) {
        this.precioEscuela = precioEscuela;
    }

    public boolean isCursoNocturnoEscuela() {
        return this.cursoNocturnoEscuela;
    }

    public boolean getCursoNocturnoEscuela() {
        return this.cursoNocturnoEscuela;
    }

    public void setCursoNocturnoEscuela(boolean cursoNocturnoEscuela) {
        this.cursoNocturnoEscuela = cursoNocturnoEscuela;
    }

    @Override
    public String toString() {
       
        return "Nombre: " + getNombreEscuela() + "; " +
            "Localidad: " + getLocalidadEscuela() + "; " +
            "Precio: " + getPrecioEscuela() + "; " +
            "¿Curso nocturno? " + (isCursoNocturnoEscuela() ? "Si" : "No");
    }

}
