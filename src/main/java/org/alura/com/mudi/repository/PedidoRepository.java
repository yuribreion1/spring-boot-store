package org.alura.com.mudi.repository;

import java.util.List;

import org.alura.com.mudi.model.Pedido;
import org.alura.com.mudi.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
    public List<Pedido> findAll();

	public List<Pedido> findByStatus(StatusPedido status);
}
