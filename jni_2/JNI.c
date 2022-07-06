#include "JNI.h"
#include <stdio.h>
#include <stdlib.h>

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     JNI
 * Method:    getIntArray
 * Signature: ()J
 */
JNIEXPORT jbyte JNICALL Java_JNI_getByte
  (JNIEnv *env, jobject obj)
{
  unsigned char out = 72;

  jbyte jbuf = 72;
  //jbyte lbuf = (*env)->NewLocalRef(env, jbuf);
  //jbyteArray gbuf = (*env)->NewGlobalRef(env, jbuf);
  //(*env)->DeleteLocalRef(env, jbuf);
  //(*env)->DeleteLocalRef(env, lbuf);
  //(*env)->DeleteGlobalRef(env, gbuf);

  //return jbuf;
  return jbuf;
}

JNIEXPORT void JNICALL Java_JNI_releaseByteArray
  (JNIEnv *env, jobject obj, jbyteArray target)
{
  //jbyte *arrElement = (*env)->GetByteArrayElements(env, target, 0);

  //(*env)->ReleaseByteArrayElements(env, target, arrElement, 0);

  //(*env)->DeleteGlobalRef(env, target);
  (*env)->DeleteLocalRef(env, target);

  return ;
}

/*
 * Class:     JNI
 * Method:    printHello
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_JNI_printHello
  (JNIEnv *env, jobject obj)
{
  //std::cout << "Hellow!" << std::endl;
  printf("Hellow!!\n");
}

#ifdef __cplusplus
}
#endif
