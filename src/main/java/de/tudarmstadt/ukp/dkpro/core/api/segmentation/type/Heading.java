

/* First created by JCasGen Thu Feb 28 20:07:00 CET 2019 */
package de.tudarmstadt.ukp.dkpro.core.api.segmentation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/** Document title, section heading, etc.
 * Updated by JCasGen Mon Nov 18 17:15:05 CET 2019
 * XML source: /home/stud_homes/s3676959/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyOCR.xml
 * @generated */
public class Heading extends Div {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Heading.class);
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
    protected Heading() {/* intentionally empty block */}
    
    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Heading(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Heading(JCas jcas) {
    super(jcas);
    readObject();   
  } 

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public Heading(JCas jcas, int begin, int end) {
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

}

    