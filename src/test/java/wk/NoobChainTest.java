package wk;

import org.junit.Test;
import junit.framework.Assert;

public class NoobChainTest {

    @Test
    public void integrityTest() {
        NoobChain chain = new NoobChain();
        Assert.assertEquals(true, chain.isChainValid());
    }
}
