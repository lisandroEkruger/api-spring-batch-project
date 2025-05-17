package com.api.project.service;

import com.api.project.domain.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ReportGenerator {


    public void exportToPdf(List<ProductDTO> list) throws JRException, FileNotFoundException {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("reportsData", new JRBeanCollectionDataSource(list));

        JasperPrint report = JasperFillManager.fillReport(JasperCompileManager.compileReport(
                ResourceUtils.getFile("src/main/resources/report.jrxml")
                        .getAbsolutePath()), params, new JREmptyDataSource());

        JasperExportManager.exportReportToPdfFile(report, SendEmailStats.REPORT_PDF_PATH);
    }


}
