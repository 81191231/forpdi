
package br.gov.planejamento.sof.siop.servicoweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de esferaDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="esferaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEsfera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataHoraAlteracao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoAbreviada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snAtivo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="snValorizacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esferaDTO", propOrder = {
    "codigoEsfera",
    "dataHoraAlteracao",
    "descricao",
    "descricaoAbreviada",
    "snAtivo",
    "snValorizacao"
})
public class EsferaDTO {

    protected String codigoEsfera;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraAlteracao;
    protected String descricao;
    protected String descricaoAbreviada;
    protected Boolean snAtivo;
    protected Boolean snValorizacao;

    /**
     * Obt�m o valor da propriedade codigoEsfera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEsfera() {
        return codigoEsfera;
    }

    /**
     * Define o valor da propriedade codigoEsfera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEsfera(String value) {
        this.codigoEsfera = value;
    }

    /**
     * Obt�m o valor da propriedade dataHoraAlteracao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraAlteracao() {
        return dataHoraAlteracao;
    }

    /**
     * Define o valor da propriedade dataHoraAlteracao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraAlteracao(XMLGregorianCalendar value) {
        this.dataHoraAlteracao = value;
    }

    /**
     * Obt�m o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoAbreviada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoAbreviada() {
        return descricaoAbreviada;
    }

    /**
     * Define o valor da propriedade descricaoAbreviada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoAbreviada(String value) {
        this.descricaoAbreviada = value;
    }

    /**
     * Obt�m o valor da propriedade snAtivo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnAtivo() {
        return snAtivo;
    }

    /**
     * Define o valor da propriedade snAtivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnAtivo(Boolean value) {
        this.snAtivo = value;
    }

    /**
     * Obt�m o valor da propriedade snValorizacao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnValorizacao() {
        return snValorizacao;
    }

    /**
     * Define o valor da propriedade snValorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnValorizacao(Boolean value) {
        this.snValorizacao = value;
    }

}
