(define (clamp min max val)
(cond
  ((> val max) max)
  ((< val min) min)
  (else val)))

(define (main)
(display(clamp 20 40 30))
(newline)
(display(clamp -5 10 -7))
(newline)
(display(clamp 0 10 20))
(newline)
(display(clamp 70 70 0))
(newline)
)

(main)