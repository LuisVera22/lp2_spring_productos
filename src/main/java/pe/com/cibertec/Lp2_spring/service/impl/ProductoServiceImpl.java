package pe.com.cibertec.Lp2_spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import pe.com.cibertec.Lp2_spring.model.entity.ProductoEntity;
import pe.com.cibertec.Lp2_spring.repository.ProductoRepository;
import pe.com.cibertec.Lp2_spring.service.ProductoService;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService{

	private final ProductoRepository productoRepository;
	
	@Override
	public List<ProductoEntity> listarProducto() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public void crearProducto(ProductoEntity productoEntity) {
		// TODO Auto-generated method stub
		productoRepository.save(productoEntity);
	}
}
