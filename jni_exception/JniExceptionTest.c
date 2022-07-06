#include "JniExceptionTest.h"

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     JniExceptionTest
 * Method:    exception
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_JniExceptionTest_exception
  (JNIEnv *env, jclass obj)
  {
    printf("exception()\n");
    jclass jc;
    jmethodID mid;
    jthrowable throwObj;
    jc = (*env)->FindClass(env, "java/lang/Exception");
    if (jc == NULL)
    {
      printf("Failed to find exception class\n");
      return ;
    }

    (*env)->ThrowNew(env, jc, "테스트 에러 메시지");
    (*env)->DeleteLocalRef(env, jc);
    return ;
  }

#ifdef __cplusplus
}
#endif
