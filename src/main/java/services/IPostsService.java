package services;

public interface IPostsService {

	boolean criarPublicacao (Long id_usuario, String email, String descricaoPet);
	
	boolean postarPublicacao (String nomeUser, String mensagem);
}
