package dio.desafio.padraospring.service;

import dio.desafio.padraospring.model.Cliente;

public interface ClienteService {
    
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}