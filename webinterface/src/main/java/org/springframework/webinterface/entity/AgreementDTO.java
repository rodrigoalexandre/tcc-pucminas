package org.springframework.webinterface.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Entidade que representa um contrato de assessoria ou consultoria.
 * @author rodrigoalexandre
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgreementDTO {

	/**
	 * Número do contrato.
	 */
    private String contractNumber;

    /**
     * Descrição do contrato.
     */
    private String description;

    /**
     * Empresa contratada.
     */
    private String advisor;

    /**
     * Valor do contrato.
     */
    private BigDecimal fee;

    /**
     * Data de início da vigência do contrato.
     */
    private String initialDate;

    /**
     * Data final de vigência do contrato. 
     */
    private String endDate;

    /**
     * Link/URL para o documento do contrato.
     */
    private String documentUrl;

    /**
     * 
     * @return
     */
	public String getContractNumber() {
		return contractNumber;
	}

	/**
	 * 
	 * @param contractNumber
	 */
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
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
	public String getAdvisor() {
		return advisor;
	}

	/**
	 * 
	 * @param advisor
	 */
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	/**
	 * 
	 * @return
	 */
	public BigDecimal getFee() {
		return fee;
	}

	/**
	 * 
	 * @param fee
	 */
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	/**
	 * 
	 * @return
	 */
	public String getInitialDate() {
		return initialDate;
	}

	/**
	 * 
	 * @param initialDate
	 */
	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}

	/**
	 * 
	 * @return
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * 
	 * @return
	 */
	public String getDocumentUrl() {
		return documentUrl;
	}

	/**
	 * 
	 * @param documentUrl
	 */
	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}

}
