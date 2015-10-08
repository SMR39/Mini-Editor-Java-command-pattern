

package fr.istic.aco.editor.Command;

import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import fr.istic.aco.editor.Command.MiniEditorCommand;

// TODO: Auto-generated Javadoc
/**
 * The Class Selection.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class Selection implements MiniEditorCommand {

	/** The stop. */
	int start,stop;
	
	/** The engine. */
	private MiniEditorEngine engine;
	
	/**
	 * Instantiates a new selection.
	 *
	 * @param engine the engine
	 * @param begin the begin
	 * @param end the end
	 */
	public Selection(MiniEditorEngine engine,int begin,int end)
	{
		this.engine=engine;
		this.start = begin;
		this.stop = end;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Command.MiniEditorCommand#execute()
	 */
	
	@Override
	public void execute() {
		engine.engineSelect(start, stop);

	}
}
