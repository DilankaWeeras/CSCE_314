					;File: SchemeFlipped5.scm
					;Written by : Dilanka Weerasinghe
					;Date: 6/6/20
					;Tamu Email: dweerasinghe@tamu.edu
					;Class: CSCE 314
					;Description: Returns if numebr is positive


(define (is-positive num)
    (if (< num 0) #f #t)
)

(define (is-positive-print num)
    (cond
    [(>= num 0) (display "positive ") #t]
    [else (display "negative ") #f]
    )
)


(define (main)
    (display(is-positive 0))
    (newline)
    (display(is-positive 20))
    (newline)
    (display(is-positive -15))
    (newline)
    (display(is-positive -0.0001))
    (newline)

    (newline)
    (display(is-positive-print 0))
    (newline)
    (display(is-positive-print 20))
    (newline)
    (display(is-positive-print -15))
    (newline)
    (display(is-positive-print -0.0001))
    (newline)
)

(main)