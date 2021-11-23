package repositorio;

import tcc1.PetsDAO;
import tcc1.UsuarioDAO;

public interface Repositorio {
	
	Repositorio selectById(Long id);
	
	Repositorio updateUsuario(UsuarioDAO u);
	Repositorio saveUsuario(UsuarioDAO u);
	
	
	
	Repositorio updatePet(PetsDAO p);
	Repositorio savePet(PetsDAO p);
}
