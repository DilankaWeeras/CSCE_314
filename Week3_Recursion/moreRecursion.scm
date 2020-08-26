;USING recursion to append data to a list
; - similar to accumulating
; - cdo alng with the recurice call enables us to add the NEXT atom in the list
; - adding the first parameter list to te second param list
; - base case is always an empty list
; - many calls have to wait for the OTHERS in the stack to finish to complete entire list

(define (append l1 l2)
    (if (null? l1) l2                       ; if true l1 is mull
    (cons (car l1) (append (cdr l1) l2)))   ; else combine with cons
)

;this works because the stack hold the X then sends the rest
;this is repeated and then it will pop the stack and add to the
;front of l2 in reverse order.
;this makes sure that the Z then Y  then X will become X Y Z A b c

(display (append '(X Y Z) '(A b c)))
(newline)

;FUNCITONAL RECURSION STEPS FOR SUCCESS
; set up the base case first
;   - if you are finding somthing in a list, check if empty and return
;   - return nominal value if you need to go through list
; if not ht ebase case but not don always bass the rest of the list
;   - else (member cdr lst)

;-------------BUILT IN FUNCTIONS FOR LIST
;min - return lowest number (if have float will change all arguments to float)
(min '(1 2 3 4)); - 1

;(filter pred lst) - returns a list with filtered awnsers
(display(filter positive? '(1 -2 3 4 -5))); - (1 3 4)


