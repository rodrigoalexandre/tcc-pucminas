package org.springframework.rules.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.rules.entity.RuleDTO;
import org.springframework.rules.service.RulesService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.core.env.Environment;

/**
 * Expõe a API Rest para acesso ao serviço do repositório de normas.
 * @author rodrigoalexandre
 *
 */
@RestController
@RequestMapping("/api")
public class RulesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RulesController.class); 

    @Autowired
    RulesService rs;

    @Autowired
    private Environment env;

    @GetMapping(value = "/rules", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<RuleDTO> findAllRules() {

        try {
            LOGGER.info("Aplicação executada na URL : " + InetAddress.getLocalHost().getHostAddress());
            LOGGER.info("Aplicação executada na Porta : " + env.getProperty("local.server.port"));
        } catch (Exception error) {
            error.printStackTrace();
        }

        return rs.getAllRules();

    }

}
