package fr.istic.aco.editor.Command;
import fr.istic.aco.editor.Receiver.MiniEditorClipboard;
import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import fr.istic.aco.editor.Command.MiniEditorCommand;

/**
 * The Class Cut.
 * @author Shashi Mohan Reddy, Nidhi Saini
 */

public class Cut implements MiniEditorCommand {
	
	/** The engine. */
	
	MiniEditorEngine engine ;
	
	/** The clipboard. */
	
	MiniEditorClipboard clipboard;
	
	/**
	 * Instantiates a new cut.
	 *
	 * @param eng the eng
	 * 
	 */
	public Cut(MiniEditorEngine eng)
	{
		this.engine = eng;
	}
	
	@Override
	public void execute() {
		
		engine.engineCut();
	

	}
	
	
}
