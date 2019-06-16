package com.lisz.command;

public class AppendCommand extends Command {
	private String toBeAppended = "https://github.com/lisz1012";
	
	public AppendCommand(Content content) {
		this.content = content;
	}

	@Override
	void exec() {
		content.setMessage(content.getMessage() + toBeAppended);
	}

	@Override
	void undo() {
		content.setMessage(content.getMessage().substring(0, content.getMessage().length() - toBeAppended.length()));
	}

}
