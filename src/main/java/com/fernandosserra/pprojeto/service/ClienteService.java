package com.fernandosserra.pprojeto.service;

import com.fernandosserra.pprojeto.model.Cliente;

/**
 * Interface para definir o padrão <b>Strategy</b> no domínio de Cliente.
 * Com isso, se necessário, podemos ter múltiplas implementações dessa mesma interface.
 *
 * @author fernandosserra
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}