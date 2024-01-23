package shopManagment1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream{

	public MyObjectOutputStream() throws IOException, SecurityException {
		super();
		
	}
	
	public MyObjectOutputStream(OutputStream outputStream)throws IOException
	{
		super(outputStream);
	}
	public void WriteStreamHeader()throws IOException
	{
		
	}

	

}
