
package fr.istic.aco.editor.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.istic.aco.editor.Receiver.MiniEditorSelect;
import fr.istic.aco.editor.Receiver.MiniEditorSelectClass;

/**
 * The Class EditorSelectTest.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */

public class EditorSelectTest {


		/** The select. */
		private MiniEditorSelect select; 
		
		/**
		 * Sets the up.
		 *
		 * @throws Exception the exception
		 */
		@Before
		public void setUp() throws Exception {
			select = new MiniEditorSelectClass();
		}
	
		/**
		 * Test constructor.
		 */
		@Test
		public void testConstructor() {
			assertEquals(select.getBegin(),0);
			assertEquals(select.getEnd(),0);
		}
		
		/**
		 * Test select.
		 */
		@Test
		/**
		 * Selection setup test
		 */
		public void  testSelect() {
			select.setBegin(2);
			select.setEnd(4);
			assertEquals(select.getBegin(),2);
			assertEquals(select.getEnd(),4);
			assertEquals(select.getLength(),2);
		}

	}