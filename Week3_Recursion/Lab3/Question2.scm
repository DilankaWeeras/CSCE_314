					;File: Question2.scm
					;Written by : Dilanka Weerasinghe and Erin Hurry
					;Date: 6/14/20
					;Tamu Email: dweerasinghe@tamu.edu
					;Class: CSCE 314
					;Description: Return min and max in a list

(define (min-list-value lst)
	(cond
		((null? lst) '()) ; if the list is empty then return an empty list
		((null? (cdr lst)) (car lst)) ; if there is nothing after the car then return the car (this will be the min value)
		((> (car lst) (cadr lst)) ; if the first is larger than the second then skip the first
		(min-list-value (cdr lst))) ;
		(else 
		(min-list-value (cons (car lst) (cddr lst)))))) ; else add the first to a new list with everything after the second

(define (max-list-value lst)
	(cond
		((null? lst) '())
		((null? (cdr lst)) (car lst))
		((< (car lst) (cadr lst))
		(max-list-value (cdr lst)))
		(else
		(max-list-value (cons (car lst) (cddr lst))))))

(display (min-list-value '(1 2 3 4 5)))
(newline)
(display (max-list-value '(1 2 3 4 5)))
(newline)

(display (min-list-value '(2 4 6 8)))
(newline)
(display (max-list-value '(2 4 6 8)))
(newline)
