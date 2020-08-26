; creat a list (side effect)
(list 2 3 5 7)
(list 'house 'at 'Pooh 'Corner)
(list 4 'calling 'birds 3 'French 'hens 2 'turtles)

;creates a temp list called a literal list
'(1 2 3 4 5)
'() ;used often to compare if an empty list
    ;is used to tell Scheme NOT to evaluate the first item inside ( )

(display(list 'Yankees 2 'Diamondbacks 1)); like above
(newline)

;Here is a list inside a list
(display (list 'A (list 'B 'C) 'D (list 'E (list 'F 'G))))
(newline)

;MAPPING WITH LISTS

(define (double x) ; quick one line function
    (* x 2)
)
(define (increment x)
    (+ x 1)
)

;pass in a funciton into the param function

(define (mapcar func lst)
    (if (null? lst) '()
        (cons (func (car lst)) (mapcar func (cdr lst)))
    )
)

(display(mapcar double '(1 2 3 4 5))) ; double has already been defined!
(newline)
(display(mapcar increment '(1 2 3 4 5)))
(newline)
