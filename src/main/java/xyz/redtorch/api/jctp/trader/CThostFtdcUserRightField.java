/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcUserRightField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserRightField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcUserRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcUserRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcUserRightField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcUserRightField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcUserRightField_UserID_get(swigCPtr, this);
  }

  public void setUserRightType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcUserRightField_UserRightType_set(swigCPtr, this, value);
  }

  public char getUserRightType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcUserRightField_UserRightType_get(swigCPtr, this);
  }

  public void setIsForbidden(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcUserRightField_IsForbidden_set(swigCPtr, this, value);
  }

  public int getIsForbidden() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcUserRightField_IsForbidden_get(swigCPtr, this);
  }

  public CThostFtdcUserRightField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcUserRightField(), true);
  }

}