package ejercicio1;

public class persona {
    private String nombre;
    private String apellido;

    public persona (String nombre ,String apellido){
        this.nombre= nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    @Override
    public String toString(){
        return "persona{" +
                "apellido" + nombre + '\'' +
                "apellido= "+ apellido +  '\'' +
                '}';
    }
}
