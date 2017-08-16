import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class VendingMachineTest {

    @Test
    public void nothing(){
        Kasa kasa = null;
        Produkty produkty = null;
        VendingMachine testObject = new VendingMachine(kasa,produkty);
    }
}
