
package fr.istic.aco.editor.Interface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class MiniEditorTextInterface.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class MiniEditorTextInterface
{
	
	/** The keyboard. */
	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		MiniEditor miniEditor = new MiniEditorStub() ;
		String inputLine;
		char commandLetter;
		
		System.out.println("Welcome to MiniEditor 9.99 (c) 2014 Smith & Jones") ;
		System.out.println("-----------------------------------------------------------") ;
				
		System.out.println("Enter command (I/S/C/X/V/D/R/E/P/Z/Y/Q) > ") ;
		try
		{
			inputLine = keyboard.readLine();
		} catch (IOException e)
		{
			System.out.println("Unable to read standard input");
			inputLine = "W";
		} 
		commandLetter = Character.toUpperCase(inputLine.charAt(0)) ;
		while (commandLetter != 'Q') /* Quit */
		{
			switch (commandLetter)
			{
				case 'I': /* Insert */
					miniEditor.editorInsert(inputLine.substring(2));
					break;
				case 'S': /* Select */
					String numberString="";
					try
					{
						String[] arguments = inputLine.substring(2).split("\\s+");
						numberString = arguments[0];
						int start  = Integer.parseInt(numberString);
						numberString = arguments[1];
						int stop  = Integer.parseInt(numberString);
						miniEditor.editorSelect(start, stop);
					}
					catch (Exception e)
					{
						System.out.println("Invalid number: " + numberString);
					}
					break;
				case 'C': /* Copy */
					miniEditor.editorCopy();
					break;
				case 'X': /* cut */
					miniEditor.editorCut();
					break;
				case 'V': /* paste */
					miniEditor.editorPaste();
					break;
				case 'D': /* Delete, i.e. insert empty string */
					miniEditor.editorInsert("");
					break;
				case 'R': /* start Recording */
						miniEditor.editorStartRecording();
					break;
				case 'E': /* End recording */
					miniEditor.editorEndRecording();
					break;
				case 'P': /* Play recording */
					miniEditor.editorPlayRecording();
					break;
				case 'Z': /* undo */
					miniEditor.editorUndo();
					break;
				case 'Y': /* redo */
					miniEditor.editorRedo();
					break;
				default: System.out.println("Unrecognized command, please try again:") ;
					break;
			}
			System.out.println("-----------------------------------------------------");
			System.out.println("[" + miniEditor.getBuffer() + "]");
			System.out.println("-----------------------------------------------------");
			System.out.println("[" + miniEditor.getSelection() + "]");
			System.out.println("-----------------------------------------------------");
			System.out.println("[" + miniEditor.getClipboard() + "]");
			System.out.println("-----------------------------------------------------");

			System.out.println("Enter command (I/S/C/X/V/D/R/E/P/Z/Y/Q) > ") ;	
			try
			{
				inputLine = keyboard.readLine();
			} catch (IOException e)
			{
				System.out.println("Unable to read standard input");
				inputLine = "W";
			} 
			commandLetter = Character.toUpperCase(inputLine.charAt(0)) ;
		}
		System.out.println ("Goodbye") ;
	}
}
