
package br.gov.planejamento.sof.siop.servicoweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de obterAcoesPorPrograma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="obterAcoesPorPrograma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credencial" type="{http://servicoweb.siop.sof.planejamento.gov.br/}credencialDTO" minOccurs="0"/>
 *         &lt;element name="exercicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoPrograma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMomento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataHoraReferencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterAcoesPorPrograma", propOrder = {
    "credencial",
    "exercicio",
    "codigoPrograma",
    "codigoMomento",
    "dataHoraReferencia"
})
public class ObterAcoesPorPrograma {

    protected CredencialDTO credencial;
    protected Integer exercicio;
    protected String codigoPrograma;
    protected Integer codigoMomento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraReferencia;

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
     * Obt�m o valor da propriedade exercicio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExercicio() {
        return exercicio;
    }

    /**
     * Define o valor da propriedade exercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExercicio(Integer value) {
        this.exercicio = value;
    }

    /**
     * Obt�m o valor da propriedade codigoPrograma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPrograma() {
        return codigoPrograma;
    }

    /**
     * Define o valor da propriedade codigoPrograma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPrograma(String value) {
        this.codigoPrograma = value;
    }

    /**
     * Obt�m o valor da propriedade codigoMomento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoMomento() {
        return codigoMomento;
    }

    /**
     * Define o valor da propriedade codigoMomento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoMomento(Integer value) {
        this.codigoMomento = value;
    }

    /**
     * Obt�m o valor da propriedade dataHoraReferencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraReferencia() {
        return dataHoraReferencia;
    }

    /**
     * Define o valor da propriedade dataHoraReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraReferencia(XMLGregorianCalendar value) {
        this.dataHoraReferencia = value;
    }

}
