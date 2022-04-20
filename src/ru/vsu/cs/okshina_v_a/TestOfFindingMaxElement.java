package ru.vsu.cs.okshina_v_a;

import org.junit.Assert;
import org.junit.Test;

public class TestOfFindingMaxElement {
    @Test
    public void testA() {
        int result = MySimpleBinaryTree.findMax(ConstructionTestingTrees.buildTreeOneForTest1());
        int answer = 7;
        Assert.assertEquals(result, answer);
    }

    @Test
    public void testB() {
        int result = MySimpleBinaryTree.findMax(ConstructionTestingTrees.buildTreeTwoForTest2());
        int answer = 53;
        Assert.assertEquals(result, answer);
    }

    @Test
    public void testC() {
        int result = MySimpleBinaryTree.findMax(ConstructionTestingTrees.buildTreeThreeForTest3());
        int answer = 2;
        Assert.assertEquals(result, answer);
    }
}
