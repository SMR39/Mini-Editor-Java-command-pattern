
package fr.istic.aco.editor.Receiver;
import java.util.List;

import fr.istic.aco.editor.Command.MiniEditorCommand;
import fr.istic.aco.editor.Version2.*;

/**
 * The Class MiniEditorEngineClass.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class MiniEditorEngineClass implements MiniEditorEngine {
	
	
	/** The buffer. */
	MiniEditorBuffer buffer ;
	
	/** The clipboard. */
	MiniEditorClipboard clipboard;
	
	/** The select. */
	MiniEditorSelect select; 
	
	/** The rcdmnge. */
	MiniEditorRecorderManager rcdmnge ;
	
	/**
	 * Instantiates a new mini editor engine class.
	 */
	public MiniEditorEngineClass() {
		this.buffer = new MiniEditorBufferClass();
		this.clipboard = new MiniEditorClipboardClass();
		this.select = new MiniEditorSelectClass();
		this.rcdmnge= new MiniEditorRecorderManagerClass();
	}
	
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#engineCopy()
	 */
	@Override
	public void engineCopy() {

		int begin = select.getBegin();
		int end = select.getEnd();
		clipboard.Write(buffer.Read(begin, end));
		System.out.println("[Clipboard is] "+clipboard.Read());
		

	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#engineCut()
	 */
	@Override
	public void engineCut() {
		clipboard.Write(buffer.Read(select.getBegin(), select.getEnd()));
		buffer.write(select.getBegin(), select.getEnd(), "");
		System.out.println("[Clipboard is] "+clipboard.Read());
		System.out.println("[Buffer is] "+buffer.getStr());
		// TODO Auto-generated method stub

	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#engineInsert(java.lang.String)
	 */
	@Override
	public void engineInsert(String substring) {
		if(buffer.getStr()!=null){
		buffer.write(select.getBegin(), select.getEnd(), substring);
		select.setBegin(buffer.getLength());
		select.setEnd(buffer.getLength());
		}
		else
		{
			buffer.setStr(substring);
		}
		System.out.println("DEBUG: inserting text [" + substring + "]");
		// TODO Auto-generated method stub
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#enginePaste()
	 */
	@Override
	public void enginePaste() {
		buffer.write(select.getBegin(), select.getBegin(),clipboard.Read() );
		System.out.println("DEBUG: String after Paste is [" + buffer.Read(0,buffer.getLength()) + "]");
		// TODO Auto-generated method stub

	}

	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#engineSelect(int, int)
	 */
	@Override
	public void engineSelect(int start, int stop) {
		// TODO Auto-generated method stub
		select.setBegin(start);
		select.setEnd(stop);
		System.out.println("[Selection is] "+buffer.Read(select.getBegin(),select.getEnd()));
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#engineStartRecording(int)
	 */
	@Override
	public void engineStartRecording(int start) {
		rcdmnge.startRecording(start);
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#engineEndRecording(int)
	 */
	@Override
	public void engineEndRecording(int stop) {
		rcdmnge.stopRecording(stop);
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#enginePlayRecording(java.util.List)
	 */
	@Override
	public void enginePlayRecording(List<MiniEditorCommand> history) {
		rcdmnge.replay(history);
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#engineRedo()
	 */
	@Override
	public void engineRedo() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#engineUndo()
	 */
	@Override
	public void engineUndo() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#getBuffer()
	 */
	@Override
	public MiniEditorBuffer getBuffer() {
		
		// TODO Auto-generated method stub
		return buffer;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#getClipboard()
	 */
	@Override
	public MiniEditorClipboard getClipboard() {
		// TODO Auto-generated method stub
		return clipboard;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorEngine#getSelection()
	 */
	@Override
	public MiniEditorSelect getSelection() {
		// TODO Auto-generated method stub
		return select;
	}

}
