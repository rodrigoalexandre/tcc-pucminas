package org.springframework.industprocess.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.industprocess.entity.SupplierDTO;
import org.springframework.industprocess.service.SuppliersService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Expõe a API Rest para acesso ao serviço do repositório de fornecedores.
 * @author rodrigoalexandre
 *
 */
@RestController
@RequestMapping("/api")
public class SuppliersController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SuppliersController.class);
 
    @Autowired
    SuppliersService ss;

    @Autowired
    private Environment env;

    @GetMapping(value = "/suppliers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SupplierDTO> findAllSuppliers() {

        try {
            LOGGER.info("Aplicação executada na URL : " + InetAddress.getLocalHost().getHostAddress());
            LOGGER.info("Aplicação executada na Porta : " + env.getProperty("local.server.port"));
        } catch (Exception error) {
            error.printStackTrace();
        }

        return ss.getAllSuppliers();

    }

}
