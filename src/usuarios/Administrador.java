package usuarios;

public class Administrador extends Usuario {
    @Override
    public String getTipoUsuario() {
        return "Administrador";
    }
}
