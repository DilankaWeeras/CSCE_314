#lang racket

(define (clone a n)
  (cond
    ((> n 0) (cons a (clone a (- n 1))))
    (else '())
    ))

(clone 3 7)