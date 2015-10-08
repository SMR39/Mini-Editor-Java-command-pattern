
package fr.istic.aco.editor.Test;


import org.junit.Before;
import fr.istic.aco.editor.Command.Copy;
import fr.istic.aco.editor.Command.Insertion;
import fr.istic.aco.editor.Command.MiniEditorCommand;
import fr.istic.aco.editor.Command.Selection;
import fr.istic.aco.editor.Invoker.MiniEditorInvoker;
import fr.istic.aco.editor.Receiver.MiniEditorEngineClass;
import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * The Class RecorderTest.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class RecorderTest {

	/** The mocked select command. */
	private MiniEditorCommand mockedCopyCommand,mockedInsertCommand,mockedSelectCommand;
	
	/** The invoker. */
	private MiniEditorInvoker invoker;
	
	/** The engine. */
	private MiniEditorEngine engine;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		mockedCopyCommand = mock(Copy.class);
		mockedInsertCommand = mock(Insertion.class);
		mockedSelectCommand = mock(Selection.class);
		invoker = new MiniEditorInvoker();
		engine = new MiniEditorEngineClass();
	}
	
	/**
	 * Testinvoker.
	 */
	@Test
	public void testinvoker() {
		invoker.invoker(mockedInsertCommand);
		verify(mockedInsertCommand).execute();
	}
	
	/**
	 * Recordertest.
	 */
	@Test
	public void Recordertest() {
		engine.engineStartRecording(invoker.getHistory().size());
		invoker.invoker(mockedInsertCommand);
		invoker.invoker(mockedSelectCommand);
		invoker.invoker(mockedCopyCommand);
		engine.engineEndRecording(invoker.getHistory().size());
		verify(mockedInsertCommand, times(1)).execute();
		engine.enginePlayRecording(invoker.getHistory());//1 more Insert Command
		engine.enginePlayRecording(invoker.getHistory());//1 more time Insert command
		verify(mockedInsertCommand, times(3)).execute();
		engine.engineStartRecording(invoker.getHistory().size());
		engine.engineEndRecording(invoker.getHistory().size());
		engine.enginePlayRecording(invoker.getHistory());//0 more times
		verify(mockedInsertCommand, times(3)).execute();
	}

	

	/**
	 * Playwithoutstarttest.
	 */
	@Test
	public void playwithoutstarttest(){
		engine.enginePlayRecording(invoker.getHistory());
		verify(mockedInsertCommand, times(0)).execute();	
	}
	
	
}


