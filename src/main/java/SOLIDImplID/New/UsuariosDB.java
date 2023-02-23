package SOLIDImplID.New;

import java.util.ArrayList;

interface UsuariosDB {
    ArrayList<Usuario> obtener();
    Usuario buscar(Usuario usuario);
    void insertar(Usuario usuario);
    void borrar(Usuario usuario);

}
