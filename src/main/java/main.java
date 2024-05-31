import client.HeaderHandlerResolver;
import xml.CustomerPort;
import xml.CustomerPortService;
import xml.GetCustomerDetailRequest;
import xml.GetCustomerDetailResponse;

import java.math.BigInteger;

public class main {

    public static void main(String[] args) {
        CustomerPortService service = new CustomerPortService();
        HeaderHandlerResolver headerHandlerResolver = new HeaderHandlerResolver();
        service.setHandlerResolver(headerHandlerResolver);
        CustomerPort port = service.getCustomerPortSoap11();
        GetCustomerDetailRequest getCustomerDetailRequest = new GetCustomerDetailRequest();
        getCustomerDetailRequest.setId(BigInteger.valueOf(1));

        GetCustomerDetailResponse getCustomerDetailResponse = port.getCustomerDetail(getCustomerDetailRequest);
        System.out.println("Id " + getCustomerDetailResponse.getCustomerDetail().getId());
        System.out.println("Nome " + getCustomerDetailResponse.getCustomerDetail().getName());
        System.out.println("Email " + getCustomerDetailResponse.getCustomerDetail().getEmail());
    }
}
