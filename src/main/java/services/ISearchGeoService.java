package services;

public interface ISearchGeoService {

		boolean getUsers (Long id_usuario, String nome);
		
		boolean searchByGeolocalizacao (String cidade, Integer cep, String bairro);
		
}
