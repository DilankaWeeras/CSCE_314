					;File: Question5.scm
					;Written by : Dilanka Weerasinghe and Erin Hurry
					;Date: 6/14/20
					;Tamu Email: dweerasinghe@tamu.edu
					;Class: CSCE 314
					;Description: Fu

(define (listmaker num)
  (cond
   ((eq? 0 num) '()) ; if num is equal to zero then return empty list
   ((eq? 1 num) '(1 0)) ; if num is equal to 1 then return the rest of the list
   (else (cons num (listmaker (- num 1)))))) ; else cons the num with the list - 1 recursivly

(display (listmaker 0))
(newline)
(display (listmaker 7))
(newline)
