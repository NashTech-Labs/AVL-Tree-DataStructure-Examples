package com.knoldus.dsa;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AVLTreeTest {
    /**
     * Method under test: {@link AVLTree#insert(int)}
     */
    @Test
    void testInsert() {

        (new AVLTree()).insert(1);
    }

    /**
     * Method under test: {@link AVLTree#insert(int)}
     */
    @Test
    void testInsert2() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(0);
        avlTree.insert(1);
    }

    /**
     * Method under test: {@link AVLTree#insert(int)}
     */
    @Test
    void testInsert3() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        avlTree.insert(3);
    }

    /**
     * Method under test: {@link AVLTree#insert(int)}
     */
    @Test
    void testInsert4() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(1);
    }

    /**
     * Method under test: {@link AVLTree#insert(int)}
     */
    @Test
    void testInsert5() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        avlTree.insert(1);
    }

    /**
     * Method under test: {@link AVLTree#insert(int)}
     */
    @Test
    void testInsert6() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(-2);
        avlTree.insert(0);
        avlTree.insert(1);
    }

    /**
     * Method under test: {@link AVLTree#insert(int)}
     */
    @Test
    void testInsert7() {

        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        avlTree.insert(0);
        avlTree.insert(1);
    }

    /**
     * Method under test: {@link AVLTree#insert(int)}
     */
    @Test
    void testInsert8() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(0);
    }

    /**
     * Method under test: {@link AVLTree#insert(int)}
     */
    @Test
    void testInsert9() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        avlTree.insert(0);
        avlTree.insert(-1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete() {
        // TODO: Complete this test.

        (new AVLTree()).delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete2() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(1);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete3() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by delete(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(0);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete4() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete5() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete6() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        avlTree.insert(1);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete7() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(1);
        avlTree.insert(0);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete8() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(0);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete9() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.delete(-2);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete10() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(-1);
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(0);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete11() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(0);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete12() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(-1);
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(Integer.MIN_VALUE);
        avlTree.delete(1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete13() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(-1);
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(0);
        avlTree.delete(-1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete14() {
        // TODO: Complete this test.

        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(0);
        avlTree.delete(2);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete15() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(0);
        avlTree.insert(-1);
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(0);
        avlTree.delete(-1);
    }

    /**
     * Method under test: {@link AVLTree#delete(int)}
     */
    @Test
    void testDelete16() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        avlTree.insert(-1);
        avlTree.insert(-2);
        avlTree.insert(1);
        avlTree.insert(0);
        avlTree.delete(-1);
    }

    /**
     * Method under test: {@link AVLTree#printBalance()}
     */
    @Test
    void testPrintBalance() {

        (new AVLTree()).printBalance();
    }

    /**
     * Method under test: {@link AVLTree#printBalance()}
     */
    @Test
    void testPrintBalance2() {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(1);
        avlTree.printBalance();
    }

    /**
     * Method under test: {@link AVLTree#search(int)}
     */
    @Test
    void testSearch() {
        assertFalse((new AVLTree()).search(1));
    }

    /**
     * Method under test: {@link AVLTree#search(int)}
     */
    @Test
    void testSearch2() {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(1);
        assertTrue(avlTree.search(1));
    }

    /**
     * Method under test: {@link AVLTree#search(int)}
     */
    @Test
    void testSearch3() {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(0);
        assertFalse(avlTree.search(1));
    }

    /**
     * Method under test: {@link AVLTree#search(int)}
     */
    @Test
    void testSearch4() {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(2);
        assertFalse(avlTree.search(1));
    }
}

