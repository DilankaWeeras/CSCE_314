					;File: Question4.scm
					;Written by : Dilanka Weerasinghe and Erin Hurry
					;Date: 6/14/20
					;Tamu Email: dweerasinghe@tamu.edu
					;Class: CSCE 314
					;Description: Remove from amywhere in a list


(define (remove-item x lst)
  (cond
   ((null? lst) '()) ; if the list is empty then return an empty list
   (else
    (if (eq? (car lst) x) (remove-item x (cdr lst))) ; if x is equal to car in list then recursive the rest of the list, this will skip the cons of this element
    (cons (car lst) (remove-item x (cdr lst) ; if it is not == x then cons it to the list and recursiv the rest of the list
				 (if (not length(car lst) 1)(remove-item x (car lst))))))))

(display (remove-item 3 '(1 2 3 4 5 6)))
(newline)
(display (remove-item 3 '(1 2 '(3 4) 5 6)))
(newline)

    
