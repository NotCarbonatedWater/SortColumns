Jonathan Jaco
ID: 20516017

Group: 
    Grace Benton 
    James Fotakis 
    Shehrebanu Rashik 

Time Complexity: 
    minDeletionSize(A) = O((n^2) + 2n)
    checkArray(A) = O(n)
    checkLength(A) = O(n)
    printInput(A) = O(n)
    printOutput(A) = O(n)
    ----------------------------------
    total: O((n^2) + 6n)

Space Complexity: 
    minDeletionSize(A):
    - int[] A = 4n
    - int[] indicies = 4n
    - int[] indiciesFinal = 4n
    - int counter = 4
    ----------------------------------
    total: 12n + 4   