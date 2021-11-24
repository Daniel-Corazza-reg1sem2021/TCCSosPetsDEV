package tcc1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pets")
public class PetsDAO {

	@Id
	private int id_pet;

	@Column
	private String descricao;

	@Column
	private String porte_animal;

	@Column
	private float latitude;

	@Column
	private float longitude;

}
