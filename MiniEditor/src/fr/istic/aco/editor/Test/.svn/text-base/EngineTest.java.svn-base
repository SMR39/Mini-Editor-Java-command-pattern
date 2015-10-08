
package fr.istic.aco.editor.Test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import fr.istic.aco.editor.Receiver.MiniEditorEngineClass;

/**
 * The Class EngineTest.
 */
public class EngineTest {
		
		/** The engine test. */
		private MiniEditorEngine engineTest;
		
		/** The str. */
		String str = "Shashi";
		
		/** The begin. */
		int begin=0;
		
		/** The end. */
		int end=0;
		
		/**
		 * Sets the up.
		 *
		 * @throws Exception the exception
		 */
		@Before
		public void setUp() throws Exception {
			engineTest = new MiniEditorEngineClass();
		}
		
		/**
		 * Test empty or not.
		 */
		@Test
		public void testEmptyOrNot() {
			assertEquals(engineTest.getBuffer().Read(0,engineTest.getBuffer().getLength()),"");
			assertEquals(engineTest.getSelection().getLength(),0);
			assertEquals(engineTest.getClipboard().Read(),"");

		}
		
		/**
		 * Test insert.
		 */
		@Test
		public void testInsert() {
			engineTest.engineInsert(str);
			assertEquals(engineTest.getBuffer().Read(0, engineTest.getBuffer().getLength()),str);
		
				
			engineTest.engineInsert("Mohan");
			assertEquals(engineTest.getBuffer().Read(0, engineTest.getBuffer().getLength()),str+"Mohan");
					
			engineTest.engineSelect(0, 0);
			engineTest.engineInsert("Ravula");
			assertEquals(engineTest.getBuffer().Read(0, engineTest.getBuffer().getLength()),"Ravula"+str+"Mohan");
			
		}
		
		/**
		 * Test editor select.
		 */
		@Test
		public void testEditorSelect() {
			engineTest.engineInsert(str);
			assertEquals(engineTest.getBuffer().Read(0, engineTest.getBuffer().getLength()),str);
			begin=2;
			end=5;
			engineTest.engineSelect(begin, end);
			assertEquals(engineTest.getSelection().getLength(),end-begin);
			
		}
		
		/**
		 * Test editor copy.
		 */
		@Test
		public void testEditorCopy() {
			engineTest.engineInsert(str);
			begin=2;
			end=5;
			engineTest.engineSelect(begin, end);
			engineTest.engineCopy();
			assertEquals(engineTest.getBuffer().Read(0, engineTest.getBuffer().getLength()),str);
			assertEquals(engineTest.getSelection().getLength(),end-begin);
			assertEquals(engineTest.getClipboard().Read(),str.substring(begin, end));
		}
		
		/**
		 * Test editor cut.
		 */
		@Test
		public void testEditorCut() {
			engineTest.engineInsert(str);
			begin=2;
			end=5;
			String clipText = str.substring(begin, end);
			str = str.substring(0, begin)+str.substring(end);
			engineTest.engineSelect(begin, end);
			engineTest.engineCut();
			
			assertEquals(engineTest.getSelection().getLength(),end-begin);
			assertEquals(engineTest.getClipboard().Read(),clipText);
		}
		
		/**
		 * Test editor paste.
		 */
		@Test
		public void testEditorPaste() {
			engineTest.engineInsert(str);
			begin=3;
			end=5;
			String clipText = str.substring(begin, end);
			str = str.substring(0, begin)+str.substring(end);
			engineTest.engineSelect(begin, end);
			engineTest.engineCut();
			engineTest.engineSelect(0, 0);
			engineTest.enginePaste();
			assertEquals(engineTest.getBuffer().Read(0, engineTest.getBuffer().getLength()),clipText+str);
			assertEquals(engineTest.getSelection().getLength(),0);
			assertEquals(engineTest.getClipboard().Read(),clipText);
		}

	}


	

