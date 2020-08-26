(load "sort.scm")
(load "apps.scm")

;(display (map pow2 '(1 2 3 4))) ;pow2 is not in Gambit
(display (map + '(1 2 3) '(0 0 6))) (newline)
(display (map + '(1 2 3) '(4 5 6))) (newline)

;This funciton will add the numbers in the list in accordance with their position in the list
;map is the function
;   it is using the + function to performed on the mapped lists
;   if there is only one thing to add then it wont add anything

;(map procedure list1 list2 ...)
;notice this can be applie to multiple lists at a time

;(map pow2 '(1 2 3 4))
;Adding each item of (1 2 3) and (4 5 6)

;Squaring each item of (1 2 3)
(display (map (lambda (x) (* x x)) '(1 2 3))) (newline)

;Create a function curve that will accept a list and add 10% to the grades
(display (map (lambda (x) (* x 1.10)) '(100 22 36))) (newline)
;Using lambda here but you do not have to
;If you use define then you change a state and you use resources

;The filter funciton
;(filter predicate-funciton list1)
;How are you going to filter the object

(filter positive? '(1 -3 4 5 -4)) (newline)

;(sort lsit1 comparison-operator/funciton)
(display (sort '(7 3 8 2) <)) (newline)

