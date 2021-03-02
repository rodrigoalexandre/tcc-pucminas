package org.springframework.rules.entity;

/**
 * Entidade que representa uma norma (regra).
 * @author rodrigoalexandre
 *
 */
public class RuleDTO {

    /**
     * Nome da norma.
     */
    private String name;

    /**
     * Descrição da norma.
     */
    private String description;

    /**
     * Ano de publicação da norma.
     */
    private Integer year;

    /**
     * URL de acesso ao documento da norma.
     */
    private String url;

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
    public Integer getYear() {
        return year;
    }

    /**
     * 
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
