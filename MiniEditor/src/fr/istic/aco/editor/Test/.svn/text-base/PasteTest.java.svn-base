
package fr.istic.aco.editor.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import fr.istic.aco.editor.Command.MiniEditorCommand;
import fr.istic.aco.editor.Command.Paste;
import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import fr.istic.aco.editor.Receiver.MiniEditorEngineClass;

/**
 * The Class PasteTest.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class PasteTest {

	/** The command. */
	private MiniEditorCommand command;
	
	/** The engine mimic. */
	private MiniEditorEngine engineMimic;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		engineMimic = mock(MiniEditorEngineClass.class);

		command = new Paste(engineMimic);
	}
	
	/**
	 * Test.
	 */
	@Test
	public void test() {
		command.execute();
		verify(engineMimic).enginePaste();
	}



}
