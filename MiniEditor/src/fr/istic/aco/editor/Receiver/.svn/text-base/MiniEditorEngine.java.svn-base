
package fr.istic.aco.editor.Receiver;

import java.util.List;

import fr.istic.aco.editor.Command.MiniEditorCommand; 

/**
 * The Interface MiniEditorEngine.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public interface MiniEditorEngine {
	
	/**
	 * Gets the buffer.
	 *
	 * @return the buffer
	 */
	public MiniEditorBuffer getBuffer();
	
	/**
	 * Gets the selection.
	 *
	 * @return the selection
	 */
	public MiniEditorSelect getSelection();
	
	/**
	 * Gets the clipboard.
	 *
	 * @return the clipboard
	 */
	public MiniEditorClipboard getClipboard();
	
	/**
	 * Engine insert.
	 *
	 * @param substring the substring
	 */
	public void engineInsert(String substring);
	
	/**
	 * Engine select.
	 *
	 * @param start the start
	 * @param stop the stop
	 */
	public void engineSelect(int start, int stop);
	
	/**
	 * Engine copy.
	 */
	public void engineCopy();
	
	/**
	 * Engine cut.
	 */
	public void engineCut();
	
	/**
	 * Engine paste.
	 */
	public void enginePaste();
	
	/**
	 * Engine start recording.
	 *
	 * @param start the start
	 */
	public void engineStartRecording(int start);
	
	/**
	 * Engine end recording.
	 *
	 * @param stop the stop
	 */
	public void engineEndRecording(int stop);
	
	/**
	 * Engine play recording.
	 *
	 * @param history the history
	 */
	public void enginePlayRecording(List<MiniEditorCommand> history);
	
	/**
	 * Engine undo.
	 */
	public void engineUndo();
	
	/**
	 * Engine redo.
	 */
	public void engineRedo();
	

}
