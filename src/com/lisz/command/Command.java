package com.lisz.command;

public abstract class Command {
	protected Content content;
	abstract void exec();
	abstract void undo();
}
