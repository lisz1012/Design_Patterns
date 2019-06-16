package com.lisz.visitor;

// 应用场景是Computer的构成组件是固定不变的
public class Computer {
	private ComputerPart cpu = new CPU();
	private ComputerPart memory = new Memory();
	private ComputerPart board = new Board();
	
	public void accpet(Visitor v) {
		cpu.accept(v);
		memory.accept(v);
		board.accept(v);
	}
	
	public static void main(String[] args) {
		Visitor visitor = new PersonalVisitor();
		Computer computer = new Computer();
		computer.accpet(visitor);
		System.out.println(visitor.getTotalPrice());
		visitor = new CompanyVisitor();
		computer.accpet(visitor);
		System.out.println(visitor.getTotalPrice());
	}
}

interface ComputerPart {
	void accept(Visitor v);
	double getPrice();
}

class CPU implements ComputerPart{
	@Override
	public void accept(Visitor v) {
		v.visitCpu(this);
	}

	@Override
	public double getPrice() {
		return 2000.00;
	}
}

class Memory implements ComputerPart {
	@Override
	public void accept(Visitor v) {
		v.visitMemory(this);
	}

	@Override
	public double getPrice() {
		return 1000.00;
	}
}

class Board implements ComputerPart {
	@Override
	public void accept(Visitor v) {
		v.visitBoard(this);
	}

	@Override
	public double getPrice() {
		return 500.00;
	}
}

abstract class Visitor {
	protected double totalPrice;
	abstract void visitCpu(CPU cpu);
	abstract void visitMemory(Memory memory);
	abstract void visitBoard(Board board);
	
	public double getTotalPrice() {
		return totalPrice;
	}
}

class PersonalVisitor extends Visitor {
	@Override
	public void visitCpu(CPU cpu) {
		totalPrice += cpu.getPrice() * 0.85;
	}

	@Override
	public void visitMemory(Memory memory) {
		totalPrice += memory.getPrice() * 0.6;
	}

	@Override
	public void visitBoard(Board board) {
		totalPrice += board.getPrice() * 0.5;
	}
}

class CompanyVisitor extends Visitor {
	@Override
	public void visitCpu(CPU cpu) {
		totalPrice += cpu.getPrice() * 0.7;
	}

	@Override
	public void visitMemory(Memory memory) {
		totalPrice += memory.getPrice() * 0.4;
	}

	@Override
	public void visitBoard(Board board) {
		totalPrice += board.getPrice() * 0.4;
	}
}
