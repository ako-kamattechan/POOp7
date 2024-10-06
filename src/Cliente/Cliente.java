
public class Cliente{
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int numCliente;
    protected int numCompras;
    
    public Cliente(String nombre, String apellido, int numCliente){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numCliente=numCliente;
        this.numCompras=0;
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}