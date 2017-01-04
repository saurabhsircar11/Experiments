#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_example_root_myapplicationopencv_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
