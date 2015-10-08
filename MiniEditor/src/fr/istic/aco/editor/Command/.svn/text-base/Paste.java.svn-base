

package fr.istic.aco.editor.Command;

import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import fr.istic.aco.editor.Command.MiniEditorCommand;

// TODO: Auto-generated Javadoc
/**
 * The Class Paste.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class Paste implements MiniEditorCommand {
	
	/** The engine. */
	private MiniEditorEngine engine;
	
	/** The new buffer. */
	String oldBuffer,newBuffer;
	
	/**
	 * Instantiates a new paste.
	 *
	 * @param eng the eng
	 */
	public Paste(MiniEditorEngine eng)
	{
		this.engine=eng;
		
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Command.MiniEditorCommand#execute()
	 */
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		engine.enginePaste();
	}
	}
