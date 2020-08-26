(define (container value)   
    ;makes a statement for creation of the sentence
    (string-append "This container has " value ".\n")
)

(define apple(container "apples"))
(define pie(container "pies"))

(define (main)
    (display apple) ; why is there already a newline after this statement
    (display pie)
    (exit)
)

(main)
