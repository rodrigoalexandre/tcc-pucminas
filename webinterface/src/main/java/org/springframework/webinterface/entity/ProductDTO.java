package org.springframework.webinterface.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Entidade que representa um produto (matéria-prima) para o processo têxtil.
 * @author rodrigoalexandre
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO {

	/**
	 * Código de identificação do produto.
	 */
	private String code;

	/**
	 * Descrição do produto.
	 */
    private String description;

    /**
     * Preço unitário do produto.
     */
    private BigDecimal unitPrice;

    /**
     * 
     * @return
     */
	public String getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	/**
	 * 
	 * @param unitPrice
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

}
