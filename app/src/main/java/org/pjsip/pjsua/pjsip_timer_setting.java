/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsip_timer_setting {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsip_timer_setting(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsip_timer_setting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsip_timer_setting(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMin_se(long value) {
    pjsuaJNI.pjsip_timer_setting_min_se_set(swigCPtr, this, value);
  }

  public long getMin_se() {
    return pjsuaJNI.pjsip_timer_setting_min_se_get(swigCPtr, this);
  }

  public void setSess_expires(long value) {
    pjsuaJNI.pjsip_timer_setting_sess_expires_set(swigCPtr, this, value);
  }

  public long getSess_expires() {
    return pjsuaJNI.pjsip_timer_setting_sess_expires_get(swigCPtr, this);
  }

  public pjsip_timer_setting() {
    this(pjsuaJNI.new_pjsip_timer_setting(), true);
  }

}
