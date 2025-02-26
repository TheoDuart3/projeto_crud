package br.com.projetocrud.produtos.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.projetocrud.produtos.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long>{

} 
