# JavaXMLTest
Sandbox for Java XML technology

## buidling
> mvn verify

## running

### With only JDK/JAX-P implementation:
    C:\ws\github\JavaXMLTest>"%JAVA_1_8_HOME%\bin\java" -cp target\java-xml-test-0.0.1-SNAPSHOT.jar net.eckenfels.test.xml.XMLInfoMain
    XMLInputFactory   = com.sun.xml.internal.stream.XMLInputFactoryImpl Java Runtime Environment/1.8.0_40 @ 1.8.0_40
     javax.xml.stream.allocator                    = null
     javax.xml.stream.isCoalescing                 = false
     javax.xml.stream.isNamespaceAware             = true
     javax.xml.stream.isReplacingEntityReferences  = true
     javax.xml.stream.isSupportingExternalEntities = true
     javax.xml.stream.isValidating                 = false
     javax.xml.stream.reporter                     = null
     javax.xml.stream.resolver                     = null
     javax.xml.stream.supportDTD                   = true

    XMLOutputFactory  = com.sun.xml.internal.stream.XMLOutputFactoryImpl Java Runtime Environment/1.8.0_40 @ 1.8.0_40
     javax.xml.stream.isRepairingNamespaces        = false

    XMLEventFactory   = com.sun.xml.internal.stream.events.XMLEventFactoryImpl Java Runtime Environment/1.8.0_40 @ 1.8.0_40

    SAXParserFactory  = com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl Java Runtime Environment/1.8.0_40 @ 1.8.0_40
     isNamespaceAware                              = false
     isValidating                                  = false
     isXIncludeAware                               = false
     http://javax.xml.XMLConstants/feature/secure-processing = true

    DocumentBuilderF  = com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl Java Runtime Environment/1.8.0_40 @ 1.8.0_40
     isCoalescing                                  = false
     isExpandEntityReferences                      = true
     isIgnoringComments                            = false
     isIgnoringElementContentWhitespace            = false
     isNamespaceAware                              = false
     isValidating                                  = false
     isXIncludeAware                               = false
     http://javax.xml.XMLConstants/feature/secure-processing = true

### With xerces on classpath

    C:\ws\github\JavaXMLTest>"%JAVA_1_8_HOME%\bin\java" -cp target\java-xml-test-0.0.1-SNAPSHOT.jar;%REP%\xerces\xercesImpl\2.11.0\xercesImpl-2.11.0.jar net.eckenfels.test.xml.XMLInfoMain
    XMLInputFactory   = com.sun.xml.internal.stream.XMLInputFactoryImpl Java Runtime Environment/1.8.0_40 @ 1.8.0_40
     javax.xml.stream.allocator                    = null
     javax.xml.stream.isCoalescing                 = false
     javax.xml.stream.isNamespaceAware             = true
     javax.xml.stream.isReplacingEntityReferences  = true
     javax.xml.stream.isSupportingExternalEntities = true
     javax.xml.stream.isValidating                 = false
     javax.xml.stream.reporter                     = null
     javax.xml.stream.resolver                     = null
     javax.xml.stream.supportDTD                   = true

    XMLOutputFactory  = com.sun.xml.internal.stream.XMLOutputFactoryImpl Java Runtime Environment/1.8.0_40 @ 1.8.0_40
     javax.xml.stream.isRepairingNamespaces        = false

    XMLEventFactory   = org.apache.xerces.stax.XMLEventFactoryImpl null/null @ null

    SAXParserFactory  = org.apache.xerces.jaxp.SAXParserFactoryImpl null/null @ null
     isNamespaceAware                              = false
     isValidating                                  = false
     isXIncludeAware                               = false
     http://javax.xml.XMLConstants/feature/secure-processing = false

    DocumentBuilderF  = org.apache.xerces.jaxp.DocumentBuilderFactoryImpl null/null @ null
     isCoalescing                                  = false
     isExpandEntityReferences                      = true
     isIgnoringComments                            = false
     isIgnoringElementContentWhitespace            = false
     isNamespaceAware                              = false
     isValidating                                  = false
     isXIncludeAware                               = false
     http://javax.xml.XMLConstants/feature/secure-processing = false

    Xerces: Xerces-J 2.11.0 org.apache.xerces.impl.Version null/null @ null
