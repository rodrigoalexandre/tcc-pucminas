package org.springframework.webinterface.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.webinterface.entity.AgreementDTO;
import org.springframework.webinterface.entity.RuleDTO;
import org.springframework.webinterface.entity.SupplierDTO;
import org.springframework.webinterface.util.ConfigProperties;

/**
 * Expõe os endpoints de acesso às páginas da aplicação web.
 * @author rodrigoalexandre
 *
 */
@Controller
public class WebinterfaceController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ConfigProperties config;

    @RequestMapping("/rules")
    public String rules(Model model) {

        ResponseEntity<RuleDTO[]> response = restTemplate.getForEntity(
                config.getRulesUrl(),
                RuleDTO[].class);
        RuleDTO[] rules = response.getBody();
        model.addAttribute("rules", Arrays.asList(rules));

        return "rules";
    
    }

    @RequestMapping("/consultancy")
    public String consultancy(Model model) {

        ResponseEntity<AgreementDTO[]> response = restTemplate.getForEntity(
                config.getAgreementsUrl(),
                AgreementDTO[].class);
        AgreementDTO[] agreements = response.getBody();
        model.addAttribute("agreements", Arrays.asList(agreements));
        
        return "consultancy";
    
    }

    @RequestMapping("/industprocess")
    public String industprocess(Model model) {

        ResponseEntity<SupplierDTO[]> response = restTemplate.getForEntity(
                config.getSuppliersUrl(),
                SupplierDTO[].class);
        SupplierDTO[] suppliers = response.getBody();
        model.addAttribute("suppliers", Arrays.asList(suppliers));

        return "industprocess";
    
    }

    @RequestMapping("/home")
    public String home(Model model) {

        return "home";
    
    }

}
