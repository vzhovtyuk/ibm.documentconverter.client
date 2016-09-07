import com.ibm.watson.developer_cloud.document_conversion.v1.DocumentConversion;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="mailto:vzhovtiuk@gmail.com">Vitaliy Zhovtyuk</a>
 *         Date: 9/6/16
 *         Time: 1:21 PM
 */
public class DocConvConnector {
    public static void main(String[] args) {

        DocumentConversion service = new DocumentConversion("2015-12-15");
        service.setUsernameAndPassword("ebdc1eaa-29f3-4cb0-9e8a-d5e7eaaed700","WJZs6Ftpexgc");
        service.convertDocumentToAnswer()
/**
        {
            "url": "https://gateway.watsonplatform.net/document-conversion/api",
                "password": "WJZs6Ftpexgc",
                "username": ""
        }

        http://www.ibm.com/watson/developercloud/document-conversion/api/v1/?java#introduction
    
 **/}
}
