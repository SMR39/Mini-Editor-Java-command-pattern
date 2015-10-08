
package fr.istic.aco.editor.Version2;

import java.util.List;

import fr.istic.aco.editor.Command.MiniEditorCommand;
import fr.istic.aco.editor.Receiver.MiniEditorEngine;

/**
 * The Class MiniEditorPlay.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class MiniEditorPlay implements MiniEditorCommand {
	
	/** The history. */
	private List<MiniEditorCommand> history;
	
	/** The engine. */
	MiniEditorEngine engine;
	
	/**
	 * Instantiates a new mini editor play.
	 *
	 * @param engineObj the engine obj
	 * @param history the history
	 */
	public MiniEditorPlay(MiniEditorEngine engineObj, List<MiniEditorCommand> history) {
		this.engine = engineObj;
		this.history = history;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Command.MiniEditorCommand#execute()
	 */
	@Override
	public void execute() {
		engine.enginePlayRecording(history);
		// TODO Auto-generated method stub

	}
	
}
