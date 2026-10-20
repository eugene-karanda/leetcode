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
Unsolved problems are disabled test classes with a stub solution.

| # | Problem | Difficulty | Solution | Solved |
|---|---------|------------|----------|:------:|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [TwoSumTest](src/test/java/org/overmind/TwoSumTest.java) | ✅ |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | [AddTwoNumbersTest](src/test/java/org/overmind/AddTwoNumbersTest.java) | ✅ |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | [LongestSubstringWithoutRepeatingCharactersTest](src/test/java/org/overmind/LongestSubstringWithoutRepeatingCharactersTest.java) | ✅ |
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Hard | [MedianOfTwoSortedArraysTest](src/test/java/org/overmind/MedianOfTwoSortedArraysTest.java) | ✅ |
| 5 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | Medium | [LongestPalindromicSubstringTest](src/test/java/org/overmind/LongestPalindromicSubstringTest.java) | ✅ |
| 6 | [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/) | Medium | [ZigzagConversionTest](src/test/java/org/overmind/ZigzagConversionTest.java) | ✅ |
| 7 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | Medium | [ReverseIntegerTest](src/test/java/org/overmind/ReverseIntegerTest.java) | ✅ |
| 8 | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | Medium | [StringToIntegerAtoiTest](src/test/java/org/overmind/StringToIntegerAtoiTest.java) | ✅ |
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Easy | [PalindromeNumberTest](src/test/java/org/overmind/PalindromeNumberTest.java) | ✅ |
| 10 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | Hard | [RegularExpressionMatchingTest](src/test/java/org/overmind/RegularExpressionMatchingTest.java) | ✅ |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | [ContainerWithMostWaterTest](src/test/java/org/overmind/ContainerWithMostWaterTest.java) | ✅ |
| 12 | [Integer to Roman](https://leetcode.com/problems/integer-to-roman/) | Medium | [IntegerToRomanTest](src/test/java/org/overmind/IntegerToRomanTest.java) | ✅ |
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | Easy | [RomanToIntegerTest](src/test/java/org/overmind/RomanToIntegerTest.java) | ✅ |
| 14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Easy | [LongestCommonPrefixTest](src/test/java/org/overmind/LongestCommonPrefixTest.java) | ✅ |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | [ThreeSumTest](src/test/java/org/overmind/ThreeSumTest.java) | ✅ |
| 16 | [3Sum Closest](https://leetcode.com/problems/3sum-closest/) | Medium | [ThreeSumClosestTest](src/test/java/org/overmind/ThreeSumClosestTest.java) | ✅ |
| 17 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | Medium | [LetterCombinationsOfAPhoneNumberTest](src/test/java/org/overmind/LetterCombinationsOfAPhoneNumberTest.java) | ✅ |
| 18 | [4Sum](https://leetcode.com/problems/4sum/) | Medium | [FourSumTest](src/test/java/org/overmind/FourSumTest.java) | ✅ |
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | [RemoveNthNodeFromEndOfListTest](src/test/java/org/overmind/RemoveNthNodeFromEndOfListTest.java) | ✅ |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | [ValidParenthesesTest](src/test/java/org/overmind/ValidParenthesesTest.java) | ✅ |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | [MergeTwoSortedListsTest](src/test/java/org/overmind/MergeTwoSortedListsTest.java) | ✅ |
| 22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | Medium | [GenerateParenthesesTest](src/test/java/org/overmind/GenerateParenthesesTest.java) | ✅ |
| 23 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | [MergeKSortedListsTest](src/test/java/org/overmind/MergeKSortedListsTest.java) | ✅ |
| 24 | [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/) | Medium | [SwapNodesInPairsTest](src/test/java/org/overmind/SwapNodesInPairsTest.java) | ✅ |
| 25 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | Hard | [ReverseKGroupTest](src/test/java/org/overmind/ReverseKGroupTest.java) | ✅ |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | [RemoveDuplicatesFromSortedArrayTest](src/test/java/org/overmind/RemoveDuplicatesFromSortedArrayTest.java) | ✅ |
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | Easy | [RemoveElementTest](src/test/java/org/overmind/RemoveElementTest.java) | ✅ |
| 28 | [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy | [FindTheIndexOfTheFirstOccurrenceInAStringTest](src/test/java/org/overmind/FindTheIndexOfTheFirstOccurrenceInAStringTest.java) |  |
| 29 | [Divide Two Integers](https://leetcode.com/problems/divide-two-integers/) | Medium | [DivideTwoIntegersTest](src/test/java/org/overmind/DivideTwoIntegersTest.java) |  |
| 30 | [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | Hard | [SubstringWithConcatenationOfAllWordsTest](src/test/java/org/overmind/SubstringWithConcatenationOfAllWordsTest.java) |  |
| 31 | [Next Permutation](https://leetcode.com/problems/next-permutation/) | Medium | [NextPermutationTest](src/test/java/org/overmind/NextPermutationTest.java) |  |
| 32 | [Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/) | Hard | [LongestValidParenthesesTest](src/test/java/org/overmind/LongestValidParenthesesTest.java) |  |
| 33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | [SearchInRotatedSortedArrayTest](src/test/java/org/overmind/SearchInRotatedSortedArrayTest.java) |  |
| 34 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Medium | [FindFirstAndLastPositionOfElementInSortedArrayTest](src/test/java/org/overmind/FindFirstAndLastPositionOfElementInSortedArrayTest.java) |  |
| 35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy | [SearchInsertPositionTest](src/test/java/org/overmind/SearchInsertPositionTest.java) |  |
| 36 | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | Medium | [ValidSudokuTest](src/test/java/org/overmind/ValidSudokuTest.java) |  |
| 37 | [Sudoku Solver](https://leetcode.com/problems/sudoku-solver/) | Hard | [SudokuSolverTest](src/test/java/org/overmind/SudokuSolverTest.java) |  |
| 38 | [Count and Say](https://leetcode.com/problems/count-and-say/) | Medium | [CountAndSayTest](src/test/java/org/overmind/CountAndSayTest.java) |  |
| 39 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium | [CombinationSumTest](src/test/java/org/overmind/CombinationSumTest.java) |  |
| 40 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | Medium | [CombinationSumIITest](src/test/java/org/overmind/CombinationSumIITest.java) |  |
| 41 | [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | Hard | [FirstMissingPositiveTest](src/test/java/org/overmind/FirstMissingPositiveTest.java) |  |
| 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | [TrappingRainWaterTest](src/test/java/org/overmind/TrappingRainWaterTest.java) |  |
| 43 | [Multiply Strings](https://leetcode.com/problems/multiply-strings/) | Medium | [MultiplyStringsTest](src/test/java/org/overmind/MultiplyStringsTest.java) |  |
| 44 | [Wildcard Matching](https://leetcode.com/problems/wildcard-matching/) | Hard | [WildcardMatchingTest](src/test/java/org/overmind/WildcardMatchingTest.java) |  |
| 45 | [Jump Game II](https://leetcode.com/problems/jump-game-ii/) | Medium | [JumpGameIITest](src/test/java/org/overmind/JumpGameIITest.java) | ✅ |
| 46 | [Permutations](https://leetcode.com/problems/permutations/) | Medium | [PermutationsTest](src/test/java/org/overmind/PermutationsTest.java) |  |
| 47 | [Permutations II](https://leetcode.com/problems/permutations-ii/) | Medium | [PermutationsIITest](src/test/java/org/overmind/PermutationsIITest.java) |  |
| 48 | [Rotate Image](https://leetcode.com/problems/rotate-image/) | Medium | [RotateImageTest](src/test/java/org/overmind/RotateImageTest.java) |  |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | [GroupAnagramsTest](src/test/java/org/overmind/GroupAnagramsTest.java) | ✅ |
| 50 | [Pow(x, n)](https://leetcode.com/problems/powx-n/) | Medium | [PowXNTest](src/test/java/org/overmind/PowXNTest.java) |  |
| 51 | [N-Queens](https://leetcode.com/problems/n-queens/) | Hard | [NQueensTest](src/test/java/org/overmind/NQueensTest.java) |  |
| 52 | [N-Queens II](https://leetcode.com/problems/n-queens-ii/) | Hard | [NQueensIITest](src/test/java/org/overmind/NQueensIITest.java) |  |
| 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | [MaximumSubarrayTest](src/test/java/org/overmind/MaximumSubarrayTest.java) | ✅ |
| 54 | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | Medium | [SpiralMatrixTest](src/test/java/org/overmind/SpiralMatrixTest.java) | ✅ |
| 55 | [Jump Game](https://leetcode.com/problems/jump-game/) | Medium | [JumpGameTest](src/test/java/org/overmind/JumpGameTest.java) | ✅ |
| 56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | [MergeIntervalsTest](src/test/java/org/overmind/MergeIntervalsTest.java) | ✅ |
| 57 | [Insert Interval](https://leetcode.com/problems/insert-interval/) | Medium | [InsertIntervalTest](src/test/java/org/overmind/InsertIntervalTest.java) |  |
| 58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | Easy | [LengthOfLastWordTest](src/test/java/org/overmind/LengthOfLastWordTest.java) |  |
| 59 | [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/) | Medium | [SpiralMatrixIITest](src/test/java/org/overmind/SpiralMatrixIITest.java) |  |
| 60 | [Permutation Sequence](https://leetcode.com/problems/permutation-sequence/) | Hard | [PermutationSequenceTest](src/test/java/org/overmind/PermutationSequenceTest.java) |  |
| 61 | [Rotate List](https://leetcode.com/problems/rotate-list/) | Medium | [RotateListTest](src/test/java/org/overmind/RotateListTest.java) |  |
| 62 | [Unique Paths](https://leetcode.com/problems/unique-paths/) | Medium | [UniquePathsTest](src/test/java/org/overmind/UniquePathsTest.java) |  |
| 63 | [Unique Paths II](https://leetcode.com/problems/unique-paths-ii/) | Medium | [UniquePathsIITest](src/test/java/org/overmind/UniquePathsIITest.java) |  |
| 64 | [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/) | Medium | [MinimumPathSumTest](src/test/java/org/overmind/MinimumPathSumTest.java) |  |
| 65 | [Valid Number](https://leetcode.com/problems/valid-number/) | Hard | [ValidNumberTest](src/test/java/org/overmind/ValidNumberTest.java) |  |
| 66 | [Plus One](https://leetcode.com/problems/plus-one/) | Easy | [PlusOneTest](src/test/java/org/overmind/PlusOneTest.java) |  |
| 67 | [Add Binary](https://leetcode.com/problems/add-binary/) | Easy | [AddBinaryTest](src/test/java/org/overmind/AddBinaryTest.java) |  |
| 68 | [Text Justification](https://leetcode.com/problems/text-justification/) | Hard | [TextJustificationTest](src/test/java/org/overmind/TextJustificationTest.java) |  |
| 69 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) | Easy | [SqrtXTest](src/test/java/org/overmind/SqrtXTest.java) |  |
| 70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | Easy | [ClimbingStairsTest](src/test/java/org/overmind/ClimbingStairsTest.java) |  |
| 71 | [Simplify Path](https://leetcode.com/problems/simplify-path/) | Medium | [SimplifyPathTest](src/test/java/org/overmind/SimplifyPathTest.java) |  |
| 72 | [Edit Distance](https://leetcode.com/problems/edit-distance/) | Medium | [EditDistanceTest](src/test/java/org/overmind/EditDistanceTest.java) |  |
| 73 | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) | Medium | [SetMatrixZeroesTest](src/test/java/org/overmind/SetMatrixZeroesTest.java) |  |
| 74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Medium | [SearchA2DMatrixTest](src/test/java/org/overmind/SearchA2DMatrixTest.java) |  |
| 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Medium | [SortColorsTest](src/test/java/org/overmind/SortColorsTest.java) |  |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard | [MinimumWindowSubstringTest](src/test/java/org/overmind/MinimumWindowSubstringTest.java) |  |
| 77 | [Combinations](https://leetcode.com/problems/combinations/) | Medium | [CombinationsTest](src/test/java/org/overmind/CombinationsTest.java) |  |
| 78 | [Subsets](https://leetcode.com/problems/subsets/) | Medium | [SubsetsTest](src/test/java/org/overmind/SubsetsTest.java) | ✅ |
| 79 | [Word Search](https://leetcode.com/problems/word-search/) | Medium | [WordSearchTest](src/test/java/org/overmind/WordSearchTest.java) |  |
| 80 | [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | Medium | [RemoveDuplicatesFromSortedArrayIITest](src/test/java/org/overmind/RemoveDuplicatesFromSortedArrayIITest.java) | ✅ |
| 81 | [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) | Medium | [SearchInRotatedSortedArrayIITest](src/test/java/org/overmind/SearchInRotatedSortedArrayIITest.java) |  |
| 82 | [Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/) | Medium | [RemoveDuplicatesFromSortedListIITest](src/test/java/org/overmind/RemoveDuplicatesFromSortedListIITest.java) |  |
| 83 | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | Easy | [RemoveDuplicatesFromSortedListTest](src/test/java/org/overmind/RemoveDuplicatesFromSortedListTest.java) |  |
| 84 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Hard | [LargestRectangleInHistogramTest](src/test/java/org/overmind/LargestRectangleInHistogramTest.java) | ✅ |
| 85 | [Maximal Rectangle](https://leetcode.com/problems/maximal-rectangle/) | Hard | [MaximalRectangleTest](src/test/java/org/overmind/MaximalRectangleTest.java) | ✅ |
| 86 | [Partition List](https://leetcode.com/problems/partition-list/) | Medium | [PartitionListTest](src/test/java/org/overmind/PartitionListTest.java) |  |
| 87 | [Scramble String](https://leetcode.com/problems/scramble-string/) | Hard | [ScrambleStringTest](src/test/java/org/overmind/ScrambleStringTest.java) |  |
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | [MergeSortedArrayTest](src/test/java/org/overmind/MergeSortedArrayTest.java) | ✅ |
| 89 | [Gray Code](https://leetcode.com/problems/gray-code/) | Medium | [GrayCodeTest](src/test/java/org/overmind/GrayCodeTest.java) |  |
| 90 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | Medium | [SubsetsIITest](src/test/java/org/overmind/SubsetsIITest.java) |  |
| 91 | [Decode Ways](https://leetcode.com/problems/decode-ways/) | Medium | [DecodeWaysTest](src/test/java/org/overmind/DecodeWaysTest.java) |  |
| 92 | [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | Medium | [ReverseLinkedListIITest](src/test/java/org/overmind/ReverseLinkedListIITest.java) |  |
| 93 | [Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/) | Medium | [RestoreIPAddressesTest](src/test/java/org/overmind/RestoreIPAddressesTest.java) |  |
| 94 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy | [BinaryTreeInorderTraversalTest](src/test/java/org/overmind/BinaryTreeInorderTraversalTest.java) | ✅ |
| 95 | [Unique Binary Search Trees II](https://leetcode.com/problems/unique-binary-search-trees-ii/) | Medium | [UniqueBinarySearchTreesIITest](src/test/java/org/overmind/UniqueBinarySearchTreesIITest.java) |  |
| 96 | [Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/) | Medium | [UniqueBinarySearchTreesTest](src/test/java/org/overmind/UniqueBinarySearchTreesTest.java) |  |
| 97 | [Interleaving String](https://leetcode.com/problems/interleaving-string/) | Medium | [InterleavingStringTest](src/test/java/org/overmind/InterleavingStringTest.java) |  |
| 98 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | [ValidateBinarySearchTreeTest](src/test/java/org/overmind/ValidateBinarySearchTreeTest.java) |  |
| 99 | [Recover Binary Search Tree](https://leetcode.com/problems/recover-binary-search-tree/) | Medium | [RecoverBinarySearchTreeTest](src/test/java/org/overmind/RecoverBinarySearchTreeTest.java) |  |
| 100 | [Same Tree](https://leetcode.com/problems/same-tree/) | Easy | [SameTreeTest](src/test/java/org/overmind/SameTreeTest.java) |  |
| 103 | [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) | Medium | [BinaryTreeZigzagLevelOrderTraversalTest](src/test/java/org/overmind/BinaryTreeZigzagLevelOrderTraversalTest.java) | ✅ |
| 104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | [MaximumDepthOfBinaryTreeTest](src/test/java/org/overmind/MaximumDepthOfBinaryTreeTest.java) | ✅ |
| 105 | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | Medium | [ConstructBinaryTreeFromPreorderAndInorderTraversalTest](src/test/java/org/overmind/ConstructBinaryTreeFromPreorderAndInorderTraversalTest.java) | ✅ |
| 118 | [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/) | Easy | [PascalsTriangleTest](src/test/java/org/overmind/PascalsTriangleTest.java) | ✅ |
| 122 | [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | Medium | [BestTimeToBuyAndSellStockIITest](src/test/java/org/overmind/BestTimeToBuyAndSellStockIITest.java) | ✅ |
| 127 | [Word Ladder](https://leetcode.com/problems/word-ladder/) | Hard | [WordLadderTest](src/test/java/org/overmind/WordLadderTest.java) |  |
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | [SingleNumberTest](src/test/java/org/overmind/SingleNumberTest.java) | ✅ |
| 155 | [Min Stack](https://leetcode.com/problems/min-stack/) | Medium | [MinStackTest](src/test/java/org/overmind/MinStackTest.java) | ✅ |
| 168 | [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/) | Easy | [ExcelSheetColumnTitleTest](src/test/java/org/overmind/ExcelSheetColumnTitleTest.java) | ✅ |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | Easy | [MajorityElementTest](src/test/java/org/overmind/MajorityElementTest.java) | ✅ |
| 171 | [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/) | Easy | [ExcelSheetColumnNumberTest](src/test/java/org/overmind/ExcelSheetColumnNumberTest.java) | ✅ |
| 172 | [Factorial Trailing Zeroes](https://leetcode.com/problems/factorial-trailing-zeroes/) | Medium | [FactorialTrailingZeroesTest](src/test/java/org/overmind/FactorialTrailingZeroesTest.java) | ✅ |
| 189 | [Rotate Array](https://leetcode.com/problems/rotate-array/) | Medium | [RotateArrayTest](src/test/java/org/overmind/RotateArrayTest.java) | ✅ |
| 198 | [House Robber](https://leetcode.com/problems/house-robber/) | Medium | [HouseRobberTest](src/test/java/org/overmind/HouseRobberTest.java) | ✅ |
| 200 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | Medium | [NumberOfIslandsTest](src/test/java/org/overmind/NumberOfIslandsTest.java) | ✅ |
| 202 | [Happy Number](https://leetcode.com/problems/happy-number/) | Easy | [HappyNumberTest](src/test/java/org/overmind/HappyNumberTest.java) | ✅ |
| 213 | [House Robber II](https://leetcode.com/problems/house-robber-ii/) | Medium | [HouseRobberIITest](src/test/java/org/overmind/HouseRobberIITest.java) | ✅ |
| 221 | [Maximal Square](https://leetcode.com/problems/maximal-square/) | Medium | [MaximalSquareTest](src/test/java/org/overmind/MaximalSquareTest.java) | ✅ |
| 238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | [ProductOfArrayExceptSelfTest](src/test/java/org/overmind/ProductOfArrayExceptSelfTest.java) | ✅ |
| 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | [ValidAnagramTest](src/test/java/org/overmind/ValidAnagramTest.java) | ✅ |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Easy | [MoveZeroesTest](src/test/java/org/overmind/MoveZeroesTest.java) | ✅ |
| 295 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | Hard | [FindMedianFromDataStreamTest](src/test/java/org/overmind/FindMedianFromDataStreamTest.java) | ✅ |
| 297 | [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | Hard | [SerializeAndDeserializeBinaryTreeTest](src/test/java/org/overmind/SerializeAndDeserializeBinaryTreeTest.java) | ✅ |
| 337 | [House Robber III](https://leetcode.com/problems/house-robber-iii/) | Medium | [HouseRobberIIITest](src/test/java/org/overmind/HouseRobberIIITest.java) | ✅ |
| 338 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | Easy | [CountingBitsTest](src/test/java/org/overmind/CountingBitsTest.java) | ✅ |
| 344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | Easy | [ReverseStringTest](src/test/java/org/overmind/ReverseStringTest.java) | ✅ |
| 371 | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) | Medium | [SumOfTwoIntegersTest](src/test/java/org/overmind/SumOfTwoIntegersTest.java) | ✅ |
| 412 | [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/) | Easy | [FizzBuzzTest](src/test/java/org/overmind/FizzBuzzTest.java) | ✅ |
| 448 | [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | Easy | [FindAllNumbersDisappearedInAnArrayTest](src/test/java/org/overmind/FindAllNumbersDisappearedInAnArrayTest.java) | ✅ |
| 461 | [Hamming Distance](https://leetcode.com/problems/hamming-distance/) | Easy | [HammingDistanceTest](src/test/java/org/overmind/HammingDistanceTest.java) | ✅ |
| 485 | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) | Easy | [MaxConsecutiveOnesTest](src/test/java/org/overmind/MaxConsecutiveOnesTest.java) | ✅ |
| 496 | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | Easy | [NextGreaterElementITest](src/test/java/org/overmind/NextGreaterElementITest.java) | ✅ |
| 509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) | Easy | [FibonacciNumberTest](src/test/java/org/overmind/FibonacciNumberTest.java) | ✅ |
| 525 | [Contiguous Array](https://leetcode.com/problems/contiguous-array/) | Medium | [ContiguousArrayTest](src/test/java/org/overmind/ContiguousArrayTest.java) | ✅ |
| 543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Easy | [DiameterOfBinaryTreeTest](src/test/java/org/overmind/DiameterOfBinaryTreeTest.java) | ✅ |
| 561 | [Array Partition](https://leetcode.com/problems/array-partition/) | Easy | [ArrayPartitionTest](src/test/java/org/overmind/ArrayPartitionTest.java) | ✅ |
| 617 | [Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/) | Easy | [MergeTwoBinaryTreesTest](src/test/java/org/overmind/MergeTwoBinaryTreesTest.java) | ✅ |
| 645 | [Set Mismatch](https://leetcode.com/problems/set-mismatch/) | Easy | [SetMismatchTest](src/test/java/org/overmind/SetMismatchTest.java) | ✅ |
| 657 | [Robot Return to Origin](https://leetcode.com/problems/robot-return-to-origin/) | Easy | [RobotReturnToOriginTest](src/test/java/org/overmind/RobotReturnToOriginTest.java) | ✅ |
| 718 | [Maximum Length of Repeated Subarray](https://leetcode.com/problems/maximum-length-of-repeated-subarray/) | Medium | [MaximumLengthOfRepeatedSubarrayTest](src/test/java/org/overmind/MaximumLengthOfRepeatedSubarrayTest.java) | ✅ |
| 728 | [Self Dividing Numbers](https://leetcode.com/problems/self-dividing-numbers/) | Easy | [SelfDividingNumbersTest](src/test/java/org/overmind/SelfDividingNumbersTest.java) | ✅ |
| 740 | [Delete and Earn](https://leetcode.com/problems/delete-and-earn/) | Medium | [DeleteAndEarnTest](src/test/java/org/overmind/DeleteAndEarnTest.java) | ✅ |
| 760 | [Find Anagram Mappings](https://leetcode.com/problems/find-anagram-mappings/) | Easy | [FindAnagramMappingsTest](src/test/java/org/overmind/FindAnagramMappingsTest.java) | ✅ |
| 766 | [Toeplitz Matrix](https://leetcode.com/problems/toeplitz-matrix/) | Easy | [ToeplitzMatrixTest](src/test/java/org/overmind/ToeplitzMatrixTest.java) | ✅ |
| 844 | [Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/) | Easy | [BackspaceStringCompareTest](src/test/java/org/overmind/BackspaceStringCompareTest.java) | ✅ |
| 876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | Easy | [MiddleOfTheLinkedListTest](src/test/java/org/overmind/MiddleOfTheLinkedListTest.java) | ✅ |
| 1025 | [Divisor Game](https://leetcode.com/problems/divisor-game/) | Easy | [DivisorGameTest](src/test/java/org/overmind/DivisorGameTest.java) | ✅ |
| 1028 | [Recover a Tree From Preorder Traversal](https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/) | Hard | [RecoverFromPreorderTest](src/test/java/org/overmind/RecoverFromPreorderTest.java) |  |
| 1046 | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) | Easy | [LastStoneWeightTest](src/test/java/org/overmind/LastStoneWeightTest.java) | ✅ |
| 1114 | [Print in Order](https://leetcode.com/problems/print-in-order/) | Easy | [PrintInOrderTest](src/test/java/org/overmind/PrintInOrderTest.java) | ✅ |
| 1115 | [Print FooBar Alternately](https://leetcode.com/problems/print-foobar-alternately/) | Medium | [PrintFooBarAlternatelyTest](src/test/java/org/overmind/PrintFooBarAlternatelyTest.java) | ✅ |
| 1137 | [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/) | Easy | [NThTribonacciNumberTest](src/test/java/org/overmind/NThTribonacciNumberTest.java) | ✅ |
| 1189 | [Maximum Number of Balloons](https://leetcode.com/problems/maximum-number-of-balloons/) | Easy | [MaximumNumberOfBalloonsTest](src/test/java/org/overmind/MaximumNumberOfBalloonsTest.java) | ✅ |
| 1365 | [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/) | Easy | [HowManyNumbersAreSmallerThanTheCurrentNumberTest](src/test/java/org/overmind/HowManyNumbersAreSmallerThanTheCurrentNumberTest.java) | ✅ |
| 1426 | [Counting Elements](https://leetcode.com/problems/counting-elements/) | Easy | [CountingElementsTest](src/test/java/org/overmind/CountingElementsTest.java) | ✅ |
| 1470 | [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/) | Easy | [ShuffleTheArrayTest](src/test/java/org/overmind/ShuffleTheArrayTest.java) | ✅ |
| 1475 | [Final Prices With a Special Discount in a Shop](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/) | Easy | [FinalPricesWithASpecialDiscountInAShopTest](src/test/java/org/overmind/FinalPricesWithASpecialDiscountInAShopTest.java) | ✅ |
| 1861 | [Rotating the Box](https://leetcode.com/problems/rotating-the-box/) | Medium | [RotatingTheBoxTest](src/test/java/org/overmind/RotatingTheBoxTest.java) | ✅ |
| 1929 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) | Easy | [ConcatenationOfArrayTest](src/test/java/org/overmind/ConcatenationOfArrayTest.java) | ✅ |
