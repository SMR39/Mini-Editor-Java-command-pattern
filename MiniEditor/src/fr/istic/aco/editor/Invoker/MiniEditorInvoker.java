
package fr.istic.aco.editor.Invoker;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import fr.istic.aco.editor.Command.*;

/**
 * The Class MiniEditorInvoker.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */

public class MiniEditorInvoker {
	
	/** The undo stack. */
	public static Stack<MiniEditorCommand> undoStack;
	
	/** The redo stack. */
	public static Stack<MiniEditorCommand> redoStack ;
	
	/** The checkundo. */
	int checkundo = 0;

	   /** The history. */
   	private List<MiniEditorCommand> history ;
	    
		/**
		 * Instantiates a new mini editor invoker.
		 */
   	
	public MiniEditorInvoker(){
		
		history = new ArrayList <MiniEditorCommand>();
		undoStack = new Stack<MiniEditorCommand>();
		redoStack = new Stack<MiniEditorCommand>();
		
		}
		
		/**
		 * Gets the history.
		 *
		 * @return the history
		 */
		
	public List<MiniEditorCommand> getHistory() {
			
		return history;
		
		}
		
	   /**
   	 * Invoker.
   	 *
   	 * @param command the command
   	 */
	
   	public void invoker(MiniEditorCommand command){
   		
		  history.add(command);
		  redoStack.push(command);
		  command.execute();
		  checkundo=0;                       // to make sure redo is done only after undo !
	    	
		   }
	    
	 	    
	   /**
   	 * Undoinvoker.
   	 */
   	
   	public void undoinvoker(){
			if (!redoStack.empty()){
			
				undoStack.push(redoStack.pop());	
					
				for (int i=0 ; i < redoStack.size(); i++)
				{	
					redoStack.elementAt(i).execute();
				}
				checkundo = 1;
				}
			else if(redoStack.size() == 0 || redoStack.empty() ) {	
			     System.out.println("End of Stack No data");
			 }
			
		}
		
	   /**
   	 * Redoinvoker.
   	 */
   	
   	public void redoinvoker(){
			if (checkundo == 1 && (!undoStack.empty())){
				
					undoStack.peek().execute();
					redoStack.push(undoStack.pop());
					
					}
			else {	
			     System.out.println("End of Stack No data");
			}
		
		}
	   
}
