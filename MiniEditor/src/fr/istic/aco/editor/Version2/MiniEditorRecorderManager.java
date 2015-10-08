
package fr.istic.aco.editor.Version2;
import java.util.List;
import fr.istic.aco.editor.Command.MiniEditorCommand;

/**
 * The Interface MiniEditorRecorderManager.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public interface MiniEditorRecorderManager {
	
	/**
	 * Start recording.
	 *
	 * @param start the start
	 */
	public abstract void startRecording(int start);

	/**
	 * Stop recording.
	 *
	 * @param finalIndex the final index
	 */
	public abstract void stopRecording(int finalIndex);

	/**
	 * Replay.
	 *
	 * @param history the history
	 */
	public abstract void replay(List<MiniEditorCommand> history);

}
