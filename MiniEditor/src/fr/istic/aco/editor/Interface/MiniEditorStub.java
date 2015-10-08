
package fr.istic.aco.editor.Interface;

import fr.istic.aco.editor.Invoker.MiniEditorInvoker;
import fr.istic.aco.editor.Receiver.MiniEditorEngine;
import fr.istic.aco.editor.Receiver.MiniEditorEngineClass;
import fr.istic.aco.editor.Command.Copy;
import fr.istic.aco.editor.Command.Cut;
import fr.istic.aco.editor.Command.Insertion;
import fr.istic.aco.editor.Command.MiniEditorCommand;
import fr.istic.aco.editor.Command.Paste;
import fr.istic.aco.editor.Command.Selection;
import fr.istic.aco.editor.Version2.*;

/**
 * The Class MiniEditorStub.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */

public class MiniEditorStub implements MiniEditor
{
	
	/** The engine obj. */
	MiniEditorEngine engineObj;
	
	/** The invoker obj. */
	MiniEditorInvoker invokerObj ;
	
	/**
	 * Instantiates a new mini editor stub.
	 */
	public MiniEditorStub(){
		engineObj = new MiniEditorEngineClass();
		invokerObj = new MiniEditorInvoker();
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#getBuffer()
	 */
	@Override
	
	public String getBuffer()
	{
		return engineObj.getBuffer().Read(0,engineObj.getBuffer().getLength());
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#getSelection()
	 */
	@Override
	
	public String getSelection()	
	{
		return engineObj.getBuffer().Read(engineObj.getSelection().getBegin(),engineObj.getSelection().getEnd());
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#getClipboard()
	 */
	@Override
	
	public String getClipboard()
	{
		return engineObj.getClipboard().Read();
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorInsert(java.lang.String)
	 */
	@Override
	
	public void editorInsert(String substring)
	{
		MiniEditorCommand insertCom = new Insertion(engineObj,substring);
		invokerObj.invoker(insertCom);
		
	}

	/* (non-Javadoc)
	 * 	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorSelect(int, int)
	 */
	@Override
	
	public void editorSelect(int start, int stop)
	{
		MiniEditorCommand selectCom = new Selection(engineObj,start,stop);
		invokerObj.invoker(selectCom); 
		System.out.println("DEBUG: selecting interval [" + start + "," + stop + "]");
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorCopy()
	 */
	@Override
	
	public void editorCopy()
	{
		MiniEditorCommand copyCom = new Copy(engineObj);
		invokerObj.invoker(copyCom); 
		System.out.println("DEBUG: performing Copy") ;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorCut()
	 */
	@Override
	
	public void editorCut() 
	{
		MiniEditorCommand cutCom = new Cut(engineObj);
		invokerObj.invoker(cutCom); 
		System.out.println("DEBUG: performing Cut") ;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorPaste()
	 */
	@Override
	
	public void editorPaste()
	{
		MiniEditorCommand pasteCom = new Paste(engineObj);
		invokerObj.invoker(pasteCom); 
		System.out.println("DEBUG: performing Paste") ;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorStartRecording()
	 */
	@Override
	
	public void editorStartRecording()
	{
		int start = invokerObj.getHistory().size();
		MiniEditorCommand startRecording = new MiniEditorStartRecording(engineObj,start);
		invokerObj.invoker(startRecording);
		System.out.println("DEBUG: performing Record start") ;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorEndRecording()
	 */
	@Override
	
	public void editorEndRecording()
	{
		int stop = invokerObj.getHistory().size();
		MiniEditorCommand stopRecording = new MiniEditorStopRecording(engineObj,stop);
		invokerObj.invoker(stopRecording);
		System.out.println("DEBUG: performing Record end") ;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorPlayRecording()
	 */
	@Override
	
	public void editorPlayRecording()
	{
		MiniEditorCommand play = new MiniEditorPlay(engineObj, invokerObj.getHistory());
		invokerObj.invoker(play);
		System.out.println("DEBUG: performing Play") ;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorUndo()
	 */
	@Override
	
	public void editorUndo()
	{
		engineObj.getBuffer().setStr("");
		invokerObj.undoinvoker();
		System.out.println("DEBUG: performing Undo") ;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Interface.MiniEditor#editorRedo()
	 */
	@Override
	
	public void editorRedo()
	{
		invokerObj.redoinvoker();
		System.out.println("DEBUG: performing Redo") ;
	}

}
