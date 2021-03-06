/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.apache.camel.component.msmq.native_support;

public class ByteArray {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ByteArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ByteArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        msmq_native_supportJNI.delete_ByteArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ByteArray(int nelements) {
    this(msmq_native_supportJNI.new_ByteArray(nelements), true);
  }

  public byte getitem(int index) {
    return msmq_native_supportJNI.ByteArray_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, byte value) {
    msmq_native_supportJNI.ByteArray_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_signed_char cast() {
    long cPtr = msmq_native_supportJNI.ByteArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_signed_char(cPtr, false);
  }

  public static ByteArray frompointer(SWIGTYPE_p_signed_char t) {
    long cPtr = msmq_native_supportJNI.ByteArray_frompointer(SWIGTYPE_p_signed_char.getCPtr(t));
    return (cPtr == 0) ? null : new ByteArray(cPtr, false);
  }

}
