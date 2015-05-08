#include "ru_nchalkova_fibonacci_FibonacciFacade.h"

JNIEXPORT jlong JNICALL Java_ru_nchalkova_fibonacci_FibonacciFacade_getNativeFib
(JNIEnv *, jobject, jint n)
{
	if(n == 0) return 0;
	if(n == 1) return 1;

    jlong a = 1;
    jlong b = 0;
    jlong next = 0;
    for (int i = 0; i < n; i++) {
        next = a + b;
        a = b;
        b = next;
    }
    return next;

}
