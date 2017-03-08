
package br.gov.planejamento.sof.siop.servicoweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarAcompanhamentoOrcamentario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarAcompanhamentoOrcamentario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credencial" type="{http://servicoweb.siop.sof.planejamento.gov.br/}credencialDTO" minOccurs="0"/>
 *         &lt;element name="acompanhamentoAcao" type="{http://servicoweb.siop.sof.planejamento.gov.br/}acompanhamentoOrcamentarioAcaoDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarAcompanhamentoOrcamentario", propOrder = {
    "credencial",
    "acompanhamentoAcao"
})
public class CadastrarAcompanhamentoOrcamentario {

    protected CredencialDTO credencial;
    protected AcompanhamentoOrcamentarioAcaoDTO acompanhamentoAcao;

    /**
     * Obt�m o valor da propriedade credencial.
     * 
     * @return
     *     possible object is
     *     {@link CredencialDTO }
     *     
     */
    public CredencialDTO getCredencial() {
        return credencial;
    }

    /**
     * Define o valor da propriedade credencial.
     * 
     * @param value
     *     allowed object is
     *     {@link CredencialDTO }
     *     
     */
    public void setCredencial(CredencialDTO value) {
        this.credencial = value;
    }

    /**
     * Obt�m o valor da propriedade acompanhamentoAcao.
     * 
     * @return
     *     possible object is
     *     {@link AcompanhamentoOrcamentarioAcaoDTO }
     *     
     */
    public AcompanhamentoOrcamentarioAcaoDTO getAcompanhamentoAcao() {
        return acompanhamentoAcao;
    }

    /**
     * Define o valor da propriedade acompanhamentoAcao.
     * 
     * @param value
     *     allowed object is
     *     {@link AcompanhamentoOrcamentarioAcaoDTO }
     *     
     */
    public void setAcompanhamentoAcao(AcompanhamentoOrcamentarioAcaoDTO value) {
        this.acompanhamentoAcao = value;
    }

}
