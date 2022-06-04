package Course;

import Gateways.EmailGatewayFactory;
import Gateways.GatewaysFactory;
import Gateways.SMSGatewayFactory;

public class singleton {
    private static GatewaysFactory GetMailInstance = null;
    private static GatewaysFactory GetSMSInstance = null;


    private static GatewaysFactory EmailFactory = null;
    private static GatewaysFactory SMSFactory = null;


    public static GatewaysFactory GatemailInstance() {
        if (EmailFactory == null)
            EmailFactory = new EmailGatewayFactory();
        return EmailFactory;
    }

    public static GatewaysFactory GetSMSInstance() {
        if (SMSFactory == null)
            SMSFactory = new SMSGatewayFactory();
        return SMSFactory;
    }



}
