package org.springframework.rules.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.rules.entity.RuleDTO;
import org.springframework.stereotype.Component;

/**
 * Serviço para acesso ao repositório de normas.
 * @author rodrigoalexandre
 *
 */
@Component
public class RulesService {

    /**
     * Retorna todas as normas disponíveis no repositório.
     * @return
     */
    public List<RuleDTO> getAllRules() {

        List<RuleDTO> result = new ArrayList<>();

        RuleDTO rule = new RuleDTO();

        rule.setName("ISO 9001");
        rule.setDescription("A  ISO 9001 é um sistema de gestão com o intuito de garantir a otimização de processos, maior agilidade no desenvolvimento de produtos e produção mais ágil");
        rule.setYear(2015);
        rule.setUrl("https://www.iso.org/obp/ui/#iso:std:iso:9001:ed-5:v1:en");
        result.add(rule);

        rule = new RuleDTO();
        rule.setName("ISO 14001");
        rule.setDescription("A ISO 14001 tem como objetivo principal especificar os requisitos para a implementação de um sistema de gestão ambiental");
        rule.setYear(2015);
        rule.setUrl("https://www.iso.org/obp/ui/#iso:std:iso:14001:ed-3:v1:en");
        result.add(rule);

        rule = new RuleDTO();
        rule.setName("ISO 27001");
        rule.setDescription("A ISO/IEC 27001 é um padrão internacional sobre como gerenciar segurança da informação.");
        rule.setYear(2013);
        rule.setUrl("https://www.iso.org/obp/ui/#iso:std:iso-iec:27001:ed-2:v1:en");
        result.add(rule);

        rule = new RuleDTO();
        rule.setName("ISO 8601");
        rule.setDescription("A ISO 8601 é uma norma internacional para representação de data e hora.");
        rule.setYear(2019);
        rule.setUrl("https://www.iso.org/obp/ui/#iso:std:iso:8601:-1:ed-1:v1:en");
        result.add(rule);

        return result;

    }

}
