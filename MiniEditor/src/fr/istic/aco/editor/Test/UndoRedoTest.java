
package fr.istic.aco.editor.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import fr.istic.aco.editor.Interface.MiniEditorStub;

/**
 * The Class UndoRedoTest.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class UndoRedoTest {

	
	/** The stub. */
	private MiniEditorStub stub;

	/** The test string. */
	private String testString = "TestString";
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		stub = new MiniEditorStub();
	}

	/**
	 * Test undoinvoker.
	 */
	@Test
	public void testUndoinvoker() {
		stub.editorInsert(testString);
		
		int beg = 2;
		int end = 5;
		stub.editorSelect(beg, end);
		stub.editorCut();
		String strCut = testString.substring(0, beg)+testString.substring(end);
		stub.editorPaste();
		stub.editorUndo();
		assertEquals(strCut, stub.getBuffer());
	}
	
	/**
	 * Test multiple undo.
	 */
	@Test
	public void testMultipleUndo() {
		stub.editorInsert(testString);
		int beg = 2;
		int end = 5;
		stub.editorSelect(beg, end);
		stub.editorCut();
		stub.editorPaste();
		stub.editorUndo();
		stub.editorUndo();
		assertEquals(testString,stub.getBuffer());
		//After last command being undo, no more undo operation can be performed
		stub.editorUndo();
		stub.editorUndo();
		assertEquals("",stub.getBuffer());
	}

	
	/**
	 * Test redoinvoker.
	 */
	@Test
	public void testRedoinvoker() {
		stub.editorInsert(testString);
		int beg = 2;
		int end = 5;
		stub.editorSelect(beg, end);
		stub.editorCut();
		String strCut = testString.substring(0, beg)+testString.substring(end);
		System.out.println("strCut "+strCut);
		stub.editorPaste();
		stub.editorUndo();
		assertEquals(strCut, stub.getBuffer());
		stub.editorRedo();
		assertEquals("TestString", stub.getBuffer());
	}
	
	/**
	 * Test RedoOnlyAfterUndo.
	 */

	@Test
	public void testRedoOnlyAfterUndo(){
		stub.editorInsert(testString);
		stub.editorRedo();
		//No Action performed
		assertEquals("TestString", stub.getBuffer());
	}
	
	/**
	 * Test AfterUndoOperationPerformedNoRedo.
	 */
	@Test
	public void testAfterUndoOperationPerformedNoRedo(){
		stub.editorInsert(testString);
		int beg = 2;
		int end = 5;
		stub.editorSelect(beg, end);
		stub.editorCut();
		stub.editorUndo();
		assertEquals(testString, stub.getBuffer());
		String strPaste = testString.substring(0, beg)+ stub.getSelection() +testString.substring(beg);
		System.out.println("strPaste: "+strPaste);
		stub.editorPaste();
		assertEquals(strPaste, stub.getBuffer());
		stub.editorRedo();
		//No change
		assertEquals(strPaste, stub.getBuffer());
		
	}
	
}
