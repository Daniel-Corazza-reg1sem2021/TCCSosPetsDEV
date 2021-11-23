package tcc1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PetsDAO {

	@Id
	private Integer id_pet;
	
	@Column
	private String descricao;
	
	@Column
	private String porte_animal;
	
}
