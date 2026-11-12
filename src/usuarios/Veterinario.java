package usuarios;

public class Veterinario extends Usuario {
    @Override
    public String getTipoUsuario() {
        return "Veterinário";
    }
}
