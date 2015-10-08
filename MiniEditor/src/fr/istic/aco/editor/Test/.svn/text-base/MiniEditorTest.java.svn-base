
package fr.istic.aco.editor.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import fr.istic.aco.editor.Receiver.MiniEditorBufferClass;
import fr.istic.aco.editor.Receiver.MiniEditorSelectClass;
import fr.istic.aco.editor.Receiver.MiniEditorEngineClass;

/**
 * The Class MiniEditorTest.
 */
public class MiniEditorTest {
	
	/** The buffer1. */
	private MiniEditorBufferClass buffer1;
	
	/** The select test1. */
	private MiniEditorSelectClass selectTest1;
	
	/** The engine test. */
	private MiniEditorEngineClass engineTest;
	
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		buffer1 = new MiniEditorBufferClass();
		selectTest1 = new MiniEditorSelectClass();
		engineTest = new MiniEditorEngineClass();
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {
		String strTest1 = "nidhi" ;
		String strTest2 = "saini" ;
		String strTest3 = "nidhisaini" ;
				
		buffer1.setStr(strTest1);
		assertEquals(strTest1, buffer1.getStr());
		
		int stringLength=buffer1.getStr().length() + strTest2.length();
		buffer1.write(strTest1.length()+1, stringLength, strTest2);
		assertEquals(strTest3, buffer1.getStr());	
		
		buffer1.Read(0, stringLength);
		assertEquals(strTest3, buffer1.getStr());	
		

		engineTest.engineInsert(strTest1);
		assertEquals(strTest3, buffer1.Read(0, buffer1.getLength()));	

		selectTest1.setBegin(2);
		assertEquals(2, selectTest1.getBegin());

		
	}

}
