
package br.gov.planejamento.sof.siop.servicoweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de objetivoDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="objetivoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://servicoweb.siop.sof.planejamento.gov.br/}baseDTO">
 *       &lt;sequence>
 *         &lt;element name="codigoMomento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoObjetivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPrograma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enunciado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exercicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="identificadorUnico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="snExclusaoLogica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetivoDTO", propOrder = {
    "codigoMomento",
    "codigoObjetivo",
    "codigoOrgao",
    "codigoPrograma",
    "enunciado",
    "exercicio",
    "identificadorUnico",
    "snExclusaoLogica"
})
public class ObjetivoDTO
    extends BaseDTO
{

    protected Integer codigoMomento;
    protected String codigoObjetivo;
    protected String codigoOrgao;
    protected String codigoPrograma;
    protected String enunciado;
    protected Integer exercicio;
    protected Integer identificadorUnico;
    protected Boolean snExclusaoLogica;

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
     * Obt�m o valor da propriedade codigoObjetivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoObjetivo() {
        return codigoObjetivo;
    }

    /**
     * Define o valor da propriedade codigoObjetivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoObjetivo(String value) {
        this.codigoObjetivo = value;
    }

    /**
     * Obt�m o valor da propriedade codigoOrgao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOrgao() {
        return codigoOrgao;
    }

    /**
     * Define o valor da propriedade codigoOrgao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOrgao(String value) {
        this.codigoOrgao = value;
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
     * Obt�m o valor da propriedade enunciado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * Define o valor da propriedade enunciado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnunciado(String value) {
        this.enunciado = value;
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
     * Obt�m o valor da propriedade identificadorUnico.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdentificadorUnico() {
        return identificadorUnico;
    }

    /**
     * Define o valor da propriedade identificadorUnico.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdentificadorUnico(Integer value) {
        this.identificadorUnico = value;
    }

    /**
     * Obt�m o valor da propriedade snExclusaoLogica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnExclusaoLogica() {
        return snExclusaoLogica;
    }

    /**
     * Define o valor da propriedade snExclusaoLogica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnExclusaoLogica(Boolean value) {
        this.snExclusaoLogica = value;
    }

}
