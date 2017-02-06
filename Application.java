import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Lori on 2/6/2017.
 */
public class Application
{
    public static void main (String[] args)
    {
        Invoice invoiceTest = new Invoice();
        invoiceTest.setPartDescription("4GB of DDR3 RAM");
        invoiceTest.setPrice(8);
        invoiceTest.setQuantity(8);

        System.out.println(invoiceTest.getInvoiceAmount());

    }
}
