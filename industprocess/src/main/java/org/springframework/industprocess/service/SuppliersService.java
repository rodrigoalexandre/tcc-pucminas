package org.springframework.industprocess.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.industprocess.entity.ProductDTO;
import org.springframework.industprocess.entity.SupplierDTO;
import org.springframework.stereotype.Component;

/**
 * Serviço para acesso ao repositório de contratos de assessoria e consultoria.
 * @author rodrigoalexandre
 *
 */
@Component
public class SuppliersService {

    /**
     * Retorna todos os fornecedores disponíveis no repositório.
     * @return
     */
    public List<SupplierDTO> getAllSuppliers() {

        List<SupplierDTO> result = new ArrayList<>();

        SupplierDTO supplier = new SupplierDTO();
        supplier.setName("Super Fabril Comércio e Serviços Têxteis");
        supplier.setAddress("Rua Dom Pedro II");
        supplier.setNumber(800);
        supplier.setCity("São Paulo");
        supplier.setState("SP");
        supplier.setZipCode("11.222-333");
        supplier.setCountry("Brasil");
        supplier.setCnpj("11.111.111/1111-11");
        supplier.setPhone("(11) 1111-2222");
        supplier.setEmail("contato@superfabril.com.br");

        List<ProductDTO> products = new ArrayList<>();
        ProductDTO prod = new ProductDTO();
        prod.setCode("250018952200");
        prod.setDescription("Rolo de fio de algodão");
        prod.setUnitPrice(new BigDecimal(60.00));
        products.add(prod);
        prod = new ProductDTO();
        prod.setCode("352522638000");
        prod.setDescription("Fibra sintética");
        prod.setUnitPrice(new BigDecimal(100.00));
        products.add(prod);

        supplier.setProducts(products);
        result.add(supplier);

        supplier = new SupplierDTO();
        supplier.setName("Mega Produtos Têxteis");
        supplier.setAddress("Rua Pedro Álvares Cabral");
        supplier.setNumber(1300);
        supplier.setCity("Rio de Janeiro");
        supplier.setState("RJ");
        supplier.setZipCode("22.333-444");
        supplier.setCountry("Brasil");
        supplier.setCnpj("22.222.222/2222-22");
        supplier.setPhone("(21) 2222-3333");
        supplier.setEmail("contato@megaprodutos.com.br");

        products = new ArrayList<>();
        prod = new ProductDTO();
        prod.setCode("451500008745");
        prod.setDescription("Seda");
        prod.setUnitPrice(new BigDecimal(150.00));
        products.add(prod);

        supplier.setProducts(products);
        result.add(supplier);

        supplier = new SupplierDTO();
        supplier.setName("Excellence Produtos Têxteis");
        supplier.setAddress("Avenida Princesa Isabel");
        supplier.setNumber(45);
        supplier.setCity("Belo Horizonte");
        supplier.setState("MG");
        supplier.setZipCode("33.444-555");
        supplier.setCountry("Brasil");
        supplier.setCnpj("33.333.333/3333-33");
        supplier.setPhone("(31) 3333-4444");
        supplier.setEmail("contato@excellencetextil.com.br");
        supplier.setProducts(products);

        products = new ArrayList<>();
        prod = new ProductDTO();
        prod.setCode("550011258522");
        prod.setDescription("Tinta");
        prod.setUnitPrice(new BigDecimal(50.00));
        products.add(prod);

        supplier.setProducts(products);
        result.add(supplier);

        return result;

    }

}
