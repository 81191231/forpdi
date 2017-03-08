
package br.gov.planejamento.sof.siop.servicoweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consultarNaturezasDisponiveisParaProposta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consultarNaturezasDisponiveisParaProposta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credencial" type="{http://servicoweb.siop.sof.planejamento.gov.br/}credencialDTO" minOccurs="0"/>
 *         &lt;element name="filtro" type="{http://servicoweb.siop.sof.planejamento.gov.br/}filtroNaturezaDespesaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarNaturezasDisponiveisParaProposta", propOrder = {
    "credencial",
    "filtro"
})
public class ConsultarNaturezasDisponiveisParaProposta {

    protected CredencialDTO credencial;
    protected FiltroNaturezaDespesaDTO filtro;

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
     * Obt�m o valor da propriedade filtro.
     * 
     * @return
     *     possible object is
     *     {@link FiltroNaturezaDespesaDTO }
     *     
     */
    public FiltroNaturezaDespesaDTO getFiltro() {
        return filtro;
    }

    /**
     * Define o valor da propriedade filtro.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroNaturezaDespesaDTO }
     *     
     */
    public void setFiltro(FiltroNaturezaDespesaDTO value) {
        this.filtro = value;
    }

}
