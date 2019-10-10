/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import interfaces.JanelaRelatórioProduto;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import persistência.BD;

/**
 *
 * @author felipe-pc
 */
public class ControladorRelatorioProdutos {
    
    public ControladorRelatorioProdutos()
    {
        new JanelaRelatórioProduto(this).setVisible(true);   
    }

    public void gerarRelatorioGeral() {
        String src = "/home/felipe-pc/SistemaEstoque/SistemaEstoque/src/relatorio/relatorio.jasper";
        
        JasperPrint jaspertPrint = null;
        
        try {
            
            jaspertPrint = JasperFillManager.fillReport(src, null, BD.conexão);
            
        } catch (JRException ex) {
            System.out.println("Error: "+ex);
        }
        
        JasperViewer view = new JasperViewer(jaspertPrint,false);
        
        view.setVisible(true);
    }
}
