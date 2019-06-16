
package com.lisz.command;

public class CopyCommand extends Command {
	public CopyCommand(Content content) {
		this.content = content;
	}
	
	@Override
	void exec() {
		content.setMessage(content.getMessage() + content.getMessage());
	}

	@Override
	void undo() {
		content.setMessage(content.getMessage().substring(0, content.getMessage().length() / 2));
	}

}
