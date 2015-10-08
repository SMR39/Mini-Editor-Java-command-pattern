
package fr.istic.aco.editor.Version2;

import fr.istic.aco.editor.Command.MiniEditorCommand;
import fr.istic.aco.editor.Receiver.MiniEditorEngine;

/**
 * The Class MiniEditorStartRecording.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class MiniEditorStartRecording implements MiniEditorCommand {
	
	/** The engine. */
	private MiniEditorEngine engine;
	
	/** The start. */
	int start;
	
	/**
	 * Instantiates a new mini editor start recording.
	 *
	 * @param engineObj the engine obj
	 * @param start the start
	 */
	public MiniEditorStartRecording(MiniEditorEngine engineObj,int start)
	{
		System.out.println("Start:"+start);
		this.engine=engineObj;
		this.start = start;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Command.MiniEditorCommand#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		engine.engineStartRecording(start);
	}
	
	
}
