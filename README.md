# LeetCode

[![Tests](https://github.com/eugene-karanda/leetcode/actions/workflows/tests.yml/badge.svg)](https://github.com/eugene-karanda/leetcode/actions/workflows/tests.yml)

My solutions to [LeetCode](https://leetcode.com/u/eugenekaranda/) problems in Java.

## Structure

Every problem is a single test class in [`src/test/java/org/overmind`](src/test/java/org/overmind), named after the problem:

- the Javadoc links to the problem and gives a short description;
- the tests are the examples from the problem statement;
- the solution is the nested `Solution` class (or the class the problem asks to design).

Shared helpers live in [`src/main/java/org/overmind`](src/main/java/org/overmind): `ListNode` and `TreeNode` with `ListNode.of(1, 2, 3)` and `TreeNode.of(3, 9, 20, null, null, 15, 7)` factories that accept the LeetCode notation.

## Running the tests

Requires JDK 25.

```shell
./gradlew test
```

## Problems

96 of 159 problems solved: 47 easy, 41 medium, 8 hard.
The check mark links to the solution.

| # | Problem | Difficulty | Solved |
|---|---------|------------|:------:|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [✅](src/test/java/org/overmind/TwoSumTest.java) |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | [✅](src/test/java/org/overmind/AddTwoNumbersTest.java) |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | [✅](src/test/java/org/overmind/LongestSubstringWithoutRepeatingCharactersTest.java) |
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Hard | [✅](src/test/java/org/overmind/MedianOfTwoSortedArraysTest.java) |
| 5 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | Medium | [✅](src/test/java/org/overmind/LongestPalindromicSubstringTest.java) |
| 6 | [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/) | Medium | [✅](src/test/java/org/overmind/ZigzagConversionTest.java) |
| 7 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | Medium | [✅](src/test/java/org/overmind/ReverseIntegerTest.java) |
| 8 | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | Medium | [✅](src/test/java/org/overmind/StringToIntegerAtoiTest.java) |
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Easy | [✅](src/test/java/org/overmind/PalindromeNumberTest.java) |
| 10 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | Hard | [✅](src/test/java/org/overmind/RegularExpressionMatchingTest.java) |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | [✅](src/test/java/org/overmind/ContainerWithMostWaterTest.java) |
| 12 | [Integer to Roman](https://leetcode.com/problems/integer-to-roman/) | Medium | [✅](src/test/java/org/overmind/IntegerToRomanTest.java) |
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | Easy | [✅](src/test/java/org/overmind/RomanToIntegerTest.java) |
| 14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Easy | [✅](src/test/java/org/overmind/LongestCommonPrefixTest.java) |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | [✅](src/test/java/org/overmind/ThreeSumTest.java) |
| 16 | [3Sum Closest](https://leetcode.com/problems/3sum-closest/) | Medium | [✅](src/test/java/org/overmind/ThreeSumClosestTest.java) |
| 17 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | Medium | [✅](src/test/java/org/overmind/LetterCombinationsOfAPhoneNumberTest.java) |
| 18 | [4Sum](https://leetcode.com/problems/4sum/) | Medium | [✅](src/test/java/org/overmind/FourSumTest.java) |
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | [✅](src/test/java/org/overmind/RemoveNthNodeFromEndOfListTest.java) |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | [✅](src/test/java/org/overmind/ValidParenthesesTest.java) |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | [✅](src/test/java/org/overmind/MergeTwoSortedListsTest.java) |
| 22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | Medium | [✅](src/test/java/org/overmind/GenerateParenthesesTest.java) |
| 23 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | [✅](src/test/java/org/overmind/MergeKSortedListsTest.java) |
| 24 | [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/) | Medium | [✅](src/test/java/org/overmind/SwapNodesInPairsTest.java) |
| 25 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | Hard | [✅](src/test/java/org/overmind/ReverseKGroupTest.java) |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | [✅](src/test/java/org/overmind/RemoveDuplicatesFromSortedArrayTest.java) |
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | Easy | [✅](src/test/java/org/overmind/RemoveElementTest.java) |
| 28 | [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy |  |
| 29 | [Divide Two Integers](https://leetcode.com/problems/divide-two-integers/) | Medium |  |
| 30 | [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | Hard |  |
| 31 | [Next Permutation](https://leetcode.com/problems/next-permutation/) | Medium |  |
| 32 | [Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/) | Hard |  |
| 33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium |  |
| 34 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Medium |  |
| 35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy |  |
| 36 | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | Medium |  |
| 37 | [Sudoku Solver](https://leetcode.com/problems/sudoku-solver/) | Hard |  |
| 38 | [Count and Say](https://leetcode.com/problems/count-and-say/) | Medium |  |
| 39 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium |  |
| 40 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | Medium |  |
| 41 | [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | Hard |  |
| 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard |  |
| 43 | [Multiply Strings](https://leetcode.com/problems/multiply-strings/) | Medium |  |
| 44 | [Wildcard Matching](https://leetcode.com/problems/wildcard-matching/) | Hard |  |
| 45 | [Jump Game II](https://leetcode.com/problems/jump-game-ii/) | Medium | [✅](src/test/java/org/overmind/JumpGameIITest.java) |
| 46 | [Permutations](https://leetcode.com/problems/permutations/) | Medium |  |
| 47 | [Permutations II](https://leetcode.com/problems/permutations-ii/) | Medium |  |
| 48 | [Rotate Image](https://leetcode.com/problems/rotate-image/) | Medium |  |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | [✅](src/test/java/org/overmind/GroupAnagramsTest.java) |
| 50 | [Pow(x, n)](https://leetcode.com/problems/powx-n/) | Medium |  |
| 51 | [N-Queens](https://leetcode.com/problems/n-queens/) | Hard |  |
| 52 | [N-Queens II](https://leetcode.com/problems/n-queens-ii/) | Hard |  |
| 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | [✅](src/test/java/org/overmind/MaximumSubarrayTest.java) |
| 54 | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | Medium | [✅](src/test/java/org/overmind/SpiralMatrixTest.java) |
| 55 | [Jump Game](https://leetcode.com/problems/jump-game/) | Medium | [✅](src/test/java/org/overmind/JumpGameTest.java) |
| 56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | [✅](src/test/java/org/overmind/MergeIntervalsTest.java) |
| 57 | [Insert Interval](https://leetcode.com/problems/insert-interval/) | Medium |  |
| 58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | Easy |  |
| 59 | [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/) | Medium |  |
| 60 | [Permutation Sequence](https://leetcode.com/problems/permutation-sequence/) | Hard |  |
| 61 | [Rotate List](https://leetcode.com/problems/rotate-list/) | Medium |  |
| 62 | [Unique Paths](https://leetcode.com/problems/unique-paths/) | Medium |  |
| 63 | [Unique Paths II](https://leetcode.com/problems/unique-paths-ii/) | Medium |  |
| 64 | [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/) | Medium |  |
| 65 | [Valid Number](https://leetcode.com/problems/valid-number/) | Hard |  |
| 66 | [Plus One](https://leetcode.com/problems/plus-one/) | Easy |  |
| 67 | [Add Binary](https://leetcode.com/problems/add-binary/) | Easy |  |
| 68 | [Text Justification](https://leetcode.com/problems/text-justification/) | Hard |  |
| 69 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) | Easy |  |
| 70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | Easy |  |
| 71 | [Simplify Path](https://leetcode.com/problems/simplify-path/) | Medium |  |
| 72 | [Edit Distance](https://leetcode.com/problems/edit-distance/) | Medium |  |
| 73 | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) | Medium |  |
| 74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Medium |  |
| 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Medium |  |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard |  |
| 77 | [Combinations](https://leetcode.com/problems/combinations/) | Medium |  |
| 78 | [Subsets](https://leetcode.com/problems/subsets/) | Medium | [✅](src/test/java/org/overmind/SubsetsTest.java) |
| 79 | [Word Search](https://leetcode.com/problems/word-search/) | Medium |  |
| 80 | [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | Medium | [✅](src/test/java/org/overmind/RemoveDuplicatesFromSortedArrayIITest.java) |
| 81 | [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) | Medium |  |
| 82 | [Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/) | Medium |  |
| 83 | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | Easy |  |
| 84 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Hard | [✅](src/test/java/org/overmind/LargestRectangleInHistogramTest.java) |
| 85 | [Maximal Rectangle](https://leetcode.com/problems/maximal-rectangle/) | Hard | [✅](src/test/java/org/overmind/MaximalRectangleTest.java) |
| 86 | [Partition List](https://leetcode.com/problems/partition-list/) | Medium |  |
| 87 | [Scramble String](https://leetcode.com/problems/scramble-string/) | Hard |  |
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | [✅](src/test/java/org/overmind/MergeSortedArrayTest.java) |
| 89 | [Gray Code](https://leetcode.com/problems/gray-code/) | Medium |  |
| 90 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | Medium |  |
| 91 | [Decode Ways](https://leetcode.com/problems/decode-ways/) | Medium |  |
| 92 | [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | Medium |  |
| 93 | [Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/) | Medium |  |
| 94 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy | [✅](src/test/java/org/overmind/BinaryTreeInorderTraversalTest.java) |
| 95 | [Unique Binary Search Trees II](https://leetcode.com/problems/unique-binary-search-trees-ii/) | Medium |  |
| 96 | [Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/) | Medium |  |
| 97 | [Interleaving String](https://leetcode.com/problems/interleaving-string/) | Medium |  |
| 98 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Medium |  |
| 99 | [Recover Binary Search Tree](https://leetcode.com/problems/recover-binary-search-tree/) | Medium |  |
| 100 | [Same Tree](https://leetcode.com/problems/same-tree/) | Easy |  |
| 103 | [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) | Medium | [✅](src/test/java/org/overmind/BinaryTreeZigzagLevelOrderTraversalTest.java) |
| 104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | [✅](src/test/java/org/overmind/MaximumDepthOfBinaryTreeTest.java) |
| 105 | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | Medium | [✅](src/test/java/org/overmind/ConstructBinaryTreeFromPreorderAndInorderTraversalTest.java) |
| 118 | [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/) | Easy | [✅](src/test/java/org/overmind/PascalsTriangleTest.java) |
| 122 | [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | Medium | [✅](src/test/java/org/overmind/BestTimeToBuyAndSellStockIITest.java) |
| 127 | [Word Ladder](https://leetcode.com/problems/word-ladder/) | Hard |  |
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | [✅](src/test/java/org/overmind/SingleNumberTest.java) |
| 155 | [Min Stack](https://leetcode.com/problems/min-stack/) | Medium | [✅](src/test/java/org/overmind/MinStackTest.java) |
| 168 | [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/) | Easy | [✅](src/test/java/org/overmind/ExcelSheetColumnTitleTest.java) |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | Easy | [✅](src/test/java/org/overmind/MajorityElementTest.java) |
| 171 | [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/) | Easy | [✅](src/test/java/org/overmind/ExcelSheetColumnNumberTest.java) |
| 172 | [Factorial Trailing Zeroes](https://leetcode.com/problems/factorial-trailing-zeroes/) | Medium | [✅](src/test/java/org/overmind/FactorialTrailingZeroesTest.java) |
| 189 | [Rotate Array](https://leetcode.com/problems/rotate-array/) | Medium | [✅](src/test/java/org/overmind/RotateArrayTest.java) |
| 198 | [House Robber](https://leetcode.com/problems/house-robber/) | Medium | [✅](src/test/java/org/overmind/HouseRobberTest.java) |
| 200 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | Medium | [✅](src/test/java/org/overmind/NumberOfIslandsTest.java) |
| 202 | [Happy Number](https://leetcode.com/problems/happy-number/) | Easy | [✅](src/test/java/org/overmind/HappyNumberTest.java) |
| 213 | [House Robber II](https://leetcode.com/problems/house-robber-ii/) | Medium | [✅](src/test/java/org/overmind/HouseRobberIITest.java) |
| 221 | [Maximal Square](https://leetcode.com/problems/maximal-square/) | Medium | [✅](src/test/java/org/overmind/MaximalSquareTest.java) |
| 238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | [✅](src/test/java/org/overmind/ProductOfArrayExceptSelfTest.java) |
| 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | [✅](src/test/java/org/overmind/ValidAnagramTest.java) |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Easy | [✅](src/test/java/org/overmind/MoveZeroesTest.java) |
| 295 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | Hard | [✅](src/test/java/org/overmind/FindMedianFromDataStreamTest.java) |
| 297 | [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | Hard | [✅](src/test/java/org/overmind/SerializeAndDeserializeBinaryTreeTest.java) |
| 337 | [House Robber III](https://leetcode.com/problems/house-robber-iii/) | Medium | [✅](src/test/java/org/overmind/HouseRobberIIITest.java) |
| 338 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | Easy | [✅](src/test/java/org/overmind/CountingBitsTest.java) |
| 344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | Easy | [✅](src/test/java/org/overmind/ReverseStringTest.java) |
| 371 | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) | Medium | [✅](src/test/java/org/overmind/SumOfTwoIntegersTest.java) |
| 412 | [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/) | Easy | [✅](src/test/java/org/overmind/FizzBuzzTest.java) |
| 448 | [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | Easy | [✅](src/test/java/org/overmind/FindAllNumbersDisappearedInAnArrayTest.java) |
| 461 | [Hamming Distance](https://leetcode.com/problems/hamming-distance/) | Easy | [✅](src/test/java/org/overmind/HammingDistanceTest.java) |
| 485 | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) | Easy | [✅](src/test/java/org/overmind/MaxConsecutiveOnesTest.java) |
| 496 | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | Easy | [✅](src/test/java/org/overmind/NextGreaterElementITest.java) |
| 509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) | Easy | [✅](src/test/java/org/overmind/FibonacciNumberTest.java) |
| 525 | [Contiguous Array](https://leetcode.com/problems/contiguous-array/) | Medium | [✅](src/test/java/org/overmind/ContiguousArrayTest.java) |
| 543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Easy | [✅](src/test/java/org/overmind/DiameterOfBinaryTreeTest.java) |
| 561 | [Array Partition](https://leetcode.com/problems/array-partition/) | Easy | [✅](src/test/java/org/overmind/ArrayPartitionTest.java) |
| 617 | [Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/) | Easy | [✅](src/test/java/org/overmind/MergeTwoBinaryTreesTest.java) |
| 645 | [Set Mismatch](https://leetcode.com/problems/set-mismatch/) | Easy | [✅](src/test/java/org/overmind/SetMismatchTest.java) |
| 657 | [Robot Return to Origin](https://leetcode.com/problems/robot-return-to-origin/) | Easy | [✅](src/test/java/org/overmind/RobotReturnToOriginTest.java) |
| 718 | [Maximum Length of Repeated Subarray](https://leetcode.com/problems/maximum-length-of-repeated-subarray/) | Medium | [✅](src/test/java/org/overmind/MaximumLengthOfRepeatedSubarrayTest.java) |
| 728 | [Self Dividing Numbers](https://leetcode.com/problems/self-dividing-numbers/) | Easy | [✅](src/test/java/org/overmind/SelfDividingNumbersTest.java) |
| 740 | [Delete and Earn](https://leetcode.com/problems/delete-and-earn/) | Medium | [✅](src/test/java/org/overmind/DeleteAndEarnTest.java) |
| 760 | [Find Anagram Mappings](https://leetcode.com/problems/find-anagram-mappings/) | Easy | [✅](src/test/java/org/overmind/FindAnagramMappingsTest.java) |
| 766 | [Toeplitz Matrix](https://leetcode.com/problems/toeplitz-matrix/) | Easy | [✅](src/test/java/org/overmind/ToeplitzMatrixTest.java) |
| 844 | [Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/) | Easy | [✅](src/test/java/org/overmind/BackspaceStringCompareTest.java) |
| 876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | Easy | [✅](src/test/java/org/overmind/MiddleOfTheLinkedListTest.java) |
| 1025 | [Divisor Game](https://leetcode.com/problems/divisor-game/) | Easy | [✅](src/test/java/org/overmind/DivisorGameTest.java) |
| 1028 | [Recover a Tree From Preorder Traversal](https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/) | Hard |  |
| 1046 | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) | Easy | [✅](src/test/java/org/overmind/LastStoneWeightTest.java) |
| 1114 | [Print in Order](https://leetcode.com/problems/print-in-order/) | Easy | [✅](src/test/java/org/overmind/PrintInOrderTest.java) |
| 1115 | [Print FooBar Alternately](https://leetcode.com/problems/print-foobar-alternately/) | Medium | [✅](src/test/java/org/overmind/PrintFooBarAlternatelyTest.java) |
| 1137 | [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/) | Easy | [✅](src/test/java/org/overmind/NThTribonacciNumberTest.java) |
| 1189 | [Maximum Number of Balloons](https://leetcode.com/problems/maximum-number-of-balloons/) | Easy | [✅](src/test/java/org/overmind/MaximumNumberOfBalloonsTest.java) |
| 1365 | [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/) | Easy | [✅](src/test/java/org/overmind/HowManyNumbersAreSmallerThanTheCurrentNumberTest.java) |
| 1426 | [Counting Elements](https://leetcode.com/problems/counting-elements/) | Easy | [✅](src/test/java/org/overmind/CountingElementsTest.java) |
| 1470 | [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/) | Easy | [✅](src/test/java/org/overmind/ShuffleTheArrayTest.java) |
| 1475 | [Final Prices With a Special Discount in a Shop](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/) | Easy | [✅](src/test/java/org/overmind/FinalPricesWithASpecialDiscountInAShopTest.java) |
| 1861 | [Rotating the Box](https://leetcode.com/problems/rotating-the-box/) | Medium | [✅](src/test/java/org/overmind/RotatingTheBoxTest.java) |
| 1929 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) | Easy | [✅](src/test/java/org/overmind/ConcatenationOfArrayTest.java) |
