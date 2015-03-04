package net.eckenfels.test.xml;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;

import org.apache.xerces.impl.Version;


public class XMLInfoMain
{

    static String[] ps = new String[] { XMLInputFactory.ALLOCATOR, XMLInputFactory.IS_COALESCING, XMLInputFactory.IS_NAMESPACE_AWARE, XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES, XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, XMLInputFactory.IS_VALIDATING, XMLInputFactory.REPORTER, XMLInputFactory.RESOLVER, XMLInputFactory.SUPPORT_DTD,
                                        XMLOutputFactory.IS_REPAIRING_NAMESPACES,
                                        XMLConstants.FEATURE_SECURE_PROCESSING
                               };

    public static void main(String[] args)
    {
        XMLInputFactory ifact = XMLInputFactory.newFactory();
        System.out.println("XMLInputFactory   = " + getInfo(ifact.getClass()));
        for(int i=0;i<ps.length;i++)
            if (ifact.isPropertySupported(ps[i])) System.out.printf("%-40s = %s%n", ps[i], ifact.getProperty(ps[i]));
        XMLOutputFactory ofact = XMLOutputFactory.newFactory();
        System.out.println("XMLOutputFactory  = " + getInfo(ofact.getClass()));
        for(int i=0;i<ps.length;i++)
            if (ofact.isPropertySupported(ps[i])) System.out.printf("%-40s = %s%n", ps[i], ofact.getProperty(ps[i]));

        XMLEventFactory efact = XMLEventFactory.newFactory();
        System.out.println("  XMLEventFactory = " + getInfo(efact.getClass()));

        SAXParserFactory sfact = SAXParserFactory.newInstance();
        System.out.println("SAXParserFactory  = " + getInfo(sfact.getClass()));
        System.out.printf("%-40s = %s%n",  "isNamespaceAware", sfact.isNamespaceAware());
        System.out.printf("%-40s = %s%n",  "isValidating", sfact.isValidating());
        try { boolean r = sfact.isXIncludeAware(); System.out.printf("%-40s = %s%n",  "isXIncludeAware", r); } catch (Exception ex) { System.out.printf("%-40s = %s%n", "isXIncludeAware", "not supported");  }
        for(int i=0;i<ps.length;i++)
            try { boolean r = sfact.getFeature(ps[i]); System.out.printf("%-40s = %s%n", ps[i], r); } catch (Exception ignored) { /* ignored */  }

        DocumentBuilderFactory dfact = DocumentBuilderFactory.newInstance();
        System.out.println("DocumentBuilderF  = " + getInfo(dfact.getClass()));
        System.out.printf("%-40s = %s%n",  "isCoalescing", dfact.isCoalescing());
        System.out.printf("%-40s = %s%n",  "isExpandEntityReferences", dfact.isExpandEntityReferences());
        System.out.printf("%-40s = %s%n",  "isIgnoringComments", dfact.isIgnoringComments());
        System.out.printf("%-40s = %s%n",  "isIgnoringElementContentWhitespace", dfact.isIgnoringElementContentWhitespace());
        System.out.printf("%-40s = %s%n",  "isNamespaceAware", dfact.isNamespaceAware());
        System.out.printf("%-40s = %s%n",  "isValidating", dfact.isValidating());
        try { boolean r = dfact.isXIncludeAware(); System.out.printf("%-40s = %s%n",  "isXIncludeAware", r); } catch (Exception ex) { System.out.printf("%-40s = %s%n", "isXIncludeAware", "not supported");  }
        for(int i=0;i<ps.length;i++)
            try { Object r = dfact.getAttribute(ps[i]); System.out.printf("%-40s = %s%n", ps[i], r); } catch (Exception ignored) { /* ignored */  }
        for(int i=0;i<ps.length;i++)
            try { boolean r = dfact.getFeature(ps[i]); System.out.printf("%-40s = %s%n", ps[i], r); } catch (Exception ignored) { /* ignored */  }

        try {
        System.out.println("Xerces: " + Version.getVersion()+ " " + getInfo(Version.class));
        } catch (Error ignored) { /* ignored */ }
    }

    private static String getInfo(Class<?> cls)
    {
        Package p = cls.getPackage();
        return cls.getName() + " " + p.getImplementationTitle() + "/" + p.getImplementationVersion() + " @ " + p.getImplementationVersion();
    }

}

