package XML;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxPrser {
    public static void main(String[] args) {
        final String fileName = "D:\\NEW_CODE\\RebootHomeWork\\src\\XML";

        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = factory.newSAXParser();   //парсер, умеющий читать xml документ

            DefaultHandler handler = new DefaultHandler(); //обрабатывает тег, после чего с ним что-то делает

            saxParser.parse(fileName, handler); //запускаем сам парсер и передаем в (сам файл, и что нужно с ним делать)
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
