					;File: Question1.scm
					;Written by : Dilanka Weerasinghe and Erin Hurry
					;Date: 6/14/20
					;Tamu Email: dweerasinghe@tamu.edu
					;Class: CSCE 314
					;Description: Triple everything in a list.

(define (triple x) ; triples a value
  (* x 3)
  )

(define (triple-mapped func lst)
  (if (null? lst) '()
      (cons (func (car lst)) (triple-mapped func (cdr lst)))
      )
  )
  (trace triple-mapped)

(define (triple-everything lst)
  (if (null? lst) '() ; if the list is empty then return
      (cons (* 3 (car lst)) (triple-everything (cdr lst))))) ; multiply the car by 3 and cons to the beggining of the list

(display (triple-everything '(1 2 3 4 5)))
(newline)
(display (triple-everything '(8 33.5 4/5 5-2i)))
(newline)
(display (triple-mapped triple '(1 2 3 4 5)))
(newline)
(display(triple-mapped triple '(8 33.5 4/5 5-2i)))
