;Dilanka Weerasinghe

(define (add x .rest)
    (+ x (list-sum rest) ; because the rest of the numbers are ing the list you must sum the list
)

(define (main)
    (display (add 1 2)) (display "\n") ; second display is for the next line
    (display (add 1 2 3 4)) (display "\n")
    (display (add 1 2 3 4 5)) (display "\n")
    (exit)
)