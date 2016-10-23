package tutorial;

import org.apache.thrift.TException;

/**
 * Created with IntelliJ IDEA.
 * Date: 23.10.2016
 * Time: 18:46
 * To change this template use File | Settings | File Templates.
 */
public class Handler implements SomeService.Iface {
    public int add(int a, int b) throws TException {
        int c = a + b;
        System.out.println("server a+b = " + c);
        return c;
    }

    public String strCat(String a, String b) throws TException {
        String c = a+b;
        System.out.println("server a+b = " + c);
        return c;
    }

    @Override
    public resultDto addDto(Dto dto) throws TException {
        resultDto resultDto = new resultDto(dto.a+dto.b,dto.sa+dto.sb);
        return resultDto;
    }

    @Override
    public void throwEx() throws ThrowableEx, TException {
        throw new ThrowableEx(1111,"aaaa");
    }
}
