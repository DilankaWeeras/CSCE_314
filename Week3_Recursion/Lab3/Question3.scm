					;File: Question3.scm
					;Written by : Dilanka Weerasinghe and Erin Hurry
					;Date: 6/14/20
					;Tamu Email: dweerasinghe@tamu.edu
					;Class: CSCE 314
					;Description: Combine with no duplicates


(define (union lst1 lst2)
  (cond
   ((null? lst2) lst1) ; if list 2 is empty then return list 1
   ((member (car lst2) lst1) ; if car of list 2 is a member in list 1 then...
   (union lst1 (cdr lst2))) ; recursive list1 one with the rest of list 2, this will skip the car element
   (else (union (cons (car lst2) lst1) (cdr lst2))))) ; else cons the car to list 1 and union that with the rest of list 2

(display (union '(1 2 3 4) '(2 4 6 8)))
(newline)
(display (union '(1 5 7 3 2) '(5 1 9 0)))
(newline)
	 

