/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcNoticeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcNoticeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setContent(String value) {
    thosttradeapiJNI.CThostFtdcNoticeField_Content_set(swigCPtr, this, value);
  }

  public String getContent() {
    return thosttradeapiJNI.CThostFtdcNoticeField_Content_get(swigCPtr, this);
  }

  public void setSequenceLabel(String value) {
    thosttradeapiJNI.CThostFtdcNoticeField_SequenceLabel_set(swigCPtr, this, value);
  }

  public String getSequenceLabel() {
    return thosttradeapiJNI.CThostFtdcNoticeField_SequenceLabel_get(swigCPtr, this);
  }

  public CThostFtdcNoticeField() {
    this(thosttradeapiJNI.new_CThostFtdcNoticeField(), true);
  }

}