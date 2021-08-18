package fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamReader implements IFileReader {

	String filename;
	byte[] data;
	
	@Override
	public void read() throws IOException {
		
		// Can also use this if you don't need file size
		// try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
		// this.filename))){}
		try(FileInputStream ins = new FileInputStream(this.filename);
				BufferedInputStream bis = new BufferedInputStream(ins)){
			
			int filesize = ins.available();
			this.data = new byte[filesize];
			
			for(int i = 0; i < filesize; i++) {
				this.data[i] = (byte) bis.read();
			}			
		}		
	}

	@Override
	public Object getData() {		
		return this.data;
	}

	@Override
	public void setFilename(String filename) {
		this.filename  = filename;
	}

	@Override
	public String getFilename() {
		return this.filename;
	}

}
