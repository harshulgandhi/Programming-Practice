package com.practice.after2017.mastercard;

import java.util.Arrays;

public class C {
	static int maxProfit(int costPerCut, int salePrice, int[] lengths) {
		   //totalProfit = totalUniformRods * saleLength * salePrice - totalUniformRods*costPerCut;
		   //totalProfit = totalUniformRods*(saleLength * salePrice - costPerCut);
		   int ans = 0;
		   Arrays.sort(lengths);
		   int maxLength = lengths[lengths.length - 1];
		   int[] totalCuts;
		   for (int i = 1; i <= maxLength; i++) {
		       totalCuts = getTotalCuts(lengths, i);
		       int temp = totalCuts[0] * i * salePrice - totalCuts[1] * costPerCut;
		       ans = Math.max(ans, temp);
		   }
		   return ans;
		}
		private static int[] getTotalCuts(int[] lengths, int optimizedLength) {
		   int[] ans = new int[2];
		   for (int item : lengths) {
		       ans[0] += item / optimizedLength;
		       ans[1] += item % optimizedLength == 0 ? item / optimizedLength - 1 : item / optimizedLength;
		   }
		   return ans;
		}
		
	static int maxProfitII(int costPerCut, int salePrice, int[] lengths) {
		int maxLength = 0;

		    for (int length : lengths) {
		      if (length > maxLength) {
		        maxLength = length;
		      }
		    }

		    int maxProfit = 0;
		    for (int i = 1; i < maxLength; i++) {
		      int sumOfLengths = 0;
		      int sumOfCutCounts = 0;
		      int sumOfCutWastes = 0;

		      for (int length : lengths) {
		        sumOfLengths += length;
		        if (length % i == 0) {
		          sumOfCutCounts += (length / i - 1);
		        } else {
		          sumOfCutCounts += (length / i);
		        }
		        sumOfCutWastes += (length % i);
		      }

		      int profit =
		          sumOfLengths * salePrice - sumOfCutCounts * costPerCut - sumOfCutWastes * salePrice;
		      if (profit > maxProfit) {
		        maxProfit = profit;
		      }
		    }

		    return maxProfit;
		}

}
