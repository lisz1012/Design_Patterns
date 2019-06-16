package com.lisz.command;

public class DeleteCommand extends Command {
	private static final int DELETE_LENGTH = 2;
	private String toBeDeleted = null;
	
	public DeleteCommand(Content content) {
		this.content = content;
	}

	@Override
	void exec() {
		toBeDeleted = content.getMessage().substring(0, DELETE_LENGTH);
		content.setMessage(content.getMessage().substring(DELETE_LENGTH));
	}

	@Override
	void undo() {
		content.setMessage(toBeDeleted + content.getMessage());
	}

}
