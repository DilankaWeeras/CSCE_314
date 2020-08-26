;Dilanka Weerasinghe
;Erin Hurry

(define (fact n) (if(< n 2) 1 (* n (fact (- n 1)))))
(trace fact)
;(fact 5)

(newline)

;I have changed it so that it will take in an input number
;If you want to input the number before runtime you can replace the (read)
(define (fib n) (if(< n 2) n (+ (fib (- n 1)) (fib (- n 2)))))
(trace fib)
(display "Input a number for Fib sequence: ")
(newline)
(fib (read))
(newline)

(exit)