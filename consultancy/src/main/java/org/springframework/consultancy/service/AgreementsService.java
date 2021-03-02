package org.springframework.consultancy.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.text.SimpleDateFormat;

import org.springframework.consultancy.entity.AgreementDTO;
import org.springframework.stereotype.Component;

/**
 * Serviço para acesso ao repositório de contratos de assessoria e consultoria.
 * @author rodrigoalexandre
 *
 */
@Component
public class AgreementsService {

    /**
     * Retorna todos os contratos disponíveis no repositório.
     * @return
     */
    public List<AgreementDTO> getAllAgreements() {

        List<AgreementDTO> result = new ArrayList<>();

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        AgreementDTO agreement = new AgreementDTO();
        agreement.setContractNumber("123123123123123");
        agreement.setDescription("Contrato de Prestação de Serviços de Assessoria de Imprensa");
        agreement.setAdvisor("Comunicações Eficientes Ltda");
        agreement.setFee(new BigDecimal(20000.00));
        agreement.setInitialDate(dateFormatter.format(new GregorianCalendar(2021, Calendar.JANUARY, 1, 0, 0, 0).getTime()));
        agreement.setEndDate(dateFormatter.format(new GregorianCalendar(2023, Calendar.DECEMBER, 31, 23, 59, 59).getTime()));
        agreement.setDocumentUrl("http://indtexbr.com/agreement/contract1.pdf");
        result.add(agreement);

        agreement = new AgreementDTO();
        agreement.setContractNumber("456456456456456");
        agreement.setDescription("Contrato de Prestação de Serviços de Consultoria Financeira");
        agreement.setAdvisor("Finanças Inteligentes S.A.");
        agreement.setFee(new BigDecimal(30000.00));
        agreement.setInitialDate(dateFormatter.format(new GregorianCalendar(2021, Calendar.JANUARY, 1, 0, 0, 0).getTime()));
        agreement.setEndDate(dateFormatter.format(new GregorianCalendar(2024, Calendar.DECEMBER, 31, 23, 59, 59).getTime()));
        agreement.setDocumentUrl("http://indtexbr.com/agreement/contract2.pdf");
        result.add(agreement);

        agreement = new AgreementDTO();
        agreement.setContractNumber("789789789789789");
        agreement.setDescription("Contrato de Prestação de Serviços de Assessoria Jurídica");
        agreement.setAdvisor("Lawyers Advocacia e Consultoria Jurídica Ltda");
        agreement.setFee(new BigDecimal(30000.00));
        agreement.setInitialDate(dateFormatter.format(new GregorianCalendar(2021, Calendar.JANUARY, 1, 0, 0, 0).getTime()));
        agreement.setEndDate(dateFormatter.format(new GregorianCalendar(2023, Calendar.DECEMBER, 31, 23, 59, 59).getTime()));
        agreement.setDocumentUrl("http://indtexbr.com/agreement/contract3.pdf");
        result.add(agreement);

        return result;

    }

}
