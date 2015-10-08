
package fr.istic.aco.editor.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.istic.aco.editor.Receiver.MiniEditorClipboard;
import fr.istic.aco.editor.Receiver.MiniEditorClipboardClass;

/**
 * The Class ClipTest.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class ClipTest {
	
	/** The clip. */
	private MiniEditorClipboard clip;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		clip = new MiniEditorClipboardClass();
	}
	
		/**
		 * Test clipboard.
		 */
		@Test
	public void testClipboard() {
		String str = "SMR";
		clip.Write(str);
		assertEquals(clip.Read(),str);
		}

}
