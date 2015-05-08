 This project contains three parts: 
- benchmark, 
- java facade to invoke native and java methods
- implementation of getNativeFib

To run benchmark use command make all. It builds jar, library and run benchmark
To build benchmark use command make buildjar.
To build library use command  make buildlib. Library will be located in target folder
If it's necessary correct INCLUDE variable  to set a location of jni.h and jni_md.h in makefile.sh
The benchmark runs getJavaFib and getNativeFib 300 times with two parameters 5 and 45. 
Result.log shows run time of each method with the corresponding parameters