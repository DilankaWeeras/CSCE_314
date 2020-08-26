;car
; - first item or element in current node it is looking at
; - accesses individual element


;cdr
; - "coo-der"
; - all items AFTER the current item in the list
; - helpful with recursion
; - access he rest of the list

;cons
; - construcs a new list, beginning with its first argument then cont.
; with its second
; - 

;CONS - construct
; CAR - contents addess register
; CDR - contents data register


;can combine CDR/CAR
(car(cdr(cdr '(1 2 3 4 5)))) ; same
(caddr '(1 2 3 4 5)) ; same
; this will travel d-d-a
; it allways goes backwards
