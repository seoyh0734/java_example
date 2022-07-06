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
JNIEXPORT jbyteArray JNICALL Java_JNI_getByteArray
  (JNIEnv *env, jobject obj)
{
  unsigned char out[40960] = { 0x01, };

  int i=0;
  for (i=0; i<40960; i++)
  {
    out[i] = 70;
  }

  jbyteArray jbuf = (*env)->NewByteArray(env, 40960);
  jbyteArray lbuf = (*env)->NewLocalRef(env, jbuf);
  jbyteArray gbuf = (*env)->NewGlobalRef(env, jbuf);
  (*env)->SetByteArrayRegion(env, jbuf, 0, 40960, (jbyte*)out);
  //(*env)->DeleteLocalRef(env, jbuf);
  //(*env)->DeleteLocalRef(env, lbuf);
  //(*env)->DeleteGlobalRef(env, gbuf);
  //jbyte *jkey = (*env)->GetByteArrayElements(env, jbuf, 0);
  //(*env)->ReleaseByteArrayElements(env, jbuf, jkey, 0);

  return lbuf;
  //return gbuf;
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
