package org.springframework.webinterface.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config.properties")
public class ConfigProperties {

    @Value("${rulesUrl}")
    private String rulesUrl;

    @Value("${agreementsUrl}")
    private String agreementsUrl;

    @Value("${suppliersUrl}")
    private String suppliersUrl;

    public String getRulesUrl() {
        return rulesUrl;
    }

    public void setRulesUrl(String rulesUrl) {
        this.rulesUrl = rulesUrl;
    }

    public String getAgreementsUrl() {
        return agreementsUrl;
    }

    public void setAgreementsUrl(String agreementsUrl) {
        this.agreementsUrl = agreementsUrl;
    }

    public String getSuppliersUrl() {
        return suppliersUrl;
    }

    public void setSuppliersUrl(String suppliersUrl) {
        this.suppliersUrl = suppliersUrl;
    }

}
