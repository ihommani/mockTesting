package mocking;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.api.easymock.annotation.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.expect;
import static org.powermock.api.easymock.PowerMock.createMock;
import static org.powermock.api.easymock.PowerMock.replay;
import static org.powermock.api.support.SuppressCode.suppressConstructor;

@RunWith(PowerMockRunner.class)
@PrepareForTest( { Singleton.class })
public class FooClazzTest extends TestCase {

    @Test
    public void testGetMyTralala() throws Exception {

        suppressConstructor(Singleton.class);

        PowerMock.mockStatic(Singleton.class);

        Singleton mockSingleton = createMock(Singleton.class);

        expect(Singleton.getInstance()).andReturn(mockSingleton).anyTimes();
        expect(mockSingleton.getHolyGrail()).andReturn(43);
        replay(Singleton.class);
        replay(mockSingleton);

        FooClazz underTest = new FooClazz();
        Assert.assertEquals(43, underTest.getMyTralala());
    }
}