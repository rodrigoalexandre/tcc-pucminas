package org.springframework.webinterface.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Entidade que representa um fornecedor.
 * @author rodrigoalexandre
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierDTO {

	/**
	 * Nome do fornecedor.
	 */
    private String name;

    /**
     * Endereço do fornecedor.
     */
    private String address;

    /**
     * Número do endereço do fornecedor.
     */
    private Integer number;

    /**
     * Cidade do fornecedor.
     */
    private String city;

    /**
     * Estado do fornecedor.
     */
    private String state;

    /**
     * Pais do fornecedor.
     */
    private String country;

    /**
     * CEP do fornecedor.
     */
    private String zipCode;

    /**
     * Telefone de contato do fornecedor.
     */
    private String phone;

    /**
     * Email do fornecedor.
     */
    private String email;

    /**
     * CNPJ do fornecedor.
     */
    private String cnpj;

    /**
     * Produtos fornecidos pela empresa.
     */
    private List<ProductDTO> products;

    /**
     * 
     * @return
     */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * 
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 
	 * @return
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * 
	 * @param zipCode
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * 
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * 
	 * @param cnpj
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * 
	 * @return
	 */
	public List<ProductDTO> getProducts() {
		return products;
	}

	/**
	 * 
	 * @param products
	 */
	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

}
