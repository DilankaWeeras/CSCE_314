(define (remove-item atom lst)
  (cond
	((null? lst) '())
	((list? (car lst)) (cons (remove-item atom (car lst)) (remove-item (cdr lst))))
	((= atom (car lst)) (remove-item (cdr lst)))
	(else (cons (car lst)(remove-item atom (cdr lst))))
  )
)

(remove-item 1 (cons '(1 1 (1 1 (1))) (1 2 (1 3))))