
package fr.istic.aco.editor.Version2;

import java.util.List;

import fr.istic.aco.editor.Command.MiniEditorCommand;

/**
 * The Class MiniEditorRecorderManagerClass.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class MiniEditorRecorderManagerClass implements MiniEditorRecorderManager {
	
	/** The stop. */
	int start,stop;
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Version2.MiniEditorRecorderManager#replay(java.util.List)
	 */
	@Override
	public void replay(List<MiniEditorCommand> history) {
		System.out.println("Start:"+start+" Stop:"+stop);
		List<MiniEditorCommand> commandsToExecute = history.subList(start, stop);
		for (MiniEditorCommand command : commandsToExecute) {
			command.execute();
		}
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Version2.MiniEditorRecorderManager#startRecording(int)
	 */
	@Override
	public void startRecording(int start) {
		System.out.println("start recording:"+start);
		this.start = start;
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Version2.MiniEditorRecorderManager#stopRecording(int)
	 */
	@Override
	public void stopRecording(int finalIndex) {
		System.out.println("end recording:"+finalIndex);
		this.stop = finalIndex;
		// TODO Auto-generated method stub

	}

}
