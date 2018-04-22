/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcRspUserLogin2Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspUserLogin2Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspUserLogin2Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcRspUserLogin2Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_TradingDay_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_LoginTime_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_UserID_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_SystemName_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_SessionID_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_FFEXTime_get(swigCPtr, this);
  }

  public void setINETime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_INETime_set(swigCPtr, this, value);
  }

  public String getINETime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_INETime_get(swigCPtr, this);
  }

  public void setRandomString(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_RandomString_set(swigCPtr, this, value);
  }

  public String getRandomString() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRspUserLogin2Field_RandomString_get(swigCPtr, this);
  }

  public CThostFtdcRspUserLogin2Field() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcRspUserLogin2Field(), true);
  }

}