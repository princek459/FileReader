package fileio;

import java.io.IOException;

public class FileMain {

	public static void main(String[] args) {
		
		IFileReader reader = new ByteStreamReader();
		
		reader.setFilename("/Users/darcy/eclipse-workspace/FileReaderExample/src/fileio/data.bin");
		
		try {
			reader.read();
		} catch (IOException e) {
			System.err.println(e.toString());
		}
		
		
		byte[] data = (byte[]) reader.getData();
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i]);			
		}
		
		
	}

}
