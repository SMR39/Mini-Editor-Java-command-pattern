
package fr.istic.aco.editor.Test;

import static org.junit.Assert.*;
import fr.istic.aco.editor.Receiver.MiniEditorBuffer;
import fr.istic.aco.editor.Receiver.MiniEditorBufferClass;

import org.junit.Before;
import org.junit.Test;

/**
 * The Class BufferTest.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class BufferTest {
	
	/** The buffer. */
	private MiniEditorBuffer buffer;
	
	/** The Str. */
	String Str = "Shashi Reddy";
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		buffer = new MiniEditorBufferClass();
		buffer.write(0, 0, Str);
	}
	
	/**
	 * Test read buffer.
	 */
	
	@Test
	public void testReadBuffer() {
		assertEquals(buffer.Read(0,buffer.getLength()),Str);
	}
	
	/**
	 * Test write buffer.
	 */
	
	@Test
	public void testWriteBuffer() {
		String sub="SMR";
		int start=5;
		int stop=8;
		buffer.write(start, stop, sub);
		Str = Str.substring(0, start)+sub+Str.substring(stop);
		assertEquals(buffer.Read(0,buffer.getLength()),Str);
	}
	
	/**
	 * Test length buffer.
	 */
	@Test
	public void testLengthBuffer() {
		assertEquals(buffer.getLength(),Str.length());
	}
}
