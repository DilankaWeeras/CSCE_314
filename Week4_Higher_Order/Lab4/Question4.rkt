#lang racket
(define (clone a n)
  (cond
    ((> n 0) (cons a (clone a (- n 1))))
    (else '())
    ))

(define (replicate lst n)
  (cond
    ((null? lst) '())
    (else (append (clone (car lst) n) (replicate (cdr lst) n)))
    ))

(replicate '(1 2 3) 2)
(replicate '(1 2 3 4 5 6) 4)
