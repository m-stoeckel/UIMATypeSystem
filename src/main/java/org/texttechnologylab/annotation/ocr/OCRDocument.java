

/* First created by JCasGen Tue Mar 12 17:40:05 CET 2019 */
package org.texttechnologylab.annotation.ocr;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Nov 18 17:15:05 CET 2019
 * XML source: /home/stud_homes/s3676959/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyOCR.xml
 * @generated */
public class OCRDocument extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(OCRDocument.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {return typeIndexID;}
 
    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected OCRDocument() {/* intentionally empty block */}
    
    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public OCRDocument(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public OCRDocument(JCas jcas) {
    super(jcas);
    readObject();   
  } 

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public OCRDocument(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
     * Write your own initialization here
     * <!-- end-user-doc -->
     *
   * @generated modifiable 
   */
    private void readObject() {/*default - does nothing empty block */}


    //*--------------*
    //* Feature: documentname

    /**
     * getter for documentname - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getDocumentname() {
    if (OCRDocument_Type.featOkTst && ((OCRDocument_Type)jcasType).casFeat_documentname == null)
      jcasType.jcas.throwFeatMissing("documentname", "org.texttechnologylab.annotation.ocr.OCRDocument");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OCRDocument_Type)jcasType).casFeatCode_documentname);}
    
    /**
     * setter for documentname - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setDocumentname(String v) {
    if (OCRDocument_Type.featOkTst && ((OCRDocument_Type)jcasType).casFeat_documentname == null)
      jcasType.jcas.throwFeatMissing("documentname", "org.texttechnologylab.annotation.ocr.OCRDocument");
    jcasType.ll_cas.ll_setStringValue(addr, ((OCRDocument_Type)jcasType).casFeatCode_documentname, v);}    
  }

    