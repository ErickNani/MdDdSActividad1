public class Sesion {
    private Usuario usuario;
    private boolean activo;

    public void iniciarSesion(String username, String password) {
        if ("admin".equals(username) && "admin".equals(password)) {
            usuario = new Usuario("Admin", username, password, "admin@example.com");
            activo = true;
            System.out.println("Sesión iniciada con éxito!");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }

    public void finalizarSesion() {
        usuario = null;
        activo = false;
        System.out.println("Sesión finalizada.");
    }

    public boolean isActivo() {
        return activo;
    }
}
