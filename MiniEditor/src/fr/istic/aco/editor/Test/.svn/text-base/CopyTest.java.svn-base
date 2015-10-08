
package fr.istic.aco.editor.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import fr.istic.aco.editor.Command.*;
import fr.istic.aco.editor.Command.MiniEditorCommand;
import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import fr.istic.aco.editor.Receiver.MiniEditorEngineClass;

/**
 * The Class CopyTest.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class CopyTest {
	
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
		command = new Copy(engineMimic);
	}
	
	/**
	 * Test execute command.
	 */
	@Test
	public void testExecuteCommand() {
		command.execute();
		verify(engineMimic).engineCopy();
	}

}
