
package br.gov.planejamento.sof.siop.servicoweb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de execucaoSubFuncaoDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="execucaoSubFuncaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://servicoweb.siop.sof.planejamento.gov.br/}baseDTO">
 *       &lt;sequence>
 *         &lt;element name="codigoSubFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programa" type="{http://servicoweb.siop.sof.planejamento.gov.br/}execucaoProgramaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "execucaoSubFuncaoDTO", propOrder = {
    "codigoSubFuncao",
    "programa"
})
public class ExecucaoSubFuncaoDTO
    extends BaseDTO
{

    protected String codigoSubFuncao;
    @XmlElement(nillable = true)
    protected List<ExecucaoProgramaDTO> programa;

    /**
     * Obt�m o valor da propriedade codigoSubFuncao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSubFuncao() {
        return codigoSubFuncao;
    }

    /**
     * Define o valor da propriedade codigoSubFuncao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSubFuncao(String value) {
        this.codigoSubFuncao = value;
    }

    /**
     * Gets the value of the programa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrograma().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExecucaoProgramaDTO }
     * 
     * 
     */
    public List<ExecucaoProgramaDTO> getPrograma() {
        if (programa == null) {
            programa = new ArrayList<ExecucaoProgramaDTO>();
        }
        return this.programa;
    }

}
