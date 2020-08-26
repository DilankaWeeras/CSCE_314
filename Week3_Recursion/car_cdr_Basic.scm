;EXERSIZE 1-------------------------

; Q1
(display(car(cdr(cdr '(1 2 3 4 5))))) ; 3
(newline)

;Q2
(display(cddr '(1 2 3 4 5))) ; 3 4 5 
(newline)

;Q3
;check for correctness
; - if it is 2d's it will include the 3

;Q4 (How to get element 5?)
(display(car(cddddr '(1 2 3 4 5)))) ; 5
(newline)

;Q5
(display(cdddddr '(1 2 3 4 5 6 7 8 9 ))) ; WILL NOT WORK
;it should return -> (6 7 8 9) but there is a max to how many CAR/CDR
(newline)

;COMPLEX LIST -----------------------------
(display(cdr '(A (B C) D (E (F G)))))
(newline)
(display(cddr '(A (B C) D (E (F G)))))
(newline)
(display(cdddr '(A (B C) D (E (F G)))))
(newline)
(display(cddddr '(A (B C) D (E (F G)))))
(newline)
;(display(cddddr '(A (B C) D (E (F G))))) ; no reference not pointing to anything
(newline)
; node 1 points to A and then points to a next node
; next node is pointing to (B C) and the node to D
; start with the smaller connections then point to the larger ones
; remember that nodes do not contain values, only point to values


(display(car(cddddr '(A B C D E (F G))))) ; pointing to E
(newline)

;RECURSION ---------------------------
;at runtime type mismatches are detected
