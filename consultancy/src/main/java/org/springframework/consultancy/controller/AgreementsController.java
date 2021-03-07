package org.springframework.consultancy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.consultancy.entity.AgreementDTO;
import org.springframework.consultancy.service.AgreementsService;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Expõe a API Rest para acesso ao serviço do repositório de contratos de consultorias e assessorias.
 * @author rodrigoalexandre
 *
 */
@RestController
@RequestMapping("/api")
public class AgreementsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgreementsController.class);

    @Autowired
    AgreementsService as;

    @Autowired
    private Environment env;

    @GetMapping(value = "/agreements", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AgreementDTO> findAllAgreements() {

        try {
            LOGGER.info("Aplicação executada na URL : " + InetAddress.getLocalHost().getHostAddress());
            LOGGER.info("Aplicação executada na Porta : " + env.getProperty("local.server.port"));
        } catch (Exception error) {
            error.printStackTrace();
        }

        return as.getAllAgreements();

    }

}
