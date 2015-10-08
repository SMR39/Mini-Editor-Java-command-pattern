package fr.istic.aco.editor.Interface;

/**
 * The Interface MiniEditor.
 * 
 *  @author Shashi Mohan Reddy, Nidhi Saini
 */


public interface MiniEditor {
	
	/**
	 * Gets the buffer.
	 *
	 * @return the buffer
	 */
	public String getBuffer();
	
	/**
	 * Gets the selection.
	 *
	 * @return the selection
	 */
	public String getSelection();
	
	/**
	 * Gets the clipboard.
	 *
	 * @return the clipboard
	 */
	public String getClipboard();
	
	/**
	 * Editor insert.
	 *
	 * @param substring the substring
	 */
	public void editorInsert(String substring);
	
	/**
	 * Editor select.
	 *
	 * @param start the start
	 * @param stop the stop
	 */
	public void editorSelect(int start, int stop);
	
	/**
	 * Editor copy.
	 */
	public void editorCopy();
	
	/**
	 * Editor cut.
	 */
	public void editorCut();
	
	/**
	 * Editor paste.
	 */
	public void editorPaste();
	
	/**
	 * Editor start recording.
	 */
	public void editorStartRecording();
	
	/**
	 * Editor end recording.
	 */
	public void editorEndRecording();
	
	/**
	 * Editor play recording.
	 */
	public void editorPlayRecording();
	
	/**
	 * Editor undo.
	 */
	public void editorUndo();
	
	/**
	 * Editor redo.
	 */
	public void editorRedo();
}
