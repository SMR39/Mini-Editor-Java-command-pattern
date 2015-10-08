

package fr.istic.aco.editor.Command;
import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import fr.istic.aco.editor.Command.MiniEditorCommand;

/**
 * The Class Copy.
 * @author Shashi Mohan Reddy, Nidhi Saini
 * 
 */
	public class Copy implements MiniEditorCommand {
	
	/** The engine. */
	private MiniEditorEngine engine;
		
	/**
	 * Instantiates a new copy.
	 *
	 * @param engine the engine
	 */
	
	public Copy(MiniEditorEngine engine)
	{
		this.engine=engine;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Command.MiniEditorCommand#execute()
	 */
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		engine.engineCopy();
	}
	
	
}
