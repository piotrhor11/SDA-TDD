import com.sun.deploy.security.MozillaMyKeyStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class VendingMachineTest {

    CashBox cashBox;
    Products products;
    VendingMachine testObject;

    @Before
    public void init(){
        cashBox = mock(CashBox.class);
        products = mock(Products.class);
        testObject = new VendingMachine(cashBox, products);
    }

    @Test
    public void kiedyWkladamyDolaraKasaGoPrzyjmuje(){
        testObject.execute("D");
        verify(cashBox).insertDollar();
        noMoreInteractions();
    }

    @Test
    public void kiedyWkladamyCwiercDolaraKasaGoPrzyjmuje(){
        testObject.execute("Q");
        verify(cashBox).insertQuarter();
        noMoreInteractions();
    }

    @Test
    public void kiedyWkladamy10CentowKasaJePrzyjmuje(){
        testObject.execute("d");
        verify(cashBox).insertDime();
        noMoreInteractions();
    }

    @Test
    public void kiedyWkladamy5CentowKasaJePrzyjmuje(){
        testObject.execute("N");
        verify(cashBox).insertNickel();
        noMoreInteractions();
    }

    @Test
    public void kiedyWkladamy1CentaKasaGoPrzyjmuje(){
        testObject.execute("P");
        verify(cashBox).insertPenny();
        noMoreInteractions();
    }

    @Test
    public void kiedyWloze2RozneMonetyKasaJePrzyjmie(){
        testObject.execute("DQ");
        verify(cashBox).insertDollar();
        verify(cashBox).insertQuarter();
        noMoreInteractions();
    }

    private void noMoreInteractions() {
        verify(cashBox).returnMoney();
        verifyNoMoreInteractions(cashBox);
    }

    @Test
    public void kiedyWloze2DolaryKasaJePrzyjmie(){
        testObject.execute("DD");
        verify(cashBox, times(2)).insertDollar();
        noMoreInteractions();
    }

    //ToDo DDQQdNNPdP

    @Test
    public void kiedyWlozeDolaraIWybioreProduktDrozszyMaszynaZwrociKase(){
        when(cashBox.returnMoney()).thenReturn("D");
        String result = testObject.execute("DA");
        verify(cashBox).insertDollar();
        noMoreInteractions();
        assertEquals("D",result);
    }

}
