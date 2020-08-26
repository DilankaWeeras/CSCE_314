;USEFUL FUNCTIONS

(define S)
(define L1)
(define L2)
(define element1)
(define element2)


(null? S); tests if S is the empty list "()"

(list? S); tests if S is a list

(equal? L1 L2) ; checks whole list

(eq? element1 element2) ; checks elements

;MORE LIST STUFF------------

(list 'A '(B C) 'D) ; makes a list of its arguments
;(A (B C) D)

(append '(1 2) '(3 4)) ; constructs new list
;(1 2 3 4) no branch/inner
(append '(A B) '((X) Y))
;(A B (X) Y) internal x in this list because it was a
;branch of a branch that was combined

(display(length (list 'A '(B C) 'D)))
; 3 because the inner list in not in the structure

;FIND ITEM IN LIST
(define (member atm lis) ;looking for atom in list
    (cond 
        ((null? lis) #f)            ;if list is null return false
        ((eq atm (car list)) #t)    ;if eq car list == atom retutn true
        (else (member atm (cdr lis))) ;cdr on list and try again
    )
)
;STACK for
(member 2 '(1 2 3 4 5))
;
;eq atm - return true
;(member 2 '(2 3 4 5))
;(member 2 '(1 2 3 4 5))

;STACK for 
(member 5 '(1 2 3 4))
;
;(null lis) - return false
;(member 5 '(4))
;(member 5 '(3 4))
;(member 5 '(2 3 4))
;(member 5 '(1 2 3 4))


;ACCUMULATE DATA IN A LIST
; - base case is always looking for an empty list
; - can 'return' a nominal value that wont effect the data
;       - adding 0 is a value for total
;       - or return nothing

(define (list-sum lst); adds all numbers in a list
    (cond 
        ((null? lst) 0)
        (else (+ (car lst) (list-sum (cdr lst))))    
    )
)

;STACK for
(list-sum '(12 3 6 7)
; : return zero
;(list-sum '() : 12 + 3 + 6 + 7 + ""
;(list-sum '(7) : 12 + 3 + 6 + ""
;(list-sum '(6 7) : 12 + 3 + ""
;(list-sum '(3 6 7) : 12 + ""
;(list-sum '(12 3 6 7) :


;EXERCISE - Accumulating data in a list recursivly
; ///////
(list-sum '("Lupoli" 1 2 3))

;   STACT                       VALUE
;                               /                   
;(list-sum '())                 / (null? lst) 0     0
;(list-sum '(3))                / (+ 3)             0 + 3
;(list-sum '(2 3))              / (+ 2)             3 + 2
;(list-sum '(1 2 3))            / (+ 1)             5 + 1
;(list-sum '("Lupoli" 1 2 3))   / (+ "Lupoli")      Lupoli + 6
;------------
;Datatype mismatch ERROR expects a string





