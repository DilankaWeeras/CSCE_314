;Making conditional statements

(display (and #t #t))
(newline)
(display (and #t #f))
(newline)

; (if(condition 1) (true statement) (false statement))


;recursive fibbonacci function
(define (fib n)
    (if(< n 2) n ; it will return n (this is the true statement)
        (+ (fib (- n 1)) (fib (- n 2))) ; false statement, add fib(n-1) and fib(n-2)
    )
)

;functions in scheme can return different data types
(define (example x)
    (if (string=? x "A")
        {display "matched\n"}
        {display "did not match"}    
    )
)

;within the if-else you need to use parenthesis if the if else contains a function
(define (example1 x)
    (if (string=? x "A") "This" "That")
)
;vs
(define (example2 x)
    (if (string=? x "A") (+ 3 4) "That")
)

;This is useful in these situations
(define (num-response x)
    (if(rational? x)
        {display(* x 10)}
        {display "Not a number"}
    )
)

;conditional / switch statements
(define (grade x)
    (cond
        [(< x 60) (display "Failed\n")]
        [(< x 70) (display "Grade : D\n")]
        [(< x 80) (display "Grade : C\n")]
        [(< x 90) (display "Grade : B\n")]
        [(< x 100) (display "Grade : A\n")]
    )
)

(define (main)
    (display (fib 7)) (newline)
    (example "A")
    (example "C") (newline)
    (display (example1 "A")) (newline)
    (display (example2 "A")) (newline)
    (num-response 5) (newline)
    (num-response "5") (newline)
    (grade 71)
    (newline)
    (exit)
)

(main)