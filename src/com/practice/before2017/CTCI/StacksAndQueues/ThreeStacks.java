package com.practice.before2017.CTCI.StacksAndQueues;

public class ThreeStacks{

	int[] mainStack = null;
	int stackSize = 0;
	int[] stackPointer = {0,0,0};

	public void push(int stackNum, int item){
		if(stackPointer[stackNum-1] == 0){
			mainStack[(stackNum-1)*stackSize] = item;
			stackPointer[stackNum-1]++;
		}
		else{
			if(stackPointer[stackNum-1] + 1 > stackSize){
				System.out.println("Stack number "+stackNum+" is full");
				return;
			}
			else{
				mainStack[(stackNum-1)*stackSize + stackPointer[stackNum-1] + 1] = item;
				stackPointer[stackNum-1]++;
			}
		}
	}

	public int pop(int stackNum){
		int popped = 0;
		if(stackPointer[stackNum-1] == 0){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			popped = mainStack[(stackNum-1) * stackSize + stackPointer[stackNum-1]];
			stackPointer[stackNum-1]--;
		}

		System.out.println("Popped from stack "+stackNum+" : "+popped);
		return popped;
	}

	public static void main(String[] args){
		ThreeStacks obj = new ThreeStacks();
		obj.stackSize = 10;
		obj.mainStack = new int[obj.stackSize*3];

		obj.push(1, 10);
		obj.push(2, 20);
		obj.push(3, 30);
		obj.push(1, 11);
		obj.push(2, 21);
		obj.push(3, 31);
		obj.push(1, 12);
		obj.push(2, 22);
		obj.push(3, 32);
		obj.push(1, 13);
		obj.push(2, 23);
		obj.push(3, 33);

		obj.pop(3);
		obj.pop(1);
		obj.pop(2);
		obj.pop(1);
		obj.pop(3);
		obj.pop(3);
		obj.pop(3);
		obj.pop(3);


	}
}