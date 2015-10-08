
package fr.istic.aco.editor.Version2;

import fr.istic.aco.editor.Command.MiniEditorCommand;
import fr.istic.aco.editor.Receiver.MiniEditorEngine;

/**
 * The Class MiniEditorStopRecording.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class MiniEditorStopRecording implements MiniEditorCommand {
	
	/** The engine. */
	private MiniEditorEngine engine;
	
	/** The stop. */
	int stop;
	
	/**
	 * Instantiates a new mini editor stop recording.
	 *
	 * @param engineObj the engine obj
	 * @param stop the stop
	 */
	public MiniEditorStopRecording(MiniEditorEngine engineObj,int stop)
	{
		System.out.println("Stop:"+stop);
		this.engine=engineObj;
		this.stop = stop;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Command.MiniEditorCommand#execute()
	 */
	@Override
	public void execute() {
		engine.engineEndRecording(stop);
		// TODO Auto-generated method stub

	}

}
