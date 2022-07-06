#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include "TestClass.h"

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     TestClass
 * Method:    GetString
 * Signature: ([BI[BI)I
 */
JNIEXPORT jint JNICALL Java_TestClass_GetString
  (JNIEnv *env, jclass obj, jbyteArray out, jbyteArray in, jint inLen)
{
  jbyte *outIter = (*env)->GetByteArrayElements(env, out, 0);
  unsigned char *buf = "abcde";
  int outLen = 3;

  memcpy(outIter, buf, outLen);

  (*env)->ReleaseByteArrayElements(env, out, outIter,0);

  return 3;
}

#ifdef __cplusplus
}
#endif
