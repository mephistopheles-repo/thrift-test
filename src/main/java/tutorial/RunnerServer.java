package tutorial;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Date: 23.10.2016
 * Time: 18:45
 * To change this template use File | Settings | File Templates.
 */
public class RunnerServer {

    public static void main(String[] args) {
        Handler h = new Handler();
        SomeService.Processor<Handler> p = new SomeService.Processor<>(h);

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(() -> {
            TServerTransport serverTransport = null;
            try {
                serverTransport = new TServerSocket(6666);
                TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(p));
                server.serve();

                System.out.println("server running");
            } catch (TTransportException e) {
                e.printStackTrace();
            }
        });
    }
}
