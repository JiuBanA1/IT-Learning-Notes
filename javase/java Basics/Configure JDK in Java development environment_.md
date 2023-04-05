## I. What is JDK?
#### 1. General introduction 
> JDK is a software development kit in Java language, which is mainly used for java applications on mobile devices and embedded devices. JDK is the core of the entire Java development, which includes the Java Runtime Environment and Java tools.

#### 2. Importance of JDK 
> without JDK, you cannot compile Java programs (java source code. java files). If you want to run only Java programs (class, jar, or other archive files).

## II. How to choose JDK8 and JDK17 in Java?
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676983051679-4582e9b1-353c-42e5-aa54-6909fd3c10c6.png#averageHue=%23868d93&clientId=ua800d6e7-b375-4&from=paste&height=398&id=ue2515d1d&name=image.png&originHeight=597&originWidth=1079&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=701946&status=done&style=none&taskId=u3d09d143-de4e-4ec4-8a84-9ee8e1dfe3a&title=&width=719.3333333333334)
#### 1. Stable JDK Version 
> JDK has been updated. So far, JDK has three long-term support versions: JDK 8, JDK 11, and JDK 17.

#### 2, what is the long-term support version we are talking about? 
> These three versions are JDK versions maintained by Oracle for a long time. In enterprises, they need to support versions for a long time because their projects need a stable development environment.

#### 3, how to Select
JDK8: 
> JDK8, because compared with the previous JDK7 and JDK5, the ecology of JDK8 is very good, and developers are more comfortable to use than the previous versions. At the same time, JDK8 supports almost all the development functional requirements, and the design is relatively perfect. JDK8 is also the version with the longest maintenance support time so far.

DK17: 
> when using JDK8 to develop programs, there are always some drawbacks and many more requirements. Therefore, Oracle has gradually released another version of JDK17 that supports long-term update and maintenance. Compared with JDK8, there are many internal upgrades. However, JDK8 is still the mainstream.

## 3. What is the relationship between JDK and JRE?
> JDK,Java Development Kit; JRE,Java runtime environment; A more popular explanation is that the software needs to be downloaded and installed as long as the Java program is developed. For developers, once the Java program is developed, it also needs to be run and tested. Therefore, JDK and JRE are an inclusion relationship.

## 4. Basic components included in JDK

- javac-compiler to convert source program into bytecode 
- jar-Packaging Tool to package related class files into one file 
- javadoc-document generator to extract documents from source code comments 
- jdb-debugger, error detection tool 
- java-run the compiled java program (.class suffix) 
- appletviewer: a small program browser that executes HTML file Java browser of the Java applet on 
- javah: generates a C/C ++ procedure that can call Java procedures, or creates a header file that can be called by Java programs. 
- Javap:Java anti-assembler, which displays the accessible functions and data in Compiled files, and also displays byte Code meaning 
- Jconsole: Java tools for system debugging and monitoring
## 5. JDK download steps
> Java has been purchased by Oracle. Download it on Oracle's official website

[https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
> Click product

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676223386471-d4d6f677-b281-4b1a-94ec-319e6b78f4a4.png#averageHue=%2347423d&clientId=u825363cc-fc37-4&from=paste&height=630&id=ua3da2444&name=image.png&originHeight=945&originWidth=1722&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=560668&status=done&style=none&taskId=u920b2fab-64c6-4b11-b4b1-59a9188dd46&title=&width=1148)
> Click Java

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676223446765-5dc23be2-eed5-4320-aa01-39fa18db2004.png#averageHue=%233b3733&clientId=u825363cc-fc37-4&from=paste&height=594&id=u73a005ec&name=image.png&originHeight=891&originWidth=1722&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=301408&status=done&style=none&taskId=ub8275962-19c0-4137-b650-01a50294907&title=&width=1148)
> Click download Java to go to the download page of Java.

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676223522875-e35aa84f-f023-4aad-a948-dcf1df014dfa.png#averageHue=%2347816b&clientId=u825363cc-fc37-4&from=paste&height=625&id=ued42f922&name=image.png&originHeight=937&originWidth=1722&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=442091&status=done&style=none&taskId=ube637012-0084-4d81-aba0-9529865c432&title=&width=1148)
> Find your favorite JDK Version and download it

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676223622409-bb7053d3-826e-4fb9-b89d-7fa069ed3b00.png#averageHue=%23fcfbfa&clientId=u825363cc-fc37-4&from=paste&height=541&id=u213d1e1e&name=image.png&originHeight=811&originWidth=1722&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=285834&status=done&style=none&taskId=u3e98d47d-e68a-47a0-ac6b-4b80ffff022&title=&width=1148)
## JDK installation
1，Double-click to run the installation package. The installation program appears and click next.
2，modify the JDK installation directory
3，Follow the prompts to complete the installation. This completes the jdk installation. You can click close directly.
## JDK environment configuration
1，Right-click this computer → properties → Advanced System Settings → environment variables 
2，environment variable → Create 
3, click Create to create the system variable JAVA_HOME. The value is the JDK installation bin directory. 
4, JDK configuration verification Press and hold win + R at the same time, enter cmd, press enter, enter the command prompt window, input java, and then press enter to see the following similar information, indicating that the environment variable is installed successfully.


