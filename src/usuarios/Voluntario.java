package usuarios;

public class Voluntario extends Usuario {
    @Override
    public String getTipoUsuario() {
        return "Voluntário";
    }
}
