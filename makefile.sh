SRC_DIR=$(JAVA_HOME)/include
CPP_PATH=src/jni/FibonacciJNICppImpl.cpp
LIB_NAME=libfibonacci.dylib
TEST_RESULT=result.log 
INCLUDE = \
-I $(SRC_DIR)\
-I $(SRC_DIR)/darwin\

all: clean buildlib
	java -Djava.library.path="./target" -jar target/benchmarks.jar >$(TEST_RESULT)

buildlib: buildjar
	g++ $(INCLUDE) -shared $(CPP_PATH) -o target/$(LIB_NAME)
buildjar: 
	mvn clean install
clean:
	rm makefile
	rm -rf target/*
	
