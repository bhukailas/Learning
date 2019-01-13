package com.learn.bst;

import java.util.ArrayList;

public class CheckIf2BSTsAreIdenticalFrom2Arrays {

	boolean checkIfSameBSTs(ArrayList<Integer> listForTree1, ArrayList<Integer> listForTree2) {
		
		if (listForTree1.size() != listForTree2.size()) {
			return false;
		}

		if (listForTree1.size() == 0) {
			return true;
		}

		// root node has to be the same
		if (listForTree1.get(0) == listForTree2.get(0)) {
			// segregate nodes for left and right sub-trees for both trees
			ArrayList<Integer> listForLeftTree1 = new ArrayList<>();
			ArrayList<Integer> listForRightTree1 = new ArrayList<>();

			ArrayList<Integer> listForLeftTree2 = new ArrayList<>();
			ArrayList<Integer> listForRightTree2 = new ArrayList<>();

			for (int i = 1; i < listForTree1.size(); i++) {
				if (listForTree1.get(i) < listForTree1.get(0)) {
					listForLeftTree1.add(listForTree1.get(i));
				} else {
					listForRightTree1.add(listForTree1.get(i));
				}

				if (listForTree2.get(i) < listForTree2.get(0)) {
					listForLeftTree2.add(listForTree2.get(i));
				} else {
					listForRightTree2.add(listForTree2.get(i));
				}
			}

			// and check that left and right sub-tree are also same
			return checkIfSameBSTs(listForLeftTree1, listForLeftTree2)
					&& checkIfSameBSTs(listForRightTree1, listForRightTree2);
		}

		return false;
	}

}
