
package com.command.design.pattern;

public class WriteFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public WriteFileCommand(FileSystemReceiver fs){
		
		this.fileSystem = fs;
	}
	@Override
	public void execute() {
		
		this.fileSystem.writeFile();
	}

}
