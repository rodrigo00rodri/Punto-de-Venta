
package Modelo;

/**
 *
 * @author RODRIGO
 */
public class Login {
    private int id;
    private String nombre;
    private String correo;
    private String pass;

    public Login() {
    }

    public Login(int id, String nombre, String correo, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
