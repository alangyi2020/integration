package automata_pojo_hibernate;

import java.io.StringWriter;
import java.text.SimpleDateFormat;

//import java.util.logging.Logger;    
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/*import com.hp.sk.ru.verejnost.konanie.datatypes.*;
import com.hp.sk.ru.verejnost.konanie.datatypes.VyhladajKonanieResponse;*/

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
@SuppressWarnings("restriction")
public class XMLUtil {
	public static String toXML( Object data) {
        String xml = "";
        try {
        	JacksonXmlModule xmlModule = new JacksonXmlModule();
        	xmlModule.setDefaultUseWrapper(false);
        	ObjectMapper objectMapper = new XmlMapper(xmlModule);

    		objectMapper.registerModule(new JaxbAnnotationModule());
        	//XmlMapper xmlMapper = new XmlMapper();
    		JaxbAnnotationModule mo = new JaxbAnnotationModule();
    		
    		 objectMapper.registerModule(mo);
    		    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);    		    
    		    objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
    		    objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
    		    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    		    objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
    		    objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    		    //objectMapper.getSerializationConfig();
        	
        	xml = objectMapper.writeValueAsString(data);
        	
            //System.out.println(xml);
         } catch(Exception e) {
            e.printStackTrace();
         }
        	
        
       /* try {        	
            //logger.info("Generating xml for: " + data.getClass());
        	System.out.println(data.getClass());
            JAXBContext jaxbContext = JAXBContext.newInstance(  data.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //jaxbMarshaller.marshal(data, System.out);
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(data, sw);
            xml = sw.toString();
        } catch (JAXBException e) {
            //handle your exception here
        }*/
        return xml;
    }


}
