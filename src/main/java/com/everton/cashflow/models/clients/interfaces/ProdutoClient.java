package com.everton.cashflow.models.clients.interfaces;

import com.everton.cashflow.models.entidades.Produto;

public interface ProdutoClient extends GenericClient<Produto>{
    ProdutoClient getInstance();
}
