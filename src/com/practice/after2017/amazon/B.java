package com.practice.after2017.amazon;

import java.util.List;

public class B {
	public int checkWinner(List<List<String>> codeList, List<String> shoppingCart) {
		   boolean listFinished = false;
		   String ANYTHING = "anything";
		   int i = 0;
		   int lastIndex = -1;
		   for (i = 0; i < codeList.size(); i++) {
		       List<String> fruits = codeList.get(i);
		       boolean sameGroup= false;
		       for (int j = 0; j < fruits.size(); j++) {
		           String cFruit = fruits.get(j);
		           if (cFruit.equals(ANYTHING)) {
		               //cFruit is anything
		               lastIndex++;
		           } else {
		               int cIndex = getFruitIndex(shoppingCart, cFruit, lastIndex + 1);

		               if (cIndex == -1 || cIndex <= lastIndex) {
		                   return 0;
		               }else if(sameGroup && lastIndex != cIndex-1){
		                   return 0;
		               } else {
		                   lastIndex = cIndex;
		               }
		           }

		           sameGroup = true;
		       }
		   }

		   if (i == codeList.size())
		       listFinished = true;
		   return listFinished ? 1 : 0;

		}

		public int getFruitIndex(List<String> fruits, String cFruit, int index) {
		   int ans = -1;
		   for (int i = index; i < fruits.size(); i++) {
		       if (fruits.get(i).equals(cFruit))
		           return i;
		   }

		   return ans;
		}
}
