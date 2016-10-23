package tutorial;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * Created with IntelliJ IDEA.
 * Date: 23.10.2016
 * Time: 18:56
 * To change this template use File | Settings | File Templates.
 */
public class ClientRunner {
    public static void main(String[] args) throws TException {
        TTransport tTransport = new TSocket("localhost", 6666);
        tTransport.open();

        TProtocol protocol = new TBinaryProtocol(tTransport);
        SomeService.Client client = new SomeService.Client(protocol);

        System.out.println("client recieve add(int,int)=" + client.add(10, 2));
        System.out.println("client recieve str+str=" + client.strCat("some", "shit"));

        Dto dto = new Dto(11,12,"13","14");

        System.out.println("client recieve dto "+client.addDto(dto));

        try {
            client.throwEx();
        } catch (ThrowableEx e) {
            System.out.println(e.toString());
        }

        tTransport.close();
    }
}
