#include "P5Exception.h"

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     P5Exception
 * Method:    throwException
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_P5Exception_throwException
  (JNIEnv *env, jclass obj)
  {
    printf("throwException()\n");

    jclass jc;
    jmethodID mid;
    jthrowable throwObj;

    jc = (*env)->FindClass(env,"P5Exception");

    //mid = (*env)->GetMethodID(env, jc, "<init>", "([BI)V");
    mid = (*env)->GetMethodID(env, jc, "<init>", "(Ljava/lang/String;I)V");
    if (mid == NULL)
    {
      return ;
    }

    throwObj = (jthrowable) (*env)->NewObject(env, jc, mid, "Test Error Message", -1);
    (*env)->Throw(env, throwObj);

    return ;
  }

#ifdef __cplusplus
}
#endif
