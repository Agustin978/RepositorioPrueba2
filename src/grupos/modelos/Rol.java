package grupos.modelos;

public enum Rol {
    ADMINISTRADOR("Administrador"),
    COLABORADOR("Colaborador");
    
    private String valor;

    private Rol(String valor) {
        this.valor = valor;
    }
    
    public static Rol getAdmin()
    {
        return ADMINISTRADOR;
    }
    
    public static Rol getColaborador()
    {
        return COLABORADOR;
    }
    
    
}

