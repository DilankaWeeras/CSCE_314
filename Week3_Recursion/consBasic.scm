;CONS ----------------------

; - way of adding to the front of the list

; - the con node acts like a unique LL
;   - node becomes a ptr (x 2) to 2 items
;   - one ptr points to whatever is in arg[1]
;   - one ptr points to whatever is in arg[2]
;   - remember that arg[0] is cons

(display(cons 1 '(2 3))); (1 2 3)
(newline)

(display(cons '(1 2 3) '(4 5))); ((1 2 3) 4 5)
(newline)

;empty list is a legit value
(display(cons 'A '()))
(newline)

(cons '(A B) '(C D))

(cons '() '(A B))

;MULTIPLE CONS----------------
(display(cons (cons 1 2)(cons 3 4)))
(newline)

;cons is just a node with 2 pointers you just need to know
;what it is pointing to
