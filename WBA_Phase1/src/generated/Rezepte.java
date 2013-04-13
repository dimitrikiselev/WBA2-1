//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.13 um 05:51:00 PM CEST 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rezept" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rezeptname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="bilder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="bild" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="bild_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *                                       &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="zubereitung">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="schwierigkeit">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="einfach"/>
 *                                   &lt;enumeration value="normal"/>
 *                                   &lt;enumeration value="schwer"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="zeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="brennwert" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="anleitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="zutaten">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="zutat" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="menge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="comments">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="comment" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *                                       &lt;element name="user_pic" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                       &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rezept"
})
@XmlRootElement(name = "rezepte")
public class Rezepte {

    @XmlElement(required = true)
    protected List<Rezepte.Rezept> rezept;

    /**
     * Gets the value of the rezept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rezept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRezept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rezepte.Rezept }
     * 
     * 
     */
    public List<Rezepte.Rezept> getRezept() {
        if (rezept == null) {
            rezept = new ArrayList<Rezepte.Rezept>();
        }
        return this.rezept;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="rezeptname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="bilder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="bild" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="bild_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}QName"/>
     *                             &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="zubereitung">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="schwierigkeit">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="einfach"/>
     *                         &lt;enumeration value="normal"/>
     *                         &lt;enumeration value="schwer"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="zeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="brennwert" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="anleitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="zutaten">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="zutat" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="menge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="comments">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="comment" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}QName"/>
     *                             &lt;element name="user_pic" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                             &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rezeptname",
        "bilder",
        "zubereitung",
        "zutaten",
        "comments"
    })
    public static class Rezept {

        @XmlElement(required = true)
        protected String rezeptname;
        @XmlElement(required = true)
        protected Rezepte.Rezept.Bilder bilder;
        @XmlElement(required = true)
        protected Rezepte.Rezept.Zubereitung zubereitung;
        @XmlElement(required = true)
        protected Rezepte.Rezept.Zutaten zutaten;
        @XmlElement(required = true)
        protected Rezepte.Rezept.Comments comments;

        /**
         * Ruft den Wert der rezeptname-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRezeptname() {
            return rezeptname;
        }

        /**
         * Legt den Wert der rezeptname-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRezeptname(String value) {
            this.rezeptname = value;
        }

        /**
         * Ruft den Wert der bilder-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Bilder }
         *     
         */
        public Rezepte.Rezept.Bilder getBilder() {
            return bilder;
        }

        /**
         * Legt den Wert der bilder-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Bilder }
         *     
         */
        public void setBilder(Rezepte.Rezept.Bilder value) {
            this.bilder = value;
        }

        /**
         * Ruft den Wert der zubereitung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Zubereitung }
         *     
         */
        public Rezepte.Rezept.Zubereitung getZubereitung() {
            return zubereitung;
        }

        /**
         * Legt den Wert der zubereitung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Zubereitung }
         *     
         */
        public void setZubereitung(Rezepte.Rezept.Zubereitung value) {
            this.zubereitung = value;
        }

        /**
         * Ruft den Wert der zutaten-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Zutaten }
         *     
         */
        public Rezepte.Rezept.Zutaten getZutaten() {
            return zutaten;
        }

        /**
         * Legt den Wert der zutaten-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Zutaten }
         *     
         */
        public void setZutaten(Rezepte.Rezept.Zutaten value) {
            this.zutaten = value;
        }

        /**
         * Ruft den Wert der comments-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Comments }
         *     
         */
        public Rezepte.Rezept.Comments getComments() {
            return comments;
        }

        /**
         * Legt den Wert der comments-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Comments }
         *     
         */
        public void setComments(Rezepte.Rezept.Comments value) {
            this.comments = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="bild" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="bild_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}QName"/>
         *                   &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bild"
        })
        public static class Bilder {

            @XmlElement(required = true)
            protected List<Rezepte.Rezept.Bilder.Bild> bild;

            /**
             * Gets the value of the bild property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bild property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBild().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Bilder.Bild }
             * 
             * 
             */
            public List<Rezepte.Rezept.Bilder.Bild> getBild() {
                if (bild == null) {
                    bild = new ArrayList<Rezepte.Rezept.Bilder.Bild>();
                }
                return this.bild;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="bild_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}QName"/>
             *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bildId",
                "user",
                "link"
            })
            public static class Bild {

                @XmlElement(name = "bild_id", required = true)
                protected BigInteger bildId;
                @XmlElement(required = true)
                protected QName user;
                @XmlElement(required = true)
                @XmlSchemaType(name = "anyURI")
                protected String link;

                /**
                 * Ruft den Wert der bildId-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getBildId() {
                    return bildId;
                }

                /**
                 * Legt den Wert der bildId-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setBildId(BigInteger value) {
                    this.bildId = value;
                }

                /**
                 * Ruft den Wert der user-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QName }
                 *     
                 */
                public QName getUser() {
                    return user;
                }

                /**
                 * Legt den Wert der user-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QName }
                 *     
                 */
                public void setUser(QName value) {
                    this.user = value;
                }

                /**
                 * Ruft den Wert der link-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLink() {
                    return link;
                }

                /**
                 * Legt den Wert der link-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLink(String value) {
                    this.link = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="comment" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}QName"/>
         *                   &lt;element name="user_pic" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                   &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "comment"
        })
        public static class Comments {

            @XmlElement(required = true)
            protected List<Rezepte.Rezept.Comments.Comment> comment;

            /**
             * Gets the value of the comment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Comments.Comment }
             * 
             * 
             */
            public List<Rezepte.Rezept.Comments.Comment> getComment() {
                if (comment == null) {
                    comment = new ArrayList<Rezepte.Rezept.Comments.Comment>();
                }
                return this.comment;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}QName"/>
             *         &lt;element name="user_pic" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "user",
                "userPic",
                "datum",
                "kommentar"
            })
            public static class Comment {

                @XmlElement(required = true)
                protected QName user;
                @XmlElement(name = "user_pic", required = true)
                @XmlSchemaType(name = "anyURI")
                protected String userPic;
                @XmlElement(required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar datum;
                @XmlElement(required = true)
                protected String kommentar;

                /**
                 * Ruft den Wert der user-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QName }
                 *     
                 */
                public QName getUser() {
                    return user;
                }

                /**
                 * Legt den Wert der user-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QName }
                 *     
                 */
                public void setUser(QName value) {
                    this.user = value;
                }

                /**
                 * Ruft den Wert der userPic-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUserPic() {
                    return userPic;
                }

                /**
                 * Legt den Wert der userPic-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUserPic(String value) {
                    this.userPic = value;
                }

                /**
                 * Ruft den Wert der datum-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDatum() {
                    return datum;
                }

                /**
                 * Legt den Wert der datum-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDatum(XMLGregorianCalendar value) {
                    this.datum = value;
                }

                /**
                 * Ruft den Wert der kommentar-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKommentar() {
                    return kommentar;
                }

                /**
                 * Legt den Wert der kommentar-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKommentar(String value) {
                    this.kommentar = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="schwierigkeit">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="einfach"/>
         *               &lt;enumeration value="normal"/>
         *               &lt;enumeration value="schwer"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="zeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="brennwert" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="anleitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "schwierigkeit",
            "zeit",
            "brennwert",
            "anleitung"
        })
        public static class Zubereitung {

            @XmlElement(required = true)
            protected String schwierigkeit;
            @XmlElement(required = true)
            protected String zeit;
            @XmlElement(required = true)
            protected BigInteger brennwert;
            @XmlElement(required = true)
            protected String anleitung;

            /**
             * Ruft den Wert der schwierigkeit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchwierigkeit() {
                return schwierigkeit;
            }

            /**
             * Legt den Wert der schwierigkeit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchwierigkeit(String value) {
                this.schwierigkeit = value;
            }

            /**
             * Ruft den Wert der zeit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZeit() {
                return zeit;
            }

            /**
             * Legt den Wert der zeit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZeit(String value) {
                this.zeit = value;
            }

            /**
             * Ruft den Wert der brennwert-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBrennwert() {
                return brennwert;
            }

            /**
             * Legt den Wert der brennwert-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBrennwert(BigInteger value) {
                this.brennwert = value;
            }

            /**
             * Ruft den Wert der anleitung-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnleitung() {
                return anleitung;
            }

            /**
             * Legt den Wert der anleitung-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnleitung(String value) {
                this.anleitung = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="zutat" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="menge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zutat"
        })
        public static class Zutaten {

            @XmlElement(required = true)
            protected List<Rezepte.Rezept.Zutaten.Zutat> zutat;

            /**
             * Gets the value of the zutat property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the zutat property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getZutat().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Zutaten.Zutat }
             * 
             * 
             */
            public List<Rezepte.Rezept.Zutaten.Zutat> getZutat() {
                if (zutat == null) {
                    zutat = new ArrayList<Rezepte.Rezept.Zutaten.Zutat>();
                }
                return this.zutat;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="menge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "einheit",
                "menge",
                "name"
            })
            public static class Zutat {

                @XmlElement(required = true)
                protected String einheit;
                @XmlElement(required = true)
                protected BigInteger menge;
                @XmlElement(required = true)
                protected String name;

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

                /**
                 * Ruft den Wert der menge-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMenge() {
                    return menge;
                }

                /**
                 * Legt den Wert der menge-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMenge(BigInteger value) {
                    this.menge = value;
                }

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }

    }

}
