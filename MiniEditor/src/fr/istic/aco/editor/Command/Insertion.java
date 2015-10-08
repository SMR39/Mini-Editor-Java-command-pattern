package fr.istic.aco.editor.Command;

import java.util.ArrayList;


import java.util.List;

import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import fr.istic.aco.editor.Command.MiniEditorCommand;


/**
 * The Class Insertion.
 * @author Shashi Mohan Reddy, Nidhi Saini
 * 
 */

public class Insertion implements MiniEditorCommand {
	
	/** The engine. */
	MiniEditorEngine engine ;
	
	/** The add string. */
	String insertString;
	
	/** The store. */
	List<String> store = new ArrayList<String>();
	
	/**
	 * Instantiates a new insertion.
	 *
	 * @param eng the eng
	 * @param substring the substring
	 */
	public Insertion(MiniEditorEngine eng,String substring)
	{
		this.engine = eng;
		insertString = substring;

	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Command.MiniEditorCommand#execute()
	 */
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		engine.engineInsert(insertString);
		
		}
	
}
