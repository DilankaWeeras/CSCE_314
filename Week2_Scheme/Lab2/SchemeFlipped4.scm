(define (fifteen-percent var)
    (* 0.15 var)
)

(define (main)
    (display (fifteen-percent 100))
    (newline)
    (display (fifteen-percent 1412))
    (newline)
    (display (fifteen-percent 21.76))
    (newline)
)

(main)