
package fr.istic.aco.editor.Receiver;

/**
 * The Class MiniEditorBufferClass.
 * 
 * @author Shashi Mohan Reddy, Nidhi Saini
 */
public class MiniEditorBufferClass implements MiniEditorBuffer {
	
	/** The buffer string. */
	String bufferString;
	
	/**
	 * Instantiates a new mini editor buffer class.
	 */
	public MiniEditorBufferClass()
	{
		this.bufferString = new String();
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorBuffer#getStr()
	 */
	public String getStr()
	{
		return bufferString;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorBuffer#setStr(java.lang.String)
	 */
	public void setStr(String str)
	{
		bufferString = str;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorBuffer#Read(int, int)
	 */
	public String Read(int begin, int end) {
		if (begin > bufferString.length()) {
			return "";
		} else if (end > bufferString.length()) {
			return bufferString.substring(begin, bufferString.length());
		} else {
			return bufferString.substring(Math.min(begin, end),
					Math.max(begin, end));
		}
	}


	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorBuffer#write(int, int, java.lang.String)
	 */
	@Override
	public void write(int beg, int end, String str) {
		
		if (str.equals(""))
		{
			this.bufferString = bufferString.substring(0,beg)+bufferString.substring(end,bufferString.length() );
		}
		else
		{
		
			if(bufferString.length()<end && bufferString.length()<beg){
				bufferString = bufferString.concat(str);
			}
			else
			{
			bufferString = bufferString.substring(0,beg) + str + bufferString.substring(end);
			System.out.println("[Buffer is] " + bufferString);
			}
		}
		// TODO Auto-generated method stub

	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.Receiver.MiniEditorBuffer#getLength()
	 */
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return bufferString.length();
	}
	


}
