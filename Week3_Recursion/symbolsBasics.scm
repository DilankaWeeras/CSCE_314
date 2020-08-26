;SYMBOLS AS PARAMETERS
; - we can pass funcitons as parameters
; - operatore are really just functions

;capable sort function

(define (sorted? numList comparator)
    (cond
        ((<= (length numList) 1) #t)
        ((comparator (car numList) (cadr numList)) (sorted? (cdr numList) comparator))
        (else #f)
    )
)

(display(sorted? '(1 2 2 4 7) <= )); : #t
(newline)
(display(sorted? '("a" "b" "c" "d") string<? )); : #t
(newline)
(display(sorted? '("a" "b" "f" "c") string<? )); : #f
(newline)
(display(sorted? '(9 8 7 6 1) > )); : #t
(newline)
