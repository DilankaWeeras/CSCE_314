
(define (helloWorld)
    ;print and return the message.
    (display "Hello World\n")
)

(define (square n)
    ;returns square of a numeric argument
    (* n n)
)

;sqrt is the root of a number
(define (pythagorean a b)
    (sqrt (+ (square a) (square b)))
)

(define (main)
    (helloWorld) ; didn't need a display since the display is inside the function
    (display (square 20))
    (display (pythagorean 20 20))
    (newline)
    (exit)
)

(main)